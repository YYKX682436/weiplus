package yx0;

/* loaded from: classes5.dex */
public final class l2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467430e;

    /* renamed from: f, reason: collision with root package name */
    public int f467431f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467430e = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467429d = obj;
        this.f467431f |= Integer.MIN_VALUE;
        return this.f467430e.O(this);
    }
}
