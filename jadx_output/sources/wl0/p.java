package wl0;

/* loaded from: classes13.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f447027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447028f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wl0.q f447029g;

    public p(wl0.q qVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f447029g = qVar;
        this.f447026d = str;
        this.f447027e = i17;
        this.f447028f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        dm.qa qaVar;
        wl0.q qVar = this.f447029g;
        java.util.HashSet hashSet = qVar.f447030a.f447033a;
        int i17 = this.f447027e;
        if (hashSet.contains(java.lang.Integer.valueOf(i17))) {
            em0.b.b("MomentVideo", 501);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(new java.util.Date(currentTimeMillis));
            int i18 = calendar.get(11);
            int i19 = calendar.get(7);
            dm.qa qaVar2 = new dm.qa();
            java.lang.String str = this.f447026d;
            qaVar2.field_snsid = str;
            qaVar2.field_type = i17;
            qaVar2.field_owner = this.f447028f;
            ul0.d dVar = qVar.f447030a.f447034b;
            dVar.getClass();
            android.database.Cursor B = dVar.f428561d.B("select * from SnsFeature where owner = '" + qaVar2.field_owner + "' and snsid = '" + qaVar2.field_snsid + "' and type = ?", new java.lang.String[]{java.lang.String.valueOf(qaVar2.field_type)});
            try {
                if (B.moveToFirst()) {
                    qaVar = new dm.qa();
                    qaVar.field_snsid = B.getString(B.getColumnIndex("snsid"));
                    qaVar.field_owner = B.getString(B.getColumnIndex("owner"));
                    qaVar.field_city = B.getString(B.getColumnIndex("city"));
                    qaVar.field_type = B.getInt(B.getColumnIndex("type"));
                    qaVar.field_weishang = B.getInt(B.getColumnIndex("weishang"));
                    qaVar.field_dayOfWeek = B.getInt(B.getColumnIndex("dayOfWeek"));
                    qaVar.field_hourOfDay = B.getInt(B.getColumnIndex("hourOfDay"));
                    qaVar.field_action = B.getInt(B.getColumnIndex("action"));
                    qaVar.field_timestamp = B.getLong(B.getColumnIndex(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP));
                } else {
                    B.close();
                    qaVar = null;
                }
                if (qaVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsScanner", "find failed! %s", str);
                    return;
                }
                qaVar.field_hourOfDay = i18;
                qaVar.field_dayOfWeek = i19;
                qaVar.field_timestamp = currentTimeMillis;
                qaVar.field_action = 12;
                qVar.f447030a.f447034b.J0(qaVar);
                if (i17 == 15) {
                    qVar.f447030a.getClass();
                    hl0.e eVar = new hl0.e("MomentVideo", str);
                    eVar.f282060h = java.lang.System.currentTimeMillis();
                    eVar.a();
                }
            } finally {
                B.close();
            }
        }
    }
}
