package oc5;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.m f344442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344443e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f344444f;

    public k(oc5.m mVar, int i17, java.lang.Runnable runnable) {
        this.f344442d = mVar;
        this.f344443e = i17;
        this.f344444f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oc5.m mVar = this.f344442d;
        mVar.getClass();
        int i17 = this.f344443e;
        mVar.c(i17, new oc5.l(mVar, i17));
        this.f344444f.run();
    }
}
