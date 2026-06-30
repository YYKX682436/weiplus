package qr3;

/* loaded from: classes9.dex */
public class x implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f366121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366122e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI f366123f;

    public x(com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI, boolean z17, java.lang.String str) {
        this.f366123f = newBizInfoSettingUI;
        this.f366121d = z17;
        this.f366122e = str;
    }

    @Override // c01.da
    public boolean a() {
        return this.f366123f.f154190w;
    }

    @Override // c01.da
    public void c() {
        com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI = this.f366123f;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = newBizInfoSettingUI.f154189v;
        if (u3Var != null) {
            u3Var.dismiss();
            newBizInfoSettingUI.f154189v = null;
        }
        if (this.f366121d) {
            com.tencent.mm.storage.w Ai = ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Ai();
            Ai.getClass();
            com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4(this.f366122e);
            l4Var.T1("officialaccounts");
            Ai.a(l4Var, Di);
        }
    }
}
