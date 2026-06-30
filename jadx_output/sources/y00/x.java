package y00;

/* loaded from: classes3.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f458558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f458559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f458560g;

    public x(java.lang.String str, long j17, java.util.Map map, long j18) {
        this.f458557d = str;
        this.f458558e = j17;
        this.f458559f = map;
        this.f458560g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        y00.h.b(this.f458557d, this.f458558e, this.f458559f, this.f458560g);
    }
}
