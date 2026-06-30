package tc3;

/* loaded from: classes7.dex */
public final class u extends qc3.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f417250d;

    /* renamed from: e, reason: collision with root package name */
    public final qc3.c f417251e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f417252f;

    public u(java.lang.String instanceName, qc3.c client, yz5.p errorCallback) {
        kotlin.jvm.internal.o.g(instanceName, "instanceName");
        kotlin.jvm.internal.o.g(client, "client");
        kotlin.jvm.internal.o.g(errorCallback, "errorCallback");
        this.f417250d = instanceName;
        this.f417251e = client;
        this.f417252f = errorCallback;
    }

    @Override // qc3.c
    public void B8(int i17, int i18, int i19, int i27, int i28, int i29) {
        e(new tc3.l(this, i17, i18, i19, i27, i28, i29));
    }

    @Override // qc3.c
    public void Bi(int i17, float[] left, float[] top, float[] width, float[] height) {
        kotlin.jvm.internal.o.g(left, "left");
        kotlin.jvm.internal.o.g(top, "top");
        kotlin.jvm.internal.o.g(width, "width");
        kotlin.jvm.internal.o.g(height, "height");
        e(new tc3.k(this, i17, left, top, width, height));
    }

    @Override // qc3.c
    public void C3(int i17, int i18, int i19, int i27, int i28, int i29) {
        e(new tc3.h(this, i17, i18, i19, i27, i28, i29));
    }

    @Override // qc3.c
    public void Da(boolean z17) {
        e(new tc3.o(this, z17));
    }

    @Override // qc3.c
    public void F2(int i17, java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        e(new tc3.p(this, i17, msg));
    }

    @Override // qc3.c
    public void K3(int i17) {
        e(new tc3.j(this, i17));
    }

    @Override // qc3.c
    public void Ke(java.lang.String logStr) {
        kotlin.jvm.internal.o.g(logStr, "logStr");
        e(new tc3.r(this, logStr));
    }

    @Override // qc3.c
    public void Oe() {
        try {
            new tc3.t(this).invoke();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
            this.f417252f.invoke(stackTraceString, "heartbeat-onPing");
        }
    }

    @Override // qc3.c
    public void c(int i17, boolean z17) {
        e(new tc3.i(this, i17, z17));
    }

    public final void e(yz5.a aVar) {
        try {
            aVar.invoke();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
            this.f417252f.invoke(stackTraceString, "");
        }
    }

    @Override // qc3.c
    public void h(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        e(new tc3.q(this, envId, msg));
    }

    @Override // qc3.c
    public java.lang.String ih(java.lang.String api, java.lang.String data, java.lang.String str) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(api, "api");
        kotlin.jvm.internal.o.g(data, "data");
        tc3.f fVar = new tc3.f(this, api, data, str);
        tc3.g gVar = new tc3.g(this, api);
        try {
            obj = fVar.invoke();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
            this.f417252f.invoke(stackTraceString, gVar.invoke());
            obj = "{\"errMsg\":\"Not handled\", \"errCode\": -1}";
        }
        return (java.lang.String) obj;
    }

    @Override // qc3.c
    public void j6(java.lang.String api, java.lang.String data, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(api, "api");
        kotlin.jvm.internal.o.g(data, "data");
        tc3.d dVar = new tc3.d(this, api, data, str, i17);
        tc3.e eVar = new tc3.e(this, api);
        try {
            dVar.invoke();
        } catch (android.os.RemoteException e17) {
            java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
            kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
            this.f417252f.invoke(stackTraceString, eVar.invoke());
        }
    }

    @Override // qc3.c
    public void n() {
        e(new tc3.s(this));
    }

    @Override // qc3.c
    public void onCreated() {
        e(new tc3.m(this));
    }

    @Override // qc3.c
    public void onDestroy() {
        e(new tc3.n(this));
    }
}
