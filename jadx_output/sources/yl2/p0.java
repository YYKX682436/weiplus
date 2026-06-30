package yl2;

/* loaded from: classes3.dex */
public final class p0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463056d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f463057e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f463058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f463059g;

    /* renamed from: h, reason: collision with root package name */
    public int f463060h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(yl2.g1 g1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f463059g = g1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f463058f = obj;
        this.f463060h |= Integer.MIN_VALUE;
        return this.f463059g.m(this);
    }
}
