package xt2;

/* loaded from: classes10.dex */
public final class t1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457019d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f457020e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f457021f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457022g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xt2.u1 f457023h;

    /* renamed from: i, reason: collision with root package name */
    public int f457024i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(xt2.u1 u1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f457023h = u1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f457022g = obj;
        this.f457024i |= Integer.MIN_VALUE;
        return xt2.u1.b(this.f457023h, null, null, this);
    }
}
