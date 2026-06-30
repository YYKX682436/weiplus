package qy0;

/* loaded from: classes5.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f367596d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f367597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f367598f;

    /* renamed from: g, reason: collision with root package name */
    public int f367599g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qy0.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f367598f = d0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f367597e = obj;
        this.f367599g |= Integer.MIN_VALUE;
        return this.f367598f.H6(this);
    }
}
