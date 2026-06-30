package vr3;

/* loaded from: classes10.dex */
public class z implements vr3.e0, im5.b, yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f439661d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f439662e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f439663f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f439664g;

    /* renamed from: h, reason: collision with root package name */
    public int f439665h;

    /* renamed from: i, reason: collision with root package name */
    public long f439666i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Intent f439667m;

    /* renamed from: n, reason: collision with root package name */
    public cs3.f f439668n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.tab.m0 f439669o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f439670p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f439671q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f439672r;

    public z(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f439661d = context;
        this.f439662e = z17;
        this.f439663f = "";
        this.f439664g = new java.util.ArrayList();
        this.f439670p = true;
        this.f439671q = new java.util.concurrent.CopyOnWriteArraySet();
    }

    public final int a(cs3.f fVar) {
        int i17;
        androidx.recyclerview.widget.RecyclerView recyclerView = fVar.g().getRecyclerView();
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (adapter == null || layoutManager == null) {
            i17 = 0;
        } else {
            int itemCount = adapter.getItemCount();
            i17 = 0;
            for (int i18 = 0; i18 < itemCount; i18++) {
                android.view.View findViewByPosition = layoutManager.findViewByPosition(i18);
                if (findViewByPosition != null) {
                    i17 += findViewByPosition.getMeasuredHeight();
                }
            }
        }
        android.widget.FrameLayout frameLayout = fVar.f222110h;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("headerLayout");
            throw null;
        }
        int measuredHeight = frameLayout.getMeasuredHeight();
        if (measuredHeight == 0) {
            android.widget.FrameLayout frameLayout2 = fVar.f222110h;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.o.o("headerLayout");
                throw null;
            }
            measuredHeight = i65.a.f(frameLayout2.getContext(), com.tencent.mm.R.dimen.f479731dn);
        }
        int i19 = i17 + measuredHeight;
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i27 = b17.x;
        int i28 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17) {
            if (i28 >= i27) {
                i27 = i28;
            }
            i28 = i27;
        }
        android.content.Context context = this.f439661d;
        int h17 = com.tencent.mm.ui.bl.h(context);
        return java.lang.Math.max((int) (i28 * 0.25f), (((i28 - h17) - com.tencent.mm.ui.bl.g(context)) - i19) + h17);
    }

    public void d() {
        if (!this.f439672r) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "onDetach: cannot detach when have not attached");
            return;
        }
        this.f439672r = false;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f439671q;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((im5.a) it.next()).dead();
        }
        copyOnWriteArraySet.clear();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "set upContinue false");
        this.f439670p = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "set downContinue true");
        cs3.f fVar = this.f439668n;
        com.tencent.mm.view.RefreshLoadMoreLayout g17 = fVar != null ? fVar.g() : null;
        if (g17 != null) {
            g17.setHasBottomMore(true);
        }
        cs3.f fVar2 = this.f439668n;
        androidx.recyclerview.widget.RecyclerView recyclerView = fVar2 != null ? fVar2.g().getRecyclerView() : null;
        if (recyclerView != null) {
            recyclerView.setLayoutFrozen(true);
        }
        cs3.f fVar3 = this.f439668n;
        com.tencent.mm.view.RefreshLoadMoreLayout g18 = fVar3 != null ? fVar3.g() : null;
        if (g18 != null) {
            g18.setActionCallback(null);
        }
        this.f439668n = null;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        r45.mm serviceInfo = (r45.mm) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(serviceInfo, "serviceInfo");
        java.lang.String str = this.f439663f;
        long j17 = this.f439666i;
        android.content.Intent intent = this.f439667m;
        if (intent == null) {
            kotlin.jvm.internal.o.o("intent");
            throw null;
        }
        gr3.e.d(str, 1100, j17, intent, 0, this.f439665h, 0, null, null, null, 0, 0, 4032, null);
        if (this.f439662e) {
            gr3.b.f274847a.b(0L, java.lang.Long.valueOf(intValue), 801L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : null, this.f439665h, (r29 & 128) != 0 ? 0 : 0, (r29 & 256) != 0 ? 0 : 0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileServiceInfoDrawerPresenter", "onClick serviceInfo.type:%d", java.lang.Integer.valueOf(serviceInfo.f380636e));
        ku5.u0 u0Var = ku5.t0.f312615d;
        vr3.x xVar = new vr3.x(serviceInfo, this, intValue, intValue2);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(xVar, 250L, false);
        cs3.f fVar = this.f439668n;
        if (fVar != null) {
            com.tencent.mm.plugin.profile.ui.widget.BizProfileServiceInfoDrawer h17 = fVar.h();
            if (h17.q()) {
                h17.n(true);
            }
        }
        return jz5.f0.f302826a;
    }

    @Override // im5.b
    public void keep(im5.a aVar) {
        this.f439671q.add(aVar);
    }
}
