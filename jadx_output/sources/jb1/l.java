package jb1;

/* loaded from: classes7.dex */
public final class l {
    public l(kotlin.jvm.internal.i iVar) {
    }

    public final jb1.m a(org.json.JSONObject json) {
        kotlin.jvm.internal.o.g(json, "json");
        jb1.n nVar = jb1.q.f298742g;
        java.lang.String optString = json.optString("uuid");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        java.lang.String t17 = r26.i0.t(optString, "-", "", false);
        int length = t17.length();
        byte[] bArr = new byte[length / 2];
        for (int i17 = 0; i17 < length; i17 += 2) {
            bArr[i17 / 2] = (byte) ((nVar.a(t17.charAt(i17)) << 4) | nVar.a(t17.charAt(i17 + 1)));
        }
        return new jb1.m(bArr, json.optInt("major"), json.optInt("minor"), json.optInt("measuredPower"));
    }
}
