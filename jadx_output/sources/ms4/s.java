package ms4;

/* loaded from: classes8.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f331104d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f331105e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ms4.t f331106f;

    /* renamed from: g, reason: collision with root package name */
    public int f331107g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ms4.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f331106f = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f331105e = obj;
        this.f331107g |= Integer.MIN_VALUE;
        return this.f331106f.O6(null, null, this);
    }
}
