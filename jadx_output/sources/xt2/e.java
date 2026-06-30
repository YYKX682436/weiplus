package xt2;

/* loaded from: classes3.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f456688d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f456689e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f456690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xt2.m f456691g;

    /* renamed from: h, reason: collision with root package name */
    public int f456692h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xt2.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f456691g = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f456690f = obj;
        this.f456692h |= Integer.MIN_VALUE;
        return this.f456691g.n(null, this);
    }
}
