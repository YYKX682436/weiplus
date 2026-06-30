package pn1;

/* loaded from: classes12.dex */
public class g implements on1.i {
    @Override // on1.i
    public boolean a(r45.ed edVar, com.tencent.mm.storage.f9 f9Var) {
        boolean z17;
        if (f9Var.z2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FastBackupItemVideo", "complementMediaFile, msg.isClean");
            return false;
        }
        java.lang.String z07 = f9Var.z0();
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, z07, false);
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, z07, false);
        if (com.tencent.mm.vfs.w6.k(tj6) == 0) {
            kn1.k.F(edVar, 11, tj6);
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, f9Var.getType(), com.tencent.mm.vfs.w6.p(tj6), null);
            z17 = true;
        } else {
            z17 = false;
        }
        java.lang.String w17 = kn1.k.w(edVar, 10, null);
        java.lang.String w18 = kn1.k.w(edVar, 17, "_hd");
        com.tencent.mars.xlog.Log.i("MicroMsg.FastBackupItemVideo", "complementMediaFile, mediaID = " + w17 + ", originMediaId = " + w18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(z07);
        sb6.append(ya.b.ORIGIN);
        java.lang.String sb7 = sb6.toString();
        java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22570r, sb7, false);
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
        t21.v2 h18 = t21.d3.h(sb7);
        if (com.tencent.mm.vfs.w6.k(rj7) != 0 || com.tencent.mm.vfs.w6.k(rj6) != 0) {
            return z17;
        }
        if (h17 != null && w17 != null) {
            com.tencent.mm.vfs.w6.w(kn1.k.n(w17) + w17, rj6);
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj6, f9Var.getType(), com.tencent.mm.vfs.w6.p(rj6), null);
        }
        if (h18 == null || w18 == null) {
            return true;
        }
        com.tencent.mm.vfs.w6.w(kn1.k.n(w18) + w18, rj7);
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj7, f9Var.getType(), com.tencent.mm.vfs.w6.p(rj7), null);
        return true;
    }

    @Override // on1.i
    public int b(java.lang.String str, r45.ed edVar, com.tencent.mm.storage.f9 f9Var, on1.a aVar) {
        java.lang.String w17;
        java.lang.String w18;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        t21.v2 v2Var = new t21.v2();
        aVar.f346795f = v2Var;
        java.lang.String str2 = edVar.f373281f.f372756d;
        java.lang.String str3 = edVar.f373282g.f372756d;
        if (f9Var.A0() == 1) {
            str2 = str3;
        }
        v2Var.f415019q = str2;
        v2Var.f415012j = f9Var.getCreateTime();
        v2Var.f415004c = edVar.f373294v;
        java.lang.String str4 = edVar.f373283h.f372756d;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str4, "msg", null);
        if (d17 != null) {
            try {
                v2Var.f415008f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.videomsg.$length"), 0);
                v2Var.f415015m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.videomsg.$playlength"), 0);
                v2Var.f415021s = (java.lang.String) d17.get(".msg.videomsg.$fromusername");
                v2Var.f415022t = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.videomsg.$type"), 0) == 44 ? 1 : 0;
                v2Var.f415025w = str4;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FastBackupItemVideo", "parsing voice msg xml failed");
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FastBackupItemVideo", e17, "", new java.lang.Object[0]);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.FastBackupItemVideo", "videomsg paseXml failed:%s", edVar.f373283h.f372756d);
            f9Var.d1(edVar.f373283h.f372756d);
        }
        if (kn1.k.j(edVar, 10) || kn1.k.j(edVar, 12)) {
            v2Var.f415011i = 199;
        } else {
            v2Var.f415011i = 111;
        }
        java.lang.String h17 = v2Var.h();
        kk.l lVar = t21.w2.f415056c;
        java.lang.String a17 = t21.c3.a(h17);
        if (!((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).hj()) {
            f9Var.i1(a17);
        }
        v2Var.f415000a = a17;
        if (f9Var.getType() != 62) {
            f9Var.setType(43);
        }
        f9Var.d1(t21.t2.a(v2Var.e(), v2Var.f415014l, false));
        v2Var.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        v2Var.f415017o = 0;
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, a17, true);
        if (f9Var.getType() == 62) {
            kn1.k.F(edVar, 13, tj6);
            w17 = kn1.k.w(edVar, 12, null);
            sb6.append(tj6);
            sb6.append(";");
            on1.c.a(f9Var.I0(), sb6.toString());
            w18 = null;
        } else {
            kn1.k.F(edVar, 11, tj6);
            w17 = kn1.k.w(edVar, 10, null);
            w18 = kn1.k.w(edVar, 17, "_hd");
            sb6.append(tj6);
            sb6.append(";");
            on1.c.a(f9Var.I0(), sb6.toString());
        }
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, f9Var.getType(), com.tencent.mm.vfs.w6.p(tj6), null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FastBackupItemVideo", "recover, mediaID = " + w17 + ", originMediaId = " + w18);
        if (w17 != null) {
            java.lang.String str5 = kn1.k.n(w17) + w17;
            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, a17, true);
            com.tencent.mm.vfs.w6.w(str5, rj6);
            sb6.append(rj6);
            sb6.append(";");
            on1.c.a(f9Var.I0(), sb6.toString());
            ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj6, f9Var.getType(), com.tencent.mm.vfs.w6.p(rj6), null);
        }
        if (w18 == null) {
            return 1;
        }
        java.lang.String str6 = kn1.k.n(w18) + w18;
        java.lang.String str7 = a17 + ya.b.ORIGIN;
        t21.v2 v2Var2 = new t21.v2();
        aVar.f346796g = v2Var2;
        v2Var2.f415000a = str7;
        v2Var2.f415012j = f9Var.getCreateTime();
        v2Var2.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        v2Var2.f415017o = 0;
        if (kn1.k.j(edVar, 17)) {
            v2Var2.f415011i = 199;
        } else {
            v2Var2.f415011i = 111;
        }
        v2Var2.f415015m = v2Var.f415015m;
        v2Var2.f415008f = v2Var.f415008f;
        v2Var.o(str7);
        aVar.f346796g = v2Var2;
        java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22570r, str7, true);
        com.tencent.mm.vfs.w6.w(str6, rj7);
        sb6.append(rj7);
        sb6.append(";");
        on1.c.a(f9Var.I0(), sb6.toString());
        ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(rj7, f9Var.getType(), com.tencent.mm.vfs.w6.p(rj7), null);
        return 1;
    }

    @Override // on1.i
    public int c(r45.ed edVar, boolean z17, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.util.LinkedList linkedList, boolean z18) {
        int i17;
        int i18;
        java.lang.String str2;
        int b17;
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false);
        t21.v2 c17 = tn1.e.c(f9Var.z0());
        boolean z19 = c17 == null || c17.f415011i == 199;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(rj6);
        int C = (z19 && r6Var.m()) ? (int) r6Var.C() : 0;
        java.lang.String str3 = c17 == null ? f9Var.z0() + ya.b.ORIGIN : c17.S;
        java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22570r, str3, false);
        t21.v2 c18 = tn1.e.c(str3);
        boolean z27 = c18 != null && c18.f415011i == 199;
        if (z27) {
            com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(rj7);
            if (r6Var2.m()) {
                C += (int) r6Var2.C();
            }
        }
        int i19 = C;
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false);
        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(tj6);
        int C2 = r6Var3.m() ? (int) r6Var3.C() : 0;
        if (z17) {
            return C2 + i19;
        }
        if (C2 != 0) {
            if (f9Var.getType() == 62) {
                i17 = 62;
                b17 = on1.e.b(new on1.d(tj6, edVar, linkedList, 13, z17, "_thumb", false, null));
            } else {
                i17 = 62;
                b17 = on1.e.b(new on1.d(tj6, edVar, linkedList, 11, z17, "_thumb", false, null));
            }
            i18 = b17 + 0;
        } else {
            i17 = 62;
            i18 = 0;
        }
        if (!z19 || i19 == 0) {
            str2 = "MicroMsg.FastBackupItemVideo";
        } else if (f9Var.getType() == i17) {
            i18 += on1.e.b(new on1.d(rj6, edVar, linkedList, 12, z17, z18, null));
            str2 = "MicroMsg.FastBackupItemVideo";
        } else {
            str2 = "MicroMsg.FastBackupItemVideo";
            int b18 = i18 + on1.e.b(new on1.d(rj6, edVar, linkedList, 10, z17, z18, null));
            if (z27) {
                int b19 = on1.e.b(new on1.d(rj7, edVar, linkedList, 17, z17, "_hd", z18, null));
                i18 = b18 + b19;
                com.tencent.mars.xlog.Log.e(str2, "pack origin video, packed video size = " + b19);
            } else {
                i18 = b18;
            }
        }
        t21.v2 c19 = tn1.e.c(f9Var.z0());
        java.lang.String str4 = null;
        if (c19 != null) {
            if (f9Var.getType() != i17) {
                i17 = 43;
            }
            edVar.f373279d = i17;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(f9Var.j())) {
                java.lang.String e17 = tn1.e.h(f9Var.Q0()) ? c19.e() : edVar.f373281f.f372756d;
                java.io.StringWriter stringWriter = new java.io.StringWriter();
                try {
                    org.xmlpull.v1.XmlSerializer newSerializer = org.xmlpull.v1.XmlPullParserFactory.newInstance().newSerializer();
                    newSerializer.setOutput(stringWriter);
                    newSerializer.startTag(null, "msg");
                    newSerializer.startTag(null, "videomsg");
                    java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(c19.g(), "msg", null);
                    if (d17 != null) {
                        newSerializer.attribute(null, "aeskey", "" + ((java.lang.String) d17.get(".msg.videomsg.$aeskey")));
                        newSerializer.attribute(null, "cdnthumbaeskey", "" + ((java.lang.String) d17.get(".msg.videomsg.$cdnthumbaeskey")));
                        newSerializer.attribute(null, "cdnvideourl", "" + ((java.lang.String) d17.get(".msg.videomsg.$cdnvideourl")));
                        newSerializer.attribute(null, "cdnthumburl", "" + ((java.lang.String) d17.get(".msg.videomsg.$cdnthumburl")));
                        newSerializer.attribute(null, "cdnthumblength", "" + ((java.lang.String) d17.get(".msg.videomsg.$cdnthumblength")));
                        newSerializer.attribute(null, "rawmd5", "" + ((java.lang.String) d17.get(".msg.videomsg.$rawmd5")));
                        newSerializer.attribute(null, "cdnrawvideourl", "" + ((java.lang.String) d17.get(".msg.videomsg.$cdnrawvideourl")));
                        newSerializer.attribute(null, "cdnrawvideoaeskey", "" + ((java.lang.String) d17.get(".msg.videomsg.$cdnrawvideoaeskey")));
                        newSerializer.attribute(null, "rawlength", "" + ((java.lang.String) d17.get(".msg.videomsg.$rawlength")));
                        newSerializer.attribute(null, "overwritenewmsgid", "" + ((java.lang.String) d17.get(".msg.videomsg.$overwritenewmsgid")));
                    }
                    newSerializer.attribute(null, "playlength", "" + c19.f415015m);
                    newSerializer.attribute(null, "length", "" + c19.f415008f);
                    newSerializer.attribute(null, "type", "" + i17);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                        newSerializer.attribute(null, "fromusername", e17);
                    }
                    newSerializer.attribute(null, "md5", "" + c19.A);
                    newSerializer.endTag(null, "videomsg");
                    boolean z28 = false;
                    for (java.lang.String str5 : d17.keySet()) {
                        if (str5.startsWith(".msg.extcommoninfo.refermsg.")) {
                            if (!z28) {
                                newSerializer.startTag(null, "extcommoninfo");
                                newSerializer.startTag(null, "refermsg");
                                z28 = true;
                            }
                            newSerializer.startTag(null, str5.substring(28));
                            newSerializer.text((java.lang.String) d17.get(str5));
                            newSerializer.endTag(null, str5.substring(28));
                        }
                    }
                    if (z28) {
                        newSerializer.endTag(null, "refermsg");
                        newSerializer.endTag(null, "extcommoninfo");
                    }
                    newSerializer.endTag(null, "msg");
                    newSerializer.endDocument();
                    stringWriter.flush();
                    stringWriter.close();
                    str4 = stringWriter.getBuffer().toString();
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str2, e18, "packetVoice xml error", new java.lang.Object[0]);
                }
            }
        }
        if (str4 == null) {
            return i18;
        }
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str4;
        du5Var.f372757e = true;
        edVar.f373283h = du5Var;
        return i18 + str4.length();
    }
}
