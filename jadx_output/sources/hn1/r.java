package hn1;

/* loaded from: classes11.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f282479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hn1.s f282480e;

    /* renamed from: f, reason: collision with root package name */
    public int f282481f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(hn1.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f282480e = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f282479d = obj;
        this.f282481f |= Integer.MIN_VALUE;
        return this.f282480e.qj(null, null, 0.0f, null, this);
    }
}
