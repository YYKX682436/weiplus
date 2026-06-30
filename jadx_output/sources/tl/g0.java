package tl;

/* loaded from: classes3.dex */
public abstract class g0 {
    public static int a(java.lang.String str, int i17) {
        try {
            return com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d(str), i17);
        } catch (java.lang.Error unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecorderSwitch", "error on parseInt failed, key: " + str);
            return i17;
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RecorderSwitch", "getIntValFromDynamicConfig parseInt failed, key: " + str);
            return i17;
        }
    }
}
