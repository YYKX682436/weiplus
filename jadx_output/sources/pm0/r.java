package pm0;

/* loaded from: classes5.dex */
public final class r implements wu5.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f356793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f356794f;

    public r(java.lang.String str, yz5.a aVar, boolean z17) {
        this.f356792d = str;
        this.f356793e = aVar;
        this.f356794f = z17;
    }

    @Override // wu5.f
    public boolean a() {
        return this.f356794f;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return this.f356792d;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f356793e.invoke();
    }
}
