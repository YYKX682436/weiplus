package xg1;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final xg1.h f454370a = new xg1.h();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseArray f454371b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public static int f454372c;

    public final boolean a(int i17) {
        xg1.j b17 = b(i17);
        if (b17 == null) {
            return false;
        }
        android.content.Context context = b17.f454375a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PendingIntentPoster", "execPendingIntent: ctx = " + b17.f454375a);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17.f454376b);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/loading/PendingIntentPoster", "execPendingIntent", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/appbrand/loading/PendingIntentPoster", "execPendingIntent", "(I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (!(context instanceof android.app.Activity)) {
            return true;
        }
        ((android.app.Activity) context).overridePendingTransition(0, 0);
        return true;
    }

    public final xg1.j b(int i17) {
        xg1.j jVar;
        synchronized (this) {
            android.util.SparseArray sparseArray = f454371b;
            jVar = (xg1.j) sparseArray.get(i17);
            if (jVar == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PendingIntentPoster", "getPendingIntentAndRemoveAtomic: get a null task by intentKey = " + i17);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.PendingIntentPoster", "getPendingIntentAndRemoveAtomic: brandName = " + jVar.f454377c.f77279e);
            }
            sparseArray.remove(i17);
        }
        return jVar;
    }
}
