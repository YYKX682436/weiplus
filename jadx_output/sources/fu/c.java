package fu;

/* loaded from: classes5.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f266750d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f266751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fu.d f266752f;

    /* renamed from: g, reason: collision with root package name */
    public int f266753g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fu.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f266752f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f266751e = obj;
        this.f266753g |= Integer.MIN_VALUE;
        return this.f266752f.A(this);
    }
}
