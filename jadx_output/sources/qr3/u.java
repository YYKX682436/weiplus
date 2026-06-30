package qr3;

/* loaded from: classes9.dex */
public class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI f366118d;

    public u(com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI) {
        this.f366118d = newBizInfoSettingUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.o oVar;
        com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI = this.f366118d;
        qk.o oVar2 = newBizInfoSettingUI.f154176f;
        boolean z17 = oVar2 != null && oVar2.T0();
        java.lang.String d17 = newBizInfoSettingUI.f154175e.d1();
        ((e21.z0) c01.d9.b().w()).c(new e21.m(d17, ((com.tencent.mm.storage.g9) c01.d9.b().u()).r6(d17).I0()));
        newBizInfoSettingUI.f154190w = false;
        newBizInfoSettingUI.f154189v = db5.e1.Q(newBizInfoSettingUI, newBizInfoSettingUI.getString(com.tencent.mm.R.string.f490573yv), newBizInfoSettingUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new qr3.w(newBizInfoSettingUI));
        c01.w9.h(d17, new qr3.x(newBizInfoSettingUI, z17, d17));
        r01.q3.nj().D0(d17);
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.tencent.mm.modelsimple.g1.I(d17, 15);
        gr3.e.b(newBizInfoSettingUI.f154175e.d1(), oc1.e.CTRL_INDEX, newBizInfoSettingUI.f154181n, newBizInfoSettingUI.getIntent(), newBizInfoSettingUI.f154183p);
        if (newBizInfoSettingUI.f154175e == null || (oVar = newBizInfoSettingUI.f154176f) == null || !oVar.Q0()) {
            return;
        }
        r01.q3.Zi().b(newBizInfoSettingUI.f154175e.d1(), 17, 0, 0.0f, 0.0f, 0, null, 0, newBizInfoSettingUI.f154191x, null);
    }
}
