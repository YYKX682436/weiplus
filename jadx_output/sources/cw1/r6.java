package cw1;

/* loaded from: classes12.dex */
public class r6 extends b75.f {
    public r6(com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI cleanNewUI, int i17, java.util.Map map, java.lang.String str) {
        super(i17, map, str);
    }

    @Override // b75.f
    public void a() {
        try {
            new org.json.JSONObject(this.f18237c);
            c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_CLEANUI_QQMGRINFO_STRING, this.f18237c);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CleanNewUI", e17, "", new java.lang.Object[0]);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(714L, 6L, 1L, false);
        }
    }
}
