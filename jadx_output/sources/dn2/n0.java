package dn2;

/* loaded from: classes3.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f241947d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f241948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn2.s0 f241949f;

    /* renamed from: g, reason: collision with root package name */
    public int f241950g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(dn2.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f241949f = s0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f241948e = obj;
        this.f241950g |= Integer.MIN_VALUE;
        return dn2.s0.e(this.f241949f, null, 0L, null, null, this);
    }
}
