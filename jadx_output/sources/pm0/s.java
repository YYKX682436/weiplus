package pm0;

/* loaded from: classes5.dex */
public final class s implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f356796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f356797f;

    public s(java.lang.String str, yz5.a aVar, boolean z17) {
        this.f356795d = str;
        this.f356796e = aVar;
        this.f356797f = z17;
    }

    @Override // wu5.f
    public boolean a() {
        return this.f356797f;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return this.f356795d + '#' + r26.i0.w(this.f356796e.getClass().getName(), "com.tencent.mm", "", true);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f356796e.invoke();
    }
}
