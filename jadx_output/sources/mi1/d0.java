package mi1;

/* loaded from: classes7.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandeEmbedSingleCloseCapsuleBar f326534d;

    public d0(com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandeEmbedSingleCloseCapsuleBar appBrandeEmbedSingleCloseCapsuleBar) {
        this.f326534d = appBrandeEmbedSingleCloseCapsuleBar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandeEmbedSingleCloseCapsuleBar$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandeEmbedSingleCloseCapsuleBar appBrandeEmbedSingleCloseCapsuleBar = this.f326534d;
        android.view.View view2 = appBrandeEmbedSingleCloseCapsuleBar.f86491o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandeEmbedSingleCloseCapsuleBar$initView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandeEmbedSingleCloseCapsuleBar$initView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener weAppHalfScreenHeaderTipsListener = appBrandeEmbedSingleCloseCapsuleBar.f86494r;
        if (weAppHalfScreenHeaderTipsListener != null) {
            weAppHalfScreenHeaderTipsListener.a();
        }
        yz5.a aVar = appBrandeEmbedSingleCloseCapsuleBar.f86495s;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/page/capsulebar/AppBrandeEmbedSingleCloseCapsuleBar$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
