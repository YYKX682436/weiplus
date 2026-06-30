package z2;

/* loaded from: classes11.dex */
public final class n1 {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f469500d;

    /* renamed from: g, reason: collision with root package name */
    public static z2.l1 f469503g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f469504a;

    /* renamed from: b, reason: collision with root package name */
    public final android.app.NotificationManager f469505b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f469499c = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public static java.util.Set f469501e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f469502f = new java.lang.Object();

    public n1(android.content.Context context) {
        this.f469504a = context;
        this.f469505b = (android.app.NotificationManager) context.getSystemService("notification");
    }

    public static java.util.Set b(android.content.Context context) {
        java.util.Set set;
        android.content.ContentResolver contentResolver = context.getContentResolver();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("enabled_notification_listeners");
        arrayList.add(contentResolver);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        java.lang.String str = (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "androidx/core/app/NotificationManagerCompat", "getEnabledListenerPackages", "(Landroid/content/Context;)Ljava/util/Set;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        synchronized (f469499c) {
            if (str != null) {
                if (!str.equals(f469500d)) {
                    java.lang.String[] split = str.split(":", -1);
                    java.util.HashSet hashSet = new java.util.HashSet(split.length);
                    for (java.lang.String str2 : split) {
                        android.content.ComponentName unflattenFromString = android.content.ComponentName.unflattenFromString(str2);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f469501e = hashSet;
                    f469500d = str;
                }
            }
            set = f469501e;
        }
        return set;
    }

    public boolean a() {
        return z2.g1.a(this.f469505b);
    }

    public void c(int i17, android.app.Notification notification) {
        android.os.Bundle bundle = notification.extras;
        boolean z17 = bundle != null && bundle.getBoolean("android.support.useSideChannel");
        android.app.NotificationManager notificationManager = this.f469505b;
        if (!z17) {
            notificationManager.notify(null, i17, notification);
            return;
        }
        z2.i1 i1Var = new z2.i1(this.f469504a.getPackageName(), i17, null, notification);
        synchronized (f469502f) {
            if (f469503g == null) {
                f469503g = new z2.l1(this.f469504a.getApplicationContext());
            }
            f469503g.f469489e.obtainMessage(0, i1Var).sendToTarget();
        }
        notificationManager.cancel(null, i17);
    }
}
