package jy4;

/* loaded from: classes.dex */
public class u implements vg3.r4 {
    @Override // vg3.r4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        if (map == null) {
            com.tencent.mars.xlog.Log.e("GotoFileHelperChattingUI", "goto_file_helper error, no values");
            return;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.goto_file_helper.deviceid");
        com.tencent.mars.xlog.Log.i("GotoFileHelperChattingUI", "goto_file_helper onNewXmlReceived, values: %s", map);
        if (ot5.h.f348877a.a(str2, wo.w0.k(), "goto_file_helper", true)) {
            if (java.lang.Math.abs(c01.id.e() - com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) map.get(".sysmsg.goto_file_helper.authtime"), 0L)) > 60) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            intent.putExtra("Chat_User", "filehelper");
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent, com.tencent.mm.sdk.platformtools.x2.f193071a);
        }
    }
}
