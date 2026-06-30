package yx0;

/* loaded from: classes5.dex */
public final class y2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467779d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467780e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467781f;

    /* renamed from: g, reason: collision with root package name */
    public int f467782g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467781f = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467780e = obj;
        this.f467782g |= Integer.MIN_VALUE;
        return this.f467781f.V(null, null, null, null, this);
    }
}
