package pn4;

/* loaded from: classes14.dex */
public final class d1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357071d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pn4.e1 f357073f;

    /* renamed from: g, reason: collision with root package name */
    public int f357074g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(pn4.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357073f = e1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357072e = obj;
        this.f357074g |= Integer.MIN_VALUE;
        return pn4.e1.d(this.f357073f, this);
    }
}
