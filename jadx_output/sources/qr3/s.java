package qr3;

/* loaded from: classes9.dex */
public class s implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f366114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI f366115e;

    public s(com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI, qk.o oVar) {
        this.f366115e = newBizInfoSettingUI;
        this.f366114d = oVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.o oVar = this.f366114d;
        oVar.field_hadAlert = 1;
        oVar.field_brandFlag |= 4;
        int i18 = com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI.f154173y;
        com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI = this.f366115e;
        newBizInfoSettingUI.W6(oVar, true);
        gr3.e.b(newBizInfoSettingUI.f154175e.d1(), com.tencent.mm.plugin.appbrand.jsapi.l5.CTRL_INDEX, newBizInfoSettingUI.f154181n, newBizInfoSettingUI.getIntent(), newBizInfoSettingUI.f154183p);
    }
}
