package hr3;

/* loaded from: classes8.dex */
public class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactInfoUI f283505d;

    public e1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI) {
        this.f283505d = contactInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/ContactInfoUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onClick: actionBarClick action_bar_root");
        java.util.Map map = com.tencent.mm.plugin.profile.ui.ContactInfoUI.U;
        this.f283505d.d7();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
