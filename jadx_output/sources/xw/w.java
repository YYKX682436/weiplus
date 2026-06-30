package xw;

/* loaded from: classes.dex */
public class w implements d95.c0 {
    public w(xw.a0 a0Var) {
    }

    @Override // d95.c0
    public java.lang.String[] a() {
        ((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).getClass();
        l75.e0 e0Var = bt1.b.f24145y1;
        kotlin.jvm.internal.o.f(e0Var, "<get-info>(...)");
        java.lang.String createSQLs = l75.n0.getCreateSQLs(e0Var, "bizfansmessage");
        kotlin.jvm.internal.o.f(createSQLs, "getCreateSQLs(...)");
        return new java.lang.String[]{createSQLs, "CREATE INDEX IF NOT EXISTS  bizfansmessageSvrIdIndex ON bizfansmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  bizfansmessageTalkerIndex ON bizfansmessage ( talker )", "CREATE INDEX IF NOT EXISTS  bizfansmessageTalkerStatusIndex ON bizfansmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  bizfansmessageCreateTimeIndex ON bizfansmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  bizfansmessageCreateTalkerTimeIndex ON bizfansmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  bizfansmessageSendCreateTimeIndex ON bizfansmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  bizfansmessageTalkerTypeIndex ON bizfansmessage ( talker,type )"};
    }
}
