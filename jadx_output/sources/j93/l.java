package j93;

/* loaded from: classes5.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.n f298428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f298429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f298430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f298431g;

    public l(j93.n nVar, java.lang.String str, com.tencent.mm.ui.base.FlowLayout flowLayout, android.view.View view) {
        this.f298428d = nVar;
        this.f298429e = str;
        this.f298430f = flowLayout;
        this.f298431g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/uic/ContactLabelRecommendUIC$showRecommendByChatroom$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.base.FlowLayout flowLayout = this.f298430f;
        android.view.View view2 = this.f298431g;
        int indexOfChild = flowLayout.indexOfChild(view2);
        j93.n nVar = this.f298428d;
        nVar.f298454t = true;
        nVar.f298447m++;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recommendLabel onTagSelected: ");
        java.lang.String str = this.f298429e;
        sb6.append(str);
        sb6.append(", idx=");
        sb6.append(indexOfChild);
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactLabelRecommendUIC", sb6.toString());
        nVar.f298453s.add(str);
        yz5.a aVar = nVar.f298444g;
        if (aVar != null) {
            aVar.invoke();
        }
        pm0.v.K(null, new j93.i(nVar, indexOfChild));
        android.view.View view3 = this.f298431g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/uic/ContactLabelRecommendUIC$showRecommendByChatroom$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/label/ui/uic/ContactLabelRecommendUIC$showRecommendByChatroom$1$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        flowLayout.removeView(view2);
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/uic/ContactLabelRecommendUIC$showRecommendByChatroom$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
