package gu0;

/* loaded from: classes5.dex */
public final class v1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275828d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f275829e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f275830f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f275831g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275832h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275833i;

    /* renamed from: m, reason: collision with root package name */
    public int f275834m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f275833i = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f275832h = obj;
        this.f275834m |= Integer.MIN_VALUE;
        return this.f275833i.u(false, this);
    }
}
