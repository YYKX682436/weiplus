package md1;

/* loaded from: classes7.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f325739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f325740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ md1.j1 f325741f;

    public h1(md1.j1 j1Var, boolean z17, boolean z18) {
        this.f325741f = j1Var;
        this.f325739d = z17;
        this.f325740e = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f325741f.a(this.f325739d, this.f325740e);
    }
}
