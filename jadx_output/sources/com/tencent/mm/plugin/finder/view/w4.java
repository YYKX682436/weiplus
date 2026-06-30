package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class w4 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f133283d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout) {
        super(3);
        this.f133283d = finderColumnFrameLayout;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        androidx.lifecycle.j0 j0Var;
        jz5.l lVar;
        androidx.recyclerview.widget.RecyclerView o17;
        android.view.View view = (android.view.View) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout = this.f133283d;
        java.lang.ref.WeakReference weakReference = finderColumnFrameLayout.getColumnFeedSelectorAdapter().f244113x;
        java.lang.Integer num = null;
        in5.s0 s0Var = weakReference != null ? (in5.s0) weakReference.get() : null;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = (s0Var == null || (o17 = s0Var.o()) == null) ? null : o17.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager != null) {
            finderLinearLayoutManager.C = !booleanValue;
        }
        float f17 = booleanValue ? 0.0f : 1.0f;
        com.tencent.mm.plugin.finder.view.PageIndicatorView pageIndicatorView = finderColumnFrameLayout.f130911o;
        if (pageIndicatorView != null) {
            pageIndicatorView.setAlpha(f17);
        }
        android.widget.TextView textView = finderColumnFrameLayout.f130910n;
        if (textView != null) {
            textView.setAlpha(f17);
        }
        java.lang.Iterable iterable = kz5.p0.f313996d;
        if (longValue != 0) {
            ey2.u uVar = finderColumnFrameLayout.f130914r;
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = (uVar == null || (j0Var = uVar.f257542x) == null || (lVar = (jz5.l) j0Var.getValue()) == null) ? null : (com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer) lVar.f302833d;
            if (dataBuffer != null) {
                java.util.Iterator<T> it = dataBuffer.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (hc2.o0.s((so2.j5) it.next()) == longValue) {
                        break;
                    }
                    i17++;
                }
                num = java.lang.Integer.valueOf(i17);
            }
            if (num != null && num.intValue() != -1) {
                java.util.List b17 = kz5.b0.b();
                if (num.intValue() > 0) {
                    ((lz5.e) b17).add(java.lang.Integer.valueOf(num.intValue() - 1));
                }
                if (num.intValue() < dataBuffer.size() - 1) {
                    ((lz5.e) b17).add(java.lang.Integer.valueOf(num.intValue() + 1));
                }
                iterable = kz5.b0.a(b17);
            }
        }
        java.util.Iterator it6 = iterable.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Number) it6.next()).intValue();
            androidx.recyclerview.widget.f2 adapter = finderColumnFrameLayout.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(intValue, "speedChanged");
            }
        }
        if (booleanValue && (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) view.findViewById(com.tencent.mm.R.id.e_k)) != null && !finderVideoLayout.J()) {
            finderVideoLayout.M();
        }
        return jz5.f0.f302826a;
    }
}
