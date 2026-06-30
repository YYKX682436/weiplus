package vs0;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final vs0.c f439830a = new vs0.c();

    /* renamed from: b, reason: collision with root package name */
    public static android.hardware.camera2.CameraManager f439831b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f439832c = null;

    /* renamed from: d, reason: collision with root package name */
    public static int f439833d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static android.graphics.Point f439834e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f439835f = true;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f439836g = false;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f439837h = true;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f439838i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f439839j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f439840k;

    /* renamed from: l, reason: collision with root package name */
    public static int f439841l;

    /* renamed from: m, reason: collision with root package name */
    public static int f439842m;

    /* renamed from: n, reason: collision with root package name */
    public static boolean f439843n;

    /* renamed from: o, reason: collision with root package name */
    public static yz5.l f439844o;

    /* renamed from: p, reason: collision with root package name */
    public static java.lang.Boolean f439845p;

    /* renamed from: q, reason: collision with root package name */
    public static java.util.ArrayList f439846q;

    /* renamed from: r, reason: collision with root package name */
    public static java.util.ArrayList f439847r;

    /* renamed from: s, reason: collision with root package name */
    public static java.util.ArrayList f439848s;

    static {
        int[] iArr = it0.c.f294486a;
        f439838i = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_camera_use_video_stabilization_switch, true);
        f439839j = true;
        f439841l = 40;
        f439842m = 40;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[EDGE_INSN: B:25:0x0068->B:26:0x0068 BREAK  A[LOOP:1: B:12:0x003c->B:36:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[LOOP:1: B:12:0x003c->B:36:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(android.hardware.camera2.CaptureRequest.Builder r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vs0.c.a(android.hardware.camera2.CaptureRequest$Builder, java.util.List):int");
    }

    public final java.lang.String b(int i17) {
        java.lang.Integer num;
        android.hardware.camera2.CameraManager cameraManager = f439831b;
        java.lang.String str = null;
        java.lang.String[] cameraIdList = cameraManager != null ? cameraManager.getCameraIdList() : null;
        if (cameraIdList != null) {
            int length = cameraIdList.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    break;
                }
                java.lang.String str2 = cameraIdList[i18];
                android.hardware.camera2.CameraManager cameraManager2 = f439831b;
                android.hardware.camera2.CameraCharacteristics cameraCharacteristics = cameraManager2 != null ? cameraManager2.getCameraCharacteristics(str2) : null;
                if ((cameraCharacteristics == null || (num = (java.lang.Integer) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING)) == null || num.intValue() != i17) ? false : true) {
                    str = str2;
                    break;
                }
                i18++;
            }
        }
        if (str != null) {
            return str;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CameraUtil", "can not find the id: %s in camera manage", java.lang.Integer.valueOf(i17));
        return java.lang.String.valueOf(i17);
    }

    public final android.util.Size[] c() {
        android.hardware.camera2.CameraCharacteristics cameraCharacteristics;
        java.lang.String str = f439832c;
        if (str == null) {
            str = b(1);
        }
        android.hardware.camera2.CameraManager cameraManager = f439831b;
        android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (cameraManager == null || (cameraCharacteristics = cameraManager.getCameraCharacteristics(str)) == null) ? null : (android.hardware.camera2.params.StreamConfigurationMap) cameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        android.util.Size[] outputSizes = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(35) : null;
        kotlin.jvm.internal.o.d(outputSizes);
        d(outputSizes, "image");
        return outputSizes;
    }

    public final void d(android.util.Size[] sizeArr, java.lang.String str) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (android.util.Size size : sizeArr) {
            stringBuffer.append("size: " + size.getHeight() + ',' + size.getWidth() + " ratios " + ((size.getHeight() * 1.0d) / size.getWidth()) + "||");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraUtil", "Print currentCamera " + f439832c + " support " + str + " sizes " + ((java.lang.Object) stringBuffer));
    }

    public final void e(android.hardware.camera2.CaptureRequest.Builder builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        java.util.ArrayList<xs0.a> arrayList = f439846q;
        if (arrayList != null) {
            for (xs0.a aVar : arrayList) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CameraUtil", "close effect :  " + aVar.f456290f);
                java.lang.Object obj = aVar.f456287c;
                kotlin.jvm.internal.o.d(obj);
                ws0.b.a(builder, aVar, false, obj);
            }
        }
    }

    public final void f(boolean z17, android.hardware.camera2.CaptureRequest.Builder builder) {
        kotlin.jvm.internal.o.g(builder, "builder");
        if (it0.c.c()) {
            if (z17) {
                builder.set(android.hardware.camera2.CaptureRequest.FLASH_MODE, 1);
                return;
            } else {
                builder.set(android.hardware.camera2.CaptureRequest.FLASH_MODE, 0);
                return;
            }
        }
        if (z17) {
            builder.set(android.hardware.camera2.CaptureRequest.FLASH_MODE, 2);
        } else {
            builder.set(android.hardware.camera2.CaptureRequest.FLASH_MODE, 0);
        }
    }
}
