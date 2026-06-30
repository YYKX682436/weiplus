package cx;

/* loaded from: classes7.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc3.k f224436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx.o0 f224437e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f224438f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(jc3.k kVar, cx.o0 o0Var, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f224436d = kVar;
        this.f224437e = o0Var;
        this.f224438f = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse it = (com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        jc3.k.b(this.f224436d, this.f224437e.g((int) it.getErrCode(), it.getErrMsg()), null, 2, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrandBaseBiz", ((java.lang.String) this.f224438f.f310123d) + " success");
        return jz5.f0.f302826a;
    }
}
