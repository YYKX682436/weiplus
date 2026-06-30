package f21;

/* loaded from: classes8.dex */
public class g0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, com.tencent.mm.modelbase.q1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f258900d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f258901e;

    /* renamed from: f, reason: collision with root package name */
    public final int f258902f;

    /* renamed from: g, reason: collision with root package name */
    public final int f258903g;

    public g0(int i17, boolean z17) {
        this.f258903g = -1;
        this.f258902f = i17;
        if (z17) {
            this.f258903g = 1;
        }
    }

    public final f21.i0 H(r45.n35 n35Var) {
        f21.i0 i0Var = new f21.i0();
        i0Var.f258913a = n35Var.f381054d;
        i0Var.f258914b = n35Var.f381055e;
        i0Var.f258915c = n35Var.f381056f;
        i0Var.f258916d = n35Var.f381057g;
        i0Var.f258917e = n35Var.f381059i;
        i0Var.f258918f = 5;
        i0Var.f258919g = this.f258902f;
        return i0Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean acceptConcurrent(com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof f21.g0) {
            return this.f258902f != ((f21.g0) m1Var).f258902f;
        }
        return true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f258900d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rk3();
        lVar.f70665b = new r45.sk3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getpackagelist";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX;
        lVar.f70668e = 51;
        lVar.f70669f = 1000000051;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f258901e = a17;
        r45.rk3 rk3Var = (r45.rk3) a17.f70710a.f70684a;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!gm0.j1.b().m()) {
            return -1;
        }
        f21.j0 Bi = f21.r0.Bi();
        int i17 = this.f258902f;
        f21.i0[] D0 = Bi.D0(i17);
        if (D0 != null && D0.length > 0) {
            for (int i18 = 0; i18 < D0.length; i18++) {
                r45.n35 n35Var = new r45.n35();
                n35Var.f381054d = D0[i18].f258913a;
                if (x51.o1.f452057j && i17 == 7) {
                    n35Var.f381055e = 0;
                } else {
                    if (12 == i17) {
                        if (!com.tencent.mm.vfs.w6.j(gm0.j1.u().h() + "address")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPackageList", "MMRCPTADDRESS final save file not found, set pkg.Version=0");
                            n35Var.f381055e = 0;
                        }
                    }
                    n35Var.f381055e = D0[i18].f258914b;
                }
                linkedList.add(n35Var);
            }
        }
        rk3Var.f384961e = linkedList;
        rk3Var.f384960d = linkedList.size();
        rk3Var.f384962f = i17;
        int i19 = this.f258903g;
        if (i19 != -1) {
            rk3Var.f384963g = i19;
        }
        return dispatch(sVar, this.f258901e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        int i27 = this.f258902f;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPackageList", "onGYNetEnd, netid:%d, errType:%d, errCode:%d, pkgType:%d, errMsg:%s", valueOf, valueOf2, valueOf3, java.lang.Integer.valueOf(i27), str);
        if (i18 != 0 && i19 != 0) {
            this.f258900d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.sk3 sk3Var = (r45.sk3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        int i28 = sk3Var.f385810h;
        if (i28 != i27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetPackageList", "packageType is not consistent, respType = %d", java.lang.Integer.valueOf(i28));
            this.f258900d.onSceneEnd(3, -1, "", this);
            return;
        }
        java.util.LinkedList<r45.n35> linkedList = sk3Var.f385807e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("summer list size:");
        boolean z17 = false;
        sb6.append(linkedList == null ? 0 : linkedList.size());
        sb6.append(" packageType: ");
        sb6.append(i27);
        sb6.append(" resp.Type: ");
        sb6.append(sk3Var.f385810h);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPackageList", sb6.toString());
        if (i27 == 2) {
            if (linkedList != null && linkedList.size() > 0) {
                for (int i29 = 0; i29 < linkedList.size(); i29++) {
                    r45.n35 n35Var = (r45.n35) linkedList.get(i29);
                    f21.i0 z07 = f21.r0.Bi().z0(n35Var.f381054d, i27);
                    f21.i0 H = H(n35Var);
                    H.f258924l = -1;
                    if (z07 == null) {
                        f21.r0.Bi().J0(H);
                    } else {
                        f21.r0.Bi().P0(H);
                    }
                    byte[] d17 = x51.j1.d(n35Var.f381058h);
                    if (d17 != null && d17.length > 0) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(new java.lang.String(d17));
                        arrayList.size();
                    }
                }
            }
        } else if (i27 == 1) {
            if (linkedList == null || linkedList.size() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetPackageList", "empty background pkg list");
            } else {
                f21.r0.Bi().getClass();
                java.lang.String a17 = zz1.a.a();
                for (int i37 = 0; i37 < linkedList.size(); i37++) {
                    r45.n35 n35Var2 = (r45.n35) linkedList.get(i37);
                    f21.i0 z08 = f21.r0.Bi().z0(n35Var2.f381054d, i27);
                    if (z08 == null || z08.f258914b != n35Var2.f381055e) {
                        com.tencent.mm.vfs.w6.h(a17 + f21.r0.Bi().u0(n35Var2.f381054d, i27));
                        f21.i0 H2 = H(n35Var2);
                        H2.f258924l = -1;
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPackageList", "[updateBackgroundPkg] ret:%s newInfo:%s", java.lang.Boolean.valueOf(z08 == null ? f21.r0.Bi().J0(H2) : f21.r0.Bi().P0(H2)), H2);
                    }
                    byte[] d18 = x51.j1.d(n35Var2.f381058h);
                    if (d18 != null && d18.length > 0) {
                        f21.j0 Bi = f21.r0.Bi();
                        int i38 = n35Var2.f381054d;
                        Bi.getClass();
                        java.lang.String str2 = i38 + "_" + i27 + "_thumb.jpg";
                        com.tencent.mm.vfs.w6.h(a17 + str2);
                        if (com.tencent.mm.vfs.w6.a(a17 + str2, d18) < 0) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetPackageList", "[updateBackgroundPkg] appendBuf thumb error!");
                        }
                    }
                }
            }
        } else if (i27 == 4) {
            if (linkedList != null && linkedList.size() > 0) {
                linkedList.size();
                f21.r0.Bi().getClass();
                java.lang.String a18 = zz1.a.a();
                for (int i39 = 0; i39 < linkedList.size(); i39++) {
                    r45.n35 n35Var3 = (r45.n35) linkedList.get(i39);
                    f21.i0 z09 = f21.r0.Bi().z0(n35Var3.f381054d, i27);
                    byte[] d19 = x51.j1.d(n35Var3.f381058h);
                    if (n35Var3.f381058h == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetPackageList", "error give me a null thumb it should be xml");
                    } else {
                        if (z09 == null || z09.f258914b != n35Var3.f381055e) {
                            java.lang.String str3 = new java.lang.String(d19);
                            java.lang.String str4 = "zh_CN";
                            if (str3.indexOf("zh_CN") < 0) {
                                str4 = "en";
                                if (str3.indexOf("en") < 0 && str3.indexOf("zh_TW") >= 0) {
                                    str4 = "zh_TW";
                                }
                            }
                            java.lang.String concat = str4.concat("_ARTIST.mm");
                            com.tencent.mm.vfs.w6.h(a18 + concat);
                            com.tencent.mm.vfs.w6.h(a18 + str4 + "_ARTISTF.mm");
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append(a18);
                            sb7.append(concat);
                            com.tencent.mm.vfs.w6.a(sb7.toString(), d19);
                        }
                        f21.i0 H3 = H(n35Var3);
                        H3.f258924l = -1;
                        if (z09 == null) {
                            f21.r0.Bi().J0(H3);
                        } else {
                            f21.r0.Bi().P0(H3);
                        }
                    }
                }
            }
        } else if (i27 == 6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPackageList", "change new egg.");
        } else if (i27 == 7) {
            if (linkedList != null && linkedList.size() > 0) {
                linkedList.size();
                int i47 = 0;
                while (i47 < linkedList.size()) {
                    r45.n35 n35Var4 = (r45.n35) linkedList.get(i47);
                    f21.i0 z010 = f21.r0.Bi().z0(n35Var4.f381054d, i27);
                    f21.i0 H4 = H(n35Var4);
                    H4.f258924l = -1;
                    if (z010 == null) {
                        f21.r0.Bi().J0(H4);
                    } else {
                        f21.r0.Bi().P0(H4);
                    }
                    byte[] d27 = x51.j1.d(n35Var4.f381058h);
                    new java.lang.String(d27);
                    ip.e a19 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a();
                    int i48 = n35Var4.f381054d;
                    a19.getClass();
                    com.tencent.mm.vfs.z7 a27 = com.tencent.mm.vfs.z7.a(ip.e.f293551f);
                    java.lang.String str5 = a27.f213279f;
                    if (str5 != null) {
                        java.lang.String l17 = com.tencent.mm.vfs.e8.l(str5, z17, z17);
                        if (!str5.equals(l17)) {
                            a27 = new com.tencent.mm.vfs.z7(a27.f213277d, a27.f213278e, l17, a27.f213280g, a27.f213281h);
                        }
                    }
                    com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
                    com.tencent.mm.vfs.z2 m17 = b3Var.m(a27, null);
                    if (!(!m17.a() ? false : m17.f213266a.F(m17.f213267b))) {
                        com.tencent.mm.vfs.z2 m18 = b3Var.m(a27, m17);
                        if (m18.a()) {
                            m18.f213266a.r(m18.f213267b);
                        }
                    }
                    try {
                        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(ip.e.c(i48));
                        if (!r6Var.m()) {
                            r6Var.k();
                        }
                        com.tencent.mm.vfs.w6.S(ip.e.c(i48), d27, 0, d27.length);
                        a19.g(i48, new java.lang.String(d27));
                        a19.h(i48);
                    } catch (java.lang.Exception e17) {
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.ConfigListDecoder", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                    i47++;
                    z17 = false;
                }
            }
        } else if (i27 == 9) {
            if (linkedList != null && linkedList.size() > 0) {
                f21.r0.Bi().getClass();
                java.lang.String a28 = zz1.a.a();
                for (int i49 = 0; i49 < linkedList.size(); i49++) {
                    r45.n35 n35Var5 = (r45.n35) linkedList.get(i49);
                    f21.i0 z011 = f21.r0.Bi().z0(n35Var5.f381054d, i27);
                    if (z011 == null || z011.f258914b != n35Var5.f381055e) {
                        com.tencent.mm.vfs.w6.h(a28 + f21.r0.Bi().u0(n35Var5.f381054d, i27));
                        f21.i0 H5 = H(n35Var5);
                        H5.f258924l = -1;
                        if (z011 == null) {
                            f21.r0.Bi().J0(H5);
                        } else {
                            f21.r0.Bi().P0(H5);
                        }
                        gm0.j1.n().f273288b.g(new f21.f0(H5.f258913a, 9));
                    }
                    if (x51.j1.d(n35Var5.f381058h) != null) {
                        new java.lang.String(x51.j1.d(n35Var5.f381058h));
                    }
                    if (x51.j1.d(n35Var5.f381060m) != null) {
                        new java.lang.String(x51.j1.d(n35Var5.f381060m));
                    }
                }
            }
        } else if (i27 == 10) {
            if (linkedList == null || linkedList.size() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetPackageList", "empty mass send top config package");
            } else {
                linkedList.size();
                r45.n35 n35Var6 = (r45.n35) linkedList.get(0);
                f21.i0 z012 = f21.r0.Bi().z0(n35Var6.f381054d, i27);
                f21.i0 H6 = H(n35Var6);
                H6.f258924l = -1;
                if (z012 == null) {
                    f21.r0.Bi().J0(H6);
                } else {
                    f21.r0.Bi().P0(H6);
                }
            }
        } else if (i27 != 11) {
            if (i27 == 12) {
                if (linkedList == null || linkedList.size() <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetPackageList", "empty address pkg list");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPackageList", "updateRcptAddress pkgList size " + linkedList.size());
                    for (int i57 = 0; i57 < linkedList.size(); i57++) {
                        r45.n35 n35Var7 = (r45.n35) linkedList.get(i57);
                        f21.i0 z013 = f21.r0.Bi().z0(n35Var7.f381054d, i27);
                        f21.i0 H7 = H(n35Var7);
                        H7.f258924l = -1;
                        if (z013 == null) {
                            f21.r0.Bi().J0(H7);
                        } else {
                            f21.r0.Bi().P0(H7);
                        }
                        gm0.j1.n().f273288b.g(new f21.f0(H7.f258913a, 12));
                    }
                }
            } else if (i27 == 5) {
                if (linkedList != null && linkedList.size() != 0) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        r45.n35 n35Var8 = (r45.n35) it.next();
                        n35Var8.getClass();
                        f21.i0 z014 = f21.r0.Bi().z0(n35Var8.f381054d, i27);
                        f21.i0 H8 = H(n35Var8);
                        H8.f258924l = -1;
                        if (z014 == null) {
                            f21.r0.Bi().J0(H8);
                        } else {
                            f21.r0.Bi().P0(H8);
                        }
                    }
                }
            } else if (i27 == 20) {
                if (linkedList != null && linkedList.size() > 0) {
                    linkedList.size();
                    java.util.Iterator it6 = linkedList.iterator();
                    while (it6.hasNext()) {
                        r45.n35 n35Var9 = (r45.n35) it6.next();
                        f21.i0 z015 = f21.r0.Bi().z0(n35Var9.f381054d, i27);
                        f21.i0 H9 = H(n35Var9);
                        H9.f258924l = -1;
                        if (z015 == null) {
                            f21.r0.Bi().J0(H9);
                        } else {
                            f21.r0.Bi().P0(H9);
                        }
                    }
                }
            } else if (i27 == 17) {
                if (linkedList != null && linkedList.size() != 0) {
                    r45.n35 n35Var10 = (r45.n35) linkedList.get(0);
                    java.lang.String str6 = n35Var10.f381056f;
                    f21.i0 z016 = f21.r0.Bi().z0(n35Var10.f381054d, i27);
                    f21.i0 H10 = H(n35Var10);
                    H10.f258924l = -1;
                    if (z016 == null) {
                        f21.r0.Bi().J0(H10);
                    } else {
                        f21.r0.Bi().P0(H10);
                    }
                    com.tencent.mm.autogen.events.PoiCategoriesUpdateEvent poiCategoriesUpdateEvent = new com.tencent.mm.autogen.events.PoiCategoriesUpdateEvent();
                    am.lo loVar = poiCategoriesUpdateEvent.f54618g;
                    try {
                        byte[] d28 = x51.j1.d(n35Var10.f381058h);
                        loVar.f7252a = d28;
                        if (d28 != null) {
                            poiCategoriesUpdateEvent.b(android.os.Looper.getMainLooper());
                        }
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetPackageList", e18.getMessage());
                    }
                }
            } else if (i27 != 18) {
                if (i27 == 19) {
                    if (linkedList != null && linkedList.size() > 0) {
                        f21.r0.Bi().getClass();
                        java.lang.String a29 = zz1.a.a();
                        for (int i58 = 0; i58 < linkedList.size(); i58++) {
                            r45.n35 n35Var11 = (r45.n35) linkedList.get(i58);
                            f21.i0 z017 = f21.r0.Bi().z0(n35Var11.f381054d, i27);
                            if (z017 == null || z017.f258914b != n35Var11.f381055e) {
                                com.tencent.mm.vfs.w6.h(a29 + f21.r0.Bi().u0(n35Var11.f381054d, i27));
                                f21.i0 H11 = H(n35Var11);
                                H11.f258924l = -1;
                                if (z017 == null) {
                                    f21.r0.Bi().J0(H11);
                                } else {
                                    f21.r0.Bi().P0(H11);
                                }
                                gm0.j1.n().f273288b.g(new f21.f0(H11.f258913a, 19));
                            }
                        }
                    }
                } else if (i27 == 21) {
                    if (linkedList != null && linkedList.size() > 0) {
                        r45.n35 n35Var12 = (r45.n35) linkedList.get(0);
                        java.util.Objects.toString(n35Var12);
                        int i59 = n35Var12.f381054d;
                        f21.i0 z018 = f21.r0.Bi().z0(n35Var12.f381054d, i27);
                        f21.i0 H12 = H(n35Var12);
                        H12.f258924l = -1;
                        if (z018 == null) {
                            f21.r0.Bi().J0(H12);
                        } else if (z018.f258914b < H12.f258914b) {
                            f21.r0.Bi().P0(H12);
                        }
                    }
                } else if (23 == i27) {
                    if (linkedList != null && linkedList.size() > 0) {
                        r45.n35 n35Var13 = (r45.n35) linkedList.get(0);
                        java.util.Objects.toString(n35Var13);
                        int i66 = n35Var13.f381054d;
                        f21.i0 z019 = f21.r0.Bi().z0(n35Var13.f381054d, i27);
                        f21.i0 H13 = H(n35Var13);
                        H13.f258924l = -1;
                        if (z019 == null) {
                            f21.r0.Bi().J0(H13);
                        } else if (z019.f258914b < H13.f258914b) {
                            f21.r0.Bi().P0(H13);
                        }
                    }
                } else if (i27 == 26) {
                    if (linkedList != null && linkedList.size() != 0) {
                        linkedList.size();
                        int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_IPCALL_COUNTRY_CODE_RESTRCTION_INT, -1)).intValue();
                        if (intValue != -1) {
                            f21.i0 z020 = f21.r0.Bi().z0(intValue, i27);
                            java.util.Iterator it7 = linkedList.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    break;
                                }
                                f21.i0 H14 = H((r45.n35) it7.next());
                                if (z020 == null || H14.f258913a != intValue) {
                                    if (z020 == null && H14.f258913a == intValue) {
                                        f21.r0.Bi().J0(H14);
                                        break;
                                    }
                                } else {
                                    f21.r0.Bi().P0(H14);
                                    break;
                                }
                            }
                        }
                    }
                } else if (i27 == 36) {
                    if (linkedList != null && linkedList.size() != 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPackageList", "start update sense where location. package list size " + linkedList.size());
                        for (r45.n35 n35Var14 : linkedList) {
                            f21.i0 z021 = f21.r0.Bi().z0(n35Var14.f381054d, i27);
                            if (z021 == null || z021.f258914b != n35Var14.f381055e) {
                                f21.i0 H15 = H(n35Var14);
                                H15.f258924l = -1;
                                if (z021 == null) {
                                    f21.r0.Bi().J0(H15);
                                } else {
                                    f21.r0.Bi().P0(H15);
                                }
                                gm0.j1.n().f273288b.g(new f21.f0(H15.f258913a, 36));
                            }
                        }
                    }
                } else if (i27 == 37 && linkedList != null && linkedList.size() != 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPackageList", "start update apple emoji. package list size " + linkedList.size());
                    java.util.Iterator it8 = linkedList.iterator();
                    while (it8.hasNext()) {
                        r45.n35 n35Var15 = (r45.n35) it8.next();
                        f21.i0 z022 = f21.r0.Bi().z0(n35Var15.f381054d, i27);
                        if (z022 == null || z022.f258914b != n35Var15.f381055e) {
                            f21.i0 H16 = H(n35Var15);
                            H16.f258924l = -1;
                            if (z022 == null) {
                                f21.r0.Bi().J0(H16);
                            } else {
                                f21.r0.Bi().P0(H16);
                            }
                            gm0.j1.n().f273288b.g(new f21.f0(H16.f258913a, 37));
                        }
                    }
                }
            }
        }
        com.tencent.mm.autogen.events.UpdatePackageEvent updatePackageEvent = new com.tencent.mm.autogen.events.UpdatePackageEvent();
        am.b00 b00Var = updatePackageEvent.f54922g;
        b00Var.f6203b = linkedList;
        b00Var.f6202a = i27;
        updatePackageEvent.e();
        if (sk3Var.f385808f <= 0) {
            this.f258900d.onSceneEnd(i18, i19, str, this);
        } else if (doScene(dispatcher(), this.f258900d) == -1) {
            this.f258900d.onSceneEnd(3, -1, "doScene failed", this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 20;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
    }

    @Override // com.tencent.mm.modelbase.q1
    public int u() {
        return this.f258902f;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean uniqueInNetsceneQueue() {
        return true;
    }

    public g0(int i17) {
        this.f258903g = -1;
        this.f258902f = i17;
    }
}
