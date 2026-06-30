package fq4;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq4.l f265613e;

    public k(fq4.l lVar, int i17) {
        this.f265613e = lVar;
        this.f265612d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.modelsimple.l0(this.f265612d).doScene(this.f265613e.dispatcher(), new fq4.j(this));
    }
}
