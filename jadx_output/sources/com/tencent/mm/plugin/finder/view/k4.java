package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class k4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f132477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f132478e;

    public k4(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout, so2.n1 n1Var) {
        this.f132477d = finderColumnFrameLayout;
        this.f132478e = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout = this.f132477d;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderColumnFrameLayout.getRecyclerView().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        int i17 = -1;
        if (finderColumnFrameLayout.e(this.f132478e)) {
            if (linearLayoutManager != null) {
                i17 = linearLayoutManager.y();
            }
        } else if (linearLayoutManager != null) {
            i17 = linearLayoutManager.t();
        }
        if (i17 == finderColumnFrameLayout.getLastSnappedPosition()) {
            ey2.u uVar = finderColumnFrameLayout.f130914r;
            if (uVar != null && uVar.f257532n) {
                return;
            }
            if (uVar != null && uVar.f257531m) {
                finderColumnFrameLayout.getLoadingView().setVisibility(8);
                android.content.Context context = finderColumnFrameLayout.getContext();
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.d(com.tencent.mm.R.string.njo);
                e4Var.c();
            }
        }
    }
}
