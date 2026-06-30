package we0;

/* loaded from: classes.dex */
public final class r1 implements d95.c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final we0.r1 f445156a = new we0.r1();

    @Override // d95.c0
    public final java.lang.String[] a() {
        java.lang.String createSQLs = l75.n0.getCreateSQLs(bt1.b.f24145y1, "textstatusmessage");
        kotlin.jvm.internal.o.f(createSQLs, "getCreateSQLs(...)");
        return new java.lang.String[]{createSQLs, "CREATE INDEX IF NOT EXISTS  textstatusmessageSvrIdIndex ON textstatusmessage ( msgSvrId )", "CREATE INDEX IF NOT EXISTS  textstatusmessageTalkerIndex ON textstatusmessage ( talker )", "CREATE INDEX IF NOT EXISTS  textstatusmessageTalkerStatusIndex ON textstatusmessage ( talker,status )", "CREATE INDEX IF NOT EXISTS  textstatusmessageCreateTimeIndex ON textstatusmessage ( createTime )", "CREATE INDEX IF NOT EXISTS  textstatusmessageCreateTalkerTimeIndex ON textstatusmessage ( talker,createTime )", "CREATE INDEX IF NOT EXISTS  textstatusmessageSendCreateTimeIndex ON textstatusmessage ( status,isSend,createTime )", "CREATE INDEX IF NOT EXISTS  textstatusmessageTalkerTypeIndex ON textstatusmessage ( talker,type )"};
    }
}
