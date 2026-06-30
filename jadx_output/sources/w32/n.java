package w32;

/* loaded from: classes13.dex */
public class n extends u32.l0 {

    /* renamed from: e, reason: collision with root package name */
    public final w32.c f442693e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f442694f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f442695g = new w32.l(this);

    public n(w32.c cVar) {
        this.f442693e = null;
        iz5.a.d(null, cVar);
        this.f442693e = cVar;
    }

    @Override // u32.m0
    public void wh(long j17, int i17, int i18, java.lang.String str, u32.w0 w0Var) {
        if (this.f442694f) {
            return;
        }
        gm0.j1.e().d().removeCallbacks(this.f442695g);
        gm0.j1.e().d().post(new w32.m(this, j17, i17, i18, str, w0Var));
    }
}
