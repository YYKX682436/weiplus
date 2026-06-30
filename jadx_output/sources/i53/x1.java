package i53;

/* loaded from: classes8.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f288781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f288782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.y1 f288783f;

    public x1(i53.y1 y1Var, java.util.LinkedList linkedList, boolean z17) {
        this.f288783f = y1Var;
        this.f288781d = linkedList;
        this.f288782e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        i53.y1 y1Var = this.f288783f;
        if (((android.app.Activity) y1Var.f288788a.getContext()).isFinishing() || ((android.app.Activity) y1Var.f288788a.getContext()).isDestroyed()) {
            return;
        }
        y1Var.f288788a.g(this.f288781d, this.f288782e, false);
        y1Var.f288788a.f288512w = true;
    }
}
