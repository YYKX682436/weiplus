package gk0;

/* loaded from: classes9.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f272410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gk0.b f272411e;

    /* renamed from: f, reason: collision with root package name */
    public int f272412f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gk0.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f272411e = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f272410d = obj;
        this.f272412f |= Integer.MIN_VALUE;
        return this.f272411e.a(null, this);
    }
}
