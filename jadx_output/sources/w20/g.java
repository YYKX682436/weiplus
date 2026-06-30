package w20;

/* loaded from: classes9.dex */
public final class g extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f442284e = {l75.n0.getCreateSQLs(w20.f.f442283t, "EcsConversationRecord")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f442285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l75.k0 db6) {
        super(db6, w20.f.f442283t, "EcsConversationRecord", null);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = w20.f.f442283t;
        this.f442285d = db6;
    }

    public final boolean D0(java.lang.String talker, int i17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        if (!J0(talker)) {
            w20.f fVar = new w20.f();
            fVar.field_talker = talker;
            fVar.field_ecsUnhandledGiftCount = i17;
            int i18 = h20.c.f278263a;
            fVar.field_ecsGiftRedLabelType = 0;
            boolean insert = insert(fVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsConversationRecordStorage", "insertOrUpdateUnhandledCount, insert new, talker:" + talker + ", unhandled count:" + i17);
            return insert;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsConversationRecordStorage", "insertOrUpdateUnhandledCount, talker:" + talker + ", unhandled count:" + i17);
        boolean execSQL = execSQL("EcsConversationRecord", "UPDATE EcsConversationRecord SET ecsUnhandledGiftCount=" + i17 + " WHERE talker='" + talker + '\'');
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsConversationRecordStorage", "updateEcsUnhandledGiftCount, talker:" + talker + ", unhandled count:" + i17 + ", ret:" + execSQL);
        return execSQL;
    }

    public final boolean J0(java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        w20.f fVar = new w20.f();
        fVar.field_talker = talker;
        boolean z17 = get(fVar, new java.lang.String[0]);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsConversationRecordStorage", "recordExist, talker:" + talker + ", is exist:" + z17);
        return z17;
    }

    public final w20.f y0(java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        w20.f fVar = new w20.f();
        fVar.field_talker = talker;
        if (get(fVar, new java.lang.String[0])) {
            return fVar;
        }
        return null;
    }

    public final boolean z0(java.lang.String talker, int i17, int i18, long j17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        if (!J0(talker)) {
            w20.f fVar = new w20.f();
            fVar.field_talker = talker;
            fVar.field_ecsUnhandledGiftCount = i17;
            fVar.field_ecsGiftRedLabelType = i18;
            fVar.field_lastHandleEcsGiftTimeStampMs = j17;
            boolean insert = insert(fVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsConversationRecordStorage", "insert, talker:" + talker + ", unhandled count:" + i17 + ", red label type:" + i18 + ", last handle gift timestamp:" + j17);
            return insert;
        }
        boolean execSQL = execSQL("EcsConversationRecord", "UPDATE EcsConversationRecord SET ecsUnhandledGiftCount=" + i17 + ", ecsGiftRedLabelType=" + i18 + ", lastHandleEcsGiftTimeStampMs=" + j17 + " WHERE talker='" + talker + '\'');
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsConversationRecordStorage", "updateEcsUnhandledGiftCountAndRedLabelType, talker:" + talker + ", unhandled count:" + i17 + ", label type:" + i18 + ", last handle gift timestamp:" + j17 + ", ret:" + execSQL);
        return execSQL;
    }
}
