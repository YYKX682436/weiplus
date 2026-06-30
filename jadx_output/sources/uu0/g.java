package uu0;

/* loaded from: classes5.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f431232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uu0.c f431233e;

    public g(uu0.c cVar, java.lang.Boolean bool) {
        this.f431233e = cVar;
        this.f431232d = bool;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f431233e.f431208c) {
            uu0.c.b(this.f431233e, this.f431232d);
        }
    }
}
