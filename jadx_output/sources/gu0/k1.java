package gu0;

/* loaded from: classes5.dex */
public final class k1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275721d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275723f;

    /* renamed from: g, reason: collision with root package name */
    public int f275724g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f275723f = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f275722e = obj;
        this.f275724g |= Integer.MIN_VALUE;
        return gu0.k2.i(this.f275723f, this);
    }
}
