package eo1;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final eo1.e f255556a = new eo1.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f255557b = new java.util.ArrayList();

    public final synchronized void a(java.lang.String deviceId) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        com.tencent.mars.xlog.Log.i("CustomDiskInitErrorCache", "clearError: deviceId=".concat(deviceId));
        java.util.ArrayList arrayList = f255557b;
        eo1.d dVar = new eo1.d(deviceId);
        kotlin.jvm.internal.o.g(arrayList, "<this>");
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            int i19 = i17 + 1;
            java.lang.Object obj = arrayList.get(i17);
            if (((java.lang.Boolean) dVar.invoke(obj)).booleanValue()) {
                i17 = i19;
            } else {
                arrayList.set(i18, obj);
                i17 = i19;
                i18++;
            }
        }
        arrayList.size();
        while (arrayList.size() > i18) {
            fp.l.b(arrayList);
        }
    }

    public final synchronized void b(java.lang.String deviceId, eo1.c errorType) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(errorType, "errorType");
        com.tencent.mars.xlog.Log.w("CustomDiskInitErrorCache", "markError: deviceId=" + deviceId + ", errorType=" + errorType);
        java.util.Iterator it = f255557b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((eo1.b) obj).f255547a, deviceId)) {
                    break;
                }
            }
        }
        eo1.b bVar = (eo1.b) obj;
        if (bVar != null) {
            bVar.f255548b = errorType;
        } else {
            f255557b.add(new eo1.b(deviceId, errorType));
        }
    }
}
