package nz2;

/* loaded from: classes9.dex */
public class x extends nz2.a {

    /* renamed from: d, reason: collision with root package name */
    public d50.q f341580d;

    @Override // nz2.o
    public java.util.Map C() {
        java.util.HashMap hashMap = new java.util.HashMap();
        re4.v a17 = re4.u.a();
        hashMap.put("cpu_id", a17.f394553a);
        hashMap.put("uid", a17.f394554b);
        return hashMap;
    }

    @Override // nz2.o
    public void C3(android.content.Context context, nz2.f fVar, nz2.b bVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "request faceid authorize: %s, %s", java.lang.Integer.valueOf(fVar.f341554b), fVar.f341553a);
        ((ne4.n) b()).c(new nz2.u(this, bVar), context, fVar.f341554b, 2, fVar.f341553a, null);
    }

    @Override // nz2.o
    public boolean D() {
        return wt5.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a, 2);
    }

    @Override // nz2.o
    public void D1(java.lang.Object... objArr) {
        if (wt5.a.i(re4.g0.a())) {
            wt5.a.s(re4.g0.a(), false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "change to new authkey name");
            fu5.d.b().a().put(1, re4.g0.d(1));
        }
    }

    @Override // nz2.o
    public boolean E2() {
        return wt5.a.k(com.tencent.mm.sdk.platformtools.x2.f193071a, 1);
    }

    @Override // nz2.o
    public boolean Lf(android.content.Context context) {
        boolean z17 = (wo.v1.f447828h.f447811b & 1) > 0;
        boolean a17 = is4.a.a("MMKV_KEY_SUPPORT_FINGER", wt5.a.m(context, 1));
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "is support finger: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(a17));
        return z17 && a17;
    }

    @Override // nz2.o
    public void Mf(boolean z17, boolean z18, boolean z19, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "on post pay: %s, %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        if (z18 && !z17 && z19) {
            java.lang.String string = bundle != null ? bundle.getString("pwd") : "";
            int i17 = bundle != null ? bundle.getInt("key_open_biometric_type") : 0;
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SoterBiometricPayManager", "no pwd. can not change auth key");
            } else {
                m05.i.f322570a.a("5", "4", "2", "update authkey after pay");
                ((ku5.t0) ku5.t0.f312615d).k(new nz2.w(this, string, i17), 500L);
            }
        }
    }

    public final d50.q b() {
        if (this.f341580d == null) {
            ((ie0.o) ((je0.j) i95.n0.c(je0.j.class))).getClass();
            this.f341580d = new ne4.n();
        }
        return this.f341580d;
    }

    @Override // nz2.o
    public void cancel() {
        d50.q qVar = this.f341580d;
        if (qVar != null) {
            ((ne4.n) qVar).a(true);
        }
    }

    @Override // nz2.o
    public void g9(android.content.Context context, nz2.f fVar, nz2.b bVar) {
        d50.n nVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "request fingerprint authorize: %s, %s", java.lang.Integer.valueOf(fVar.f341554b), fVar.f341553a);
        if (com.tencent.mm.sdk.platformtools.t8.K0(fVar.f341556d)) {
            nVar = null;
        } else {
            nVar = new d50.n();
            nVar.f226517a = fVar.f341556d;
            nVar.f226518b = fVar.f341557e;
            nVar.f226519c = fVar.f341558f;
        }
        d50.n nVar2 = nVar;
        ((ne4.n) b()).c(new nz2.t(this, bVar), context, fVar.f341554b, 1, fVar.f341553a, nVar2);
    }

    @Override // nz2.o
    public boolean h1() {
        boolean o17 = wt5.a.o(com.tencent.mm.sdk.platformtools.x2.f193071a, 2);
        ((ku5.t0) ku5.t0.f312615d).g(new nz2.q(this, o17));
        return o17;
    }

    @Override // nz2.o
    public boolean ja() {
        boolean o17 = wt5.a.o(com.tencent.mm.sdk.platformtools.x2.f193071a, 1);
        ((ku5.t0) ku5.t0.f312615d).g(new nz2.r(this, o17));
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "isDeviceHasFingerPrint:%s", java.lang.Boolean.valueOf(o17));
        return o17;
    }

    @Override // nz2.o
    public boolean mf() {
        boolean i17 = wt5.a.i(re4.g0.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "py: hasAuthKey: %b", java.lang.Boolean.valueOf(i17));
        return i17;
    }

    @Override // nz2.o
    public int of() {
        return 2;
    }

    @Override // nz2.o
    public void prepare() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "prepare");
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (aVar.type() != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "set soter manager");
            mz2.p1 p1Var = new mz2.p1();
            p1Var.c(this);
            gm0.j1.q(pz2.a.class, p1Var);
        } else {
            ((mz2.a) aVar).c(this);
        }
        if (((java.lang.String) fu5.d.b().a().get(1)).equals("WechatAuthKeyPay&null")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "init error, reinit");
            fu5.d b17 = fu5.d.b();
            b17.getClass();
            synchronized (fu5.d.class) {
                b17.f266913b = false;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 46);
            je0.i iVar = (je0.i) i95.n0.c(je0.i.class);
            nz2.p pVar = new nz2.p(this);
            ((ie0.m) iVar).getClass();
            se4.h.a(true, true, pVar);
        }
    }

    @Override // nz2.o
    public pz2.d r1() {
        return new mz2.w1();
    }

    @Override // nz2.o
    public boolean uf(android.content.Context context) {
        boolean z17 = (wo.v1.f447828h.f447811b & 2) > 0;
        boolean a17 = is4.a.a("MMKV_KEY_SUPPORT_FACE_ID", wt5.a.m(context, 2));
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "is support face: %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(a17));
        return z17 && a17;
    }

    @Override // nz2.o
    public boolean wh() {
        boolean z17 = wo.v1.f447826f.f447867a == 1;
        boolean z18 = wo.v1.f447828h.f447810a;
        boolean c17 = cu5.b.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "is support: %s, %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(c17));
        return (z17 || z18) && c17;
    }

    @Override // nz2.o
    public void z9(android.content.Context context, nz2.f fVar, nz2.d dVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterBiometricPayManager", "request fingerprint authorize for pay");
        if (dVar == null) {
            return;
        }
        g9(context, fVar, new nz2.s(this, dVar));
    }

    @Override // nz2.a, nz2.o
    public void cancel(boolean z17) {
        d50.q qVar = this.f341580d;
        if (qVar != null) {
            ((ne4.n) qVar).a(z17);
        }
    }
}
