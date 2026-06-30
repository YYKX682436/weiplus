package k8;

/* loaded from: classes15.dex */
public class c implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f304853d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f304854e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel f304855f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.OrientationEventListener f304856g;

    /* renamed from: h, reason: collision with root package name */
    public int f304857h = -1;

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        if (this.f304853d == null) {
            result.error("NO_ACTIVITY", "OrientationPlugin requires a foreground activity.", null);
            return;
        }
        java.lang.String str = methodCall.method;
        java.lang.Object obj = methodCall.arguments;
        if (str.equals("SystemChrome.setEnabledSystemUIOverlays")) {
            java.util.List list = (java.util.List) obj;
            int i17 = 7942;
            for (int i18 = 0; i18 < list.size(); i18++) {
                if (list.get(i18).equals("SystemUiOverlay.top")) {
                    i17 &= -5;
                } else if (list.get(i18).equals("SystemUiOverlay.bottom")) {
                    i17 &= -3;
                }
            }
            this.f304853d.getWindow().getDecorView().setSystemUiVisibility(i17);
            result.success(null);
            return;
        }
        if (!str.equals("SystemChrome.setPreferredOrientations")) {
            if (!str.equals("SystemChrome.forceOrientation")) {
                result.notImplemented();
                return;
            }
            java.lang.String str2 = (java.lang.String) obj;
            if (str2.equals("DeviceOrientation.portraitUp")) {
                this.f304853d.setRequestedOrientation(1);
            } else if (str2.equals("DeviceOrientation.portraitDown")) {
                this.f304853d.setRequestedOrientation(9);
            } else if (str2.equals("DeviceOrientation.landscapeLeft")) {
                this.f304853d.setRequestedOrientation(0);
            } else if (str2.equals("DeviceOrientation.landscapeRight")) {
                this.f304853d.setRequestedOrientation(8);
            } else {
                this.f304853d.setRequestedOrientation(-1);
            }
            result.success(null);
            return;
        }
        java.util.List list2 = (java.util.List) obj;
        int i19 = 0;
        for (int i27 = 0; i27 < list2.size(); i27++) {
            if (list2.get(i27).equals("DeviceOrientation.portraitUp")) {
                i19 |= 1;
            } else if (list2.get(i27).equals("DeviceOrientation.landscapeLeft")) {
                i19 |= 2;
            } else if (list2.get(i27).equals("DeviceOrientation.portraitDown")) {
                i19 |= 4;
            } else if (list2.get(i27).equals("DeviceOrientation.landscapeRight")) {
                i19 |= 8;
            }
        }
        switch (i19) {
            case 0:
                this.f304853d.setRequestedOrientation(-1);
                break;
            case 1:
                this.f304853d.setRequestedOrientation(1);
                break;
            case 2:
                this.f304853d.setRequestedOrientation(0);
                break;
            case 3:
            case 6:
            case 7:
            case 9:
            case 12:
            case 13:
            case 14:
                this.f304853d.setRequestedOrientation(13);
                break;
            case 4:
                this.f304853d.setRequestedOrientation(9);
                break;
            case 5:
                this.f304853d.setRequestedOrientation(12);
                break;
            case 8:
                this.f304853d.setRequestedOrientation(8);
                break;
            case 10:
                this.f304853d.setRequestedOrientation(11);
                break;
            case 11:
                this.f304853d.setRequestedOrientation(2);
                break;
            case 15:
                this.f304853d.setRequestedOrientation(13);
                break;
        }
        result.success(null);
    }
}
