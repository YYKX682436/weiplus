package ss2;

/* loaded from: classes10.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.d0 f411928d;

    public b0(ss2.d0 d0Var) {
        this.f411928d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/question/QASwitchSceneWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ss2.d0 d0Var = this.f411928d;
        int i17 = d0Var.f411945o == 2 ? 1 : 2;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        d0Var.f411945o = i17;
        d0Var.a();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
