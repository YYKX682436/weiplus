package gr3;

/* loaded from: classes11.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f274860a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f274862c;

    /* renamed from: d, reason: collision with root package name */
    public int f274863d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f274865f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f274866g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f274867h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f274868i;

    /* renamed from: b, reason: collision with root package name */
    public int f274861b = 1;

    /* renamed from: e, reason: collision with root package name */
    public gr3.j f274864e = gr3.j.f274880e;

    public final java.lang.String a() {
        if (this.f274868i == null) {
            this.f274868i = "session_id_" + java.lang.System.currentTimeMillis();
        }
        java.lang.String str = this.f274868i;
        return str == null ? "" : str;
    }

    public final void b() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("wxtype", java.lang.Integer.valueOf(this.f274861b));
        linkedHashMap.put("enter_50321_path", java.lang.Integer.valueOf(this.f274860a));
        java.lang.String str = this.f274862c;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("wx_username", str);
        linkedHashMap.put("page_sessionid", a());
        linkedHashMap.put("referpath", java.lang.Integer.valueOf(this.f274863d));
        linkedHashMap.put("page_name", "PersonalPermissionSettingsPage");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50321, "page_in", linkedHashMap, 33629);
    }

    public final void c() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("enter_50321_path", java.lang.Integer.valueOf(this.f274860a));
        linkedHashMap.put("wxtype", java.lang.Integer.valueOf(this.f274861b));
        boolean z17 = this.f274865f;
        boolean z18 = this.f274866g;
        boolean z19 = this.f274867h;
        linkedHashMap.put("level2permission", java.lang.Integer.valueOf((z17 ? gr3.i.f274873e : (!z18 || z19) ? (z18 || !z19) ? (z18 && z19) ? gr3.i.f274876h : gr3.i.f274877i : gr3.i.f274875g : gr3.i.f274874f).f274879d));
        linkedHashMap.put("level1permission", java.lang.Integer.valueOf((this.f274865f ? gr3.h.f274870f : gr3.h.f274869e).f274872d));
        linkedHashMap.put("modify_permission", java.lang.Integer.valueOf(this.f274864e.f274888d));
        java.lang.String str = this.f274862c;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("wx_username", str);
        linkedHashMap.put("page_sessionid", a());
        linkedHashMap.put("page_name", "PersonalPermissionSettingsPage");
        linkedHashMap.put("referpath", java.lang.Integer.valueOf(this.f274863d));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Gj(50321, "50321_permission_change", linkedHashMap, 33629);
    }
}
