package nz0;

/* loaded from: classes5.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f341523d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f341524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nz0.o f341525f;

    /* renamed from: g, reason: collision with root package name */
    public int f341526g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(nz0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f341525f = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f341524e = obj;
        this.f341526g |= Integer.MIN_VALUE;
        return this.f341525f.g(null, 0, this);
    }
}
