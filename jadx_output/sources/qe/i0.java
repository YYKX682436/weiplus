package qe;

/* loaded from: classes7.dex */
public class i0 implements com.tencent.mm.tcp.libmmtcp.TcpNative.NativeCallBackInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f361961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qe.m0 f361962b;

    public i0(qe.m0 m0Var, java.lang.ref.WeakReference weakReference) {
        this.f361962b = m0Var;
        this.f361961a = weakReference;
    }

    @Override // com.tencent.mm.tcp.libmmtcp.TcpNative.NativeCallBackInterface
    public void onCallBack(long j17, java.lang.String str) {
        ((com.tencent.mm.plugin.appbrand.jsruntime.f0) this.f361961a.get()).post(new qe.h0(this, str, j17));
    }
}
