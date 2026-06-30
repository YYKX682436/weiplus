package g63;

/* loaded from: classes8.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final g63.b1 f269095d = new g63.b1();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        z53.t Ui = ((t53.m0) i95.n0.c(t53.m0.class)).Ui();
        ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Bi(((z53.i) ((java.util.LinkedList) Ui.Ca(0, 1)).get(0)).field_sessionId);
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
