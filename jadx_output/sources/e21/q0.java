package e21;

/* loaded from: classes11.dex */
public final class q0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f246567d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f246568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e21.z0 f246569f;

    /* renamed from: g, reason: collision with root package name */
    public int f246570g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(e21.z0 z0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f246569f = z0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f246568e = obj;
        this.f246570g |= Integer.MIN_VALUE;
        return this.f246569f.h(null, this);
    }
}
