package p61;

/* loaded from: classes5.dex */
public class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI f352393d;

    public v1(com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI bindMContactVerifyUI) {
        this.f352393d = bindMContactVerifyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindMContactVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI bindMContactVerifyUI = this.f352393d;
        java.lang.String trim = bindMContactVerifyUI.f73001e.getText().toString().trim();
        if (com.tencent.mm.sdk.platformtools.t8.K0(trim)) {
            db5.e1.i(bindMContactVerifyUI, com.tencent.mm.R.string.ahp, com.tencent.mm.R.string.f490573yv);
            yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        bindMContactVerifyUI.hideVKB();
        s61.l1 l1Var = s61.l1.BINDMOBILE;
        if (bindMContactVerifyUI.f73008o == 3) {
            l1Var = s61.l1.CHANGEMOBILE;
        }
        if (bindMContactVerifyUI.f73009p == null) {
            bindMContactVerifyUI.f73009p = new s61.m1(l1Var, bindMContactVerifyUI, new p61.a2(bindMContactVerifyUI));
        }
        s61.m1 m1Var = bindMContactVerifyUI.f73009p;
        m1Var.f403378o = bindMContactVerifyUI.f73004h;
        int i17 = bindMContactVerifyUI.f73008o;
        m1Var.f403377n = i17 == 0 || i17 == 3;
        m1Var.e(bindMContactVerifyUI.f73002f, trim, 2, "");
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindMContactVerifyUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
