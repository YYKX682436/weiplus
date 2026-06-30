package com.tencent.mm.plugin.subapp.jdbiz;

@j95.b
/* loaded from: classes8.dex */
public class q extends i95.w implements k35.q {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.subapp.jdbiz.o f172151d = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f172152e = new java.util.HashMap();

    public q() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("new SubCoreJDBiz this: ");
        sb6.append(hashCode());
        sb6.append(" stack: ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreJdIP6", sb6.toString());
    }

    public static java.lang.String Bi(java.lang.String str, int i17) {
        if (-1 != str.indexOf(35)) {
            return str;
        }
        if (-1 == str.indexOf(63)) {
            return str + "?wc_scene=" + i17;
        }
        return str + "&wc_scene=" + i17;
    }

    public static com.tencent.mm.plugin.subapp.jdbiz.q Di() {
        return (com.tencent.mm.plugin.subapp.jdbiz.q) i95.n0.c(com.tencent.mm.plugin.subapp.jdbiz.q.class);
    }

    public static void cj(com.tencent.mm.plugin.subapp.jdbiz.o oVar) {
        gm0.j1.b().c();
        com.tencent.mm.plugin.subapp.jdbiz.q Di = Di();
        if (Di.f172151d == null) {
            Di.f172151d = com.tencent.mm.plugin.subapp.jdbiz.o.a();
        }
        java.lang.String str = Di.f172151d.f172150s;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = oVar.f172150s;
        if (str2 == null) {
            str2 = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreJdIP6", "updatejdMsgContent old: %s new: %s", str, str2);
        if (!oVar.c(Di.f172151d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreJdIP6", "fo zu baoyou! the activityid is same");
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(oVar.f172138g) || oVar.f172137f) {
            c01.d9.b().p().w(327939, "1");
        }
        if (oVar.f172136e) {
            c01.d9.b().p().w(327938, "1");
        } else {
            c01.d9.b().p().w(327938, "");
        }
        Di.f172151d = oVar;
        c01.d9.b().p().w(327942, oVar.f172150s);
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.subapp.jdbiz.p(Di));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_JD_ENTRANCE_RESET_EXPOSURE_FLAG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }

    public void Ai() {
        c01.d9.b().p().w(327938, "");
    }

    public java.lang.String Ni() {
        return ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigJumpUrl");
    }

    public java.lang.String Ri() {
        return com.tencent.mm.sdk.platformtools.m2.m() ? ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigName") : com.tencent.mm.sdk.platformtools.m2.n() ? ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigNameHKTW") : ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigNameEN");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String Ui() {
        /*
            r12 = this;
            com.tencent.mm.plugin.subapp.jdbiz.o r0 = r12.Zi()
            boolean r1 = r12.bj()
            r2 = 1
            java.lang.String r3 = ""
            if (r1 == 0) goto L3d
            boolean r1 = r0.d()
            if (r1 != 0) goto L37
            java.lang.String r1 = "3"
            java.lang.String r4 = r0.f172132a
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L37
            java.lang.String r1 = r0.f172146o
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r1)
            if (r1 != 0) goto L37
            java.lang.String r1 = r0.f172146o
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "MicroMsg.SubCoreJdIP6"
            java.lang.String r4 = "jumpUrl update %s"
            com.tencent.mars.xlog.Log.i(r3, r4, r1)
            java.lang.String r3 = r0.f172146o
            r1 = 6
            goto L3e
        L37:
            boolean r1 = r0.f172137f
            if (r1 == 0) goto L3d
            r1 = 2
            goto L3e
        L3d:
            r1 = r2
        L3e:
            java.lang.String r4 = r0.f172132a
            java.lang.String r5 = "2"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L7b
            java.lang.String r4 = r0.f172146o
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r4 != 0) goto L7b
            long r4 = r0.f172140i
            long r6 = java.lang.System.currentTimeMillis()
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r8
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L60
            r4 = r2
            goto L61
        L60:
            r4 = r5
        L61:
            if (r4 == 0) goto L7b
            long r6 = r0.f172141j
            r10 = 0
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 / r8
            int r4 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r4 >= 0) goto L75
            goto L76
        L75:
            r2 = r5
        L76:
            if (r2 != 0) goto L7b
            java.lang.String r3 = r0.f172146o
            r1 = 3
        L7b:
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r0 != 0) goto L86
            java.lang.String r0 = Bi(r3, r1)
            return r0
        L86:
            java.lang.String r0 = r12.Ni()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.subapp.jdbiz.q.Ui():java.lang.String");
    }

    public com.tencent.mm.plugin.subapp.jdbiz.n Vi() {
        com.tencent.mm.plugin.subapp.jdbiz.n nVar = new com.tencent.mm.plugin.subapp.jdbiz.n();
        com.tencent.mm.plugin.subapp.jdbiz.o Zi = Zi();
        if (bj() && !Zi.d() && "3".equals(Zi.f172132a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreJdIP6", "bizType %s, jumpWeapp update user:%s path:%s version:%d", Zi.f172132a, Zi.f172147p, Zi.f172148q, java.lang.Integer.valueOf(Zi.f172149r));
            nVar.f172129a = Zi.f172147p;
            nVar.f172130b = Zi.f172148q;
            nVar.f172131c = Zi.f172149r;
        }
        if ("2".equals(Zi.f172132a)) {
            if (Zi.f172140i < java.lang.System.currentTimeMillis() / 1000) {
                long j17 = Zi.f172141j;
                if (!(j17 != 0 && j17 < java.lang.System.currentTimeMillis() / 1000)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreJdIP6", "bizType %s, jumpWeapp update user:%s path:%s version:%d", Zi.f172132a, Zi.f172147p, Zi.f172148q, java.lang.Integer.valueOf(Zi.f172149r));
                    nVar.f172129a = Zi.f172147p;
                    nVar.f172130b = Zi.f172148q;
                    nVar.f172131c = Zi.f172149r;
                }
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(nVar.f172129a)) {
            return nVar;
        }
        com.tencent.mm.plugin.subapp.jdbiz.n nVar2 = new com.tencent.mm.plugin.subapp.jdbiz.n();
        nVar2.f172129a = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigJumpWeAppUsername");
        nVar2.f172130b = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigJumpWeAppPath");
        nVar2.f172131c = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("JDEntranceConfigJumpWeAppVersion", 0);
        return nVar2;
    }

    public com.tencent.mm.plugin.subapp.jdbiz.o Zi() {
        if (this.f172151d == null) {
            this.f172151d = com.tencent.mm.plugin.subapp.jdbiz.o.a();
        }
        return this.f172151d;
    }

    public boolean aj() {
        return (com.tencent.mm.sdk.platformtools.t8.K0(Ri()) || (com.tencent.mm.sdk.platformtools.t8.K0(Ni()) && com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("JDEntranceConfigJumpWeAppUsername")))) ? false : true;
    }

    public boolean bj() {
        return "1".equals((java.lang.String) c01.d9.b().p().l(327939, ""));
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        ((java.util.HashMap) this.f172152e).clear();
    }

    public void wi() {
        c01.d9.b().p().w(327939, "");
    }
}
