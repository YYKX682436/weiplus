package fl2;

/* loaded from: classes10.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f263914d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f263915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fl2.e f263916f;

    /* renamed from: g, reason: collision with root package name */
    public int f263917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fl2.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f263916f = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f263915e = obj;
        this.f263917g |= Integer.MIN_VALUE;
        return this.f263916f.b(this);
    }
}
