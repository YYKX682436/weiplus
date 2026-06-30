package dz0;

/* loaded from: classes5.dex */
public final class o2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f244959d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.maas.uic.MaasSdkUIC f244961f;

    /* renamed from: g, reason: collision with root package name */
    public int f244962g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f244961f = maasSdkUIC;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f244960e = obj;
        this.f244962g |= Integer.MIN_VALUE;
        return this.f244961f.s7(false, false, this);
    }
}
