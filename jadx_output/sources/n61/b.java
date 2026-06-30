package n61;

/* loaded from: classes11.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f335178d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f335179e;

    /* renamed from: f, reason: collision with root package name */
    public final long f335180f;

    public b(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, boolean z17) {
        byte[] d17;
        this.f335180f = 0L;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fi();
        lVar.f70665b = new r45.gi();
        lVar.f70666c = "/cgi-bin/micromsg-bin/bindqq";
        lVar.f70667d = 144;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f335179e = a17;
        this.f335180f = j17;
        r45.fi fiVar = (r45.fi) a17.f70710a.f70684a;
        fiVar.f374362d = new kk.v(j17).f308478d;
        fiVar.f374363e = "";
        fiVar.f374364f = "";
        fiVar.f374365g = "";
        fiVar.f374366h = "";
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = "";
        du5Var.f372757e = true;
        fiVar.f374368m = du5Var;
        fiVar.f374367i = 1;
        if (z17) {
            d17 = gm0.j1.b().l().c(j17, str3);
        } else {
            d17 = gm0.j1.b().l().d(j17, kk.k.g(str.getBytes()), true);
        }
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(d17);
        fiVar.f374373r = cu5Var;
        java.lang.String str5 = (java.lang.String) gm0.j1.u().c().l(47, null);
        java.lang.String str6 = str5 != null ? str5 : "";
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(com.tencent.mm.sdk.platformtools.t8.h(str6));
        fiVar.f374369n = cu5Var2;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Long.valueOf(j17);
        objArr[2] = java.lang.Integer.valueOf(d17 == null ? -1 : d17.length);
        objArr[3] = str3;
        objArr[4] = str2;
        objArr[5] = str4;
        objArr[6] = str6;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindQQ", "init opcode:%d qq:%d  wtbuf:%d img[%s,%s,%s] ksid:%s", objArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f335178d = u0Var;
        return dispatch(sVar, this.f335179e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 144;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27;
        int i28 = i19;
        com.tencent.mm.modelbase.o oVar = this.f335179e;
        r45.fi fiVar = (r45.fi) oVar.f70710a.f70684a;
        r45.gi giVar = (r45.gi) oVar.f70711b.f70700a;
        byte[] d17 = x51.j1.d(giVar.f375267s);
        boolean f17 = !com.tencent.mm.sdk.platformtools.t8.M0(d17) ? gm0.j1.b().l().f(new kk.v(fiVar.f374362d).longValue(), d17) : false;
        if (f17 && gm0.j1.a()) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MANUAL_AUTH_AS_QQ_ACCOUNT_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i18);
        objArr[1] = java.lang.Integer.valueOf(i19);
        objArr[2] = java.lang.Boolean.valueOf(f17);
        objArr[3] = java.lang.Integer.valueOf(d17 == null ? -1 : d17.length);
        objArr[4] = giVar.f375255d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindQQ", "onGYNetEnd[%d,%d] wtret:%b wtRespBuf:%d imgsid:%s", objArr);
        if (i18 == 0 && i28 == 0) {
            int q17 = gm0.j1.u().c().q(9, 0);
            gm0.j1.u().c().w(9, java.lang.Integer.valueOf(fiVar.f374362d));
            if (q17 != 0) {
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LAST_LOGIN_USERNAME_STRING;
                if (c17.m(u3Var, "").equals(java.lang.String.valueOf(q17))) {
                    gm0.j1.u().c().x(u3Var, c01.z1.r());
                }
                java.util.Iterator it = ((java.util.HashSet) c01.uc.f37514c.d()).iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    java.lang.String valueOf = java.lang.String.valueOf(q17);
                    c01.uc ucVar = c01.uc.f37514c;
                    if (valueOf.equals(ucVar.c(str2, "login_user_name"))) {
                        ucVar.h(str2, "login_user_name", str2);
                    }
                }
            }
            if (fiVar.f374367i == 1) {
                gm0.j1.u().c().w(17, java.lang.Integer.valueOf(giVar.f375257f));
            }
            xg3.r0 hj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj();
            java.lang.String str3 = giVar.f375259h;
            boolean z17 = giVar.f375258g == 1 ? 1 : 0;
            com.tencent.mm.storage.ka kaVar = (com.tencent.mm.storage.ka) hj6;
            kaVar.getClass();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.RoleStorage", "insert role info failed: empty user");
            } else {
                com.tencent.mm.storage.ja n07 = kaVar.n0(str3);
                if (n07 == null) {
                    kaVar.u0(new com.tencent.mm.storage.ja(str3, z17, true, 2));
                } else {
                    if (z17 != 0) {
                        n07.f195060d |= z17;
                    } else {
                        n07.f195060d &= -2;
                    }
                    n07.f195057a = 4;
                    kaVar.z0(n07);
                }
            }
            int i29 = fiVar.f374362d;
            if (i29 != 0) {
                i27 = 3;
                ((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).y0("" + new kk.v(i29) + "@qqim", 3);
            } else {
                i27 = 3;
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).hj(i29, i27);
            gm0.j1.u().c().w(32, fiVar.f374363e);
            gm0.j1.u().c().w(33, fiVar.f374364f);
            java.lang.String l17 = com.tencent.mm.sdk.platformtools.t8.l(gm0.j1.b().l().b(new kk.v(fiVar.f374362d).longValue()));
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindQQ", "onGYNetEnd wtret:%b newa2key:%s ", java.lang.Boolean.valueOf(f17), com.tencent.mm.sdk.platformtools.t8.G1(l17));
            gm0.j1.u().c().w(72, l17);
            gm0.j1.u().c().w(46, com.tencent.mm.sdk.platformtools.t8.l(x51.j1.d(giVar.f375263o)));
            java.lang.String l18 = com.tencent.mm.sdk.platformtools.t8.l(x51.j1.d(fiVar.f374369n));
            gm0.j1.u().c().w(47, l18);
            gm0.j1.u().f273148a.f(18, l18);
            gm0.j1.u().c().w(-1535680990, giVar.f375261m);
        } else if (i18 == 4) {
            gm0.j1.u().c().w(32, "");
            gm0.j1.u().c().w(33, "");
        }
        if (fiVar.f374367i == 3 && i28 == -3) {
            i28 = 10000;
        }
        this.f335178d.onSceneEnd(i18, i28, str, this);
    }

    public b(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6, boolean z17) {
        this(j17, str, str2, str3, str4, i17, z17);
        r45.fi fiVar = (r45.fi) this.f335179e.f70710a.f70684a;
        fiVar.f374371p = str5;
        fiVar.f374372q = str6;
    }
}
