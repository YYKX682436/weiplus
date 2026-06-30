package sf2;

/* loaded from: classes10.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407020d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407022f;

    /* renamed from: g, reason: collision with root package name */
    public int f407023g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407022f = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407021e = obj;
        this.f407023g |= Integer.MIN_VALUE;
        return this.f407022f.Z6(null, null, null, null, this);
    }
}
