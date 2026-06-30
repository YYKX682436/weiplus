package wb1;

/* loaded from: classes.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f444358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f444359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f444360f;

    public c(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var) {
        this.f444358d = lVar;
        this.f444359e = i17;
        this.f444360f = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f444358d.a(this.f444359e, this.f444360f.o("ok"));
    }
}
