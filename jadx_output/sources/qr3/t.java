package qr3;

/* loaded from: classes9.dex */
public class t implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f366116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI f366117e;

    public t(com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI newBizInfoSettingUI, qk.o oVar) {
        this.f366117e = newBizInfoSettingUI;
        this.f366116d = oVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.o oVar = this.f366116d;
        oVar.field_hadAlert = 1;
        int i18 = com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI.f154173y;
        this.f366117e.W6(oVar, false);
    }
}
