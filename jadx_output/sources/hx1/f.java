package hx1;

/* loaded from: classes12.dex */
public class f implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hx1.g f285621d;

    public f(hx1.g gVar) {
        this.f285621d = gVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        hx1.g gVar = this.f285621d;
        if (gVar.f285627e == -1) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            gVar.f285627e = android.os.SystemClock.elapsedRealtime();
        }
        long j17 = gVar.f285627e;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (elapsedRealtime >= 3590000 && elapsedRealtime <= 3600000) {
            android.widget.Toast toast = gVar.f285628f;
            if (toast == null) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                gVar.f285628f = dp.a.makeText(context, context.getString(com.tencent.mm.R.string.c_3, java.lang.Integer.valueOf((int) ((3600000 - elapsedRealtime) / 1000))), 0);
            } else {
                toast.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.c_3, java.lang.Integer.valueOf((int) ((3600000 - elapsedRealtime) / 1000))));
            }
            gVar.f285628f.show();
        }
        if (elapsedRealtime < 3600000) {
            return true;
        }
        gVar.f285626d = true;
        gVar.b();
        jx1.a aVar = gVar.f285634l;
        if (aVar != null) {
            ((qx1.q) aVar).d(null);
        }
        return false;
    }
}
