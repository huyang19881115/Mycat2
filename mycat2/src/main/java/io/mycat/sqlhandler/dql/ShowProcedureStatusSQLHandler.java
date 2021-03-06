package io.mycat.sqlhandler.dql;

import com.alibaba.druid.sql.dialect.mysql.ast.statement.MySqlShowProcedureStatusStatement;
import io.mycat.MycatDataContext;
import io.mycat.sqlhandler.AbstractSQLHandler;
import io.mycat.sqlhandler.SQLRequest;
import io.mycat.Response;




public class ShowProcedureStatusSQLHandler extends AbstractSQLHandler<MySqlShowProcedureStatusStatement> {

    @Override
    protected void onExecute(SQLRequest<MySqlShowProcedureStatusStatement> request, MycatDataContext dataContext, Response response) throws Exception {
        response.proxySelectToPrototype(request.getSqlString());
    }
}
