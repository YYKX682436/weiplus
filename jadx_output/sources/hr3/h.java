package hr3;

/* loaded from: classes.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.AddDescriptionUI f283600d;

    public h(com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI) {
        this.f283600d = addDescriptionUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.profile.ui.AddDescriptionUI.B;
        com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI = this.f283600d;
        addDescriptionUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) addDescriptionUI.getContext(), 1, true);
        k0Var.f211872n = new hr3.j(addDescriptionUI);
        k0Var.f211881s = new hr3.k(addDescriptionUI);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
