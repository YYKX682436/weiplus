package v41;

/* loaded from: classes15.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v41.q f433222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f433223e;

    public p(v41.q qVar, int i17) {
        this.f433222d = qVar;
        this.f433223e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/OpenIMKefuConfirmFullUIModelImpl$showConfirmUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l41.m mVar = this.f433222d.f433205e;
        if (mVar != null) {
            ((l41.j1) mVar).d(this.f433223e);
        }
        yj0.a.h(this, "com/tencent/mm/openim/ui/OpenIMKefuConfirmFullUIModelImpl$showConfirmUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
