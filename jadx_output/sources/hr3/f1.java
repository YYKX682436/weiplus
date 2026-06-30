package hr3;

/* loaded from: classes8.dex */
public class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactInfoUI f283536d;

    public f1(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI) {
        this.f283536d = contactInfoUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/ContactInfoUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactInfoUI", "onClick: actionBarClick action_bar_root2");
        com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f283536d;
        if (android.text.TextUtils.equals(contactInfoUI.getIntent().getStringExtra("Contact_User"), en1.a.a())) {
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            if (contactInfoUI != null) {
                bj4.a.f21163a.a(contactInfoUI, -1, true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
