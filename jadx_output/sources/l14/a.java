package l14;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(java.lang.String viewID, boolean z17) {
        kotlin.jvm.internal.o.g(viewID, "viewID");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("before_value", java.lang.Integer.valueOf(z17 ? 2 : 1));
        hashMap.put("after_value", java.lang.Integer.valueOf(z17 ? 1 : 2));
        jz5.g gVar = com.tencent.mm.plugin.setting.ui.setting.bm.f160878a;
        java.lang.String str = com.tencent.mm.plugin.setting.ui.setting.bm.f160879b;
        if (str == null) {
            str = (java.lang.String) ((jz5.n) com.tencent.mm.plugin.setting.ui.setting.bm.f160878a).getValue();
        }
        hashMap.put("care_mode_sessionid", str);
        hashMap.toString();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewID, "view_clk", hashMap, 35684);
    }

    public static final void b(boolean z17) {
        com.tencent.mm.autogen.mmdata.rpt.CareModeSwitchStruct careModeSwitchStruct = new com.tencent.mm.autogen.mmdata.rpt.CareModeSwitchStruct();
        careModeSwitchStruct.f55580d = z17 ? 1L : 0L;
        careModeSwitchStruct.k();
    }
}
