package dz0;

/* loaded from: classes5.dex */
public final class b1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f244780d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244782f;

    /* renamed from: g, reason: collision with root package name */
    public int f244783g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f244782f = maasSdkUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f244781e = obj;
        this.f244783g |= Integer.MIN_VALUE;
        return com.tencent.mm.mj_template.maas.uic.MaasSdkUIC.Q6(this.f244782f, this);
    }
}
