package l00;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final l00.l f314729d = new l00.l();

    public l() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object value = ((kotlin.Result) obj).getValue();
        if (kotlin.Result.m528isSuccessimpl(value)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsGiftFlutterPlugin", "invoke success: " + ((com.tencent.pigeon.ecs.EcsMagicBizApiResponse) value).getErrCode());
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(value);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicEcsGiftFlutterPlugin", "invoke failed: " + m524exceptionOrNullimpl);
        }
        return jz5.f0.f302826a;
    }
}
