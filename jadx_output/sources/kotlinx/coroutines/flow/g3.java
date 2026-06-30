package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class g3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310267d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f310268e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f310269f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f310270g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f310271h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310272i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.h3 f310273m;

    /* renamed from: n, reason: collision with root package name */
    public int f310274n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(kotlinx.coroutines.flow.h3 h3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310273m = h3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310272i = obj;
        this.f310274n |= Integer.MIN_VALUE;
        return this.f310273m.a(null, this);
    }
}
