package sh;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference f407996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sh.b f407997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f407998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f407999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m3.i f408000h;

    public a(sh.c cVar, java.util.concurrent.atomic.AtomicReference atomicReference, sh.b bVar, long j17, android.os.Handler handler, m3.i iVar) {
        this.f407996d = atomicReference;
        this.f407997e = bVar;
        this.f407998f = j17;
        this.f407999g = handler;
        this.f408000h = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.f407996d;
        rh.c1 c1Var = (rh.c1) atomicReference.get();
        m3.i iVar = this.f408000h;
        android.os.Handler handler = this.f407999g;
        long j17 = this.f407998f;
        if (c1Var == null) {
            rh.c1 c1Var2 = (rh.c1) iVar.get();
            c1Var2.I();
            atomicReference.set(c1Var2);
            handler.postDelayed(this, j17);
            return;
        }
        atomicReference.set(null);
        c1Var.l();
        if (this.f407997e.a(c1Var, j17)) {
            handler.getLooper().quit();
            return;
        }
        rh.c1 c1Var3 = (rh.c1) iVar.get();
        c1Var3.I();
        atomicReference.set(c1Var3);
        handler.postDelayed(this, j17);
    }
}
