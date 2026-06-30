package oh1;

/* loaded from: classes4.dex */
public class w1 implements tg3.b1 {
    @Override // tg3.b1
    public java.lang.String Bb(java.util.Map map, java.lang.String str, android.os.Bundle bundle) {
        if (!gm0.j1.a()) {
            return "";
        }
        if (map == null || map.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxaSysTemplateMsgDigestHandler", "values map is null or nil");
            return "";
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".title");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str2 == null ? "" : str2;
    }
}
