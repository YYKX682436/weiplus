package lo3;

/* loaded from: classes8.dex */
public class e implements android.os.IBinder.DeathRecipient {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo3.f f320184d;

    public e(lo3.f fVar) {
        this.f320184d = fVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        lo3.g gVar = this.f320184d.f320185d;
        lo3.g gVar2 = lo3.g.INSTANCE;
        gVar.getClass();
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setAction("com.vivo.intent.action.SECURE_FRAUD_DETECT");
            intent.setPackage("com.iqoo.secure");
            if (com.tencent.mm.sdk.platformtools.x2.f193071a.bindService(intent, gVar.f320190f, 1)) {
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.VAFM", "connect to vivo service failed");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VAFM", "connect to vivo service error: " + th6);
        }
    }
}
