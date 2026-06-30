package yg0;

@j95.b
/* loaded from: classes8.dex */
public class s4 extends i95.w implements zg0.q3 {
    public java.lang.String wi(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        if (str != null && str.startsWith("Refused to frame")) {
            java.lang.String[] split = str.split("'");
            if (split.length > 2) {
                return split[1];
            }
        }
        return "";
    }
}
