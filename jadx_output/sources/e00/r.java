package e00;

/* loaded from: classes9.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f245813d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f245814e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e00.s f245815f;

    /* renamed from: g, reason: collision with root package name */
    public int f245816g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(e00.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f245815f = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f245814e = obj;
        this.f245816g |= Integer.MIN_VALUE;
        return this.f245815f.b(null, null, null, null, this);
    }
}
