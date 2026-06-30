package z83;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI f470752d;

    public s(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI) {
        this.f470752d = kidsWatchRegMobileVerifyUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegMobileVerifyUI", "click finish button, code:24");
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegMobileVerifyUI kidsWatchRegMobileVerifyUI = this.f470752d;
        kidsWatchRegMobileVerifyUI.hideVKB();
        kidsWatchRegMobileVerifyUI.f143159i = db5.e1.Q(kidsWatchRegMobileVerifyUI, kidsWatchRegMobileVerifyUI.getString(com.tencent.mm.R.string.f490573yv), kidsWatchRegMobileVerifyUI.getString(com.tencent.mm.R.string.f490604zq), true, true, null);
        java.lang.String obj = kidsWatchRegMobileVerifyUI.T6().f444012h.getText().toString();
        gm0.j1.d().a(145, kidsWatchRegMobileVerifyUI);
        hv.e eVar = (hv.e) i95.n0.c(hv.e.class);
        java.lang.String str = kidsWatchRegMobileVerifyUI.f143155e;
        ((gv.a) eVar).getClass();
        h11.e eVar2 = new h11.e(str, 24, obj, 0, "");
        eVar2.S(kidsWatchRegMobileVerifyUI.f143158h);
        java.lang.String str2 = kidsWatchRegMobileVerifyUI.f143154d;
        if (str2 == null) {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
        ((o45.eh) eVar2.f278071d.getReqObj()).f342922a.C = str2;
        gm0.j1.d().g(eVar2);
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegMobileVerifyUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
