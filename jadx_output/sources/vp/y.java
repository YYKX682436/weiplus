package vp;

/* loaded from: classes16.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp.a f438859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp.c0 f438860e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp.d0 f438861f;

    public y(vp.d0 d0Var, wp.a aVar, vp.c0 c0Var) {
        this.f438861f = d0Var;
        this.f438859d = aVar;
        this.f438860e = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        xp.d dVar = this.f438861f.f438766d;
        wp.a aVar = this.f438859d;
        vp.d0.b(dVar, aVar);
        vp.c0 c0Var = this.f438860e;
        if (c0Var != null) {
            c0Var.a(aVar);
        }
    }
}
