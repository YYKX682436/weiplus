package vw3;

/* loaded from: classes.dex */
public final class h4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final vw3.h4 f440979d = new vw3.h4();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((h45.q) i95.n0.c(h45.q.class)).startUiTest("KindaDemoUI");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerPayDebugUI$onCreate$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
