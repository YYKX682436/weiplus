package oo1;

/* loaded from: classes12.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f347127d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f347128e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f347129f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oo1.e f347130g;

    /* renamed from: h, reason: collision with root package name */
    public int f347131h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(oo1.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f347130g = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f347129f = obj;
        this.f347131h |= Integer.MIN_VALUE;
        return this.f347130g.a(null, this);
    }
}
