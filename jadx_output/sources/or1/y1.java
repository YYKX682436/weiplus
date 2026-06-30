package or1;

/* loaded from: classes12.dex */
public class y1 extends fb5.c {

    /* renamed from: h, reason: collision with root package name */
    public static fb5.b f347598h;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f347599d;

    /* renamed from: e, reason: collision with root package name */
    public final long f347600e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f347601f;

    /* renamed from: g, reason: collision with root package name */
    public final int f347602g;

    public y1(java.lang.Object obj, long j17, int i17, java.lang.String str) {
        super(2, obj);
        this.f347600e = j17;
        this.f347601f = str;
        this.f347602g = i17;
    }

    @Override // fb5.c
    public void a(android.content.Context context, fb5.a aVar, java.lang.Object... objArr) {
        this.f347599d = "";
    }

    @Override // fb5.c
    public fb5.a b() {
        return new or1.x1();
    }

    @Override // fb5.c
    public fb5.b c() {
        if (f347598h == null) {
            f347598h = new or1.w1(this);
        }
        return f347598h;
    }
}
