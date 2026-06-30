package mz2;

/* loaded from: classes9.dex */
public class y0 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz2.d1 f333209d;

    public y0(mz2.d1 d1Var) {
        this.f333209d = d1Var;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        if (1 != message.what) {
            return false;
        }
        java.lang.String string = message.getData().getString("rsaKey");
        if (android.text.TextUtils.isEmpty(string)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HwFingerprintOpenDelegate", "handleMessage msg.what=" + message.what + " rsaKey is null");
            com.tencent.mm.sdk.platformtools.u3.h(new mz2.x0(this));
        }
        this.f333209d.f333103c.doSceneProgress(new oz2.e(string), false);
        return true;
    }
}
