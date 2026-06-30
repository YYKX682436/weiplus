package w03;

/* loaded from: classes8.dex */
public final class w implements z41.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity f441918a;

    public w(com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity megaVideoFlutterActivity) {
        this.f441918a = megaVideoFlutterActivity;
    }

    @Override // z41.b
    public final void a(z41.a aVar, z41.a aVar2) {
        com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity megaVideoFlutterActivity = this.f441918a;
        if (aVar2 == megaVideoFlutterActivity.f137323y) {
            return;
        }
        int i17 = android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "accelerometer_rotation", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterActivity", "accRotation=" + i17);
        if (i17 == 0) {
            return;
        }
        kotlin.jvm.internal.o.d(aVar2);
        megaVideoFlutterActivity.f137323y = aVar2;
        android.graphics.Bitmap bitmap = com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity.B;
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterActivity", "onOrientationsChange currentOrientation=" + aVar2);
        int i18 = w03.v.f441917a[aVar2.ordinal()];
        if (i18 == 1) {
            megaVideoFlutterActivity.setRequestedOrientation(0);
            return;
        }
        if (i18 == 2) {
            megaVideoFlutterActivity.setRequestedOrientation(8);
        } else if (i18 == 3 && !((java.lang.Boolean) ((jz5.n) megaVideoFlutterActivity.f137319u).getValue()).booleanValue()) {
            megaVideoFlutterActivity.setRequestedOrientation(1);
        }
    }
}
