package w11;

/* loaded from: classes12.dex */
public class u0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f442149d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f442150e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.cx4 f442151f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mars.comm.MMWakerLock f442152g;

    public u0(r45.cx4 cx4Var) {
        this.f442151f = cx4Var;
        com.tencent.mars.comm.MMWakerLock mMWakerLock = new com.tencent.mars.comm.MMWakerLock(com.tencent.mm.sdk.platformtools.x2.f193071a, "MicroMsg.NetSceneSynCheck");
        this.f442152g = mMWakerLock;
        mMWakerLock.lock(3000L, "NetSceneSynCheck");
        boolean a17 = o45.ji.a();
        w11.b2 b2Var = w11.c2.f441991a;
        if (a17) {
            w11.s0 s0Var = new w11.s0();
            this.f442150e = s0Var;
            gm0.j1.i();
            if (gm0.j1.u() != null) {
                gm0.j1.i();
                if (gm0.j1.u().c() != null) {
                    gm0.j1.i();
                    long h17 = gm0.j1.b().h() & io.flutter.embedding.android.KeyboardMap.kValueMask;
                    ((o45.fi) s0Var.getReqObj()).f342926a = b2Var.a();
                    ((o45.fi) s0Var.getReqObj()).f342929d = h17;
                    ((o45.fi) s0Var.getReqObj()).f342927b = o45.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    ((o45.fi) s0Var.getReqObj()).f342928c = o45.a.b();
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSynCheck", "[arthurdan.NetSceneSynCheckCrash] Notice!!! MMCore.getAccStg() is null");
            return;
        }
        w11.t0 t0Var = new w11.t0();
        this.f442150e = t0Var;
        gm0.j1.i();
        if (gm0.j1.u() != null) {
            gm0.j1.i();
            if (gm0.j1.u().c() != null) {
                ((o45.gi) t0Var.getReqObj()).f342935a = b2Var.a();
                o45.gi giVar = (o45.gi) t0Var.getReqObj();
                gm0.j1.i();
                giVar.f342938d = gm0.j1.b().h();
                ((o45.gi) t0Var.getReqObj()).f342936b = o45.a.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
                ((o45.gi) t0Var.getReqObj()).f342937c = o45.a.b();
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSynCheck", "[arthurdan.NetSceneSynCheckCrash] Notice!!! MMCore.getConfigStg() is null");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f442149d = u0Var;
        int dispatch = dispatch(sVar, this.f442150e, this);
        if (dispatch == -1) {
            com.tencent.mars.comm.MMWakerLock mMWakerLock = this.f442152g;
            if (mMWakerLock.isLocking()) {
                mMWakerLock.unLock();
            }
        }
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public long getReturnTimeout() {
        return 240000L;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 39;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (gm0.j1.a() && !gm0.m.r()) {
            if (o45.ji.a()) {
                o45.hi hiVar = (o45.hi) v0Var.getRespObj();
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSynCheck", "synccheck3 syncCheck3 complete, selector=" + hiVar.f342947a);
                ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().c(hiVar.f342947a, 2, hiVar.a(), this.f442151f);
            } else {
                o45.ii iiVar = (o45.ii) v0Var.getRespObj();
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSynCheck", "new syncCheck complete, selector=" + iiVar.f342961a);
                byte[] bArr2 = ((o45.gi) v0Var.getReqObj()).f342939e;
                if (com.tencent.mm.sdk.platformtools.t8.M0(bArr2)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSynCheck", "onGYNetEnd md5 is null");
                }
                iiVar.f342964d = bArr2;
                ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().c(iiVar.f342961a, 2, iiVar.a(), this.f442151f);
            }
        }
        this.f442149d.onSceneEnd(i18, i19, str, this);
        this.f442152g.unLock();
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean uniqueInNetsceneQueue() {
        return true;
    }
}
