package hr3;

/* loaded from: classes12.dex */
public final class qf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f283925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.ag f283926e;

    /* renamed from: f, reason: collision with root package name */
    public int f283927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf(hr3.ag agVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f283926e = agVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f283925d = obj;
        this.f283927f |= Integer.MIN_VALUE;
        return this.f283926e.a(null, null, null, this);
    }
}
