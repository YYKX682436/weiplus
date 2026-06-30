package ku3;

/* loaded from: classes3.dex */
public final class c6 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f312183d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f312184e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f312185f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f312186g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f312187h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f312188i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f312189m;

    public c6(zt3.a kitContext, android.view.ViewGroup parent) {
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f312183d = kitContext;
        this.f312184e = parent;
        this.f312185f = jz5.h.b(new ku3.s5(this));
        this.f312186g = jz5.h.b(new ku3.t5(this));
        this.f312187h = jz5.h.b(new ku3.a6(this));
        this.f312188i = jz5.h.b(new ku3.b6(this));
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView a() {
        java.lang.Object value = ((jz5.n) this.f312185f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    public final android.view.View b() {
        java.lang.Object value = ((jz5.n) this.f312186g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.view.View c() {
        java.lang.Object value = ((jz5.n) this.f312188i).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    @Override // yt3.r2
    public void onAttach() {
        this.f312189m = false;
    }

    @Override // yt3.r2
    public void onDetach() {
        this.f312189m = true;
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.view.View c17 = c();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordTopOutsideMenuPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        ku3.w5 w5Var = new ku3.w5(this);
        zt3.a aVar = this.f312183d;
        aVar.R6(w5Var);
        aVar.Q6(10, new ku3.x5(this));
        a().setOnClickListener(new ku3.y5(this));
        b().setOnClickListener(new ku3.z5(this));
    }
}
