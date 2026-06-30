package sp0;

/* loaded from: classes7.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc3.k f410942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp0.d f410943e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jc3.k kVar, sp0.d dVar) {
        super(1);
        this.f410942d = kVar;
        this.f410943e = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        lc3.z zVar;
        com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse it = (com.tencent.pigeon.flutter_magic_brush.MagicSclBizApiResponse) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int errCode = (int) it.getErrCode();
        java.lang.String errMsg = it.getErrMsg();
        this.f410943e.getClass();
        if (errCode == 0) {
            zVar = lc3.x.f317934a;
        } else {
            zVar = new lc3.z(4, "fail:internal errorbizErrCode: " + errCode + ", bizErrCode:" + errMsg);
        }
        jc3.k.b(this.f410942d, zVar, null, 2, null);
        return jz5.f0.f302826a;
    }
}
