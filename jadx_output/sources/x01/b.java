package x01;

/* loaded from: classes9.dex */
public abstract class b {
    public static java.lang.String a(x01.a aVar) {
        if (aVar == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.lang.String str = aVar.f450976e;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append("\n-------------------\n");
        java.lang.String str2 = aVar.f450975d;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append("\n-------------------\n");
        java.lang.String str3 = aVar.f450974c;
        sb6.append(str3 != null ? str3 : "");
        return sb6.toString();
    }

    public static java.lang.String b(x01.a aVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        if (!c01.z1.J(aVar.f450972a)) {
            sb6.append(aVar.f450973b);
            sb6.append(": ");
        }
        sb6.append(com.tencent.mm.sdk.platformtools.t8.K0(aVar.f450976e) ? com.tencent.mm.sdk.platformtools.t8.K0(aVar.f450975d) ? aVar.f450974c : aVar.f450975d : aVar.f450976e);
        return sb6.toString();
    }
}
