package h11;

/* loaded from: classes14.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, hv.f {

    /* renamed from: m, reason: collision with root package name */
    public static h11.c f278070m;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f278071d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f278072e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f278073f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f278074g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f278075h;

    /* renamed from: i, reason: collision with root package name */
    public int f278076i;

    public e(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4) {
        this(str, i17, str2, i18, str3);
        ((o45.eh) this.f278071d.getReqObj()).f342922a.f372488m = str4;
    }

    public int H() {
        return ((h11.d) this.f278071d).f278069b.f342925a.f373528z;
    }

    public int I() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((h11.d) this.f278071d).f278069b.f342925a.f373524v;
        if (w56Var == null || (linkedList = w56Var.f388905e) == null || linkedList.size() <= 0) {
            return 30;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            if (gg6Var.f375237d == 4) {
                return com.tencent.mm.sdk.platformtools.t8.P(gg6Var.f375238e, 30);
            }
        }
        return 30;
    }

    public int J() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((h11.d) this.f278071d).f278069b.f342925a.f373524v;
        if (w56Var == null || (linkedList = w56Var.f388905e) == null || linkedList.size() <= 0) {
            return 0;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            if (gg6Var.f375237d == 5) {
                return com.tencent.mm.sdk.platformtools.t8.P(gg6Var.f375238e, 0);
            }
        }
        return 0;
    }

    public boolean K() {
        int i17;
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((h11.d) this.f278071d).f278069b.f342925a.f373524v;
        if (w56Var != null && (linkedList = w56Var.f388905e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f375237d == 7) {
                    i17 = com.tencent.mm.sdk.platformtools.t8.P(gg6Var.f375238e, 0);
                    break;
                }
            }
        }
        i17 = 0;
        return i17 > 0;
    }

    public int L() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((h11.d) this.f278071d).f278069b.f342925a.f373524v;
        if (w56Var == null || (linkedList = w56Var.f388905e) == null || linkedList.size() <= 0) {
            return 3;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            if (gg6Var.f375237d == 6) {
                return com.tencent.mm.sdk.platformtools.t8.P(gg6Var.f375238e, 3);
            }
        }
        return 3;
    }

    public int M() {
        return ((o45.eh) this.f278071d.getReqObj()).f342922a.f372484f;
    }

    public java.lang.String N() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((h11.d) this.f278071d).f278069b.f342925a.f373524v;
        if (w56Var != null && (linkedList = w56Var.f388905e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f375237d == 14) {
                    return gg6Var.f375238e;
                }
            }
        }
        return null;
    }

    public java.lang.String O() {
        java.util.LinkedList linkedList;
        r45.w56 w56Var = ((h11.d) this.f278071d).f278069b.f342925a.f373524v;
        if (w56Var != null && (linkedList = w56Var.f388905e) != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.gg6 gg6Var = (r45.gg6) it.next();
                if (gg6Var.f375237d == 15) {
                    return gg6Var.f375238e;
                }
            }
        }
        return null;
    }

    public java.lang.String P() {
        return ((h11.d) this.f278071d).f278069b.f342925a.f373512g;
    }

    public java.lang.String Q() {
        return ((h11.d) this.f278071d).f278069b.f342925a.f373513h;
    }

    public void R(r45.k57 k57Var) {
        if (k57Var != null) {
            try {
                r45.di diVar = ((o45.eh) this.f278071d.getReqObj()).f342922a;
                r45.cu5 cu5Var = new r45.cu5();
                cu5Var.d(k57Var.toByteArray());
                diVar.f372500y = cu5Var;
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public void S(java.lang.String str) {
        ((o45.eh) this.f278071d.getReqObj()).f342922a.f372498w = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        java.lang.String str;
        this.f278072e = u0Var;
        com.tencent.mm.network.v0 v0Var = this.f278071d;
        o45.eh ehVar = (o45.eh) v0Var.getReqObj();
        java.lang.String str2 = ehVar.f342922a.f372483e;
        r45.di diVar = ehVar.f342922a;
        if (str2 == null || str2.length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBindMobileForReg", "doScene getMobile Error: " + diVar.f372483e);
            return -1;
        }
        int i17 = diVar.f372484f;
        if ((i17 == 6 || i17 == 9) && ((str = diVar.f372485g) == null || str.length() <= 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneBindMobileForReg", "doScene getVerifyCode Error: " + diVar.f372483e);
            return -1;
        }
        diVar.G = this.f278073f;
        diVar.H = this.f278074g;
        diVar.I = this.f278075h;
        return dispatch(sVar, v0Var, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 145;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.ei eiVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindMobileForReg", "dkidc onGYNetEnd  errType:%d errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        o45.fh fhVar = (o45.fh) v0Var.getRespObj();
        if (fhVar == null || (eiVar = fhVar.f342925a) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindMobileForReg", "summerauth mmtls bindopreg not set as ret:%s", fhVar);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindMobileForReg", "summerauth mmtls bindopreg json:%s", eiVar.toJSON());
            int i27 = fhVar.f342925a.f373525w;
            gm0.j1.i();
            gm0.j1.u().f273148a.f(47, java.lang.Integer.valueOf(i27));
            com.tencent.mm.network.s sVar = gm0.j1.n().f273288b.f70764d;
            if (sVar != null) {
                sVar.n1((i27 & 1) == 0);
            }
        }
        if (i18 == 4 && i19 == -301) {
            r45.ei eiVar2 = fhVar.f342925a;
            c01.f9.d(eiVar2.f373515m, eiVar2.f373516n, eiVar2.f373514i, true, eiVar2.D);
            int i28 = this.f278076i - 1;
            this.f278076i = i28;
            if (i28 <= 0) {
                this.f278072e.onSceneEnd(3, -1, "", this);
                return;
            } else {
                doScene(dispatcher(), this.f278072e);
                return;
            }
        }
        if (i18 == 4 && i19 == -240) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindMobileForReg", "summerauth bindopreg MM_ERR_AUTO_RETRY_REQUEST redirectCount:%s", java.lang.Integer.valueOf(this.f278076i));
            int i29 = this.f278076i - 1;
            this.f278076i = i29;
            if (i29 <= 0) {
                this.f278072e.onSceneEnd(3, -1, "", this);
                return;
            } else {
                doScene(dispatcher(), this.f278072e);
                return;
            }
        }
        if (i18 == 4 && i19 == -102) {
            gm0.j1.e().j(new h11.b(this, v0Var.getReqObj().getRsaInfo().f342999c));
            return;
        }
        if (i18 == 4 && (i19 == -305 || i19 == -306)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindMobileForReg", "summerauth bindmobilereg MM_ERR_CERT_SWITCH or MM_ERR_ECDHFAIL_ROLLBACK errCode:%d ver:%d", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(o45.ag.a()));
            doScene(dispatcher(), this.f278072e);
        } else {
            if (i18 != 0 || i19 != 0) {
                this.f278072e.onSceneEnd(i18, i19, str, this);
                return;
            }
            r45.ei eiVar3 = fhVar.f342925a;
            c01.f9.d(eiVar3.f373515m, eiVar3.f373516n, eiVar3.f373514i, false, 0);
            this.f278072e.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
    }

    public e(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3) {
        this(str, i17, str2, i18, str3, 0);
    }

    public e(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, int i19) {
        this(str, i17, str2, i18, str3, i19, null, null);
    }

    public e(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, int i19, r45.cu5 cu5Var, r45.c66 c66Var) {
        java.lang.String string;
        this.f278072e = null;
        java.lang.String str4 = "";
        this.f278073f = "";
        this.f278074g = "";
        this.f278075h = "";
        this.f278076i = 2;
        h11.d dVar = new h11.d();
        this.f278071d = dVar;
        o45.eh ehVar = (o45.eh) dVar.getReqObj();
        r45.di diVar = ehVar.f342922a;
        diVar.f372484f = i17;
        diVar.f372483e = str;
        diVar.f372485g = str2;
        diVar.f372497v = i19;
        diVar.f372486h = i18;
        diVar.f372487i = str3;
        diVar.f372493r = com.tencent.mm.sdk.platformtools.m2.d();
        java.lang.String e17 = gm0.m.e();
        r45.di diVar2 = ehVar.f342922a;
        diVar2.f372496u = e17;
        diVar2.f372481J = cu5Var;
        diVar2.K = c66Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(diVar2.f372490o) && com.tencent.mm.sdk.platformtools.t8.K0(diVar2.f372491p)) {
            h11.c cVar = f278070m;
            if (cVar != null) {
                ((aq1.g1) cVar).getClass();
                if (com.tencent.mm.sdk.platformtools.a0.f192448k) {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i7d);
                } else {
                    string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.i7c);
                }
                str4 = string;
            }
            diVar2.f372490o = str4;
            diVar2.f372491p = o45.wf.f343026d;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindMobileForReg", "req json %s", diVar2.toJSON());
    }
}
