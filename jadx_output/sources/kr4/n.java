package kr4;

/* loaded from: classes8.dex */
public final class n extends l75.n0 {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f311518g = {l75.n0.getCreateSQLs(kr4.o.f311522z, "W1wSessionInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f311519d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f311520e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f311521f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l75.k0 db6) {
        super(db6, kr4.o.f311522z, "W1wSessionInfo", dm.xb.f241101o);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = kr4.o.f311522z;
        this.f311519d = db6;
        this.f311520e = new java.util.concurrent.ConcurrentHashMap();
        this.f311521f = new java.util.concurrent.ConcurrentHashMap();
    }

    public final void D0(java.lang.String sessionId, java.lang.String talkerUserName, java.lang.String selfUserName, int i17, boolean z17, int i18) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(talkerUserName, "talkerUserName");
        kotlin.jvm.internal.o.g(selfUserName, "selfUserName");
        kr4.o oVar = new kr4.o();
        oVar.field_sessionId = sessionId;
        oVar.field_talkerUserName = talkerUserName;
        oVar.field_updateTime = c01.id.c();
        oVar.field_selfUserName = selfUserName;
        oVar.field_status = i17;
        oVar.field_canRecvMsg = z17;
        oVar.field_isHello = i18;
        if (replace(oVar, false)) {
            this.f311520e.remove(oVar.field_talkerUserName + '_' + oVar.field_selfUserName);
            this.f311521f.remove(sessionId);
            doNotify(oVar.field_sessionId);
        }
    }

    public final kr4.o y0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new kr4.o();
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f311521f;
        kr4.o oVar = (kr4.o) concurrentHashMap.get(str);
        if (oVar != null) {
            return oVar;
        }
        kr4.o oVar2 = new kr4.o();
        android.database.Cursor B = this.f311519d.B("select * , rowid from W1wSessionInfo where sessionId = '" + str + "' ", null);
        try {
            if (B.moveToFirst()) {
                oVar2.convertFrom(B);
            }
            vz5.b.a(B, null);
            if (oVar2.systemRowid > 0) {
                concurrentHashMap.put(str, oVar2);
                this.f311520e.put(oVar2.field_talkerUserName + '_' + oVar2.field_selfUserName, oVar2);
            }
            return oVar2;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(B, th6);
                throw th7;
            }
        }
    }

    public final java.lang.String z0(java.lang.String str) {
        java.lang.String str2 = y0(str).field_talkerUserName;
        return str2 == null ? "" : str2;
    }
}
