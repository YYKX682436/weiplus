package xw0;

/* loaded from: classes5.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457581d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xw0.r f457582e;

    /* renamed from: f, reason: collision with root package name */
    public int f457583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(xw0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f457582e = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f457581d = obj;
        this.f457583f |= Integer.MIN_VALUE;
        return this.f457582e.i(0, this);
    }
}
