package pn4;

/* loaded from: classes14.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn4.q0 f357116e;

    /* renamed from: f, reason: collision with root package name */
    public int f357117f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pn4.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357116e = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357115d = obj;
        this.f357117f |= Integer.MIN_VALUE;
        return this.f357116e.h(0, null, this);
    }
}
