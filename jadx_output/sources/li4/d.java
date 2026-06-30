package li4;

/* loaded from: classes10.dex */
public final class d extends l75.n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f318789g = {l75.n0.getCreateSQLs(hi4.n.F, "TextStatusSessionInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f318790d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f318791e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f318792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l75.k0 db6) {
        super(db6, hi4.n.F, "TextStatusSessionInfo", rj4.g.f396331r);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = hi4.n.F;
        this.f318790d = db6;
        this.f318791e = new java.util.concurrent.ConcurrentHashMap();
        this.f318792f = new java.util.concurrent.ConcurrentHashMap();
    }

    public final hi4.n y0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new hi4.n();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f318792f;
        hi4.n nVar = (hi4.n) concurrentHashMap.get(str);
        if (nVar != null) {
            return nVar;
        }
        hi4.n nVar2 = new hi4.n();
        android.database.Cursor B = this.f318790d.B("select * , rowid from TextStatusSessionInfo where sessionId = '" + str + "' ", null);
        try {
            if (B.moveToFirst()) {
                nVar2.convertFrom(B);
            }
            vz5.b.a(B, null);
            if (nVar2.systemRowid > 0) {
                concurrentHashMap.put(str, nVar2);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f318791e;
                java.lang.String field_talker = nVar2.field_talker;
                kotlin.jvm.internal.o.f(field_talker, "field_talker");
                java.lang.String field_senderUserName = nVar2.field_senderUserName;
                kotlin.jvm.internal.o.f(field_senderUserName, "field_senderUserName");
                concurrentHashMap2.put(field_talker + '_' + field_senderUserName, nVar2);
            }
            return nVar2;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(B, th6);
                throw th7;
            }
        }
    }

    public final void z0(java.lang.String sessionId, java.lang.String talker, int i17, int i18, int i19, int i27, java.lang.String senderUserName) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(senderUserName, "senderUserName");
        hi4.n nVar = new hi4.n();
        nVar.field_sessionId = sessionId;
        nVar.field_talker = talker;
        nVar.field_type = i17;
        nVar.field_updateTime = c01.id.c();
        nVar.field_selfUsername = en1.a.a();
        nVar.field_actionPermission = i18;
        nVar.field_rejectMsg = i19;
        nVar.field_disableSendMsg = i27;
        nVar.field_senderUserName = senderUserName;
        android.os.SystemClock.uptimeMillis();
        boolean replace = replace(nVar, false);
        if (replace) {
            this.f318791e.remove(nVar.field_talker + '_' + nVar.field_senderUserName);
            this.f318792f.remove(sessionId);
            doNotify(nVar.field_sessionId);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusSessionInfoStorage", "[replaceSessionInfo]  ret=" + replace + ", sessionId=" + sessionId + ", talker=" + talker + ", actionPermission=" + i18 + ", type=" + i17);
    }
}
