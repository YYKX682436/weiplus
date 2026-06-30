package or1;

/* loaded from: classes12.dex */
public class n implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f347538d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer f347539e;

    public n(com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer bizSearchResultItemContainer) {
        this.f347539e = bizSearchResultItemContainer;
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
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        if (i17 + i18 == i19) {
            this.f347538d = true;
        } else {
            this.f347538d = false;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0 && this.f347538d) {
            com.tencent.mm.plugin.brandservice.ui.BizSearchResultItemContainer bizSearchResultItemContainer = this.f347539e;
            or1.r rVar = bizSearchResultItemContainer.f93984g;
            if ((!rVar.f347561f || rVar.f347556a == 0 || rVar.f347560e) ? false : true) {
                java.lang.String str = rVar.f347557b;
                int i18 = rVar.f347559d;
                long[] jArr = bizSearchResultItemContainer.f93989o;
                bizSearchResultItemContainer.b(str, i18, jArr[jArr.length - 1]);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/ui/BizSearchResultItemContainer$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
