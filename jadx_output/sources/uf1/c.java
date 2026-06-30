package uf1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f427150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f427151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uf1.a f427152f;

    public c(uf1.a aVar, com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var, java.lang.Runnable runnable) {
        this.f427152f = aVar;
        this.f427150d = k0Var;
        this.f427151e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        uf1.a aVar = this.f427152f;
        android.view.Surface surface = aVar.f427138g;
        java.lang.Runnable runnable = this.f427151e;
        if (surface == null) {
            com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = this.f427150d;
            if ((k0Var instanceof vf1.g) || (k0Var instanceof vf1.i)) {
                ((java.util.Vector) aVar.f427141m).add(runnable);
                return;
            }
        }
        runnable.run();
    }
}
