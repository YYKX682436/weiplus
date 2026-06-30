package is;

/* loaded from: classes11.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ is.f f294299e;

    /* renamed from: f, reason: collision with root package name */
    public int f294300f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(is.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294299e = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294298d = obj;
        this.f294300f |= Integer.MIN_VALUE;
        return this.f294299e.wi(null, null, null, this);
    }
}
