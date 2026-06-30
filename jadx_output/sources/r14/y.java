package r14;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f368633a;

    /* renamed from: b, reason: collision with root package name */
    public final r14.b f368634b;

    /* renamed from: c, reason: collision with root package name */
    public final v24.e f368635c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f368636d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f368637e;

    /* renamed from: f, reason: collision with root package name */
    public final o25.y1 f368638f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f368639g;

    public y(com.tencent.mm.ui.MMActivity context, r14.b controller, v24.e qrCodeReporter) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(qrCodeReporter, "qrCodeReporter");
        this.f368633a = context;
        this.f368634b = controller;
        this.f368635c = qrCodeReporter;
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.f368638f = new com.tencent.mm.pluginsdk.forward.m();
        r14.a[] aVarArr = r14.a.f368606d;
        jz5.l lVar = new jz5.l(0, new r14.i(this));
        r14.a[] aVarArr2 = r14.a.f368606d;
        jz5.l lVar2 = new jz5.l(1, new r14.j(this));
        r14.a[] aVarArr3 = r14.a.f368606d;
        jz5.l lVar3 = new jz5.l(2, new r14.k(this));
        r14.a[] aVarArr4 = r14.a.f368606d;
        jz5.l lVar4 = new jz5.l(3, new r14.l(this));
        r14.a[] aVarArr5 = r14.a.f368606d;
        jz5.l lVar5 = new jz5.l(4, new r14.m(this));
        r14.a[] aVarArr6 = r14.a.f368606d;
        jz5.l lVar6 = new jz5.l(5, new r14.n(this));
        r14.a[] aVarArr7 = r14.a.f368606d;
        jz5.l lVar7 = new jz5.l(6, new r14.o(this));
        r14.a[] aVarArr8 = r14.a.f368606d;
        this.f368639g = kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, new jz5.l(7, new r14.p(this)));
    }

    public static final void a(r14.y yVar, android.view.MenuItem menuItem) {
        int i17;
        yz5.a aVar = (yz5.a) yVar.f368639g.get(java.lang.Integer.valueOf(menuItem.getItemId()));
        if (aVar != null) {
            aVar.invoke();
        }
        int itemId = menuItem.getItemId();
        int d17 = yVar.f368634b.d();
        r14.a[] aVarArr = r14.a.f368606d;
        if (itemId == 0) {
            i17 = 23;
        } else if (itemId == 1) {
            i17 = 24;
        } else if (itemId == 2) {
            i17 = 25;
        } else if (itemId == 3) {
            i17 = 27;
        } else if (itemId == 4) {
            i17 = 28;
        } else if (itemId == 5) {
            i17 = 29;
        } else if (itemId == 6) {
            i17 = 30;
        } else {
            if (itemId != 7) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ColorfulSelfQRCodeDialogHelper", "try reportAction but did not get actionType");
                return;
            }
            i17 = 31;
        }
        v24.e.c(yVar.f368635c, i17, d17, null, null, 0, 28, null);
    }

    public final void b() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f368637e;
        if (k0Var != null) {
            k0Var.V1 = false;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f368633a, 0, false);
        this.f368637e = k0Var2;
        ((com.tencent.mm.pluginsdk.forward.m) this.f368638f).Di(this.f368633a, k0Var2, 1, null, new r14.e(this));
        k0Var2.f211872n = new r14.q(this, k0Var2);
        k0Var2.f211874o = new r14.r(this, k0Var2);
        k0Var2.f211881s = new r14.s(this);
        k0Var2.f211884v = new r14.t(this);
    }
}
