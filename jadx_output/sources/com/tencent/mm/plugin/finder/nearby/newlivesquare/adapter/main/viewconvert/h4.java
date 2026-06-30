package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class h4 implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 f121712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp2.q f121713e;

    public h4(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 p4Var, vp2.q qVar) {
        this.f121712d = p4Var;
        this.f121713e = qVar;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4 p4Var = this.f121712d;
        rl5.r rVar = p4Var.f121884g;
        if (rVar != null) {
            rVar.a();
            p4Var.f121884g = null;
        }
        vp2.q qVar = this.f121713e;
        java.lang.Object obj = qVar.f438951e.get(i17);
        vp2.p pVar = obj instanceof vp2.p ? (vp2.p) obj : null;
        p4Var.o(4, (pVar == null || (feedObject = pVar.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0));
        rl5.r rVar2 = new rl5.r(view.getContext());
        rVar2.C = true;
        rVar2.V = true;
        p4Var.f121884g = rVar2;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = iArr[0] + ((int) (view.getWidth() / 2.0f));
        int a17 = iArr[1] + i65.a.a(view.getContext(), 8.0f);
        rl5.r rVar3 = p4Var.f121884g;
        if (rVar3 != null) {
            rVar3.f397354x = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.o4(i17, qVar, p4Var, adapter);
            rVar3.f397338f = view;
            if (!(view instanceof android.widget.TextView) && (width == 0 || a17 == 0)) {
                rVar3.l();
            }
            rVar3.f397356z.clear();
            db5.g4 g4Var = rVar3.f397356z;
            if (g4Var != null) {
                g4Var.removeItem(1);
            }
            if (g4Var != null) {
                g4Var.b(1, com.tencent.mm.R.string.dze, com.tencent.mm.R.raw.icons_filled_delete);
            }
            if (width == 0 && a17 == 0) {
                rVar3.m();
            } else {
                rVar3.n(width, a17);
            }
        }
        return true;
    }
}
