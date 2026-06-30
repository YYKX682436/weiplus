package gi;

/* loaded from: classes12.dex */
public final /* synthetic */ class w0$$h implements wh.u0 {
    @Override // wh.u0
    public final java.lang.Object apply(java.lang.Object obj) {
        rh.c3 c3Var = (rh.c3) obj;
        android.os.SystemClock.uptimeMillis();
        rh.x2 b17 = rh.x2.b(-1L);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.content.Intent intent = null;
        try {
            intent = context.registerReceiver(null, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (java.lang.Exception e17) {
            oj.j.f("MicroMsg.BatteryCurrentSnapshot", "get ACTION_BATTERY_CHANGED failed: " + e17.getMessage(), new java.lang.Object[0]);
        }
        if (intent != null) {
            b17 = rh.x2.b(java.lang.Long.valueOf(intent.getIntExtra("voltage", -1)));
        }
        long longValue = ((java.lang.Long) b17.f395552a).longValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.battery.MMCompositeMonitors", "onSampling " + c3Var.f395346g + " " + c3Var.f395340a + ", val = " + longValue);
        return java.lang.Long.valueOf(longValue);
    }
}
