package mi1;

/* loaded from: classes7.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f326655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.n2 f326656e;

    public o2(mi1.n2 n2Var, android.graphics.drawable.Drawable drawable) {
        this.f326656e = n2Var;
        this.f326655d = drawable;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.drawable.Drawable drawable = this.f326655d;
        mi1.n2 n2Var = this.f326656e;
        n2Var.f326634d = drawable;
        if (n2Var.a()) {
            android.graphics.drawable.Drawable drawable2 = n2Var.f326634d;
            mi1.g gVar = (mi1.g) n2Var.f326642o;
            gVar.f326557g = drawable2;
            if (gVar.p()) {
                return;
            }
            gVar.f326556f.c(drawable2);
        }
    }
}
