package fq4;

/* loaded from: classes9.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265619d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq4.o f265620e;

    public n(fq4.o oVar, int i17) {
        this.f265620e = oVar;
        this.f265619d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.modelsimple.l0(this.f265619d).doScene(this.f265620e.dispatcher(), new fq4.m(this));
    }
}
