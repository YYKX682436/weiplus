package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class bg implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView f173756d;

    public bg(com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView textStatusRecentStatusView) {
        this.f173756d = textStatusRecentStatusView;
    }

    @Override // in5.y
    public boolean c(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusRecentUseView", "onItemLongClick() called with: adapter = " + adapter + ", view = " + view + ", position = " + i17 + ", holder = " + holder);
        com.tencent.mm.plugin.textstatus.ui.TextStatusRecentStatusView textStatusRecentStatusView = this.f173756d;
        androidx.recyclerview.widget.RecyclerView recyclerView = textStatusRecentStatusView.f173688f;
        if (recyclerView != null) {
            java.lang.Object obj = textStatusRecentStatusView.f173689g.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            ej4.k kVar = (ej4.k) obj;
            rl5.r rVar = textStatusRecentStatusView.f173692m;
            if (rVar != null) {
                rVar.a();
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            android.view.View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i17) : null;
            if (findViewByPosition != null) {
                rl5.r rVar2 = new rl5.r(findViewByPosition.getContext());
                rVar2.D = true;
                rVar2.L = new com.tencent.mm.plugin.textstatus.ui.cg(textStatusRecentStatusView);
                textStatusRecentStatusView.f173692m = rVar2;
                int[] iArr = {0, 0};
                findViewByPosition.getLocationInWindow(iArr);
                com.tencent.mm.plugin.textstatus.ui.dg dgVar = new com.tencent.mm.plugin.textstatus.ui.dg(kVar, textStatusRecentStatusView, i17, recyclerView);
                rl5.r rVar3 = textStatusRecentStatusView.f173692m;
                if (rVar3 != null) {
                    int width = (int) (iArr[0] + (findViewByPosition.getWidth() / 2.0f));
                    int i18 = iArr[1];
                    rVar3.f397354x = dgVar;
                    rVar3.f397338f = findViewByPosition;
                    if (!(findViewByPosition instanceof android.widget.TextView) && (width == 0 || i18 == 0)) {
                        rVar3.l();
                    }
                    rVar3.f397356z.clear();
                    rVar3.f397356z.a(0, com.tencent.mm.R.string.jwq);
                    if (width == 0 && i18 == 0) {
                        rVar3.m();
                    } else {
                        rVar3.n(width, i18);
                    }
                }
            }
        }
        return true;
    }
}
