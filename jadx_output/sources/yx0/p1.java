package yx0;

/* loaded from: classes5.dex */
public final class p1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467537d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467538e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f467539f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f467540g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467541h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467542i;

    /* renamed from: m, reason: collision with root package name */
    public int f467543m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467542i = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467541h = obj;
        this.f467543m |= Integer.MIN_VALUE;
        return yx0.b8.d(this.f467542i, this);
    }
}
