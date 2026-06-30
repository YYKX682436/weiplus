package u61;

/* loaded from: classes4.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f424875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u61.b f424876e;

    /* renamed from: f, reason: collision with root package name */
    public int f424877f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u61.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f424876e = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f424875d = obj;
        this.f424877f |= Integer.MIN_VALUE;
        return this.f424876e.a(null, null, this);
    }
}
