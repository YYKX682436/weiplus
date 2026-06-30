package ld2;

/* loaded from: classes15.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f318074d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f318075e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f318076f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f318077g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f318078h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f318079i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f318080m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ld2.i f318081n;

    /* renamed from: o, reason: collision with root package name */
    public int f318082o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ld2.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f318081n = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f318080m = obj;
        this.f318082o |= Integer.MIN_VALUE;
        return this.f318081n.b(null, null, null, null, null, this);
    }
}
