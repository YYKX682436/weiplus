package yt3;

/* loaded from: classes3.dex */
public final class q2 implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f465607d;

    /* renamed from: e, reason: collision with root package name */
    public final yt3.j2 f465608e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f465609f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f465610g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f465611h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f465612i;

    public q2(android.view.ViewGroup container, ju3.d0 status, yt3.j2 actionProxy) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(actionProxy, "actionProxy");
        this.f465607d = status;
        this.f465608e = actionProxy;
        jz5.g b17 = jz5.h.b(new yt3.p2(container));
        this.f465609f = jz5.h.b(new yt3.k2(container));
        jz5.g b18 = jz5.h.b(new yt3.l2(container));
        this.f465610g = b18;
        jz5.g b19 = jz5.h.b(new yt3.o2(container));
        this.f465611h = b19;
        jz5.g b27 = jz5.h.b(new yt3.m2(container));
        this.f465612i = b27;
        jz5.g b28 = jz5.h.b(new yt3.n2(container));
        a().setVisibility(0);
        java.lang.Object value = ((jz5.n) b18).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.Object value2 = ((jz5.n) b18).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        ((android.widget.ImageView) value).setImageDrawable(com.tencent.mm.ui.uk.e(((android.widget.ImageView) value2).getContext(), com.tencent.mm.R.raw.icons_filled_clip, -1));
        java.lang.Object value3 = ((jz5.n) b17).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        ((android.widget.TextView) value3).setTextColor(-1);
        a().setOnClickListener(this);
        java.lang.Object value4 = ((jz5.n) b19).getValue();
        kotlin.jvm.internal.o.f(value4, "getValue(...)");
        ((android.view.View) value4).setOnClickListener(new yt3.g2(this));
        java.lang.Object value5 = ((jz5.n) b27).getValue();
        kotlin.jvm.internal.o.f(value5, "getValue(...)");
        ((android.view.View) value5).setOnClickListener(new yt3.h2(this));
        java.lang.Object value6 = ((jz5.n) b28).getValue();
        kotlin.jvm.internal.o.f(value6, "getValue(...)");
        ((android.view.View) value6).setOnClickListener(new yt3.i2(this));
    }

    public final android.view.ViewGroup a() {
        java.lang.Object value = this.f465609f.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.ViewGroup) value;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ju3.d0.k(this.f465607d, ju3.c0.H1, null, 2, null);
        nu3.i iVar = nu3.i.f340218a;
        iVar.b(10);
        nu3.i.c(iVar, "KEY_CLICK_CROP_COUNT_INT", 0, 2, null);
        android.view.ViewGroup a17 = a();
        java.lang.Object value = ((jz5.n) this.f465610g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        a17.announceForAccessibility(i65.a.r(((android.widget.ImageView) value).getContext(), com.tencent.mm.R.string.f489966gv));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        a().setVisibility(i17);
    }
}
