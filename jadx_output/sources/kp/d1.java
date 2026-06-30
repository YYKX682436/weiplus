package kp;

/* loaded from: classes13.dex */
public final class d1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310725d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310727f;

    /* renamed from: g, reason: collision with root package name */
    public int f310728g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(kp.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310727f = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310726e = obj;
        this.f310728g |= Integer.MIN_VALUE;
        return this.f310727f.oj(null, null, this);
    }
}
