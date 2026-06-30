package sj3;

/* loaded from: classes14.dex */
public class w4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a5 f408791d;

    public w4(sj3.a5 a5Var) {
        this.f408791d = a5Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sj3.a5 a5Var = this.f408791d;
        if (a5Var.f408417d.findViewById(com.tencent.mm.R.id.k6o) != null) {
            a5Var.f408417d.W6(2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkTalkingUILogic$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
