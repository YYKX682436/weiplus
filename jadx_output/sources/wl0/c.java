package wl0;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f446992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f446993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wl0.d f446995g;

    public c(wl0.d dVar, long j17, boolean z17, java.lang.String str) {
        this.f446995g = dVar;
        this.f446992d = j17;
        this.f446993e = z17;
        this.f446994f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int i17 = calendar.get(7);
        int i18 = calendar.get(11);
        dm.b2 b2Var = new dm.b2();
        b2Var.field_msgid = this.f446992d;
        b2Var.field_timestamp = currentTimeMillis;
        b2Var.field_dayOfWeek = i17;
        b2Var.field_hourOfDay = i18;
        b2Var.field_isfrom = this.f446993e ? 1 : 0;
        b2Var.field_type = 3;
        b2Var.field_action = 2;
        b2Var.field_talker = this.f446994f;
        this.f446995g.f446996a.f447018a.z0(b2Var);
    }
}
