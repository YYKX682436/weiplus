package if3;

/* loaded from: classes8.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.LinkedList f291156a;

    /* JADX WARN: Removed duplicated region for block: B:31:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: if3.a0.a():void");
    }

    public final java.lang.String b() {
        return gm0.j1.a() ? java.lang.String.format("%s/masssend_%s.ini", gm0.j1.u().h(), com.tencent.mm.sdk.platformtools.m2.d()) : "";
    }

    public int c() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_mass_send_max_num, 500);
    }

    public void d(java.lang.String str) {
        java.util.Map d17;
        java.util.LinkedList linkedList;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "Festivals", null)) == null) {
            return;
        }
        if3.c0 c0Var = new if3.c0();
        int i17 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".Festivals.Festival");
            sb6.append(i17 == 0 ? "" : java.lang.String.valueOf(i17));
            java.lang.String sb7 = sb6.toString();
            boolean containsKey = d17.containsKey(sb7);
            linkedList = c0Var.f291161e;
            if (!containsKey) {
                break;
            }
            if3.b0 b0Var = new if3.b0();
            b0Var.f291158d = com.tencent.mm.sdk.platformtools.t8.a0((java.lang.String) d17.get(sb7 + ".StartTime"), 0);
            b0Var.f291159e = com.tencent.mm.sdk.platformtools.t8.a0((java.lang.String) d17.get(sb7 + ".EndTime"), 0) + com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER;
            linkedList.add(b0Var);
            i17++;
        }
        c0Var.f291160d = linkedList.size();
        this.f291156a = linkedList;
        try {
            byte[] byteArray = c0Var.toByteArray();
            java.lang.String b17 = b();
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MassSendService", "mass send config file path is null, return");
                return;
            }
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(b17);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
            if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                c01.d9.b().p().w(102408, java.lang.Boolean.FALSE);
            } else if (!com.tencent.mm.vfs.w6.p(a17.toString()).equals(kk.k.g(byteArray))) {
                c01.d9.b().p().w(102408, java.lang.Boolean.FALSE);
            }
            com.tencent.mm.vfs.w6.S(b17, byteArray, 0, byteArray.length);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MassSendService", e17, "", new java.lang.Object[0]);
        }
    }
}
