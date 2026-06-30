package fq4;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fq4.h f265594e;

    public g(fq4.h hVar, int i17) {
        this.f265594e = hVar;
        this.f265593d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.mm.modelsimple.l0(this.f265593d).doScene(this.f265594e.dispatcher(), new fq4.f(this));
    }
}
