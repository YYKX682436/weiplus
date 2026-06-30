package dz0;

/* loaded from: classes5.dex */
public final class e2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f244831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f244832e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f244833f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f244834g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244835h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244836i;

    /* renamed from: m, reason: collision with root package name */
    public int f244837m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f244836i = maasSdkUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f244835h = obj;
        this.f244837m |= Integer.MIN_VALUE;
        return this.f244836i.h7(null, null, this);
    }
}
