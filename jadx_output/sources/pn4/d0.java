package pn4;

/* loaded from: classes14.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f357067d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn4.e0 f357069f;

    /* renamed from: g, reason: collision with root package name */
    public int f357070g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(pn4.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357069f = e0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357068e = obj;
        this.f357070g |= Integer.MIN_VALUE;
        return this.f357069f.c(null, 0, 0, this);
    }
}
