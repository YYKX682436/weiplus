package tj5;

/* loaded from: classes8.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.search.WeAppWebSearchView f419835d;

    public b0(com.tencent.mm.ui.search.WeAppWebSearchView weAppWebSearchView) {
        this.f419835d = weAppWebSearchView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/WeAppWebSearchView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.search.WeAppWebSearchView weAppWebSearchView = this.f419835d;
        weAppWebSearchView.getMFtsEditText().m();
        weAppWebSearchView.getMFtsEditText().t();
        yj0.a.h(this, "com/tencent/mm/ui/search/WeAppWebSearchView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
