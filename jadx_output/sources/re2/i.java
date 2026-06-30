package re2;

/* loaded from: classes2.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ re2.g f394429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f394430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394431g;

    public i(yz5.l lVar, re2.g gVar, int i17, java.lang.String str) {
        this.f394428d = lVar;
        this.f394429e = gVar;
        this.f394430f = i17;
        this.f394431g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f394428d.invoke(new re2.h(this.f394429e, this.f394430f, this.f394431g));
    }
}
