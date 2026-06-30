package kr4;

/* loaded from: classes.dex */
public final class h implements d95.c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final kr4.h f311509a = new kr4.h();

    @Override // d95.c0
    public final java.lang.String[] a() {
        ((px.a) ((qx.d0) i95.n0.c(qx.d0.class))).getClass();
        l75.e0 e0Var = bt1.b.f24145y1;
        kotlin.jvm.internal.o.f(e0Var, "<get-info>(...)");
        java.lang.String createSQLs = l75.n0.getCreateSQLs(e0Var, "w1wmessage");
        kotlin.jvm.internal.o.f(createSQLs, "getCreateSQLs(...)");
        return new java.lang.String[]{createSQLs, "CREATE INDEX IF NOT EXISTS  w1wmessageSvrIdIndex ON w1wmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  w1wmessageTalkerIndex ON w1wmessage ( talker )", "CREATE INDEX IF NOT EXISTS  w1wmessageTalkerStatusIndex ON w1wmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  w1wmessageCreateTimeIndex ON w1wmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  w1wmessageCreateTalkerTimeIndex ON w1wmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  w1wmessageSendCreateTimeIndex ON w1wmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  w1wmessageTalkerTypeIndex ON w1wmessage ( talker,type )"};
    }
}
