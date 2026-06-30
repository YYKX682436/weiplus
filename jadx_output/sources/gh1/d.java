package gh1;

/* loaded from: classes7.dex */
public final class d extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "removeMagicBrushFrameSet";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        if (!data.has(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)) {
            s().invoke(i(new lc3.z(1, "fail")));
            return;
        }
        java.lang.String name = data.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "");
        lc3.e eVar = this.f317890a;
        kotlin.jvm.internal.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.magicbrush_frame.mb_host.MagicSclMBFrameBiz");
        fh1.z zVar = (fh1.z) ((fh1.x0) eVar).f262622x;
        zVar.getClass();
        kotlin.jvm.internal.o.g(name, "name");
        zVar.e(new fh1.v(zVar, name));
        s().invoke(k());
    }
}
