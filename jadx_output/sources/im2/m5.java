package im2;

/* loaded from: classes3.dex */
public final class m5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f292442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f292443e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f292444f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f292445g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292446h;

    /* renamed from: i, reason: collision with root package name */
    public int f292447i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(im2.h6 h6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f292446h = h6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f292445g = obj;
        this.f292447i |= Integer.MIN_VALUE;
        return im2.h6.g(this.f292446h, this);
    }
}
