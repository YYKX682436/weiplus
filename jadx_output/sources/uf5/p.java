package uf5;

/* loaded from: classes3.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.x f427281d;

    public p(uf5.x xVar) {
        this.f427281d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/privacy/BatchLabelUIC$initBatchBottomBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        uf5.x.T6(this.f427281d);
        yj0.a.h(this, "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$initBatchBottomBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
