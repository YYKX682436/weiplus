package sg3;

/* loaded from: classes4.dex */
public class l extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f407973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f407974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407975g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407976h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i17, r35.m3 m3Var, java.lang.Long l17, java.lang.Long l18, java.lang.String str, java.lang.String str2) {
        super(i17, m3Var);
        this.f407973e = l17;
        this.f407974f = l18;
        this.f407975g = str;
        this.f407976h = str2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        zy2.pa paVar = (zy2.pa) i95.n0.c(zy2.pa.class);
        java.lang.Long l17 = this.f407973e;
        long longValue = l17.longValue();
        java.lang.Long l18 = this.f407974f;
        ((c61.w8) paVar).Zi(longValue, l18.longValue(), "", -1, -1, -1L, "temp_17", -1, -1, "", "", java.lang.System.currentTimeMillis(), -1, "", "", null);
        r45.m84 m84Var = new r45.m84();
        m84Var.set(0, java.lang.Long.valueOf(l17.longValue()));
        m84Var.set(1, java.lang.Long.valueOf(l18.longValue()));
        m84Var.set(2, this.f407975g);
        m84Var.set(3, "");
        m84Var.set(4, "");
        m84Var.set(5, "");
        m84Var.set(6, null);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        wk0Var.set(6, new r45.y74());
        ((r45.y74) wk0Var.getCustom(6)).set(8, this.f407976h);
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ri(com.tencent.mm.sdk.platformtools.x2.f193071a, null, m84Var, true, wk0Var, null);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "chat_room_live_red_packet");
        hashMap.put("liveId", pm0.v.u(l18.longValue()));
        hashMap.put("feedId", pm0.v.u(l17.longValue()));
        hashMap.put("comment_scene", "temp_17");
        hashMap.put("finder_username", "");
        hashMap.put("session_buffer", "");
        hashMap.put("behaviour_session_id", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri());
        ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
        hashMap.put("finder_context_id", b52.b.b());
        ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).getClass();
        hashMap.put("finder_tab_context_id", b52.b.c());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 26236);
    }
}
