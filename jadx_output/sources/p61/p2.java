package p61;

/* loaded from: classes5.dex */
public class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobileUI f352346d;

    public p2(com.tencent.mm.plugin.account.bind.ui.BindMobileUI bindMobileUI) {
        this.f352346d = bindMobileUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobileUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.account.bind.ui.BindMobileUI bindMobileUI = this.f352346d;
        intent.putExtra("country_name", bindMobileUI.f73037n);
        intent.putExtra("couttry_code", bindMobileUI.f73038o);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.o(intent, bindMobileUI, 100);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
