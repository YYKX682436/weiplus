package oz;

/* loaded from: classes12.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oz.s f350185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oz.b f350186e;

    public r(oz.s sVar, oz.b bVar) {
        this.f350185d = sVar;
        this.f350186e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oz.s.aj(this.f350185d, this.f350186e);
    }
}
