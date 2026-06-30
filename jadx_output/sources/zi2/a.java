package zi2;

/* loaded from: classes3.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f473096d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473097e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473098f;

    /* renamed from: g, reason: collision with root package name */
    public int f473099g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zi2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f473098f = wVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f473097e = obj;
        this.f473099g |= Integer.MIN_VALUE;
        return this.f473098f.M(null, this);
    }
}
