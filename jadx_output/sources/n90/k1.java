package n90;

/* loaded from: classes4.dex */
public class k1 implements tg3.b1 {
    @Override // tg3.b1
    public java.lang.String Bb(java.util.Map map, java.lang.String str, android.os.Bundle bundle) {
        if (map == null) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) map.get(str + ".plain");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return str2 == null ? "" : str2;
    }
}
