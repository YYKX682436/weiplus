package hz4;

/* loaded from: classes12.dex */
public class a0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hz4.b0 f286379d;

    public a0(hz4.b0 b0Var) {
        this.f286379d = b0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        hz4.b0 b0Var = this.f286379d;
        if (b0Var.f286386e == -1) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            b0Var.f286386e = android.os.SystemClock.elapsedRealtime();
        }
        long j17 = b0Var.f286386e;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime >= 3590000 && elapsedRealtime <= 3600000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteVoiceLogic", "onTimerExpired: duration ms %s", java.lang.Long.valueOf(elapsedRealtime));
            android.widget.Toast toast = b0Var.f286387f;
            if (toast == null) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                b0Var.f286387f = dp.a.makeText(context, context.getString(com.tencent.mm.R.string.c_3, java.lang.Integer.valueOf((int) ((3600000 - elapsedRealtime) / 1000))), 0);
            } else {
                toast.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c_3, java.lang.Integer.valueOf((int) ((3600000 - elapsedRealtime) / 1000))));
            }
            b0Var.f286387f.show();
        }
        if (elapsedRealtime < 3600000) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WNNoteVoiceLogic", "record stop on duration %s", java.lang.Long.valueOf(elapsedRealtime));
        b0Var.f286385d = true;
        b0Var.b();
        jz4.a aVar = b0Var.f286393l;
        if (aVar != null) {
            aVar.F0();
        }
        return false;
    }
}
