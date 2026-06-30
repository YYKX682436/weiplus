package l75;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f316964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f316965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l75.v0 f316966f;

    public t0(l75.v0 v0Var, java.lang.Object obj, java.lang.Object obj2) {
        this.f316966f = v0Var;
        this.f316964d = obj;
        this.f316965e = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f316966f.h(this.f316964d, this.f316965e);
    }
}
