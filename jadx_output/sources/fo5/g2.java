package fo5;

/* loaded from: classes.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f264991d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(boolean z17) {
        super(1);
        this.f264991d = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.Launcher", "android send systemRotateLocked:" + this.f264991d + "  to flutter, res:" + kotlin.Result.m528isSuccessimpl(((kotlin.Result) obj).getValue()));
        return jz5.f0.f302826a;
    }
}
