package nu4;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f340275d;

    public r(nu4.b0 b0Var) {
        this.f340275d = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.appcache.u3 B0 = this.f340275d.B0();
        com.tencent.mapsdk.rastercore.tools.IO.safeClose(B0 instanceof java.io.Closeable ? (java.io.Closeable) B0 : null);
    }
}
