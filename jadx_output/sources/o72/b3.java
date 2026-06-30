package o72;

/* loaded from: classes9.dex */
public class b3 implements o72.i4 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f343310a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f343311b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f343312c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f343313d;

    public b3() {
        this.f343310a = true;
        this.f343311b = true;
        this.f343312c = false;
        this.f343313d = false;
    }

    public boolean a(o72.r2 r2Var, boolean z17, boolean z18) {
        if (r2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSendFilter", "canBeForwardWithMsg err0");
            return false;
        }
        if (z17) {
            int i17 = r2Var.field_type;
            if (i17 == 2 || i17 == 8) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavSendFilter", "canBeForwardWithMsg isFastSendToChat return false for type: " + i17);
                return false;
            }
            if (z18 && i17 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavSendFilter", "canBeForwardWithMsg isFastSendVideoToChat return false for type: " + i17);
                return false;
            }
        }
        if (r2Var.field_itemStatus > 0 && !o72.x1.l0(r2Var)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSendFilter", "canBeForwardWithMsg err1 %s", java.lang.Integer.valueOf(r2Var.field_itemStatus));
            return false;
        }
        o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(r2Var.field_localId);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(o72.x1.x(o72.x1.J(r2Var)));
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendFilter", "[canBeForwardWithMsg] info.getType = " + r2Var.field_type);
        int i18 = r2Var.field_type;
        if (i18 != 2) {
            if (i18 != 4) {
                if (i18 != 8) {
                    if (i18 != 14) {
                        if (i18 != 16) {
                            if (i18 != 18) {
                                if (i18 == 24) {
                                    return r2Var.field_favProto.P == null;
                                }
                            }
                        } else {
                            if (com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTCannotTransmitForFav"), 0) != 0) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.FavSendFilter", "can not retransmit short video");
                                return false;
                            }
                            if (!r6Var.m()) {
                                return true;
                            }
                        }
                    }
                    if (r2Var.field_id <= 0 && F != null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FavSendFilter", "canBeForwardWithMsg err2");
                        return false;
                    }
                    r45.bq0 bq0Var = r2Var.field_favProto;
                    if (bq0Var == null || bq0Var.f370964f.size() <= 1) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.FavSendFilter", "canBeForwardWithMsg err3 %s", r2Var.field_favProto);
                        return false;
                    }
                }
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(o72.x1.J(r2Var).A) && !r6Var.m()) {
                return true;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSendFilter", "canBeForwardWithMsg() err4:%s", java.lang.Integer.valueOf(r2Var.field_type));
            return false;
        }
        if (!r6Var.m()) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FavSendFilter", "canBeForwardWithMsg() err4:%s", java.lang.Integer.valueOf(r2Var.field_type));
        return false;
    }

    public boolean b(r45.gp0 gp0Var, boolean z17, boolean z18) {
        r45.hp0 hp0Var;
        r45.km6 km6Var;
        if (gp0Var == null) {
            return true;
        }
        if (z17) {
            int i17 = gp0Var.I;
            if (i17 == 2 || i17 == 8) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavSendFilter", "filter isFastSendToChat return false for type: " + i17);
                return false;
            }
            if (z18 && i17 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavSendFilter", "filter isFastSendToChat return false for type: " + i17);
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendFilter", "filter [FavDataItem] dataType = " + gp0Var.I);
        int i18 = gp0Var.I;
        if (i18 != 2) {
            if (i18 == 3) {
                return true;
            }
            if (i18 == 4) {
                if (this.f343312c && this.f343313d) {
                    return false;
                }
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(o72.x1.x(gp0Var));
                java.lang.String str = a17.f213279f;
                if (str != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                    if (!str.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
                    return false;
                }
                return com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.A);
            }
            if (i18 != 7) {
                if (i18 != 8) {
                    if (i18 == 15) {
                        if (com.tencent.mm.sdk.platformtools.t8.D1(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SIGHTCannotTransmitForFav"), 0) != 0) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.FavSendFilter", "can not retransmit short video");
                            return true;
                        }
                        com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(o72.x1.x(gp0Var));
                        java.lang.String str2 = a18.f213279f;
                        if (str2 != null) {
                            java.lang.String l18 = com.tencent.mm.vfs.e8.l(str2, false, false);
                            if (!str2.equals(l18)) {
                                a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                            }
                        }
                        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
                        return !(!m18.a() ? false : m18.f213266a.F(m18.f213267b));
                    }
                    if (i18 != 29 && i18 != 32) {
                        if (i18 != 33 || (hp0Var = gp0Var.J1) == null || (km6Var = hp0Var.G) == null) {
                            return false;
                        }
                        return com.tencent.mm.sdk.platformtools.t8.K0(km6Var.f378839e);
                    }
                }
            }
            return com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.A) && com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.C) && com.tencent.mm.sdk.platformtools.t8.K0(gp0Var.E);
        }
        if (this.f343312c) {
            return false;
        }
        com.tencent.mm.vfs.z7 a19 = com.tencent.mm.vfs.z7.a(o72.x1.x(gp0Var));
        java.lang.String str3 = a19.f213279f;
        if (str3 != null) {
            java.lang.String l19 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l19)) {
                a19 = new com.tencent.mm.vfs.z7(a19.f213277d, a19.f213278e, l19, a19.f213280g, a19.f213281h);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[filter Data] IMG & FILE, dataFile path = ");
        sb6.append(o72.x1.x(gp0Var));
        sb6.append(", exists = ");
        com.tencent.mm.vfs.z2 m19 = com.tencent.mm.vfs.a3.f212781a.m(a19, null);
        sb6.append(!m19.a() ? false : m19.f213266a.F(m19.f213267b));
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSendFilter", sb6.toString());
        return !(com.tencent.mm.vfs.a3.f212781a.m(a19, m19).a() ? r13.f213266a.F(r13.f213267b) : false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0133, code lost:
    
        if (r3 != null) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0147, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.FavSendFilter", "it can not retransmit short video because of file was replaced. file[%d, %s], data[%d, %s]", java.lang.Long.valueOf(r7), r9, java.lang.Long.valueOf(r10), r4.M);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0135, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0144, code lost:
    
        if (r3 == null) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(z30.v r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o72.b3.c(z30.v, boolean, boolean):boolean");
    }

    public b3(boolean z17, boolean z18) {
        this.f343310a = true;
        this.f343311b = true;
        this.f343312c = z17;
        this.f343313d = z18;
    }
}
