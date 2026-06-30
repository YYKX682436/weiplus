package oz;

/* loaded from: classes12.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oz.s f350171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oz.b f350172e;

    public m(oz.s sVar, oz.b bVar) {
        this.f350171d = sVar;
        this.f350172e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oz.s.aj(this.f350171d, this.f350172e);
    }
}
