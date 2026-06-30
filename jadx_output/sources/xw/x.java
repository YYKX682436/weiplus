package xw;

/* loaded from: classes.dex */
public class x implements d95.c0 {
    public x(xw.a0 a0Var) {
    }

    @Override // d95.c0
    public java.lang.String[] a() {
        ((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).getClass();
        l75.e0 e0Var = bt1.b.f24145y1;
        kotlin.jvm.internal.o.f(e0Var, "<get-info>(...)");
        java.lang.String createSQLs = l75.n0.getCreateSQLs(e0Var, "picfansmsg");
        kotlin.jvm.internal.o.f(createSQLs, "getCreateSQLs(...)");
        return new java.lang.String[]{createSQLs, "CREATE INDEX IF NOT EXISTS  picfansmsgSvrIdIndex ON picfansmsg ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  picfansmsgTalkerIndex ON picfansmsg ( talker )", "CREATE INDEX IF NOT EXISTS  picfansmsgTalkerStatusIndex ON picfansmsg ( talker,status )", "CREATE INDEX IF NOT EXISTS  picfansmsgCreateTimeIndex ON picfansmsg ( createTime )", "CREATE INDEX IF NOT EXISTS  picfansmsgCreateTalkerTimeIndex ON picfansmsg ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  picfansmsgSendCreateTimeIndex ON picfansmsg ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  picfansmsgTalkerTypeIndex ON picfansmsg ( talker,type )"};
    }
}
