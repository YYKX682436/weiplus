package vd0;

/* loaded from: classes8.dex */
public final class f3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f435405d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f435406e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f435407f;

    /* renamed from: g, reason: collision with root package name */
    public int f435408g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f435409h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vd0.l3 f435410i;

    /* renamed from: m, reason: collision with root package name */
    public int f435411m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(vd0.l3 l3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f435410i = l3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f435409h = obj;
        this.f435411m |= Integer.MIN_VALUE;
        return this.f435410i.Di(null, null, this);
    }
}
