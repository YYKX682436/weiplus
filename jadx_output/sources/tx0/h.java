package tx0;

/* loaded from: classes.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tx0.k f422518e;

    /* renamed from: f, reason: collision with root package name */
    public int f422519f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(tx0.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422518e = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422517d = obj;
        this.f422519f |= Integer.MIN_VALUE;
        java.lang.Object a17 = tx0.k.a(this.f422518e, 0.0d, 0.0d, this);
        return a17 == pz5.a.f359186d ? a17 : kotlin.Result.m520boximpl(a17);
    }
}
