package l14;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final l14.e f315008a = new l14.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f315009b = new java.util.LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v18 */
    public final void a() {
        boolean s17 = ip.b.s();
        int i17 = 1;
        ?? r07 = s17;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            r07 = (s17 && ip.b.u()) ? 1 : 0;
        }
        java.util.Map map = f315009b;
        map.put("msg_notify_after_status", java.lang.Integer.valueOf((int) r07));
        map.put("voice_video_after_status", java.lang.Integer.valueOf(ip.b.t() ? 1 : 0));
        map.put("sys_notify_after_status", java.lang.Integer.valueOf(ip.b.u() ? 1 : 0));
        w14.d dVar = w14.d.f442234d;
        dVar.c();
        map.put("banner_msg_show_after_status", java.lang.Integer.valueOf(w14.d.f442235e.f442233d));
        if (!dVar.e() && !dVar.f()) {
            i17 = 0;
        }
        map.put("show_details_after_status", java.lang.Integer.valueOf(i17));
        map.put("show_avatar_after_status", java.lang.Integer.valueOf(dVar.d(null) ? 1 : 0));
        map.put("show_msg_content_after_status", java.lang.Integer.valueOf(dVar.e() ? 1 : 0));
        map.put("voice_video_pop_window_after_status", 2);
    }

    public final void b(l14.d type) {
        kotlin.jvm.internal.o.g(type, "type");
        java.util.Map map = f315009b;
        ((java.util.LinkedHashMap) map).clear();
        a();
        map.put("notify_change_setting", java.lang.Integer.valueOf(type.f315007d));
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsNotificationReporter", "reportNotificationSwitchChange reportParams: " + map);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        if (rVar != null) {
            ((cy1.a) rVar).Ej("push_notify_setting_change", map, 33328);
        }
    }
}
