package hw;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc3.k f285437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw.w f285438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f285439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(jc3.k kVar, hw.w wVar, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f285437d = kVar;
        this.f285438e = wVar;
        this.f285439f = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse it = (com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        jc3.k.b(this.f285437d, this.f285438e.g((int) it.getErrCode(), it.getErrMsg()), null, 2, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsTLBaseBiz", ((java.lang.String) this.f285439f.f310123d) + " successs");
        return jz5.f0.f302826a;
    }
}
