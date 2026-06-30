package db5;

/* loaded from: classes8.dex */
public class e4 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMLoadMoreListView f228326d;

    public e4(com.tencent.mm.ui.base.MMLoadMoreListView mMLoadMoreListView) {
        this.f228326d = mMLoadMoreListView;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMLoadMoreListView$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.tencent.mm.ui.base.MMLoadMoreListView mMLoadMoreListView = this.f228326d;
        if (i17 == 0 && mMLoadMoreListView.getChildAt(0) != null && mMLoadMoreListView.getChildAt(0).getTop() == mMLoadMoreListView.getPaddingTop()) {
            mMLoadMoreListView.f197495f = true;
        } else {
            mMLoadMoreListView.f197495f = false;
        }
        new java.lang.StringBuilder("").append(mMLoadMoreListView.f197495f);
        yj0.a.h(this, "com/tencent/mm/ui/base/MMLoadMoreListView$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        db5.f4 f4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMLoadMoreListView$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (absListView.getLastVisiblePosition() == absListView.getCount() - 1 && (f4Var = this.f228326d.f197494e) != null) {
            f4Var.onLoadMore();
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMLoadMoreListView$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
