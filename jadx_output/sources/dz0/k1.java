package dz0;

/* loaded from: classes5.dex */
public final class k1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f244908d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f244909e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f244910f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244911g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244912h;

    /* renamed from: i, reason: collision with root package name */
    public int f244913i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f244912h = maasSdkUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f244911g = obj;
        this.f244913i |= Integer.MIN_VALUE;
        return this.f244912h.c7(this);
    }
}
