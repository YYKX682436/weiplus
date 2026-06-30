package tr0;

/* loaded from: classes14.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421332d;

    /* renamed from: e, reason: collision with root package name */
    public int f421333e;

    /* renamed from: f, reason: collision with root package name */
    public int f421334f;

    /* renamed from: g, reason: collision with root package name */
    public int f421335g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f421336h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f421337i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421338m;

    /* renamed from: n, reason: collision with root package name */
    public int f421339n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(tr0.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f421338m = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f421337i = obj;
        this.f421339n |= Integer.MIN_VALUE;
        return tr0.t.J(this.f421338m, 0, 0, 0, false, this);
    }
}
