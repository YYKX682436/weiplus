package com.tencent.mm.ui.tools;

/* loaded from: classes8.dex */
public class MiniQbCallBackMMUI extends com.tencent.mm.ui.tools.MiniQbCallBackBaseUI {
    @Override // com.tencent.mm.ui.tools.MiniQbCallBackBaseUI
    public void T6(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, int i18) {
        super.T6(str, str2, i17, str3, i18);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).K7(str2, new com.tencent.mm.miniutil.MiniReaderConstants$MiniQbFloatBallMenuActionBrandEvent(i17, str3));
            return;
        }
        com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent miniQbFloatBallMenuActionEvent = new com.tencent.mm.autogen.events.MiniQbFloatBallMenuActionEvent();
        am.sj sjVar = miniQbFloatBallMenuActionEvent.f54495g;
        sjVar.f7900a = i17;
        sjVar.f7901b = str3;
        sjVar.f7902c = i18;
        miniQbFloatBallMenuActionEvent.e();
    }

    @Override // com.tencent.mm.ui.tools.MiniQbCallBackBaseUI
    public java.lang.String U6() {
        return "MicroMsg.FilesFloatBall.MiniQbCallBackMMUI";
    }
}
