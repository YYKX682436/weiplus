package hw;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc3.k f285430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw.w f285431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f285432f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(jc3.k kVar, hw.w wVar, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f285430d = kVar;
        this.f285431e = wVar;
        this.f285432f = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse it = (com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        jc3.k.b(this.f285430d, this.f285431e.g((int) it.getErrCode(), it.getErrMsg()), null, 2, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsTLBaseBiz", ((java.lang.String) this.f285432f.f310123d) + " errCode:" + ((int) it.getErrCode()) + ",errMsg:" + it.getErrMsg());
        return jz5.f0.f302826a;
    }
}
