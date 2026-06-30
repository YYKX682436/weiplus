package ku3;

/* loaded from: classes10.dex */
public final class i0 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f312251d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f312252e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f312253f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f312254g;

    /* renamed from: h, reason: collision with root package name */
    public final android.content.Context f312255h;

    public i0(android.view.ViewGroup parent, ju3.d0 status, zt3.a kitContext) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        this.f312251d = kitContext;
        this.f312252e = jz5.h.b(new ku3.h0(parent));
        this.f312253f = jz5.h.b(new ku3.g0(parent));
        this.f312254g = jz5.h.b(new ku3.f0(parent));
        this.f312255h = parent.getContext();
    }

    public final androidx.recyclerview.widget.RecyclerView a() {
        java.lang.Object value = ((jz5.n) this.f312252e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (androidx.recyclerview.widget.RecyclerView) value;
    }

    public final void b() {
        int i17 = this.f312251d.N6(10) == 0 ? com.tencent.mm.R.raw.icons_filled_more2 : com.tencent.mm.R.raw.icons_outlined_more2;
        java.lang.Object value = ((jz5.n) this.f312253f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) value).s(i17, com.tencent.mm.R.color.f478553an);
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        java.lang.Object value = ((jz5.n) this.f312254g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object value2 = ((jz5.n) this.f312253f).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) value2).setVisibility(i17);
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        b();
        a().setAlpha(0.0f);
        java.lang.Object value = ((jz5.n) this.f312253f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((com.tencent.mm.ui.widget.imageview.WeImageView) value).setOnClickListener(new ku3.u(this));
        a().setLayoutManager(new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(this.f312255h, 0, false));
        a().setAdapter(new ku3.x(this));
        ku3.y yVar = new ku3.y(this);
        zt3.a aVar = this.f312251d;
        aVar.Q6(10, yVar);
        aVar.Q6(16, new ku3.z(this));
        aVar.R6(new ku3.e0(this));
    }
}
