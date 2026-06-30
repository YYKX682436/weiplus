package nr1;

/* loaded from: classes8.dex */
public final class k extends l75.n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final nr1.j f339152g = new nr1.j(null);

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.String[] f339153h;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f339154d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f339155e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f339156f;

    static {
        l75.e0 e0Var = hr1.m.f283356x;
        f339153h = new java.lang.String[]{l75.n0.getCreateSQLs(hr1.m.f283356x, "BizPhotoFansSessionInfo")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l75.k0 db6) {
        super(db6, hr1.m.f283356x, "BizPhotoFansSessionInfo", dm.f1.f236779n);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = hr1.m.f283356x;
        this.f339154d = db6;
        this.f339155e = new java.util.concurrent.ConcurrentHashMap();
        this.f339156f = new java.util.concurrent.ConcurrentHashMap();
    }

    public void D0(hr1.m sessionInfo, int i17, hr1.u source) {
        kotlin.jvm.internal.o.g(sessionInfo, "sessionInfo");
        kotlin.jvm.internal.o.g(source, "source");
        sessionInfo.field_type = i17;
        sessionInfo.field_updateTime = c01.id.c();
        boolean replace = replace(sessionInfo, false);
        if (replace) {
            this.f339155e.remove(sessionInfo.field_talker + '_' + sessionInfo.field_senderUserName);
            this.f339156f.remove(sessionInfo.field_sessionId);
            doNotify(sessionInfo.field_sessionId);
        }
        com.tencent.mars.xlog.Log.i("BizPhotoFans.SessionStorage", "[replaceSessionInfo] source=" + source + ", ret=" + replace + ", sessionId=" + sessionInfo.field_sessionId + ", isGreetSession=" + sessionInfo.field_isGreetSession);
    }

    public boolean y0(java.lang.String sessionId, boolean z17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        hr1.m z07 = z0(sessionId);
        this.f339156f.remove(sessionId);
        this.f339155e.remove(z07.field_talker + '_' + z07.field_senderUserName);
        return delete(z07, z17, com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID);
    }

    public hr1.m z0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new hr1.m();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f339156f;
        hr1.m mVar = (hr1.m) concurrentHashMap.get(str);
        if (mVar != null) {
            return mVar;
        }
        hr1.m mVar2 = new hr1.m();
        android.database.Cursor B = this.f339154d.B("select * , rowid from BizPhotoFansSessionInfo where sessionId = '" + str + "' ", null);
        try {
            if (B.moveToFirst()) {
                mVar2.convertFrom(B);
            }
            vz5.b.a(B, null);
            if (mVar2.systemRowid > 0) {
                concurrentHashMap.put(str, mVar2);
                this.f339155e.put(mVar2.field_talker + '_' + mVar2.field_senderUserName, mVar2);
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
}
