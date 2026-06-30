package mr3;

/* loaded from: classes10.dex */
public final class k {
    public k(kotlin.jvm.internal.i iVar) {
    }

    public final mr3.l a(java.lang.String str, java.lang.String str2, int i17) {
        if (str == null || str2 == null || !com.tencent.mm.vfs.w6.j(str2)) {
            return null;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str2);
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str4 = a17.f213279f;
        int lastIndexOf = str4.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str4 = str4.substring(lastIndexOf + 1);
        }
        java.lang.String str5 = str4;
        kotlin.jvm.internal.o.f(str5, "getName(...)");
        return new mr3.l(str5, str, null, null, str2, 0, i17, 40, null);
    }
}
