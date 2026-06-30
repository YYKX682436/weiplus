package mz2;

/* loaded from: classes9.dex */
public class g1 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public mz2.f1 f333122d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent f333123e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f333124f;

    public g1() {
        super(0);
        this.f333124f = false;
    }

    public final void b(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "onFail()");
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent openFingerPrintAuthEvent = this.f333123e;
        mz2.a aVar2 = (mz2.a) aVar;
        aVar2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseFingerprintImp", "hy: onOpenFingerprintAuthFailed");
        if (openFingerPrintAuthEvent != null) {
            am.on onVar = openFingerPrintAuthEvent.f54595g;
            if (onVar.f7565c != null) {
                am.pn pnVar = new am.pn();
                openFingerPrintAuthEvent.f54596h = pnVar;
                pnVar.f7635a = i17;
                pnVar.f7636b = "";
                pnVar.f7637c = "";
                pnVar.f7640f = aVar2.type();
                onVar.f7565c.run();
            }
        }
        if (this.f333124f) {
            this.f333123e = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "callback OpenFingerPrintAuthEvent onFail()");
    }

    public final boolean c(boolean z17) {
        f();
        if (!((nz2.o) gm0.j1.s(nz2.o.class)).ja()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFingerPrintAuthEventListener", "no fingerprints enrolled, use settings to enroll fingerprints first");
            ((nz2.o) gm0.j1.s(nz2.o.class)).cancel();
            this.f333123e = null;
            this.f333124f = true;
            b(1, "");
            return false;
        }
        if (((pz2.a) gm0.j1.s(pz2.a.class)).dg(this.f333122d, 0, z17) == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "startIdentify()");
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenFingerPrintAuthEventListener", "failed to start identify");
        ((nz2.o) gm0.j1.s(nz2.o.class)).cancel();
        this.f333123e = null;
        this.f333124f = true;
        b(1, "");
        return false;
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent openFingerPrintAuthEvent = (com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent) iEvent;
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFingerPrintAuthEventListener", "OpenFingerPrintAuthEvent account is not ready");
            return false;
        }
        this.f333124f = false;
        if (!(openFingerPrintAuthEvent instanceof com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenFingerPrintAuthEventListener", "handle OpenFingerPrintAuthEventListener");
        if (!mz2.n0.c()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFingerPrintAuthEventListener", "device is not support FingerPrintAuth");
            this.f333124f = true;
            b(1, "");
            return true;
        }
        this.f333123e = openFingerPrintAuthEvent;
        if (openFingerPrintAuthEvent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenFingerPrintAuthEventListener", null, "mEvent is null !!!");
            return false;
        }
        java.lang.String str = openFingerPrintAuthEvent.f54595g.f7563a;
        mz2.d2 d2Var = mz2.d2.IML;
        d2Var.f333112e = str;
        boolean ja6 = ((nz2.o) gm0.j1.s(nz2.o.class)).ja();
        if (this.f333122d == null) {
            this.f333122d = new mz2.f1(this);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(d2Var.f333111d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenFingerPrintAuthEventListener", "no challenge!!");
            b(1, "");
        } else {
            c(false);
        }
        return ja6;
    }

    public void f() {
        ((nz2.o) gm0.j1.s(nz2.o.class)).cancel();
    }
}
