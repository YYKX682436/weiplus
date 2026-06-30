package yl2;

/* loaded from: classes3.dex */
public final class e1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f462989d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f462990e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f462991f;

    /* renamed from: g, reason: collision with root package name */
    public int f462992g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f462993h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f462994i;

    /* renamed from: m, reason: collision with root package name */
    public int f462995m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(yl2.g1 g1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f462994i = g1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f462993h = obj;
        this.f462995m |= Integer.MIN_VALUE;
        return this.f462994i.s(null, false, this);
    }
}
