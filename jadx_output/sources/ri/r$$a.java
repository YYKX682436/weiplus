package ri;

/* loaded from: classes12.dex */
public final /* synthetic */ class r$$a implements m3.a {
    @Override // m3.a
    public final void accept(java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        map.put("stat-bat-temp", java.lang.Integer.valueOf(wh.m.m(context)));
        map.put("stat-dev-thermal", java.lang.Integer.valueOf(wh.m.u(context)));
        map.put("stat-dev-watt", java.lang.Integer.valueOf(wh.m.n(context)));
        map.put("stat-dev-light", java.lang.Integer.valueOf(android.provider.Settings.System.getInt(context.getContentResolver(), "screen_brightness", Integer.MIN_VALUE)));
        map.put("stat-net-radio", java.lang.Long.valueOf(com.tencent.mars.comm.NetworkSignalUtil.getGSMSignalStrength()));
        map.put("stat-net-wifi", java.lang.Long.valueOf(com.tencent.mars.comm.NetworkSignalUtil.getWifiSignalStrength()));
        int i17 = 0;
        for (int i18 : wh.m.p()) {
            if (i18 > i17) {
                i17 = i18;
            }
        }
        map.put("stat-cpu-freq", java.lang.Integer.valueOf(i17));
    }
}
