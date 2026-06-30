package p61;

/* loaded from: classes5.dex */
public class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI f352394d;

    public v2(com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI bindMobileVerifyUI) {
        this.f352394d = bindMobileVerifyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMobileVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI bindMobileVerifyUI = this.f352394d;
        bindMobileVerifyUI.hideVKB();
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("bindmcontact_mobile", bindMobileVerifyUI.f73051f);
        bundle.putInt("voice_verify_type", 4);
        intent.putExtras(bundle);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.x(bindMobileVerifyUI, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMobileVerifyUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
