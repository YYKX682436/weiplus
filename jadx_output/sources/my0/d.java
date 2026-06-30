package my0;

/* loaded from: classes5.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my0.e f332654e;

    /* renamed from: f, reason: collision with root package name */
    public int f332655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(my0.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332654e = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332653d = obj;
        this.f332655f |= Integer.MIN_VALUE;
        return this.f332654e.i(null, this);
    }
}
