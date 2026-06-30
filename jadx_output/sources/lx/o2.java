package lx;

/* loaded from: classes11.dex */
public final class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr1.a f321894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx.v2 f321895e;

    public o2(hr1.a aVar, lx.v2 v2Var) {
        this.f321894d = aVar;
        this.f321895e = v2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f321894d.field_openid;
        lx.v2 v2Var = this.f321895e;
        nr1.f d17 = v2Var.d();
        kotlin.jvm.internal.o.d(str);
        hr1.e z07 = d17.z0(str);
        if (z07.t0()) {
            lx.v2.a(v2Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "[onContactStorageChange] contact refreshed, sessionId=".concat(str));
            lx.v2.b(v2Var, z07);
        }
    }
}
