package h05;

/* loaded from: classes4.dex */
public class f implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h05.i f277932d;

    public f(com.tencent.mm.plugin.wxgamecard.ui.WxGamePushSettingUI wxGamePushSettingUI, h05.i iVar) {
        this.f277932d = iVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        if (i17 == 0 && i18 == 0) {
            if (((r45.e36) oVar.f70711b.f70700a) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxGamePushSettingUI", "SetUserSwitchResponse failed, response is null!");
                z17 = false;
            } else {
                z17 = true;
            }
            h05.i iVar = this.f277932d;
            if (iVar != null) {
                iVar.a(z17);
            }
        }
        return 0;
    }
}
