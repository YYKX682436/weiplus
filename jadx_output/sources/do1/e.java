package do1;

/* loaded from: classes12.dex */
public final class e implements do1.b {
    /* JADX WARN: Removed duplicated region for block: B:63:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[LOOP:0: B:55:0x0121->B:66:?, LOOP_END, SYNTHETIC] */
    @Override // do1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.tencent.mm.storage.f9 r20, long r21) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.e.a(com.tencent.mm.storage.f9, long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x046e A[Catch: Exception -> 0x04b8, TRY_LEAVE, TryCatch #5 {Exception -> 0x04b8, blocks: (B:119:0x0429, B:122:0x0462, B:123:0x0466, B:125:0x046e, B:138:0x0455, B:140:0x045d), top: B:118:0x0429 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04b0  */
    @Override // do1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(bw5.u0 r41, bw5.t0 r42, com.tencent.mm.storage.f9 r43) {
        /*
            Method dump skipped, instructions count: 2678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.e.b(bw5.u0, bw5.t0, com.tencent.mm.storage.f9):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0368  */
    @Override // do1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(com.tencent.mm.storage.f9 r41, bw5.u0 r42, bw5.t0 r43, co1.c r44) {
        /*
            Method dump skipped, instructions count: 3024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.e.d(com.tencent.mm.storage.f9, bw5.u0, bw5.t0, co1.c):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a6, code lost:
    
        if (r0 != 2001) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017f  */
    @Override // do1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public co1.h e(long r32, com.tencent.mm.storage.f9 r34, do1.a r35) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.e.e(long, com.tencent.mm.storage.f9, do1.a):co1.h");
    }

    @Override // do1.b
    public long g(com.tencent.mm.storage.f9 msg, java.lang.String mediaId, int i17) {
        t05.a r17;
        s15.w j17;
        java.util.LinkedList j18;
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        if (msg.getType() == 285212721 || msg.getType() == 1048625 || (r17 = r(s(msg, p(msg)))) == null) {
            return 0L;
        }
        int i18 = r17.f368365d;
        if (6 == i17) {
            int i19 = i18 + 6;
            if (r17.getInteger(i19) == 24 || r17.getInteger(i19) == 19) {
                return 0L;
            }
            i95.m c17 = i95.n0.c(tg3.u0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            return com.tencent.mm.vfs.w6.k(tg3.u0.ga((tg3.u0) c17, msg, msg.z0(), false, 4, null));
        }
        int integer = r17.getInteger(i18 + 6);
        if (integer == 2) {
            if (7 == i17) {
                return com.tencent.mm.vfs.w6.k(l(msg, r17));
            }
            return 0L;
        }
        int i27 = 0;
        if (integer != 19 && integer != 24) {
            if (integer != 87) {
                if (integer != 130) {
                    if ((integer == 6 || integer == 7) && 7 == i17) {
                        return com.tencent.mm.vfs.w6.k(m(msg));
                    }
                    return 0L;
                }
                if (24 == i17) {
                    return com.tencent.mm.vfs.w6.k(o(msg, false));
                }
                if (25 == i17) {
                    return com.tencent.mm.vfs.w6.k(n(msg, false));
                }
                return 0L;
            }
            java.lang.String j19 = r17.j();
            t05.b bVar = new t05.b();
            bVar.fromXml(j19);
            for (java.lang.Object obj : bVar.j()) {
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                h15.a aVar = (h15.a) obj;
                r45.gp0 gp0Var = new r45.gp0();
                gp0Var.e0(aVar.k());
                gp0Var.O0(aVar.l());
                gp0Var.i0(aVar.j());
                gp0Var.p0(aVar.getMd5());
                gp0Var.h0(aVar.n());
                if (18 == i17) {
                    if (kotlin.jvm.internal.o.b(co1.d.f43763b.d(msg.I0(), i27), mediaId)) {
                        return com.tencent.mm.vfs.w6.k(hx1.b.e(gp0Var));
                    }
                } else if (19 == i17 && kotlin.jvm.internal.o.b(co1.d.f43763b.c(msg.I0(), i27), mediaId)) {
                    return com.tencent.mm.vfs.w6.k(hx1.b.c(gp0Var));
                }
                i27 = i28;
            }
            return 0L;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(r17.l())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackupItemAppMsg", "recordInfo empty!!! msgId:" + msg.getMsgId());
        } else {
            s15.w wVar = new s15.w();
            wVar.fromXml(r17.l());
            int i29 = 0;
            for (java.lang.Object obj2 : wVar.j()) {
                int i37 = i29 + 1;
                if (i29 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                s15.h hVar = (s15.h) obj2;
                if (hVar.getInteger(hVar.f303422d + 2) != 17) {
                    java.lang.Long j27 = j(msg, hVar, java.lang.String.valueOf(i29), false, mediaId, i17);
                    if (j27 != null) {
                        return j27.longValue();
                    }
                } else {
                    s15.i0 H = hVar.H();
                    if (H != null && (j17 = H.j()) != null && (j18 = j17.j()) != null) {
                        int i38 = 0;
                        for (java.lang.Object obj3 : j18) {
                            int i39 = i38 + 1;
                            if (i38 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            s15.h hVar2 = (s15.h) obj3;
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(i29);
                            sb6.append('_');
                            sb6.append(i38);
                            int i47 = i29;
                            java.lang.Long j28 = j(msg, hVar2, sb6.toString(), true, mediaId, i17);
                            if (j28 != null) {
                                return j28.longValue();
                            }
                            i38 = i39;
                            i29 = i47;
                        }
                    }
                }
                i29 = i37;
            }
        }
        return 0L;
    }

    public final void h(com.tencent.mm.storage.f9 f9Var, s15.h hVar, java.lang.String str, boolean z17, bw5.t0 t0Var, bw5.u0 u0Var) {
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.e0(hVar.getString(hVar.f303422d + 3));
        int i17 = hVar.f303422d;
        gp0Var.h0(hVar.getInteger(i17 + 2));
        gp0Var.O0(hVar.getString(i17 + 0));
        gp0Var.i0(hVar.n());
        gp0Var.d0(hVar.getString(i17 + 4));
        gp0Var.b0(hVar.getString(i17 + 8));
        java.lang.String H = bt3.g2.H(gp0Var, f9Var.Q0(), f9Var.getMsgId(), 1);
        java.lang.String str2 = gp0Var.f375412h;
        if (str2 != null) {
            kotlin.jvm.internal.o.f(str2, "getCdnThumbUrl(...)");
            if (str2.length() > 0) {
                co1.d dVar = co1.d.f43762a;
                java.lang.String b17 = co1.d.f43763b.b(f9Var.I0(), str);
                if (!com.tencent.mm.vfs.w6.j(H)) {
                    H = "";
                }
                kotlin.jvm.internal.o.d(H);
                co1.i.a(t0Var, b17, 21, H, u0Var);
            }
        }
        java.lang.String t17 = bt3.g2.t(gp0Var, f9Var.Q0(), f9Var.getMsgId(), 1);
        java.lang.String str3 = gp0Var.f375434s;
        if (str3 != null) {
            kotlin.jvm.internal.o.f(str3, "getCdnDataUrl(...)");
            if (str3.length() > 0) {
                co1.d dVar2 = co1.d.f43762a;
                java.lang.String a17 = co1.d.f43763b.a(f9Var.I0(), str);
                int i18 = z17 ? 20 : 7;
                java.lang.String str4 = com.tencent.mm.vfs.w6.j(t17) ? t17 : "";
                kotlin.jvm.internal.o.d(str4);
                co1.i.a(t0Var, a17, i18, str4, u0Var);
            }
        }
    }

    public final boolean i(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String r17;
        v05.b bVar = new v05.b();
        java.lang.String U1 = f9Var.U1();
        java.lang.String str = "";
        if (U1 == null) {
            U1 = "";
        }
        bVar.fromXml(U1);
        pt.j0 j0Var = (pt.j0) i95.n0.c(pt.j0.class);
        java.lang.String g17 = ez.v0.f257777a.g(bVar);
        if (g17 == null) {
            g17 = "";
        }
        int i17 = bVar.f432315e;
        v05.a aVar = (v05.a) bVar.getCustom(i17 + 8);
        if (aVar != null && (r17 = aVar.r()) != null) {
            str = r17;
        }
        java.lang.String cj6 = ((ez.e) j0Var).cj(f9Var, g17, str, false);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(cj6);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAttachDownloaded, filePath:");
        sb6.append(cj6);
        sb6.append(", exist:");
        sb6.append(r6Var.m());
        sb6.append(", length:");
        sb6.append(r6Var.C());
        sb6.append(", totalLen:");
        v05.a aVar2 = (v05.a) bVar.getCustom(i17 + 8);
        sb6.append(aVar2 != null ? aVar2.getLong(aVar2.f368364d + 0) : 0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupItemAppMsg", sb6.toString());
        if (!r6Var.m()) {
            return false;
        }
        long C = r6Var.C();
        v05.a aVar3 = (v05.a) bVar.getCustom(i17 + 8);
        return C >= (aVar3 != null ? aVar3.getLong(aVar3.f368364d + 0) : 0L);
    }

    public final java.lang.Long j(com.tencent.mm.storage.f9 f9Var, s15.h hVar, java.lang.String str, boolean z17, java.lang.String str2, int i17) {
        jz5.g b17 = jz5.h.b(new do1.c(hVar));
        if (i17 == 21) {
            co1.d dVar = co1.d.f43762a;
            if (kotlin.jvm.internal.o.b(co1.d.f43763b.b(f9Var.I0(), str), str2)) {
                return java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(bt3.g2.H((r45.gp0) ((jz5.n) b17).getValue(), f9Var.Q0(), f9Var.getMsgId(), 1)));
            }
            return null;
        }
        if (!(z17 && i17 == 20) && (z17 || i17 != 7)) {
            return null;
        }
        co1.d dVar2 = co1.d.f43762a;
        if (kotlin.jvm.internal.o.b(co1.d.f43763b.a(f9Var.I0(), str), str2)) {
            return java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(bt3.g2.t((r45.gp0) ((jz5.n) b17).getValue(), f9Var.Q0(), f9Var.getMsgId(), 1)));
        }
        return null;
    }

    public final com.tencent.mm.pluginsdk.model.app.e k() {
        com.tencent.mm.pluginsdk.model.app.e a17 = tn1.f.f().e().a();
        kotlin.jvm.internal.o.f(a17, "getAppAttachInfoStg(...)");
        return a17;
    }

    public final java.lang.String l(com.tencent.mm.storage.f9 f9Var, t05.a aVar) {
        r05.j k17 = aVar.k();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(k17 != null ? k17.getString(k17.f368364d + 1) : null)) {
            com.tencent.mm.pluginsdk.model.app.e k18 = k();
            r05.j k19 = aVar.k();
            com.tencent.mm.pluginsdk.model.app.d D0 = k18.D0(k19 != null ? k19.getString(k19.f368364d + 1) : null);
            if ((D0 != null && D0.t0()) || (f9Var.A0() == 1 && D0 != null && D0.field_isUpload)) {
                return D0.field_fileFullPath;
            }
        }
        return null;
    }

    public final java.lang.String m(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mm.pluginsdk.model.app.d J0 = k().J0(f9Var.getMsgId(), f9Var.Q0());
        if (J0 == null) {
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RoamBackupItemAppMsg", "getAttachFilePathByMsgId, msgSvrId = " + f9Var.I0() + ", msgId = " + f9Var.getMsgId() + " appAttach is null");
                return null;
            }
            com.tencent.mm.pluginsdk.model.app.d h17 = com.tencent.mm.pluginsdk.model.app.k0.h(v17.f348694p);
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupItemAppMsg", "Get attachment info from attach id(%s)", v17.f348694p);
            J0 = h17;
        }
        if ((J0 == null || !J0.t0()) && !(f9Var.A0() == 1 && J0 != null && J0.field_isUpload)) {
            return null;
        }
        return J0.field_fileFullPath;
    }

    public final java.lang.String n(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        java.lang.String r17;
        v05.b bVar = new v05.b();
        java.lang.String U1 = f9Var.U1();
        java.lang.String str = "";
        if (U1 == null) {
            U1 = "";
        }
        bVar.fromXml(U1);
        pt.j0 j0Var = (pt.j0) i95.n0.c(pt.j0.class);
        java.lang.String g17 = ez.v0.f257777a.g(bVar);
        if (g17 == null) {
            g17 = "";
        }
        v05.a aVar = (v05.a) bVar.getCustom(bVar.f432315e + 8);
        if (aVar != null && (r17 = aVar.r()) != null) {
            str = r17;
        }
        return ((ez.e) j0Var).cj(f9Var, g17, str, z17);
    }

    public final java.lang.String o(com.tencent.mm.storage.f9 msgInfo, boolean z17) {
        ((ez.e) ((pt.j0) i95.n0.c(pt.j0.class))).getClass();
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        return bm5.z.h(bm5.y.f22756i.b(msgInfo, bm5.f0.f22564i, ""), null, z17, 1, null);
    }

    public final java.lang.String p(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String j17;
        if (f9Var.getType() == 1107296305) {
            j17 = f9Var.J0();
            if (j17 == null) {
                return "";
            }
        } else {
            j17 = f9Var.j();
            if (j17 == null) {
                return "";
            }
        }
        return j17;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:43:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x0050. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0058 A[FALL_THROUGH, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == r0) goto L58
            r1 = 2
            if (r3 == r1) goto L58
            r1 = 3
            if (r3 == r1) goto L58
            r1 = 4
            if (r3 == r1) goto L58
            r1 = 5
            if (r3 == r1) goto L58
            r1 = 6
            if (r3 == r1) goto L58
            r1 = 7
            if (r3 == r1) goto L58
            r1 = 33
            if (r3 == r1) goto L58
            r1 = 34
            if (r3 == r1) goto L58
            r1 = 40
            if (r3 == r1) goto L58
            r1 = 41
            if (r3 == r1) goto L58
            r1 = 50
            if (r3 == r1) goto L58
            r1 = 51
            if (r3 == r1) goto L58
            r1 = 53
            if (r3 == r1) goto L58
            r1 = 54
            if (r3 == r1) goto L58
            r1 = 59
            if (r3 == r1) goto L58
            r1 = 60
            if (r3 == r1) goto L58
            r1 = 62
            if (r3 == r1) goto L58
            r1 = 63
            if (r3 == r1) goto L58
            r1 = 68
            if (r3 == r1) goto L58
            r1 = 69
            if (r3 == r1) goto L58
            switch(r3) {
                case 7: goto L58;
                case 8: goto L58;
                case 9: goto L58;
                case 19: goto L58;
                case 36: goto L58;
                case 38: goto L58;
                case 44: goto L58;
                case 57: goto L58;
                case 72: goto L58;
                case 75: goto L58;
                case 76: goto L58;
                case 77: goto L58;
                case 82: goto L58;
                case 83: goto L58;
                case 84: goto L58;
                case 87: goto L58;
                case 92: goto L58;
                case 93: goto L58;
                case 96: goto L58;
                case 97: goto L58;
                case 101: goto L58;
                case 102: goto L58;
                case 103: goto L58;
                case 105: goto L58;
                case 106: goto L58;
                case 115: goto L58;
                case 118: goto L58;
                case 124: goto L58;
                case 129: goto L58;
                case 130: goto L58;
                case 132: goto L58;
                case 2000: goto L58;
                case 2001: goto L58;
                case 2011: goto L58;
                default: goto L50;
            }
        L50:
            switch(r3) {
                case 15: goto L58;
                case 16: goto L58;
                case 17: goto L58;
                default: goto L53;
            }
        L53:
            switch(r3) {
                case 24: goto L58;
                case 25: goto L58;
                case 26: goto L58;
                case 27: goto L58;
                default: goto L56;
            }
        L56:
            r3 = 0
            return r3
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: do1.e.q(int):boolean");
    }

    public final t05.a r(java.lang.String str) {
        t05.a aVar = new t05.a();
        try {
            aVar.fromXml(str);
            return aVar;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RoamBackupItemAppMsg", e17, "parse content error!!! content:" + str, new java.lang.Object[0]);
            return null;
        }
    }

    public final java.lang.String s(com.tencent.mm.storage.f9 f9Var, java.lang.String str) {
        int K;
        if (f9Var.A0() != 1 && tn1.e.h(f9Var.Q0()) && (K = r26.n0.K(str, ':', 0, false, 6, null)) != -1) {
            str = str.substring(K + 1);
            kotlin.jvm.internal.o.f(str, "substring(...)");
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        kotlin.jvm.internal.o.f(str, "processXml(...)");
        return str;
    }
}
