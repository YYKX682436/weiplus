package com.tencent.mm.plugin.label.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/label/ui/AbsLabelUserDialog;", "Lhg5/d;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "checkDismissOnContextDestroy", "Landroid/content/Context;", "uiContext", "Ln80/d;", "uiParamConfig", "Ln80/b;", "dataFetcher", "Ln80/c;", "opCallback", "<init>", "(Landroid/content/Context;Ln80/d;Ln80/b;Ln80/c;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class AbsLabelUserDialog extends hg5.d implements androidx.lifecycle.x {
    public static final /* synthetic */ int K = 0;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final kotlinx.coroutines.y0 I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f143181J;

    /* renamed from: r, reason: collision with root package name */
    public final n80.d f143182r;

    /* renamed from: s, reason: collision with root package name */
    public final n80.b f143183s;

    /* renamed from: t, reason: collision with root package name */
    public final n80.c f143184t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f143185u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f143186v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f143187w;

    /* renamed from: x, reason: collision with root package name */
    public int f143188x;

    /* renamed from: y, reason: collision with root package name */
    public int f143189y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f143190z;

    public /* synthetic */ AbsLabelUserDialog(android.content.Context context, n80.d dVar, n80.b bVar, n80.c cVar, int i17, kotlin.jvm.internal.i iVar) {
        this(context, dVar, (i17 & 4) != 0 ? null : bVar, (i17 & 8) != 0 ? null : cVar);
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.crx, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        com.tencent.mm.view.recyclerview.WxRecyclerView L;
        super.G();
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsLabelUserDialog", "[" + hashCode() + "] initContentView");
        android.view.View view = (android.view.View) ((jz5.n) this.F).getValue();
        if (view != null) {
            view.setOnClickListener(new f93.m(this));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView L2 = L();
        if (L2 != null) {
            L2.setLayoutManager((com.tencent.mm.view.recyclerview.WxLinearLayoutManager) ((jz5.n) this.G).getValue());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView L3 = L();
        if ((L3 != null ? L3.getAdapter() : null) == null && (L = L()) != null) {
            L.setAdapter((f93.e) ((jz5.n) this.f143181J).getValue());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView L4 = L();
        if (L4 != null) {
            L4.N(new f93.o(this));
        }
        kotlinx.coroutines.l.d(this.I, null, null, new f93.n(this, null), 3, null);
    }

    @Override // hg5.d
    public void J() {
        super.J();
        kotlinx.coroutines.z0.e(this.I, null, 1, null);
        java.lang.Object context = getContext();
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AbsLabelUserDialog", "onDismiss: removeObserver to " + getContext());
            yVar.mo133getLifecycle().c(this);
        }
    }

    public final android.widget.TextView K() {
        return (android.widget.TextView) ((jz5.n) this.B).getValue();
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView L() {
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.A).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.label.ui.AbsLabelUserDialog.M(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(int r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.label.ui.AbsLabelUserDialog.N(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(int r24, kotlin.coroutines.Continuation r25) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.label.ui.AbsLabelUserDialog.O(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public final void checkDismissOnContextDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AbsLabelUserDialog", "checkDismissWhenContextDestroy: dialog lifecycle state:" + ((androidx.lifecycle.b0) mo133getLifecycle()).f11605c.name());
        if (((androidx.lifecycle.b0) mo133getLifecycle()).f11605c != androidx.lifecycle.n.DESTROYED) {
            J();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsLabelUserDialog(android.content.Context uiContext, n80.d uiParamConfig, n80.b bVar, n80.c cVar) {
        super(uiContext);
        kotlin.jvm.internal.o.g(uiContext, "uiContext");
        kotlin.jvm.internal.o.g(uiParamConfig, "uiParamConfig");
        this.f143182r = uiParamConfig;
        this.f143183s = bVar;
        this.f143184t = cVar;
        this.f143185u = new java.util.ArrayList();
        this.f143186v = new java.util.ArrayList();
        this.f143187w = new java.util.ArrayList();
        this.f143190z = jz5.h.b(new f93.v(this));
        this.A = jz5.h.b(new f93.u(this));
        this.B = jz5.h.b(new f93.i(this));
        this.C = jz5.h.b(new f93.t(this));
        this.D = jz5.h.b(new f93.j(this));
        this.E = jz5.h.b(new f93.k(this));
        this.F = jz5.h.b(new f93.g(this));
        this.G = jz5.h.b(new f93.q(this));
        this.H = jz5.h.b(f93.h.f260345d);
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.I = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
        this.f143181J = jz5.h.b(new f93.f(this, uiContext));
    }
}
