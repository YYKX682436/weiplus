package g63;

/* loaded from: classes.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.TestUI f269093d;

    public a1(com.tencent.mm.plugin.gamelife.ui.TestUI testUI) {
        this.f269093d = testUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        t53.m0 m0Var = (t53.m0) i95.n0.c(t53.m0.class);
        com.tencent.mm.plugin.gamelife.ui.TestUI testUI = this.f269093d;
        m0Var.Bi(testUI, testUI.f142000e, testUI.f141999d, 0, null, null);
        yj0.a.h(this, "com/tencent/mm/plugin/gamelife/ui/TestUI$onCreate$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
