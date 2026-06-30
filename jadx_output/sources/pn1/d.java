package pn1;

/* loaded from: classes12.dex */
public class d implements on1.i {
    @Override // on1.i
    public boolean a(r45.ed edVar, com.tencent.mm.storage.f9 f9Var) {
        return false;
    }

    @Override // on1.i
    public int b(java.lang.String str, r45.ed edVar, com.tencent.mm.storage.f9 f9Var, on1.a aVar) {
        f9Var.d1(edVar.f373283h.f372756d);
        java.lang.String str2 = edVar.f373281f.f372756d;
        java.lang.String str3 = edVar.f373282g.f372756d;
        if (((java.lang.String) tn1.f.f().e().b().l(2, null)).equals(str2)) {
            str2 = str3;
        }
        java.lang.String str4 = edVar.f373283h.f372756d;
        java.util.Map<java.lang.String, java.lang.String> d17 = com.tencent.mm.sdk.platformtools.aa.d(str4, "msg", null);
        com.tencent.mm.storage.g5 O = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).O(str4, str2);
        if (O == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BackupItemEmoji", "EmojiMsgInfo is null");
            return -1;
        }
        com.tencent.mm.storage.emotion.EmojiInfo N = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(O.f193954d);
        if (N == null) {
            N = new com.tencent.mm.storage.emotion.EmojiInfo();
            n22.m.b(O, N);
            N.field_catalog = 65;
            aVar.f346797h = N;
        }
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = N;
        if (d17.get(".msg.emoji.$androidmd5") == null) {
            java.lang.String a17 = kn1.j.a(O.f193954d);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                O.f193954d = a17;
            }
        }
        java.lang.String str5 = O.f193957g;
        f9Var.setType(47);
        if (!pt0.f0.f358209b1.e()) {
            f9Var.i1(O.f193954d);
        }
        r15.b bVar = new r15.b();
        try {
            bVar.fromXmlMap(d17, "msg");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupItemEmoji", th6, "recover parse extCommonInfo err", new java.lang.Object[0]);
        }
        f9Var.d1(com.tencent.mm.storage.y4.e(O.f193952b, 0L, (emojiInfo.k() || emojiInfo.B1()) ? false : true, O.f193954d, false, bVar.n() != null ? bVar.toXml() : ""));
        if (!emojiInfo.E0()) {
            tn1.d e17 = tn1.f.f().e();
            if (e17.f420812o == 0) {
                throw new c01.c();
            }
            java.lang.String str6 = e17.f420813p + "emoji/";
            if (android.text.TextUtils.isEmpty(str5)) {
                kn1.k.F(edVar, 4, str6 + O.f193954d + "_thumb");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str6);
                sb6.append(O.f193954d);
                kn1.k.F(edVar, 5, sb6.toString());
            } else {
                com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(str6 + str5);
                java.lang.String str7 = a18.f213279f;
                if (str7 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str7, false, false);
                    if (!str7.equals(l17)) {
                        a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
                    com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, m17);
                    if (m18.a()) {
                        m18.f213266a.r(m18.f213267b);
                    }
                }
                kn1.k.F(edVar, 4, str6 + str5 + "/" + O.f193954d + "_cover");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str6);
                sb7.append(str5);
                sb7.append("/");
                sb7.append(O.f193954d);
                kn1.k.F(edVar, 5, sb7.toString());
            }
        }
        return 1;
    }

    @Override // on1.i
    public int c(r45.ed edVar, boolean z17, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.util.LinkedList linkedList, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupItemEmoji", "msg:" + f9Var.j() + ", msgId:" + f9Var.getMsgId() + ", svrId:" + f9Var.I0() + ", talker:" + f9Var.Q0());
        int length = com.tencent.mm.sdk.platformtools.t8.K0(f9Var.j()) ? 0 : f9Var.j().getBytes().length;
        java.lang.String trim = new com.tencent.mm.storage.y4(f9Var.j()).f196357e.trim();
        if (!kn1.k.g(trim)) {
            trim = com.tencent.mm.storage.y4.c(f9Var.j());
            if (!kn1.k.g(trim)) {
                java.lang.String y07 = f9Var.y0();
                if (tn1.e.h(f9Var.Q0())) {
                    int indexOf = f9Var.j().indexOf(58);
                    if (f9Var.A0() != 1 && indexOf != -1) {
                        y07 = f9Var.j().substring(0, indexOf).trim();
                    }
                }
                f9Var.T0();
                java.lang.String b17 = kn1.j.b(f9Var, y07, tn1.e.h(f9Var.Q0()) ? f9Var.A0() != 1 ? f9Var.y0() : f9Var.T0() : f9Var.T0(), edVar);
                if (f9Var.A0() == 1 || !tn1.e.h(f9Var.Q0())) {
                    trim = b17;
                } else {
                    trim = y07 + " :\n " + b17;
                }
            }
        }
        if (trim == null || !kn1.k.f(trim)) {
            com.tencent.mm.sdk.platformtools.t8.G1(trim);
            return -1;
        }
        r45.du5 du5Var = new r45.du5();
        du5Var.c(trim);
        edVar.f373283h = du5Var;
        return length;
    }
}
