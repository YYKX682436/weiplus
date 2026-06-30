package od0;

/* loaded from: classes13.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344541d;

    public g0(od0.v vVar, java.lang.String str) {
        this.f344541d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            byte[] e17 = com.tencent.mm.normsg.WCProbe$Info.e(48);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByteArray("ECD", e17);
            bundle.putString("MGAI", this.f344541d);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, od0.q0.class, new od0.f0(this));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SecInfoReporterImpl", "post rwgsi task error: %s", th6.toString());
        }
    }
}
