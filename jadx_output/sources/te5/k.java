package te5;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te5.o f418698e;

    /* renamed from: f, reason: collision with root package name */
    public int f418699f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(te5.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f418698e = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f418697d = obj;
        this.f418699f |= Integer.MIN_VALUE;
        return this.f418698e.wi(null, null, this);
    }
}
