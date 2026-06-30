package vp;

/* loaded from: classes16.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp.a f438768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zp.m f438769e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp.d f438770f;

    public f(vp.d dVar, wp.a aVar, zp.m mVar) {
        this.f438770f = dVar;
        this.f438768d = aVar;
        this.f438769e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f438770f.d(this.f438768d, this.f438769e);
    }
}
