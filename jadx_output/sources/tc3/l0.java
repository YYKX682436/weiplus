package tc3;

/* loaded from: classes7.dex */
public final class l0 implements qc3.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f417231d;

    /* renamed from: e, reason: collision with root package name */
    public final qc3.f f417232e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f417233f;

    public l0(java.lang.String instanceName, qc3.f service, yz5.p errorCallback) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(errorCallback, "errorCallback");
        this.f417231d = instanceName;
        this.f417232e = service;
        this.f417233f = errorCallback;
    }

    @Override // qc3.f
    public void D1() {
        d(new tc3.k0(this));
    }

    @Override // qc3.f
    public void J5(int i17, java.lang.String result) {
        kotlin.jvm.internal.o.g(result, "result");
        d(new tc3.y(this, i17, result));
    }

    @Override // qc3.f
    public void M1(int i17, int i18, int i19, long j17, int[] pointerIds, float[] x17, float[] y17) {
        kotlin.jvm.internal.o.g(pointerIds, "pointerIds");
        kotlin.jvm.internal.o.g(x17, "x");
        kotlin.jvm.internal.o.g(y17, "y");
        d(new tc3.b0(this, i17, i18, i19, j17, pointerIds, x17, y17));
    }

    @Override // qc3.f
    public void Oc(int i17) {
        d(new tc3.x(this, i17));
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
        return this.f417232e.asBinder();
    }

    @Override // qc3.f
    public void cj(int i17, int i18, int i19) {
        d(new tc3.h0(this, i17, i18, i19));
    }

    public final void d(yz5.a aVar) {
        try {
            aVar.invoke();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
            this.f417233f.invoke(stackTraceString, "");
        }
    }

    @Override // qc3.f
    public void fj(int i17, java.lang.String result) {
        kotlin.jvm.internal.o.g(result, "result");
        d(new tc3.z(this, i17, result));
    }

    @Override // qc3.f
    public void pg(int i17, android.view.Surface surface, int i18, int i19) {
        kotlin.jvm.internal.o.g(surface, "surface");
        d(new tc3.f0(this, i17, surface, i18, i19));
    }

    @Override // qc3.f
    public void s2(java.lang.String event, java.lang.String data) {
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        tc3.d0 d0Var = new tc3.d0(this, event, data);
        tc3.e0 e0Var = new tc3.e0(this, event, data);
        try {
            d0Var.invoke();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
            this.f417233f.invoke(stackTraceString, e0Var.invoke());
        }
    }

    @Override // qc3.f
    public void setMute(boolean z17) {
        d(new tc3.j0(this, z17));
    }

    @Override // qc3.f
    public void uc() {
        d(new tc3.i0(this));
    }

    @Override // qc3.f
    public void w3(com.tencent.mm.plugin.magicbrush.MBBuildConfig config) {
        kotlin.jvm.internal.o.g(config, "config");
        d(new tc3.c0(this, config));
    }

    @Override // qc3.f
    public void w9(java.lang.String script, int i17) {
        kotlin.jvm.internal.o.g(script, "script");
        tc3.v vVar = new tc3.v(this, script, i17);
        tc3.w wVar = new tc3.w(this, script);
        try {
            vVar.invoke();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
            this.f417233f.invoke(stackTraceString, wVar.invoke());
        }
    }

    @Override // qc3.f
    public void yd(int i17) {
        d(new tc3.g0(this, i17));
    }

    @Override // qc3.f
    public void z3() {
        d(new tc3.a0(this));
    }
}
