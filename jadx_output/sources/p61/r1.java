package p61;

/* loaded from: classes5.dex */
public class r1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactUI f352363d;

    public r1(com.tencent.mm.plugin.account.bind.ui.BindMContactUI bindMContactUI) {
        this.f352363d = bindMContactUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMContactUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.account.bind.ui.BindMContactUI bindMContactUI = this.f352363d;
        intent.putExtra("country_name", bindMContactUI.f72992o);
        intent.putExtra("couttry_code", bindMContactUI.f72993p);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.o(intent, bindMContactUI, 100);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
