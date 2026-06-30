package ni3;

/* loaded from: classes12.dex */
public class c2 extends wu5.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni3.f1 f337554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ni3.d2 f337555f;

    public c2(ni3.d2 d2Var, ni3.f1 f1Var) {
        this.f337555f = d2Var;
        this.f337554e = f1Var;
    }

    @Override // wu5.g
    public java.lang.String getKey() {
        return "autoScanRemove";
    }

    @Override // java.lang.Runnable
    public void run() {
        ni3.c1 c1Var = null;
        this.f337555f.f337563a.f337597v = null;
        int a17 = c01.w9.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerdel checkUnfinishedDeleteMsgTask ret[%s]", java.lang.Integer.valueOf(a17));
        if (a17 > 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(418L, 8L, 1L, true);
        }
        ni3.g2 g2Var = this.f337555f.f337563a;
        ni3.f1 f1Var = this.f337554e;
        g2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv startScan");
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mm.vfs.r5 r5Var = (com.tencent.mm.vfs.r5) com.tencent.mm.vfs.a3.f212781a.a();
            if (r5Var.f213165f == null) {
                r5Var.f213165f = java.util.Collections.unmodifiableList(r5Var.f213161b);
            }
            for (com.tencent.mm.vfs.l5 l5Var : r5Var.f213165f) {
                java.lang.String str = l5Var.f213067d;
                java.lang.String str2 = l5Var.f213068e;
                java.util.LinkedList linkedList = (java.util.LinkedList) hashMap.get(str2 + "/");
                if (linkedList == null) {
                    java.util.LinkedList linkedList2 = new java.util.LinkedList();
                    linkedList2.add(str);
                    hashMap.put(str2 + "/", linkedList2);
                } else {
                    linkedList.add(str);
                }
            }
            java.lang.String D = lp0.b.D();
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(D);
            if (r6Var.m() && r6Var.y()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv startScan root[%s] exist[%b], diretory[%b]", D, java.lang.Boolean.valueOf(r6Var.m()), java.lang.Boolean.valueOf(r6Var.y()));
                java.util.HashMap hashMap2 = new java.util.HashMap(73);
                gm0.j1.i();
                java.lang.String d17 = gm0.j1.u().d();
                if (!g2Var.Ri(hashMap, hashMap2, "voice/", 1)) {
                    java.lang.String str3 = d17 + "voice/";
                    hashMap2.put(str3.substring(0, str3.length() - 1), 1);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "voice2/", 2)) {
                    java.lang.String str4 = d17 + "voice2/";
                    hashMap2.put(str4.substring(0, str4.length() - 1), 2);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "image/", 3)) {
                    java.lang.String str5 = d17 + "image/";
                    hashMap2.put(str5.substring(0, str5.length() - 1), 3);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "image2/", 4)) {
                    java.lang.String str6 = d17 + "image2/";
                    hashMap2.put(str6.substring(0, str6.length() - 1), 4);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "sfs/", 5)) {
                    java.lang.String str7 = d17 + "sfs/";
                    hashMap2.put(str7.substring(0, str7.length() - 1), 5);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "avatar/", 6)) {
                    hashMap2.put(hn1.a0.a().substring(0, hn1.a0.a().length() - 1), 6);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "emoji/", 7)) {
                    java.lang.String str8 = d17 + "emoji/";
                    hashMap2.put(str8.substring(0, str8.length() - 1), 7);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "video/", 8)) {
                    java.lang.String str9 = d17 + "video/";
                    hashMap2.put(str9.substring(0, str9.length() - 1), 8);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "package/", 9)) {
                    hashMap2.put(zz1.a.a().substring(0, zz1.a.a().length() - 1), 9);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "mailapp/", 10)) {
                    java.lang.String str10 = d17 + "mailapp/";
                    hashMap2.put(str10.substring(0, str10.length() - 1), 10);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "openapi/", 11)) {
                    hashMap2.put(zo3.p.Ai().substring(0, zo3.p.Ai().length() - 1), 11);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "attachment/", 12)) {
                    java.lang.String str11 = d17 + "attachment/";
                    hashMap2.put(str11.substring(0, str11.length() - 1), 12);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "brandicon/", 13)) {
                    ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).getClass();
                    java.lang.String wi6 = ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).wi();
                    ((qv.i) ((rv.q2) i95.n0.c(rv.q2.class))).getClass();
                    hashMap2.put(wi6.substring(0, ((r01.s1) ((r01.x2) i95.n0.c(r01.x2.class))).wi().length() - 1), 13);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "voiceremind/", 14)) {
                    java.lang.String str12 = d17 + "voiceremind/";
                    hashMap2.put(str12.substring(0, str12.length() - 1), 14);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "recbiz/", 15)) {
                    hashMap2.put(ys3.l.a().substring(0, ys3.l.a().length() - 1), 15);
                }
                hashMap2.put(n21.c.a().substring(0, n21.c.a().length() - 1), 16);
                if (!g2Var.Ri(hashMap, hashMap2, "favorite/", 17)) {
                    hashMap2.put(com.tencent.mm.storage.s3.a().substring(0, com.tencent.mm.storage.s3.a().length() - 1), 17);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "draft/", 18)) {
                    java.lang.String str13 = d17 + "draft/";
                    hashMap2.put(str13.substring(0, str13.length() - 1), 18);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "record/", 19)) {
                    java.lang.String str14 = d17 + "record/";
                    hashMap2.put(str14.substring(0, str14.length() - 1), 19);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "sns/", 20)) {
                    hashMap2.put(((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).wi().substring(0, ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).wi().length() - 1), 20);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "wenote/", 21)) {
                    java.lang.String str15 = d17 + "wenote/";
                    hashMap2.put(str15.substring(0, str15.length() - 1), 21);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "remark/", 22)) {
                    ((tc0.p) ((uc0.n) i95.n0.c(uc0.n.class))).getClass();
                    java.lang.String a18 = gw3.a.a();
                    ((tc0.p) ((uc0.n) i95.n0.c(uc0.n.class))).getClass();
                    hashMap2.put(a18.substring(0, gw3.a.a().length() - 1), 22);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "xlog/", 23)) {
                    hashMap2.put(lp0.b.g0(), 23);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "Download/", 24)) {
                    hashMap2.put(lp0.b.t().substring(0, lp0.b.t().length() - 1), 24);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "Game/", 25)) {
                    hashMap2.put(lp0.b.z().substring(0, lp0.b.z().length() - 1), 25);
                }
                hashMap2.put(lp0.b.m().substring(0, lp0.b.m().length() - 1), 26);
                java.lang.String str16 = d17 + "avatar/";
                hashMap2.put(str16.substring(0, str16.length() - 1), 27);
                if (!g2Var.Ri(hashMap, hashMap2, "backupRecover/", 28)) {
                    java.lang.String str17 = d17 + "backupRecover/";
                    hashMap2.put(str17.substring(0, str17.length() - 1), 28);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "bizimg/", 29)) {
                    java.lang.String str18 = d17 + "bizimg/";
                    hashMap2.put(str18.substring(0, str18.length() - 1), 29);
                }
                java.lang.String str19 = d17 + "bizmsg/";
                hashMap2.put(str19.substring(0, str19.length() - 1), 30);
                java.lang.String str20 = d17 + "boots/";
                hashMap2.put(str20.substring(0, str20.length() - 1), 31);
                java.lang.String str21 = d17 + "dbback/";
                hashMap2.put(str21.substring(0, str21.length() - 1), 32);
                java.lang.String str22 = d17 + "locallog/";
                hashMap2.put(str22.substring(0, str22.length() - 1), 33);
                java.lang.String str23 = d17 + "logcat/";
                hashMap2.put(str23.substring(0, str23.length() - 1), 34);
                if (!g2Var.Ri(hashMap, hashMap2, "msgsynchronize/", 35)) {
                    java.lang.String str24 = d17 + "msgsynchronize/";
                    hashMap2.put(str24.substring(0, str24.length() - 1), 35);
                }
                java.lang.String str25 = d17 + "music/";
                hashMap2.put(str25.substring(0, str25.length() - 1), 36);
                if (!g2Var.Ri(hashMap, hashMap2, "oneday/", 37)) {
                    hashMap2.put(((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).wi().substring(0, ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).wi().length() - 1), 37);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "openim/", 38)) {
                    java.lang.String str26 = d17 + "openim/";
                    hashMap2.put(str26.substring(0, str26.length() - 1), 38);
                }
                java.lang.String str27 = d17 + "story/";
                hashMap2.put(str27.substring(0, str27.length() - 1), 39);
                hashMap2.put(lp0.b.i().substring(0, lp0.b.i().length() - 1), 40);
                hashMap2.put(lp0.b.j().substring(0, lp0.b.j().length() - 1), 41);
                java.lang.String str28 = vz.e1.f441540a;
                hashMap2.put(str28.substring(0, str28.length() - 1), 42);
                hashMap2.put(lp0.b.k().substring(0, lp0.b.k().length() - 1), 43);
                hashMap2.put(lp0.b.l().substring(0, lp0.b.l().length() - 1), 44);
                hashMap2.put(lp0.b.n().substring(0, lp0.b.n().length() - 1), 45);
                if (!g2Var.Ri(hashMap, hashMap2, "CDNTemp/", 46)) {
                    hashMap2.put(lp0.b.o().substring(0, lp0.b.o().length() - 1), 46);
                }
                hashMap2.put(lp0.b.p().substring(0, lp0.b.p().length() - 1), 47);
                hashMap2.put(lp0.b.q().substring(0, lp0.b.q().length() - 1), 48);
                hashMap2.put(lp0.b.s().substring(0, lp0.b.s().length() - 1), 49);
                hashMap2.put(lp0.b.v().substring(0, lp0.b.v().length() - 1), 50);
                hashMap2.put(lp0.b.w().substring(0, lp0.b.w().length() - 1), 51);
                hashMap2.put(lp0.b.y().substring(0, lp0.b.y().length() - 1), 52);
                hashMap2.put(lp0.b.A().substring(0, lp0.b.A().length() - 1), 53);
                hashMap2.put(lp0.b.B().substring(0, lp0.b.B().length() - 1), 54);
                hashMap2.put(lp0.b.C().substring(0, lp0.b.C().length() - 1), 55);
                hashMap2.put(lp0.b.E().substring(0, lp0.b.E().length() - 1), 56);
                hashMap2.put(lp0.b.F().substring(0, lp0.b.F().length() - 1), 57);
                hashMap2.put(lp0.b.G().substring(0, lp0.b.G().length() - 1), 58);
                if (!g2Var.Ri(hashMap, hashMap2, "sns_ad_landingpages/", 59)) {
                    java.lang.String Bi = ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi();
                    hashMap2.put(Bi.substring(0, Bi.length() - 1), 59);
                }
                hashMap2.put(lp0.b.I().substring(0, lp0.b.I().length() - 1), 60);
                hashMap2.put(lp0.b.L().substring(0, lp0.b.L().length() - 1), 61);
                if (!g2Var.Ri(hashMap, hashMap2, "vproxy/", 62)) {
                    hashMap2.put(lp0.b.M().substring(0, lp0.b.M().length() - 1), 62);
                }
                hashMap2.put(lp0.b.N().substring(0, lp0.b.N().length() - 1), 63);
                hashMap2.put(lp0.b.O().substring(0, lp0.b.O().length() - 1), 64);
                if (!g2Var.Ri(hashMap, hashMap2, "wallet/", 65)) {
                    hashMap2.put(lp0.b.P().substring(0, lp0.b.P().length() - 1), 65);
                }
                hashMap2.put(lp0.b.f0().substring(0, lp0.b.f0().length() - 1), 66);
                hashMap2.put(lp0.b.Q().substring(0, lp0.b.Q().length() - 1), 67);
                hashMap2.put(lp0.b.R().substring(0, lp0.b.R().length() - 1), 68);
                hashMap2.put(lp0.b.S().substring(0, lp0.b.S().length() - 1), 69);
                hashMap2.put(lp0.b.T().substring(0, lp0.b.T().length() - 1), 70);
                hashMap2.put(lp0.b.U().substring(0, lp0.b.U().length() - 1), 72);
                java.lang.String str29 = d17 + "scanner/";
                hashMap2.put(str29.substring(0, str29.length() - 1), 73);
                hashMap2.put(lp0.b.K().substring(0, lp0.b.K().length() - 1), 74);
                hashMap2.put(lp0.b.a().substring(0, lp0.b.a().length() - 1), 75);
                hashMap2.put(lp0.b.H().substring(0, lp0.b.H().length() - 1), 76);
                hashMap2.put(lp0.b.J().substring(0, lp0.b.J().length() - 1), 77);
                hashMap2.put(lp0.b.u().substring(0, lp0.b.u().length() - 1), 78);
                hashMap2.put(lp0.b.V().substring(0, lp0.b.V().length() - 1), 79);
                hashMap2.put(lp0.b.W().substring(0, lp0.b.W().length() - 1), 80);
                if (!g2Var.Ri(hashMap, hashMap2, "favoffline/", 81)) {
                    hashMap2.put(lp0.b.x().substring(0, lp0.b.x().length() - 1), 81);
                }
                if (!g2Var.Ri(hashMap, hashMap2, "finder/", 82)) {
                    java.lang.String str30 = d17 + "finder/";
                    hashMap2.put(str30.substring(0, str30.length() - 1), 82);
                }
                java.lang.String str31 = d17 + "shakemusic/";
                hashMap2.put(str31.substring(0, str31.length() - 1), 83);
                java.lang.String str32 = d17 + "recordPlugin/";
                hashMap2.put(str32.substring(0, str32.length() - 1), 84);
                java.lang.String str33 = d17 + "audio/";
                hashMap2.put(str33.substring(0, str33.length() - 1), 85);
                c1Var = new ni3.c1(r6Var.o());
                ((ku5.t0) ku5.t0.f312615d).h(new ni3.e2(g2Var, hashMap2, c1Var, r6Var, f1Var), "summerhv_scanFile");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv startScan failed as path not exists[%s]", D);
                ((ni3.b2) f1Var).a(-1, null);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv startScan failed as sdcard not available");
            ((ni3.b2) f1Var).a(-1, null);
        }
        g2Var.f337598w = c1Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv auto scan started[%s]", this.f337555f.f337563a.f337598w);
    }
}
