package zf0;

/* loaded from: classes12.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472487d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f472488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472489f;

    /* renamed from: g, reason: collision with root package name */
    public int f472490g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(zf0.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f472489f = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f472488e = obj;
        this.f472490g |= Integer.MIN_VALUE;
        return this.f472489f.B(this);
    }
}
