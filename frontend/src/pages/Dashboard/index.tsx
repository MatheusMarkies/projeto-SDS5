import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function Dashboard() {
    return (
        <>
            <NavBar></NavBar>

            <div className="container">
                <h1 className="text-primary py-3">Dashboard de Vendas:</h1>
                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5>Sucesso</h5>
                        <BarChart />
                    </div>
                    <div className="col-sm-6">
                        <h5>Sucesso</h5>
                        <DonutChart />
                    </div>
                </div>

                <div className="py-3">
                    <h1 className="text-primary">Vendas:</h1>
                </div>

                <DataTable></DataTable>
            </div>

            <Footer></Footer>
        </>
    );
}

export default Dashboard;