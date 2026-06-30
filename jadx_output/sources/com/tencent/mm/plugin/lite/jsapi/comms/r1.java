package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.s1 f143761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.plugin.lite.jsapi.comms.s1 s1Var) {
        super(1);
        this.f143761d = s1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.lite.jsapi.comms.s1 s1Var = this.f143761d;
        if (intValue == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonSetSearchTagResult", "setSearchTagResult, uploadEmoji success.");
            s1Var.f143443f.b(kz5.b1.e(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "ok")));
        } else if (intValue == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonSetSearchTagResult", "onSetSearchTagResult, User confirmed navigation to purchase page");
            s1Var.f143443f.b(kz5.b1.e(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "ok")));
        } else if (intValue != 2) {
            s1Var.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppJsApiEmoticonSetSearchTagResult", "onSetSearchTagResult, uploadEmoji failed.");
            s1Var.f143443f.a(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiEmoticonSetSearchTagResult", "onSetSearchTagResult, User cancelled navigation to purchase page");
            s1Var.f143443f.b(kz5.b1.e(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, "ok")));
        }
        return jz5.f0.f302826a;
    }
}
