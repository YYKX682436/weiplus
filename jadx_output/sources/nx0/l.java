package nx0;

/* loaded from: classes5.dex */
public final class l extends vu3.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel f341155b;

    public l(com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel beautifyPanel) {
        this.f341155b = beautifyPanel;
    }

    @Override // vu3.c
    public void b(uu3.u layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautifyPanel beautifyPanel = this.f341155b;
        beautifyPanel.setVisibility(4);
        int ordinal = beautifyPanel.f69573m.ordinal();
        if (ordinal == 0) {
            beautifyPanel.f69567d.invoke();
        } else if (ordinal == 1) {
            java.lang.ref.WeakReference weakReference = beautifyPanel.f69568e;
            if (weakReference == null) {
                kotlin.jvm.internal.o.o("controller");
                throw null;
            }
            nx0.n nVar = (nx0.n) weakReference.get();
            if (nVar != null) {
                nx0.h hVar = new nx0.h(beautifyPanel);
                wx0.c0 c0Var = (wx0.c0) nVar;
                yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                kotlinx.coroutines.l.d(m7Var.Di(), null, null, new yy0.f6(m7Var, null), 3, null);
                kotlinx.coroutines.l.d(c0Var.g(), kotlinx.coroutines.internal.b0.f310484a, null, new wx0.r(c0Var, hVar, null), 2, null);
            }
        } else if (ordinal == 2) {
            java.lang.ref.WeakReference weakReference2 = beautifyPanel.f69568e;
            if (weakReference2 == null) {
                kotlin.jvm.internal.o.o("controller");
                throw null;
            }
            nx0.n nVar2 = (nx0.n) weakReference2.get();
            if (nVar2 != null) {
                nx0.i iVar = new nx0.i(beautifyPanel);
                wx0.c0 c0Var2 = (wx0.c0) nVar2;
                yy0.m7 m7Var2 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                kotlinx.coroutines.l.d(m7Var2.Di(), null, null, new yy0.i6(m7Var2, null), 3, null);
                kotlinx.coroutines.l.d(c0Var2.g(), kotlinx.coroutines.internal.b0.f310484a, null, new wx0.a0(c0Var2, iVar, null), 2, null);
            }
        } else if (ordinal == 3) {
            java.lang.ref.WeakReference weakReference3 = beautifyPanel.f69568e;
            if (weakReference3 == null) {
                kotlin.jvm.internal.o.o("controller");
                throw null;
            }
            nx0.n nVar3 = (nx0.n) weakReference3.get();
            if (nVar3 != null) {
                nx0.j jVar = new nx0.j(beautifyPanel);
                wx0.c0 c0Var3 = (wx0.c0) nVar3;
                yy0.m7 m7Var3 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                kotlinx.coroutines.l.d(m7Var3.Di(), null, null, new yy0.h6(m7Var3, null), 3, null);
                kotlinx.coroutines.l.d(c0Var3.g(), kotlinx.coroutines.internal.b0.f310484a, null, new wx0.x(c0Var3, jVar, null), 2, null);
            }
        } else if (ordinal == 4) {
            java.lang.ref.WeakReference weakReference4 = beautifyPanel.f69568e;
            if (weakReference4 == null) {
                kotlin.jvm.internal.o.o("controller");
                throw null;
            }
            nx0.n nVar4 = (nx0.n) weakReference4.get();
            if (nVar4 != null) {
                nx0.k kVar = new nx0.k(beautifyPanel);
                wx0.c0 c0Var4 = (wx0.c0) nVar4;
                yy0.m7 m7Var4 = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
                kotlinx.coroutines.l.d(m7Var4.Di(), null, null, new yy0.g6(m7Var4, null), 3, null);
                kotlinx.coroutines.l.d(c0Var4.g(), kotlinx.coroutines.internal.b0.f310484a, null, new wx0.u(c0Var4, kVar, null), 2, null);
            }
        }
        beautifyPanel.f69573m = nx0.g.f341108d;
    }

    @Override // vu3.c
    public void d(uu3.u layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        this.f341155b.setEnabled(true);
    }
}
