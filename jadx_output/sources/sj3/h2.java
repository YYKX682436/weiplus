package sj3;

/* loaded from: classes5.dex */
public final class h2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f408547d;

    public h2(sj3.g3 g3Var) {
        this.f408547d = g3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$hideScreenCastBigVideo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sj3.g3.a(this.f408547d);
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic$hideScreenCastBigVideo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
