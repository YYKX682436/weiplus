package nz0;

/* loaded from: classes5.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f341505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nz0.o f341506e;

    /* renamed from: f, reason: collision with root package name */
    public int f341507f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nz0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f341506e = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f341505d = obj;
        this.f341507f |= Integer.MIN_VALUE;
        return this.f341506e.c(0, null, this);
    }
}
