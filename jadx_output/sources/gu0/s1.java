package gu0;

/* loaded from: classes5.dex */
public final class s1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275805d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f275806e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275808g;

    /* renamed from: h, reason: collision with root package name */
    public int f275809h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f275808g = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f275807f = obj;
        this.f275809h |= Integer.MIN_VALUE;
        return gu0.k2.k(this.f275808g, this);
    }
}
