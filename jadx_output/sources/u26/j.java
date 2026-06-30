package u26;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f424156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.k f424157e;

    /* renamed from: f, reason: collision with root package name */
    public int f424158f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u26.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f424157e = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f424156d = obj;
        this.f424158f |= Integer.MIN_VALUE;
        java.lang.Object i17 = this.f424157e.i(this);
        return i17 == pz5.a.f359186d ? i17 : new u26.c0(i17);
    }
}
