package z70;

/* loaded from: classes12.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f470502d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f470503e;

    /* renamed from: f, reason: collision with root package name */
    public int f470504f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f470505g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z70.b f470506h;

    /* renamed from: i, reason: collision with root package name */
    public int f470507i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(z70.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f470506h = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f470505g = obj;
        this.f470507i |= Integer.MIN_VALUE;
        return this.f470506h.T6(null, this);
    }
}
