package ku3;

/* loaded from: classes3.dex */
public final class n2 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f312336d;

    /* renamed from: e, reason: collision with root package name */
    public final zt3.a f312337e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f312338f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f312339g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f312340h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.r2 f312341i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f312342m;

    public n2(android.view.ViewGroup parent, ju3.d0 status, zt3.a kitContext) {
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        this.f312336d = parent;
        this.f312337e = kitContext;
        this.f312338f = jz5.h.b(new ku3.h2(this));
        this.f312339g = jz5.h.b(new ku3.g2(this));
        this.f312340h = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    public final android.view.View a() {
        java.lang.Object value = ((jz5.n) this.f312339g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.widget.TextView b() {
        java.lang.Object value = ((jz5.n) this.f312338f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final void c(java.lang.String str) {
        if (a().getVisibility() != 0) {
            kotlinx.coroutines.r2 r2Var = this.f312342m;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            b().setText(str);
            b().setVisibility(0);
            b().animate().alpha(1.0f).start();
            this.f312342m = kotlinx.coroutines.l.d(this.f312340h, null, null, new ku3.k2(this, null), 3, null);
        }
    }

    public final void d(android.view.View.OnClickListener clickListener) {
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordHintPlugin", "showPermissionAfterHint");
        if (b().getVisibility() == 0) {
            kotlinx.coroutines.r2 r2Var = this.f312341i;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f312341i = kotlinx.coroutines.l.d(this.f312340h, null, null, new ku3.m2(this, null), 3, null);
        } else {
            android.view.View a17 = a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordHintPlugin", "showPermissionAfterHint", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordHintPlugin", "showPermissionAfterHint", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        a().setOnClickListener(clickListener);
    }

    @Override // yt3.r2
    public void release() {
        kotlinx.coroutines.r2 r2Var = this.f312342m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.f312341i;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        kotlinx.coroutines.z0.e(this.f312340h, null, 1, null);
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        ku3.a2 a2Var = new ku3.a2(this);
        zt3.a aVar = this.f312337e;
        aVar.getClass();
        aVar.f475581i.observe(aVar.f475576d, a2Var);
        aVar.R6(new ku3.f2(this));
    }
}
