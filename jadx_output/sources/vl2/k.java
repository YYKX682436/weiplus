package vl2;

/* loaded from: classes10.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437845d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f437846e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f437847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vl2.s f437848g;

    /* renamed from: h, reason: collision with root package name */
    public int f437849h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vl2.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f437848g = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f437847f = obj;
        this.f437849h |= Integer.MIN_VALUE;
        return this.f437848g.a(null, this);
    }
}
