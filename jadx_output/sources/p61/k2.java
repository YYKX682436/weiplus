package p61;

/* loaded from: classes5.dex */
public class k2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352302d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobileUI f352303e;

    public k2(com.tencent.mm.plugin.account.bind.ui.BindMobileUI bindMobileUI, java.lang.String str) {
        this.f352303e = bindMobileUI;
        this.f352302d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.bind.ui.BindMobileUI bindMobileUI = this.f352303e;
        s61.m1 m1Var = bindMobileUI.f73036m;
        java.lang.String str = this.f352302d;
        if (m1Var == null) {
            bindMobileUI.f73036m = new s61.m1(s61.l1.BINDMOBILE, bindMobileUI, new p61.q2(bindMobileUI, str));
        }
        bindMobileUI.f73036m.d(str);
        if (bindMobileUI.A) {
            bindMobileUI.f73036m.f403377n = false;
        }
    }
}
