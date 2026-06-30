package qd2;

/* loaded from: classes.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f361818d;

    public s0(qd2.g1 g1Var) {
        this.f361818d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qd2.g1 g1Var = this.f361818d;
        y9.i iVar = g1Var.f361754h;
        if (iVar != null) {
            iVar.dismiss();
        }
        yz5.a aVar = g1Var.f361765s;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
