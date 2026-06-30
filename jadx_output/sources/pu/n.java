package pu;

/* loaded from: classes12.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358342d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f358343e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pu.o f358345g;

    /* renamed from: h, reason: collision with root package name */
    public int f358346h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(pu.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f358345g = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f358344f = obj;
        this.f358346h |= Integer.MIN_VALUE;
        return this.f358345g.U6(null, null, this);
    }
}
