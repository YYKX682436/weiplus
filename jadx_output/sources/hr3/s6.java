package hr3;

/* loaded from: classes9.dex */
public class s6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t6 f283969d;

    public s6(hr3.t6 t6Var) {
        this.f283969d = t6Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f283969d.g();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/ContactWidgetBizInfo$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
