package ex0;

/* loaded from: classes5.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f257158d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f257159e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.q f257160f;

    /* renamed from: g, reason: collision with root package name */
    public int f257161g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ex0.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f257160f = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f257159e = obj;
        this.f257161g |= Integer.MIN_VALUE;
        return this.f257160f.G(this);
    }
}
