package qe;

/* loaded from: classes7.dex */
public class o0 implements com.tencent.mm.udp.libmmudp.UdpNative.NativeCallBackInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f361981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qe.s0 f361982b;

    public o0(qe.s0 s0Var, java.lang.ref.WeakReference weakReference) {
        this.f361982b = s0Var;
        this.f361981a = weakReference;
    }

    @Override // com.tencent.mm.udp.libmmudp.UdpNative.NativeCallBackInterface
    public void onCallBack(long j17, java.lang.String str) {
        ((com.tencent.mm.plugin.appbrand.jsruntime.f0) this.f361981a.get()).post(new qe.n0(this, str, j17));
    }
}
