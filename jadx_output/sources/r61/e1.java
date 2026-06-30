package r61;

/* loaded from: classes11.dex */
public class e1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: i, reason: collision with root package name */
    public static int f392859i;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f392860d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f392861e;

    /* renamed from: f, reason: collision with root package name */
    public int f392862f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f392863g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f392864h;

    public e1(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this(str, i17, str2, i18, str3);
        this.f392863g = str4;
        this.f392864h = str5;
        r45.di diVar = (r45.di) this.f392860d.f70710a.f70684a;
        diVar.f372490o = str4;
        diVar.f372491p = str5;
    }

    public final boolean H(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return false;
        }
        return (str.startsWith("+") || str2.startsWith("+")) ? str.endsWith(str2) || str2.endsWith(str) : str.equals(str2);
    }

    public int I() {
        return ((r45.di) this.f392860d.f70710a.f70684a).f372484f;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        java.lang.String str;
        this.f392861e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f392860d;
        r45.di diVar = (r45.di) oVar.f70710a.f70684a;
        java.lang.String str2 = diVar.f372483e;
        if (str2 == null || str2.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBindOpMobile", "doScene getMobile Error: " + diVar.f372483e);
            return -1;
        }
        int i17 = diVar.f372484f;
        if ((i17 != 2 && i17 != 19) || ((str = diVar.f372485g) != null && str.length() > 0)) {
            return dispatch(sVar, oVar, this);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBindOpMobile", "doScene getVerifyCode Error: " + diVar.f372483e);
        return -1;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 132;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.o oVar = this.f392860d;
        r45.di diVar = (r45.di) oVar.f70710a.f70684a;
        r45.ei eiVar = (r45.ei) oVar.f70711b.f70700a;
        if (eiVar != null) {
            int i27 = eiVar.f373525w;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindOpMobile", "summerauth mmtls bindop:%s", java.lang.Integer.valueOf(i27));
            gm0.j1.i();
            gm0.j1.u().f273148a.f(47, java.lang.Integer.valueOf(i27));
            com.tencent.mm.network.s sVar = gm0.j1.n().f273288b.f70764d;
            if (sVar != null) {
                sVar.n1((i27 & 1) == 0);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd response JSON %s", eiVar.toJSON());
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindOpMobile", "summerauth mmtls bindop not set as ret:%s", eiVar);
        }
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBindOpMobile", "onGYNetEnd  errType:" + i18 + " errCode:" + i19);
            if (i18 != 4 || i19 != -240) {
                this.f392861e.onSceneEnd(i18, i19, str, this);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindOpMobile", "summerauth bindop MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", java.lang.Integer.valueOf(this.f392862f));
            int i28 = this.f392862f - 1;
            this.f392862f = i28;
            if (i28 <= 0) {
                this.f392861e.onSceneEnd(3, -1, "", this);
                return;
            } else {
                doScene(dispatcher(), this.f392861e);
                return;
            }
        }
        int i29 = diVar.f372484f;
        if (i29 == 2 || i29 == 4 || i29 == 25 || i29 == 11 || i29 == 19) {
            gm0.j1.u().c().w(4097, "");
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(6, "");
            java.lang.String str3 = diVar.f372483e;
            com.tencent.mm.storage.z3 g17 = c01.z1.g();
            c01.uc ucVar = c01.uc.f37514c;
            java.lang.String c17 = ucVar.c(g17.d1(), "login_user_name");
            java.lang.String u17 = gm0.j1.u().c().u(6, "");
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindOpMobile", "checkSwitchInfoWhenMobileChange: wxid=%s, switchLastUsername=%s oldMobile=%s newMobile=%s", g17.d1(), c17, u17, str3);
            if (H(u17, c17)) {
                ucVar.h(g17.d1(), "login_user_name", com.tencent.mm.sdk.platformtools.t8.u1(str3, com.tencent.mm.sdk.platformtools.t8.u1(g17.t0(), g17.d1())));
            }
            c01.b9 b9Var = c01.b9.f37069c;
            java.lang.String a17 = b9Var.a("login_user_name", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindOpMobile", "checkSwitchInfoWhenMobileChange: wxid=%s, loginUsername=%s oldMobile=%s newMobile=%s", g17.d1(), a17, u17, str3);
            if (H(u17, a17)) {
                b9Var.d("login_user_name", com.tencent.mm.sdk.platformtools.t8.u1(str3, com.tencent.mm.sdk.platformtools.t8.u1(g17.t0(), g17.d1())));
            }
            gm0.j1.u().c().w(6, diVar.f372483e);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_LAST_LOGIN_USERNAME_STRING;
                if (c18.m(u3Var, "").equals(str2)) {
                    gm0.j1.u().c().x(u3Var, diVar.f372483e);
                }
                java.util.Iterator it = ((java.util.HashSet) ucVar.d()).iterator();
                while (it.hasNext()) {
                    java.lang.String str4 = (java.lang.String) it.next();
                    c01.uc ucVar2 = c01.uc.f37514c;
                    if (str2.equals(ucVar2.c(str4, "login_user_name"))) {
                        ucVar2.h(str4, "login_user_name", diVar.f372483e);
                    }
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f392863g) || com.tencent.mm.sdk.platformtools.t8.K0(this.f392864h)) {
                r61.q0.k(true);
            }
            if (diVar.f372484f == 19) {
                gm0.j1.u().c().w(12322, null);
            }
            com.tencent.mm.plugin.report.service.b1.f(4, 3);
        } else if (i29 == 3) {
            gm0.j1.u().c().w(4097, "");
            gm0.j1.u().c().w(6, "");
            gm0.j1.u().c().w(12322, null);
            gm0.j1.u().c().w(64, java.lang.Integer.valueOf(eiVar.f373518p));
            com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent updateLocalVerifySwitchEvent = new com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent();
            am.zz zzVar = updateLocalVerifySwitchEvent.f54920g;
            zzVar.f8617a = false;
            zzVar.f8618b = true;
            updateLocalVerifySwitchEvent.e();
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            r61.b wi6 = m61.k.wi();
            if (wi6.f392819d.delete("addr_upload2", null, null) > 0) {
                wi6.b(5, wi6, null);
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it6 = ((java.util.ArrayList) ((com.tencent.mm.storage.q7) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ui()).J0(0)).iterator();
            while (it6.hasNext()) {
                com.tencent.mm.storage.p7 p7Var = (com.tencent.mm.storage.p7) it6.next();
                int i37 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().D3(p7Var.field_msgContent).f196364g;
                if (i37 == 10 || i37 == 11) {
                    hashSet.add(p7Var.field_talker);
                }
            }
            hashSet.size();
            java.util.Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                r61.q0.c(0L, (java.lang.String) it7.next());
            }
        }
        this.f392861e.onSceneEnd(i18, i19, str, this);
    }

    public e1(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        this(str, i17, str2, i18, str3);
        ((r45.di) this.f392860d.f70710a.f70684a).f372488m = str4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r6) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r6) == false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e1(java.lang.String r5, int r6, java.lang.String r7, int r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r61.e1.<init>(java.lang.String, int, java.lang.String, int, java.lang.String):void");
    }
}
