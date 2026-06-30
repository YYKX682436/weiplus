package wl0;

/* loaded from: classes13.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f447007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f447008e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447009f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wl0.j f447010g;

    public i(wl0.j jVar, long j17, boolean z17, java.lang.String str) {
        this.f447010g = jVar;
        this.f447007d = j17;
        this.f447008e = z17;
        this.f447009f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int i17 = calendar.get(7);
        int i18 = calendar.get(11);
        dm.b2 b2Var = new dm.b2();
        b2Var.field_msgid = this.f447007d;
        b2Var.field_timestamp = currentTimeMillis;
        b2Var.field_dayOfWeek = i17;
        b2Var.field_hourOfDay = i18;
        b2Var.field_isfrom = this.f447008e ? 1 : 0;
        b2Var.field_type = 2;
        b2Var.field_action = 1;
        b2Var.field_talker = this.f447009f;
        this.f447010g.f447011a.f447018a.z0(b2Var);
    }
}
