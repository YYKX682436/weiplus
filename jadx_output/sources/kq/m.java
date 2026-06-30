package kq;

/* loaded from: classes12.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311211d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f311212e;

    /* renamed from: f, reason: collision with root package name */
    public int f311213f;

    /* renamed from: g, reason: collision with root package name */
    public int f311214g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f311215h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kq.n f311216i;

    /* renamed from: m, reason: collision with root package name */
    public int f311217m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kq.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f311216i = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f311215h = obj;
        this.f311217m |= Integer.MIN_VALUE;
        return this.f311216i.B(null, this);
    }
}
