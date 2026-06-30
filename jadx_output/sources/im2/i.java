package im2;

/* loaded from: classes3.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.k f292380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mo0.a f292381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ug5.v f292382f;

    public i(im2.k kVar, mo0.a aVar, ug5.v vVar) {
        this.f292380d = kVar;
        this.f292381e = aVar;
        this.f292382f = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        im2.k kVar = this.f292380d;
        if (kVar.f292407e) {
            kVar.h(this.f292381e, this.f292382f);
        }
    }
}
