package yx0;

/* loaded from: classes5.dex */
public final class o2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467499e;

    /* renamed from: f, reason: collision with root package name */
    public int f467500f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467499e = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467498d = obj;
        this.f467500f |= Integer.MIN_VALUE;
        return this.f467499e.P(this);
    }
}
