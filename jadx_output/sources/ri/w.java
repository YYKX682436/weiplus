package ri;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f396012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f396013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f396014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f396015g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f396016h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f396017i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f396018m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17, long j18, long j19, long j27, long j28, long j29, long j37) {
        super(1);
        this.f396012d = j17;
        this.f396013e = j18;
        this.f396014f = j19;
        this.f396015g = j27;
        this.f396016h = j28;
        this.f396017i = j29;
        this.f396018m = j37;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map myDict = (java.util.Map) obj;
        kotlin.jvm.internal.o.g(myDict, "myDict");
        float f17 = ((float) this.f396012d) * 100.0f;
        float f18 = (float) this.f396013e;
        myDict.put("top-ratio", java.lang.Long.valueOf(a06.d.c(f17 / f18)));
        myDict.put("fg-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f396014f) * 100.0f) / f18)));
        myDict.put("fgs-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f396015g) * 100.0f) / f18)));
        myDict.put("bg-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f396016h) * 100.0f) / f18)));
        myDict.put("sleep-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f396017i) * 100.0f) / f18)));
        myDict.put("cache-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f396018m) * 100.0f) / f18)));
        return jz5.f0.f302826a;
    }
}
