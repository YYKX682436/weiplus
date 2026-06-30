package hr1;

/* loaded from: classes8.dex */
public final class o extends l75.n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final hr1.n f283357g = new hr1.n(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f283358h;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f283359d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f283360e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f283361f;

    static {
        l75.e0 e0Var = hr1.m.f283356x;
        f283358h = new java.lang.String[]{l75.n0.getCreateSQLs(hr1.m.f283356x, "BizFansSessionInfo")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l75.k0 db6) {
        super(db6, hr1.m.f283356x, "BizFansSessionInfo", dm.f1.f236779n);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = hr1.m.f283356x;
        this.f283359d = db6;
        this.f283360e = new java.util.concurrent.ConcurrentHashMap();
        this.f283361f = new java.util.concurrent.ConcurrentHashMap();
    }

    public hr1.m y0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new hr1.m();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f283361f;
        hr1.m mVar = (hr1.m) concurrentHashMap.get(str);
        if (mVar != null) {
            return mVar;
        }
        hr1.m mVar2 = new hr1.m();
        android.database.Cursor B = this.f283359d.B("select * , rowid from BizFansSessionInfo where sessionId = '" + str + "' ", null);
        try {
            if (B.moveToFirst()) {
                mVar2.convertFrom(B);
            }
            vz5.b.a(B, null);
            if (mVar2.systemRowid > 0) {
                concurrentHashMap.put(str, mVar2);
                this.f283360e.put(mVar2.field_talker + '_' + mVar2.field_senderUserName, mVar2);
            }
            return mVar2;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(B, th6);
                throw th7;
            }
        }
    }

    public void z0(hr1.m sessionInfo, int i17, hr1.u source) {
        kotlin.jvm.internal.o.g(sessionInfo, "sessionInfo");
        kotlin.jvm.internal.o.g(source, "source");
        sessionInfo.field_type = i17;
        sessionInfo.field_updateTime = c01.id.c();
        boolean replace = replace(sessionInfo, false);
        if (replace) {
            this.f283360e.remove(sessionInfo.field_talker + '_' + sessionInfo.field_senderUserName);
            this.f283361f.remove(sessionInfo.field_sessionId);
            doNotify(sessionInfo.field_sessionId);
        }
        com.tencent.mars.xlog.Log.i("BizFans.SessionStorage", "[replaceSessionInfo] source=" + source + ", ret=" + replace + ", sessionId=" + sessionInfo.field_sessionId + ", isGreetSession=" + sessionInfo.field_isGreetSession);
    }
}
