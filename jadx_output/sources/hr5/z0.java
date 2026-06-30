package hr5;

/* loaded from: classes11.dex */
public final class z0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public float f284503d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f284504e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284505f;

    /* renamed from: g, reason: collision with root package name */
    public int f284506g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(hr5.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f284505f = a1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f284504e = obj;
        this.f284506g |= Integer.MIN_VALUE;
        return this.f284505f.h(0L, false, null, this);
    }
}
