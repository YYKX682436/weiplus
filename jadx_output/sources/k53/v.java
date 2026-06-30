package k53;

/* loaded from: classes8.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p33.l f304405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k53.b0 f304406e;

    public v(k53.c0 c0Var, p33.l lVar, k53.b0 b0Var) {
        this.f304405d = lVar;
        this.f304406e = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r90.l lVar = (r90.l) i95.n0.c(r90.l.class);
        java.lang.String str = this.f304405d.f351607i;
        ((q90.i) lVar).getClass();
        android.graphics.Bitmap p17 = ai3.d.p(str);
        if (p17 != null) {
            this.f304406e.f304339f.post(new k53.u(this, p17));
        }
    }
}
