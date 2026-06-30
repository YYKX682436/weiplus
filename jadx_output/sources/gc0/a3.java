package gc0;

/* loaded from: classes5.dex */
public final class a3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f270094d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.d3 f270096f;

    /* renamed from: g, reason: collision with root package name */
    public int f270097g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(gc0.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270096f = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f270095e = obj;
        this.f270097g |= Integer.MIN_VALUE;
        return this.f270096f.h(this);
    }
}
