package nu4;

/* loaded from: classes7.dex */
public final class n implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f340260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.r f340262c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f340264e;

    public n(nu4.b0 b0Var, java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.r rVar, java.lang.String str2, yz5.l lVar) {
        this.f340260a = b0Var;
        this.f340261b = str;
        this.f340262c = rVar;
        this.f340263d = str2;
        this.f340264e = lVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.util.HashMap hashMap = this.f340260a.H;
        com.tencent.mm.plugin.appbrand.jsruntime.r rVar = this.f340262c;
        hashMap.put(this.f340261b, java.lang.Integer.valueOf(rVar.o()));
        java.lang.String domain = this.f340263d;
        kotlin.jvm.internal.o.f(domain, "$domain");
        com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.a(domain);
        this.f340264e.invoke(rVar);
    }
}
