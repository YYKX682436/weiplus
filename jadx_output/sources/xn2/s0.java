package xn2;

/* loaded from: classes2.dex */
public final class s0 extends com.tencent.mm.plugin.finder.view.mj {

    /* renamed from: e, reason: collision with root package name */
    public boolean f455574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xn2.f1 f455575f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(xn2.f1 f1Var, com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout) {
        super(finderRefreshLayout);
        this.f455575f = f1Var;
        kotlin.jvm.internal.o.d(finderRefreshLayout);
        this.f455574e = true;
    }

    @Override // com.tencent.mm.plugin.finder.view.mj
    public void b() {
        xn2.f1 f1Var = this.f455575f;
        int e17 = ((xn2.p0) f1Var.f455493e).e();
        com.tencent.mars.xlog.Log.i("Finder.MegaVideoViewCallback", "updateState data size = " + e17);
        jz5.g gVar = f1Var.f455498m;
        if (e17 <= 0) {
            android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$getIViewCallback$1", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$getIViewCallback$1", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$getIViewCallback$1", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/contract/MegaVideoViewCallback$getIViewCallback$1", "updateState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f1Var.g().setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        super.onItemRangeChanged(i17, i18);
        if (!this.f455574e || i18 <= 0) {
            return;
        }
        this.f455574e = false;
        xn2.f1 f1Var = this.f455575f;
        android.app.Activity context = f1Var.f455492d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) a17).Z6(-1);
        if (Z6 == null || (recyclerView = f1Var.j().getRecyclerView()) == null) {
            return;
        }
        new fc2.i(Z6).onScrollStateChanged(recyclerView, 5);
        com.tencent.mars.xlog.Log.i("Finder.MegaVideoViewCallback", "first item change,positionStart=" + i17 + ",itemCount=" + i18);
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.p1
    public void onPreFinishLoadMore(ym5.s3 reason) {
        android.view.View view;
        kotlin.jvm.internal.o.g(reason, "reason");
        super.onPreFinishLoadMore(reason);
        if (reason.f463523h <= 0) {
            com.tencent.mars.xlog.Log.i("Finder.MegaVideoViewCallback", "no more loadMore data!");
            on5.c loadMoreFooter = this.f455575f.j().getLoadMoreFooter();
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = (loadMoreFooter == null || (view = loadMoreFooter.getView()) == null) ? null : (com.tencent.mm.ui.widget.MMProcessBar) view.findViewById(com.tencent.mm.R.id.ilh);
            if (mMProcessBar == null) {
                return;
            }
            mMProcessBar.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.mj, ym5.p1
    public void onPreFinishRefresh(ym5.s3 reason) {
        android.view.View view;
        kotlin.jvm.internal.o.g(reason, "reason");
        super.onPreFinishRefresh(reason);
        if (reason.f463523h <= 0) {
            com.tencent.mars.xlog.Log.i("Finder.MegaVideoViewCallback", "no more refresh data!");
            on5.d refreshHeader = this.f455575f.j().getRefreshHeader();
            com.tencent.mm.ui.widget.MMProcessBar mMProcessBar = (refreshHeader == null || (view = refreshHeader.getView()) == null) ? null : (com.tencent.mm.ui.widget.MMProcessBar) view.findViewById(com.tencent.mm.R.id.f486588lr5);
            if (mMProcessBar == null) {
                return;
            }
            mMProcessBar.setVisibility(8);
        }
    }
}
