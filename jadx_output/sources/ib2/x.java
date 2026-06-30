package ib2;

/* loaded from: classes2.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f290176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ib2.i0 f290177e;

    /* renamed from: f, reason: collision with root package name */
    public int f290178f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ib2.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f290177e = i0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f290176d = obj;
        this.f290178f |= Integer.MIN_VALUE;
        java.lang.Object a17 = ib2.i0.a(this.f290177e, null, this);
        return a17 == pz5.a.f359186d ? a17 : kotlin.Result.m520boximpl(a17);
    }
}
