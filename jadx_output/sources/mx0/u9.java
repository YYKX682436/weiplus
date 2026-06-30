package mx0;

/* loaded from: classes3.dex */
public final class u9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.v9 f332385d;

    public u9(mx0.v9 v9Var) {
        this.f332385d = v9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapterWithEmptyTemplate$bindEmptyTemplate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a aVar = this.f332385d.f332403i;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/ShootComposingTemplateAdapterWithEmptyTemplate$bindEmptyTemplate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
