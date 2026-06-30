package jh;

/* loaded from: classes13.dex */
public final class l extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final jh.d0 f299723a;

    public l(jh.d0 d0Var) {
        this.f299723a = d0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        oj.j.c("Matrix.WarmUpDelegate", "Warm-up received.", new java.lang.Object[0]);
        java.lang.String action = intent.getAction();
        if (action != null && action.equals("action.backtrace.warmed-up")) {
            com.tencent.matrix.backtrace.WeChatBacktraceNative.setWarmedUp(true);
            jh.d0 d0Var = jh.d0.FpUntilQuickenWarmedUp;
            jh.d0 d0Var2 = this.f299723a;
            if (d0Var2 == d0Var || d0Var2 == jh.d0.DwarfUntilQuickenWarmedUp) {
                com.tencent.matrix.backtrace.WeChatBacktraceNative.setBacktraceMode(1);
            }
            try {
                context.unregisterReceiver(this);
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.WarmUpDelegate", th6, "Unregister receiver twice.", new java.lang.Object[0]);
            }
        }
    }
}
