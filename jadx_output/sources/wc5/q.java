package wc5;

/* loaded from: classes10.dex */
public final class q extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f444622d;

    /* renamed from: e, reason: collision with root package name */
    public long f444623e;

    /* renamed from: f, reason: collision with root package name */
    public long f444624f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.h2 f444625g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f444626h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f444627i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f444628m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.f4 f444629n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Runnable f444630o;

    /* renamed from: p, reason: collision with root package name */
    public ed5.m f444631p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity baseActivity) {
        super(baseActivity);
        kotlin.jvm.internal.o.g(baseActivity, "baseActivity");
        this.f444622d = baseActivity;
    }

    public static final void T6(wc5.q qVar, int i17) {
        ed5.m mVar = qVar.f444631p;
        if (mVar != null) {
            android.animation.AnimatorSet animatorSet = mVar.f251368b;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            mVar.f251368b = null;
            mVar.c();
        }
        ed5.m mVar2 = new ed5.m(qVar.getRecyclerView());
        qVar.f444631p = mVar2;
        long uptimeMillis = 300 - (android.os.SystemClock.uptimeMillis() - qVar.f444624f);
        if (uptimeMillis > 0) {
            qVar.getRecyclerView().postDelayed(new wc5.a(mVar2, i17), uptimeMillis);
        } else {
            mVar2.b(i17);
        }
    }

    public final void U6() {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.h2 h2Var = this.f444625g;
        if (h2Var != null && (adapter = getRecyclerView().getAdapter()) != null) {
            adapter.unregisterAdapterDataObserver(h2Var);
        }
        this.f444625g = null;
    }

    public final void V6() {
        java.lang.Runnable runnable = this.f444630o;
        if (runnable != null) {
            getRecyclerView().removeCallbacks(runnable);
        }
        this.f444630o = null;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = this.f444629n;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        this.f444629n = null;
    }

    public final int W6(long j17) {
        xm3.t0 b17 = xm3.u0.b(getRecyclerView());
        if (b17 == null) {
            return -1;
        }
        java.util.List data = b17.getData();
        int size = data.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.Object obj = data.get(i17);
            uc5.h0 h0Var = obj instanceof uc5.h0 ? (uc5.h0) obj : null;
            if (h0Var != null && h0Var.f426494d.p().getMsgId() == j17) {
                return i17;
            }
        }
        return -1;
    }

    public final uc5.r X6() {
        android.view.LayoutInflater.Factory factory = this.f444622d;
        kotlin.jvm.internal.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        return (uc5.r) factory;
    }

    public final void Y6() {
        if (this.f444627i) {
            return;
        }
        this.f444627i = true;
        kotlinx.coroutines.r2 r2Var = this.f444626h;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f444626h = null;
        U6();
        long j17 = this.f444623e;
        if (j17 == 0) {
            V6();
            return;
        }
        if (j17 == 0) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(W6(j17));
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryInitialLoadUIC", "startLocateLoad: targetMsgId=" + j17 + " found in initial data at position=" + intValue);
            V6();
            Z6(intValue);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryInitialLoadUIC", "startLocateLoad: targetMsgId=" + j17 + " not in initial data, start paging");
        if (this.f444630o == null && this.f444629n == null) {
            wc5.c cVar = new wc5.c(this);
            this.f444630o = cVar;
            getRecyclerView().postDelayed(cVar, 300L);
        }
        this.f444628m = v65.i.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) X6()).k7(), null, new wc5.p(this, j17, null), 1, null);
    }

    public final void Z6(int i17) {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/components/MsgHistoryGalleryInitialLoadUIC", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(linearLayoutManager, "com/tencent/mm/ui/chatting/history/components/MsgHistoryGalleryInitialLoadUIC", "scrollToPosition", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            getRecyclerView().post(new wc5.e(this, linearLayoutManager, i17));
        } else {
            com.tencent.mm.view.recyclerview.WxRecyclerView recyclerView = getRecyclerView();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/components/MsgHistoryGalleryInitialLoadUIC", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/ui/chatting/history/components/MsgHistoryGalleryInitialLoadUIC", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
            getRecyclerView().post(new wc5.f(this, i17));
        }
        this.f444623e = 0L;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView getRecyclerView() {
        return ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) X6()).m7();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        U6();
        kotlinx.coroutines.r2 r2Var = this.f444628m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f444628m = null;
        kotlinx.coroutines.r2 r2Var2 = this.f444626h;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        this.f444626h = null;
        V6();
        ed5.m mVar = this.f444631p;
        if (mVar != null) {
            android.animation.AnimatorSet animatorSet = mVar.f251368b;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            mVar.f251368b = null;
            mVar.c();
        }
        this.f444631p = null;
        super.onFinished();
    }
}
