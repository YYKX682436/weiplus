package w11;

/* loaded from: classes11.dex */
public class d1 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w11.e1 f441996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f441997b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w11.f1 f441998c;

    public d1(w11.f1 f1Var, w11.e1 e1Var, boolean z17) {
        this.f441998c = f1Var;
        this.f441996a = e1Var;
        this.f441997b = z17;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent == null ? "" : intent.getAction();
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenState", "ScreenReceiver action [%s] ", action);
        boolean equals = "android.intent.action.SCREEN_OFF".equals(action);
        w11.f1 f1Var = this.f441998c;
        if (equals) {
            f1Var.f442021a = java.lang.Boolean.FALSE;
        } else {
            f1Var.f442021a = java.lang.Boolean.TRUE;
        }
        w11.e1 e1Var = this.f441996a;
        if (e1Var != null) {
            e1Var.a(f1Var.f442021a.booleanValue());
        }
        if (this.f441997b) {
            try {
                context.unregisterReceiver(this);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
