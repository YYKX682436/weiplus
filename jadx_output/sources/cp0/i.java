package cp0;

/* loaded from: classes15.dex */
public final class i implements cp0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cp0.l f220747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f220748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ip0.a f220749c;

    public i(cp0.l lVar, java.util.Map.Entry entry, ip0.a aVar) {
        this.f220747a = lVar;
        this.f220748b = entry;
        this.f220749c = aVar;
    }

    @Override // cp0.b
    public void a(boolean z17) {
        if (z17) {
            this.f220747a.b((cp0.f) ((jz5.l) this.f220748b.getValue()).f302834e, this.f220749c, "onDataItemLoadEnd");
        }
    }
}
