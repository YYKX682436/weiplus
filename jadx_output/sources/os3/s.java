package os3;

/* loaded from: classes8.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ComposeUI f348189d;

    public s(com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI) {
        this.f348189d = composeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/ComposeUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.qqmail.ui.ComposeUI composeUI = this.f348189d;
        composeUI.f154835g.setVisibility(8);
        composeUI.f154836h.setVisibility(0);
        composeUI.f154840n.setVisibility(0);
        composeUI.f154835g.post(new os3.r(this));
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/ComposeUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
