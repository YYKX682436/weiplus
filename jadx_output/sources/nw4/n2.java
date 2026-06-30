package nw4;

/* loaded from: classes8.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f340929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f340930e;

    public n2(nw4.n nVar, nw4.y2 y2Var) {
        this.f340930e = nVar;
        this.f340929d = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f340930e.e(this.f340929d.f341013c, "system:access_denied", null);
    }
}
