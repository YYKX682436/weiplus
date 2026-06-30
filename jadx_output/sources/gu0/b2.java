package gu0;

/* loaded from: classes5.dex */
public final class b2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275632d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f275633e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275635g;

    /* renamed from: h, reason: collision with root package name */
    public int f275636h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f275635g = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f275634f = obj;
        this.f275636h |= Integer.MIN_VALUE;
        return this.f275635g.v(this);
    }
}
