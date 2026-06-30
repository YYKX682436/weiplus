package n00;

/* loaded from: classes8.dex */
public final class f extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f333819e = {l75.n0.getCreateSQLs(n00.e.f333818z, "EcsGiftMsgRecord")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f333820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.k0 db6) {
        super(db6, n00.e.f333818z, "EcsGiftMsgRecord", null);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = n00.e.f333818z;
        this.f333820d = db6;
    }

    public final boolean D0(java.lang.String giftMsgId) {
        kotlin.jvm.internal.o.g(giftMsgId, "giftMsgId");
        n00.e eVar = new n00.e();
        eVar.field_giftMsgId = giftMsgId;
        boolean z17 = get(eVar, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgRecordStorage", "recordExist giftMsgId:" + giftMsgId + " had:" + z17);
        return z17;
    }

    public final boolean J0(java.lang.String giftMsgId, boolean z17) {
        kotlin.jvm.internal.o.g(giftMsgId, "giftMsgId");
        java.lang.String str = "UPDATE EcsGiftMsgRecord SET hasMsgClicked=" + (z17 ? 1 : 0) + " WHERE giftMsgId='" + giftMsgId + '\'';
        boolean execSQL = execSQL("EcsGiftMsgRecord", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgRecordStorage", "updateHasMsgClicked giftMsgId:" + giftMsgId + " hasMsgClicked:" + z17 + " ret:" + execSQL + " sql:" + str);
        return execSQL;
    }

    public final n00.e y0(java.lang.String giftMsgId) {
        kotlin.jvm.internal.o.g(giftMsgId, "giftMsgId");
        n00.e eVar = new n00.e();
        eVar.field_giftMsgId = giftMsgId;
        get(eVar, new java.lang.String[0]);
        return eVar;
    }

    public final boolean z0(java.lang.String giftMsgId, long j17, java.lang.String talker, boolean z17, java.lang.String appMsgSign, boolean z18) {
        kotlin.jvm.internal.o.g(giftMsgId, "giftMsgId");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(appMsgSign, "appMsgSign");
        n00.e eVar = new n00.e();
        eVar.field_giftMsgId = giftMsgId;
        eVar.field_msgLocalId = j17;
        eVar.field_talkerUserName = talker;
        eVar.field_hasMsgClicked = z17;
        eVar.field_appMsgSign = appMsgSign;
        eVar.field_hasOpenPagPlayed = z18;
        boolean insert = insert(eVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgRecordStorage", "insert giftMsgId:" + giftMsgId + " msgLocalId:" + j17 + " talker: " + talker + ", appMsgSign: " + appMsgSign + ", ret:" + insert);
        return insert;
    }
}
