package iu1;

/* loaded from: classes9.dex */
public final class o implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294928a;

    public o(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI) {
        this.f294928a = cardHomePageNewUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI = this.f294928a;
        android.app.Dialog dialog = cardHomePageNewUI.L;
        if (dialog != null) {
            dialog.dismiss();
        }
        cardHomePageNewUI.M = null;
        android.view.ViewGroup viewGroup = cardHomePageNewUI.f95186o;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("mLoadingView2");
            throw null;
        }
        viewGroup.setVisibility(8);
        cardHomePageNewUI.A = false;
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            cardHomePageNewUI.E = 0;
            if (cardHomePageNewUI.f95197z) {
                cardHomePageNewUI.f95197z = false;
            }
            lu1.a0.q(cardHomePageNewUI, "");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 31);
            return jz5.f0.f302826a;
        }
        com.tencent.mm.protobuf.f fVar2 = fVar.f70618d;
        r45.ri3 ri3Var = (r45.ri3) fVar2;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardHomePageNewUI", "retCode: %s", java.lang.Integer.valueOf(ri3Var.f384906d));
        if (ri3Var.f384906d == 0) {
            cardHomePageNewUI.f95187p = ri3Var.f384908f;
            cardHomePageNewUI.f95189r = ri3Var.f384909g == 1;
            java.util.ArrayList arrayList = cardHomePageNewUI.F;
            arrayList.clear();
            r45.ru ruVar = ri3Var.f384916q;
            if (ruVar != null) {
                arrayList.addAll(ruVar.f385209d);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(ri3Var.f384913n)) {
                cardHomePageNewUI.f95190s = ri3Var.f384913n;
            }
            if (cardHomePageNewUI.f95189r) {
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = cardHomePageNewUI.f95183i;
                if (loadMoreRecyclerView == null) {
                    kotlin.jvm.internal.o.o("mRecyclerView");
                    throw null;
                }
                loadMoreRecyclerView.m1(false);
                cardHomePageNewUI.H = ri3Var.f384912m;
                cardHomePageNewUI.Z6();
            } else {
                com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = cardHomePageNewUI.f95183i;
                if (loadMoreRecyclerView2 == null) {
                    kotlin.jvm.internal.o.o("mRecyclerView");
                    throw null;
                }
                loadMoreRecyclerView2.m1(true);
            }
            if (cardHomePageNewUI.f95197z || cardHomePageNewUI.K) {
                cardHomePageNewUI.f95192u.clear();
                cardHomePageNewUI.f95193v.clear();
                cardHomePageNewUI.f95191t.clear();
                cardHomePageNewUI.f95195x = null;
                if (cardHomePageNewUI.f95197z) {
                    cardHomePageNewUI.f95197z = false;
                }
                cardHomePageNewUI.K = false;
            } else {
                ri3Var.f384917r = null;
            }
            cardHomePageNewUI.a7(ri3Var.f384910h, ri3Var.f384911i, ri3Var.f384917r);
            com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView3 = cardHomePageNewUI.f95183i;
            if (loadMoreRecyclerView3 == null) {
                kotlin.jvm.internal.o.o("mRecyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = loadMoreRecyclerView3.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        } else {
            if (cardHomePageNewUI.f95197z) {
                cardHomePageNewUI.f95197z = false;
            }
            lu1.a0.r(cardHomePageNewUI, ri3Var.f384907e);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(16322, 31);
        }
        if (ri3Var.f384914o != 1) {
            return fVar2;
        }
        cardHomePageNewUI.K = true;
        cardHomePageNewUI.f95187p = 0;
        cardHomePageNewUI.E = ri3Var.f384915p;
        cardHomePageNewUI.Y6();
        return fVar2;
    }
}
