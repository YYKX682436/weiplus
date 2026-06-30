package wd1;

/* loaded from: classes7.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f444807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd1.k f444808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444809f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, wd1.k kVar, java.lang.String str) {
        super(0);
        this.f444807d = context;
        this.f444808e = kVar;
        this.f444809f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnapshotWebViewService", "open context:" + this.f444807d + " runtime:" + this.f444808e.f444822d);
        wd1.k kVar = this.f444808e;
        if (kVar.f444824f == null) {
            int width = kVar.f444822d.f74810s.getWidth();
            int height = this.f444808e.f444822d.f74810s.getHeight();
            wd1.k kVar2 = this.f444808e;
            kVar2.f444824f = new wl1.h(this.f444807d, new wd1.f(kVar2));
            wd1.k kVar3 = this.f444808e;
            com.tencent.mm.plugin.appbrand.o6 o6Var = kVar3.f444822d;
            wl1.h hVar = kVar3.f444824f;
            kotlin.jvm.internal.o.d(hVar);
            com.tencent.mm.ui.widget.MMWebView mMWebView = hVar.f447043c;
            mMWebView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(width, height));
            o6Var.getClass();
            com.tencent.mm.plugin.appbrand.ef.SnapshotWebView.a(o6Var, mMWebView);
            this.f444808e.f444822d.N.a(new wd1.h(this.f444808e));
        }
        wl1.h hVar2 = this.f444808e.f444824f;
        if (hVar2 != null) {
            hVar2.c(this.f444809f);
        }
        return jz5.f0.f302826a;
    }
}
