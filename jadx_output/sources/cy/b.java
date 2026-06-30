package cy;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String str) {
        super(1);
        this.f224656d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(((kotlin.Result) obj).getValue());
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatbotCardPlatformView", "onError delivery failed code=" + this.f224656d + ": " + m524exceptionOrNullimpl);
        }
        return jz5.f0.f302826a;
    }
}
