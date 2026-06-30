package r61;

/* loaded from: classes12.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f392893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r61.m1 f392894e;

    public k1(r61.m1 m1Var, int i17) {
        this.f392894e = m1Var;
        this.f392893d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.modelsimple.l0(this.f392893d).doScene(this.f392894e.dispatcher(), new r61.j1(this));
    }
}
