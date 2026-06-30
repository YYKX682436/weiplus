package qf2;

/* loaded from: classes10.dex */
public final class o1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362505d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f362506e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f362507f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f362508g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362509h;

    /* renamed from: i, reason: collision with root package name */
    public int f362510i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(qf2.y1 y1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f362509h = y1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f362508g = obj;
        this.f362510i |= Integer.MIN_VALUE;
        return qf2.y1.b7(this.f362509h, null, 0, false, null, this);
    }
}
