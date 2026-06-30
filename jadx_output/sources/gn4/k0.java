package gn4;

/* loaded from: classes15.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm4.j f273635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gn4.l0 f273636e;

    public k0(gn4.l0 l0Var, sm4.j jVar) {
        this.f273636e = l0Var;
        this.f273635d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gn4.c1 c1Var = this.f273636e.f273638d.f175156o;
        sm4.j jVar = this.f273635d;
        fn4.m E = c1Var.E(jVar.f409955g);
        if (E == null || !(E instanceof gn4.d0)) {
            return;
        }
        ((gn4.c0) E.i().getControlBar()).B(jVar.f409955g);
    }
}
