package pu;

/* loaded from: classes12.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358336d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f358337e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pu.o f358339g;

    /* renamed from: h, reason: collision with root package name */
    public int f358340h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(pu.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f358339g = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f358338f = obj;
        this.f358340h |= Integer.MIN_VALUE;
        return this.f358339g.T6(null, this);
    }
}
