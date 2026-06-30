package du3;

/* loaded from: classes3.dex */
public final class h4 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f243609f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f243610g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f243611h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f243612i;

    /* renamed from: m, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f243613m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f243614n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f243615o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f243609f = parent;
        this.f243610g = jz5.h.b(new du3.u3(this));
        this.f243611h = jz5.h.b(new du3.g4(this));
        this.f243612i = jz5.h.b(new du3.v3(this));
        this.f243613m = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f243615o = jz5.h.b(new du3.f4(this));
    }

    public final android.view.View A() {
        java.lang.Object value = this.f243610g.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView B() {
        java.lang.Object value = this.f243612i.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    public final hk0.u0 C() {
        return (hk0.u0) ((jz5.n) this.f243615o).getValue();
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView D() {
        java.lang.Object value = this.f243611h.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.imageview.WeImageView) value;
    }

    @Override // yt3.r2
    public void onAttach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoUndoPlugin", "onAttach");
        android.view.View A = A();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(A, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        A.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(A, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C().Z6(2, new du3.y3(this));
        C().Z6(3, new du3.z3(this));
        C().Z6(4, new du3.a4(this));
        C().a7(1, new du3.b4(this));
        this.f243614n = kotlinx.coroutines.l.d(this.f243613m, null, null, new du3.e4(this, null), 3, null);
    }

    @Override // yt3.r2
    public void onDetach() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoUndoPlugin", "onDetach");
        kotlinx.coroutines.r2 r2Var = this.f243614n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        if (D().isEnabled()) {
            z(D(), false);
        }
        if (B().isEnabled()) {
            z(B(), false);
        }
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        D().setOnClickListener(new du3.w3(this));
        B().setOnClickListener(new du3.x3(this));
    }

    public final void z(com.tencent.mm.ui.widget.imageview.WeImageView view, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoUndoPlugin", "changeUndoState >> " + z17);
        view.setEnabled(z17);
        view.setIconColor(i65.a.d(this.f243609f.getContext(), z17 ? com.tencent.mm.R.color.f479273ac5 : com.tencent.mm.R.color.ac6));
    }
}
