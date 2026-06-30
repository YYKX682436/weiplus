package sj3;

/* loaded from: classes11.dex */
public class b1 implements android.view.ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sj3.f1 f408439a;

    public b1(sj3.f1 f1Var) {
        this.f408439a = f1Var;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        sj3.f1 f1Var = this.f408439a;
        if (f1Var.f408510g) {
            return;
        }
        f1Var.f408510g = true;
        zj3.d.c(zj3.c.i(), 0, 0, 0, 0, 0, 0, 0, 1, "", 0);
    }
}
