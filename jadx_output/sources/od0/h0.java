package od0;

/* loaded from: classes13.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f344544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ od0.v f344546f;

    public h0(od0.v vVar, android.content.Intent intent, java.lang.String str) {
        this.f344546f = vVar;
        this.f344544d = intent;
        this.f344545e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Intent intent = this.f344544d;
        if (intent == null) {
            return;
        }
        try {
            java.lang.String stringExtra = intent.getStringExtra("geta8key_username");
            java.lang.String stringExtra2 = intent.getStringExtra("msgUsername");
            java.lang.String stringExtra3 = intent.getStringExtra("preChatName");
            java.lang.String stringExtra4 = intent.getStringExtra("rawUrl");
            int intExtra = intent.getIntExtra("geta8key_scene", 0);
            r45.k57 k57Var = new r45.k57();
            byte[] k17 = com.tencent.mm.normsg.WCProbe$Info.k(stringExtra, stringExtra2, stringExtra3, stringExtra4, this.f344545e, intExtra);
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(k17);
            k57Var.f378409v = cu5Var;
            this.f344546f.Ai(540999710, k57Var.toByteArray(), false);
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "report wssi suc");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SecInfoReporterImpl", "[+] report wssf error, msg:" + th6);
        }
    }
}
