package vp4;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp4.b0 f439077d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(vp4.b0 b0Var) {
        super(1);
        this.f439077d = b0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoForegroundRemuxChain", "remuxImpl invokeOnCancellation");
        this.f439077d.f439013m = null;
        return jz5.f0.f302826a;
    }
}
