package gg2;

/* loaded from: classes2.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f271699d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f271700e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f271701f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gg2.q f271702g;

    /* renamed from: h, reason: collision with root package name */
    public int f271703h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(gg2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f271702g = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f271701f = obj;
        this.f271703h |= Integer.MIN_VALUE;
        return this.f271702g.a(null, this);
    }
}
