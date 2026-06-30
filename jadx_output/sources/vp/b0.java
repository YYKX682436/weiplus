package vp;

/* loaded from: classes16.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f438733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp.c0 f438734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp.d0 f438735f;

    public b0(vp.d0 d0Var, java.util.List list, vp.c0 c0Var) {
        this.f438735f = d0Var;
        this.f438733d = list;
        this.f438734e = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (wp.a aVar : this.f438733d) {
            vp.d0.b(this.f438735f.f438766d, aVar);
            vp.c0 c0Var = this.f438734e;
            if (c0Var != null) {
                c0Var.a(aVar);
            }
        }
    }
}
