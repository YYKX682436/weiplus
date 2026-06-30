package zl0;

/* loaded from: classes13.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f473564a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f473565b = com.tencent.mm.vfs.q7.c("PublicResource") + "/kara/model";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f473566c = com.tencent.mm.vfs.q7.c("PublicResource") + "/kara/fewshot/model";

    public static zl0.a a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.z.f193115k && com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().j("clicfg_plugin_kara_few_shot_open", "0", false, true), 0) != 0) {
            if ((com.tencent.mm.sdk.platformtools.t8.P(j62.e.g().a("clicfg_plugin_kara_can_use_fewshot_model", "1", false, true), 1) != 0) && com.tencent.mm.vfs.w6.j(yl0.b.f462957b)) {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(f473566c + "/" + str + ".json");
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                    return new zl0.b(str);
                }
            }
        }
        java.util.List b17 = b(false);
        if (b17 == null) {
            return null;
        }
        java.util.Iterator it = ((java.util.ArrayList) b17).iterator();
        while (it.hasNext()) {
            zl0.a aVar = (zl0.a) it.next();
            if (aVar.f473558c.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:8|9|10|11|(12:18|(3:20|21|22)|24|25|26|27|28|29|(2:83|84)(3:35|(5:37|38|39|40|41)|82)|(1:47)|(3:49|(1:51)(1:78)|(3:55|(5:57|(3:62|(2:63|(2:65|(2:67|68)(1:74))(2:75|76))|(2:70|(3:72|73|61)))|59|60|61)|77))|79)|88|26|27|28|29|(1:31)|83|84|(0)|(0)|79) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bf, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c0, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0171 A[Catch: JSONException -> 0x01bf, TryCatch #4 {JSONException -> 0x01bf, blocks: (B:29:0x0141, B:31:0x0171, B:33:0x0177, B:83:0x01ba), top: B:28:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List b(boolean r23) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl0.g.b(boolean):java.util.List");
    }
}
