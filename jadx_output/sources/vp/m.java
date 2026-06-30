package vp;

/* loaded from: classes16.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wp.a f438812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zp.m f438813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp.k f438814f;

    public m(vp.k kVar, wp.a aVar, zp.m mVar) {
        this.f438814f = kVar;
        this.f438812d = aVar;
        this.f438813e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f438814f.d(this.f438812d, this.f438813e);
    }
}
