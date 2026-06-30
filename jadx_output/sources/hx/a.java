package hx;

/* loaded from: classes11.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "deleteCard";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        com.tencent.wechat.mm.biz.b1 b17;
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MBJsApiDeleteCard", "data: " + data);
        boolean z17 = false;
        int optInt = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        if (optInt != 0) {
            if (optInt != 1) {
                return;
            }
            java.lang.String optString = data.optString("cardId");
            com.tencent.mm.autogen.events.BizRecommandDeleteCardEvent bizRecommandDeleteCardEvent = new com.tencent.mm.autogen.events.BizRecommandDeleteCardEvent();
            bizRecommandDeleteCardEvent.f54008g.f8413a = optString;
            bizRecommandDeleteCardEvent.e();
            s().invoke(k());
            return;
        }
        long optLong = data.optLong("msgId");
        cx.w0 w0Var = (cx.w0) this.f317890a;
        java.lang.String O0 = w0Var != null ? w0Var.O0() : null;
        int i17 = kotlin.jvm.internal.o.b(O0, "MagicBrandService") ? 2 : kotlin.jvm.internal.o.b(O0, "MagicAdBrandService") ? 1 : 0;
        ((vw.b) ((rv.p2) i95.n0.c(rv.p2.class))).getClass();
        if (yw.h1.f466332a.n() && (b17 = yw.q3.f466437a.b()) != null) {
            z17 = b17.a(optLong, i17);
        }
        com.tencent.mars.xlog.Log.i("MBJsApiDeleteCard", "deleteCard msgId:" + optLong + " ret:" + z17);
        if (z17) {
            s().invoke(k());
        } else {
            s().invoke(i(new lc3.z(1, "fail")));
        }
    }
}
