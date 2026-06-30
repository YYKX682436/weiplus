package yy0;

/* loaded from: classes4.dex */
public final class s7 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f468323d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f468324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yy0.g8 f468325f;

    /* renamed from: g, reason: collision with root package name */
    public int f468326g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(yy0.g8 g8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f468325f = g8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f468324e = obj;
        this.f468326g |= Integer.MIN_VALUE;
        return this.f468325f.wi(null, this);
    }
}
