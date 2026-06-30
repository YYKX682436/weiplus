package wl0;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f447020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f447022g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447023h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wl0.o f447024i;

    public n(wl0.o oVar, java.lang.String str, boolean z17, java.lang.String str2, int i17, java.lang.String str3) {
        this.f447024i = oVar;
        this.f447019d = str;
        this.f447020e = z17;
        this.f447021f = str2;
        this.f447022g = i17;
        this.f447023h = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f447021f;
        if (str == null) {
            str = "";
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        wl0.o oVar = this.f447024i;
        java.util.HashSet hashSet = oVar.f447025a.f447033a;
        int i17 = this.f447022g;
        if (hashSet.contains(java.lang.Integer.valueOf(i17))) {
            if (str.endsWith("市")) {
                str = str.substring(0, str.length() - 1);
            }
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(new java.util.Date(currentTimeMillis));
            int i18 = calendar.get(11);
            int i19 = calendar.get(7);
            dm.qa qaVar = new dm.qa();
            java.lang.String str2 = this.f447019d;
            qaVar.field_snsid = str2;
            qaVar.field_owner = this.f447023h;
            qaVar.field_type = i17;
            qaVar.field_weishang = this.f447020e ? 1 : 0;
            qaVar.field_city = str;
            qaVar.field_timestamp = currentTimeMillis;
            qaVar.field_hourOfDay = i18;
            qaVar.field_dayOfWeek = i19;
            qaVar.field_action = 11;
            oVar.f447025a.f447034b.J0(qaVar);
            if (i17 == 15) {
                oVar.f447025a.getClass();
                nl0.d a17 = nl0.c.a();
                if (a17.y0("MomentVideo", str2) != null) {
                    return;
                }
                dm.u6 u6Var = new dm.u6();
                u6Var.field_happen_time = java.lang.System.currentTimeMillis();
                u6Var.field_type = "MomentVideo";
                u6Var.field_id = str2;
                u6Var.field_version = java.lang.Integer.parseInt(com.tencent.mm.sdk.platformtools.z.f193111g.replace("0x", ""), 16);
                a17.insert(u6Var);
                em0.b.b("MomentVideo", 101);
                hl0.e eVar = new hl0.e("MomentVideo", str2);
                eVar.f282056d = java.lang.System.currentTimeMillis();
                eVar.a();
            }
        }
    }
}
