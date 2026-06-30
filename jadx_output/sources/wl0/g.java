package wl0;

/* loaded from: classes13.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f447002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f447003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447004f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wl0.h f447005g;

    public g(wl0.h hVar, long j17, boolean z17, java.lang.String str) {
        this.f447005g = hVar;
        this.f447002d = j17;
        this.f447003e = z17;
        this.f447004f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int i17 = calendar.get(7);
        int i18 = calendar.get(11);
        dm.b2 b2Var = new dm.b2();
        b2Var.field_msgid = this.f447002d;
        b2Var.field_timestamp = currentTimeMillis;
        b2Var.field_dayOfWeek = i17;
        b2Var.field_hourOfDay = i18;
        boolean z17 = this.f447003e;
        b2Var.field_isfrom = z17 ? 1 : 0;
        b2Var.field_type = 1;
        b2Var.field_action = 2;
        b2Var.field_talker = this.f447004f;
        if (z17) {
            this.f447005g.f447006a.f447018a.z0(b2Var);
        }
    }
}
