package f01;

/* loaded from: classes9.dex */
public class i1 implements com.tencent.mm.storage.j8 {
    @Override // com.tencent.mm.storage.j8
    public void p(com.tencent.mm.storage.l4 l4Var, com.tencent.mm.storage.l8 l8Var) {
        boolean z17;
        com.tencent.mm.storage.f9 f9Var;
        com.tencent.mm.storage.f9 z07;
        long createTime;
        if (l4Var == null) {
            return;
        }
        if (com.tencent.mm.storage.z3.G4(l4Var.h1()) || com.tencent.mm.storage.z3.s4(l4Var.h1()) || com.tencent.mm.storage.z3.H3(l4Var.h1()) || c01.e2.G(l4Var.h1()) || com.tencent.mm.storage.z3.m4(l4Var.h1())) {
            if (!com.tencent.mm.storage.z3.H3(l4Var.h1())) {
                if (com.tencent.mm.storage.z3.G4(l4Var.h1()) || com.tencent.mm.storage.z3.s4(l4Var.h1())) {
                    return;
                }
                ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).Ai().a(l4Var, l8Var);
                if ("@blacklist".equals(l4Var.W0())) {
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(l4Var.h1(), true);
                    if (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(n17.d1()) || n17.o2()) {
                        return;
                    }
                    ((com.tencent.mm.storage.m4) c01.d9.b().r()).P(new java.lang.String[]{l4Var.h1()}, "");
                    return;
                }
                return;
            }
            com.tencent.mm.storage.m4 m4Var = (com.tencent.mm.storage.m4) l8Var;
            com.tencent.mm.storage.l4 p17 = m4Var.p("floatbottle");
            if (p17 == null) {
                p17 = new com.tencent.mm.storage.l4("floatbottle");
                z17 = true;
            } else {
                z17 = false;
            }
            p17.k1(1);
            p17.Y1(c01.f1.a());
            final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) c01.d9.b().u();
            java.util.List list = g9Var.f193981g;
            if (list == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfoStorage", "getLastMsg failed lstTable is null");
                f9Var = null;
            } else {
                com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                final java.lang.String replaceFirst = com.tencent.mm.sdk.platformtools.t8.K0(" and not ( type = 10000 and isSend != 2 ) ") ? "" : " and not ( type = 10000 and isSend != 2 ) ".replaceFirst("and", "where");
                int i17 = 0;
                long j17 = 0;
                while (true) {
                    java.util.LinkedList linkedList = (java.util.LinkedList) list;
                    if (i17 >= linkedList.size()) {
                        break;
                    }
                    if ((((xg3.k0) linkedList.get(i17)).f454407c & 8) != 0) {
                        final java.lang.String str = ((xg3.k0) linkedList.get(i17)).f454408d;
                        final java.lang.String str2 = "select * from " + str + replaceFirst + "  order by createTime DESC limit 1";
                        if (g9Var.Da(str)) {
                            z07 = ot0.c3.l().g("getLastMsg[" + str + "]", new yz5.a() { // from class: com.tencent.mm.storage.g9$$e5
                                @Override // yz5.a
                                public final java.lang.Object invoke() {
                                    return ot0.z2.f348822a.z0(com.tencent.mm.storage.g9.this.f193989r, str, replaceFirst);
                                }
                            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$f5
                                @Override // yz5.a
                                public final java.lang.Object invoke() {
                                    android.database.Cursor f17 = com.tencent.mm.storage.g9.this.f193989r.f(str2, null, 2);
                                    com.tencent.mm.storage.f9 f9Var3 = new com.tencent.mm.storage.f9();
                                    if (f17.moveToFirst()) {
                                        f9Var3.convertFrom(f17);
                                    }
                                    f17.close();
                                    return f9Var3;
                                }
                            });
                            if (z07.getMsgId() > 0 && z07.getCreateTime() > j17) {
                                createTime = z07.getCreateTime();
                                f9Var2 = z07;
                                j17 = createTime;
                            }
                        } else {
                            boolean Pb = g9Var.Pb(str);
                            l75.k0 k0Var = g9Var.f193989r;
                            if (Pb) {
                                z07 = ot0.z2.f348822a.z0(k0Var, str, replaceFirst);
                                if (z07.getMsgId() > 0 && z07.getCreateTime() > j17) {
                                    createTime = z07.getCreateTime();
                                    f9Var2 = z07;
                                    j17 = createTime;
                                }
                            } else {
                                android.database.Cursor f17 = k0Var.f(str2, null, 2);
                                if (f17.moveToFirst()) {
                                    long j18 = f17.getLong(f17.getColumnIndex("createTime"));
                                    if (j17 < j18) {
                                        f9Var2.convertFrom(f17);
                                        j17 = j18;
                                    }
                                }
                                f17.close();
                            }
                        }
                        i17++;
                    }
                    i17++;
                }
                f9Var = f9Var2;
            }
            if (f9Var == null || f9Var.getMsgId() <= 0) {
                p17.f2();
            } else {
                p17.h2(f9Var);
                p17.l1(com.tencent.mm.storage.z3.Y4(f9Var.Q0()) + ":" + f9Var.j());
                p17.S1(java.lang.Integer.toString(f9Var.getType()));
                if (m4Var.w() != null) {
                    com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
                    com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
                    com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
                    f9Var.u1("floatbottle");
                    f9Var.d1(p17.j());
                    qm.a0.d(f9Var, pString, pString2, pInt, false);
                    p17.o1(pString.value);
                    p17.p1(pString2.value);
                    p17.K1(pInt.value);
                }
            }
            if (z17) {
                m4Var.G(p17);
            } else {
                m4Var.W(p17, p17.h1());
            }
        }
    }
}
