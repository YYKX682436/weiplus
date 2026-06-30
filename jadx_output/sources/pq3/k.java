package pq3;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357645d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357646e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f357647f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f357648g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357649h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pq3.q f357650i;

    /* renamed from: m, reason: collision with root package name */
    public int f357651m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pq3.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357650i = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357649h = obj;
        this.f357651m |= Integer.MIN_VALUE;
        return this.f357650i.a(null, this);
    }
}
