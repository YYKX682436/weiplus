package tt;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421747d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f421748e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tt.f f421749f;

    /* renamed from: g, reason: collision with root package name */
    public int f421750g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tt.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f421749f = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f421748e = obj;
        this.f421750g |= Integer.MIN_VALUE;
        return this.f421749f.T6(null, this);
    }
}
