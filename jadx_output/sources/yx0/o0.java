package yx0;

/* loaded from: classes5.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467490d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467491e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f467492f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467493g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467494h;

    /* renamed from: i, reason: collision with root package name */
    public int f467495i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467494h = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467493g = obj;
        this.f467495i |= Integer.MIN_VALUE;
        return this.f467494h.w(this);
    }
}
