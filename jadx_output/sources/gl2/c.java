package gl2;

/* loaded from: classes3.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f272800d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f272801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl2.e f272802f;

    /* renamed from: g, reason: collision with root package name */
    public int f272803g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gl2.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f272802f = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f272801e = obj;
        this.f272803g |= Integer.MIN_VALUE;
        return this.f272802f.m(this);
    }
}
