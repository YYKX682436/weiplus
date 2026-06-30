package lu3;

/* loaded from: classes10.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f321387d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f321388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lu3.m f321389f;

    /* renamed from: g, reason: collision with root package name */
    public int f321390g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(lu3.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f321389f = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f321388e = obj;
        this.f321390g |= Integer.MIN_VALUE;
        return this.f321389f.a(this);
    }
}
