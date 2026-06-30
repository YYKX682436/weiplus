package tc3;

/* loaded from: classes7.dex */
public final class m0 extends qc3.e {

    /* renamed from: e, reason: collision with root package name */
    public final sc3.k1 f417235e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f417236f;

    public m0(sc3.k1 biz) {
        kotlin.jvm.internal.o.g(biz, "biz");
        this.f417235e = biz;
        this.f417236f = true;
    }

    @Override // qc3.f
    public void D1() {
        if (this.f417236f) {
            this.f417235e.D1();
        }
    }

    @Override // qc3.f
    public void J5(int i17, java.lang.String result) {
        kotlin.jvm.internal.o.g(result, "result");
        if (this.f417236f) {
            this.f417235e.J5(i17, result);
        }
    }

    @Override // qc3.f
    public void M1(int i17, int i18, int i19, long j17, int[] pointerIds, float[] x17, float[] y17) {
        kotlin.jvm.internal.o.g(pointerIds, "pointerIds");
        kotlin.jvm.internal.o.g(x17, "x");
        kotlin.jvm.internal.o.g(y17, "y");
        if (this.f417236f) {
            this.f417235e.M1(i17, i18, i19, j17, pointerIds, x17, y17);
        }
    }

    @Override // qc3.f
    public void Oc(int i17) {
        if (this.f417236f) {
            sc3.k1 k1Var = this.f417235e;
            k1Var.getClass();
            try {
                android.os.IBinder asBinder = k1Var.H0().asBinder();
                if (asBinder != null) {
                    asBinder.unlinkToDeath(k1Var.X, 0);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w(k1Var.Q, "unlink client binder death failed: " + e17);
            }
            k1Var.Oc(i17);
        }
    }

    @Override // qc3.f
    public void cj(int i17, int i18, int i19) {
        if (this.f417236f) {
            this.f417235e.cj(i17, i18, i19);
        }
    }

    @Override // qc3.f
    public void fj(int i17, java.lang.String result) {
        kotlin.jvm.internal.o.g(result, "result");
        if (this.f417236f) {
            this.f417235e.fj(i17, result);
        }
    }

    @Override // qc3.f
    public void pg(int i17, android.view.Surface surface, int i18, int i19) {
        kotlin.jvm.internal.o.g(surface, "surface");
        if (this.f417236f) {
            this.f417235e.pg(i17, surface, i18, i19);
        }
    }

    @Override // qc3.f
    public void s2(java.lang.String event, java.lang.String data) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        if (this.f417236f) {
            this.f417235e.s2(event, data);
        }
    }

    @Override // qc3.f
    public void setMute(boolean z17) {
        if (this.f417236f) {
            this.f417235e.setMute(z17);
        }
    }

    @Override // qc3.f
    public void uc() {
        if (this.f417236f) {
            this.f417235e.uc();
        }
    }

    @Override // qc3.f
    public void w3(com.tencent.mm.plugin.magicbrush.MBBuildConfig config) {
        kotlin.jvm.internal.o.g(config, "config");
        if (this.f417236f) {
            this.f417235e.w3(config);
        }
    }

    @Override // qc3.f
    public void w9(java.lang.String script, int i17) {
        kotlin.jvm.internal.o.g(script, "script");
        if (this.f417236f) {
            this.f417235e.w9(script, i17);
        }
    }

    @Override // qc3.f
    public void yd(int i17) {
        if (this.f417236f) {
            this.f417235e.yd(i17);
        }
    }

    @Override // qc3.f
    public void z3() {
        if (this.f417236f) {
            this.f417235e.z3();
        }
    }
}
