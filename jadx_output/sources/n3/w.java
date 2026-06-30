package n3;

/* loaded from: classes13.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Runnable f334427a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f334428b = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f334429c = new java.util.HashMap();

    public w(java.lang.Runnable runnable) {
        this.f334427a = runnable;
    }

    public void a(n3.b0 b0Var) {
        this.f334428b.remove(b0Var);
        n3.x xVar = (n3.x) ((java.util.HashMap) this.f334429c).remove(b0Var);
        if (xVar != null) {
            xVar.f334434a.c(xVar.f334435b);
            xVar.f334435b = null;
        }
        this.f334427a.run();
    }
}
