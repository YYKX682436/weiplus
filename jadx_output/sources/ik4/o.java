package ik4;

/* loaded from: classes4.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f291950d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f291951e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f291952f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f291953g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ik4.p f291954h;

    /* renamed from: i, reason: collision with root package name */
    public int f291955i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ik4.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f291954h = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f291953g = obj;
        this.f291955i |= Integer.MIN_VALUE;
        return this.f291954h.g(false, null, false, this);
    }
}
