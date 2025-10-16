package nl.mingull.cdn.data

import org.mariadb.jdbc.MariaDbPoolDataSource
import java.sql.Connection

class Database {
    private var _pool: MariaDbPoolDataSource = MariaDbPoolDataSource(
        "jdbc:mariadb://localhost:3306/score_play?user=root&password="
    )

    val dataSource: MariaDbPoolDataSource get() = _pool

    fun close() {
        _pool.close()
    }
}