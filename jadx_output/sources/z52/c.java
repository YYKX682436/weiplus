package z52;

/* loaded from: classes15.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f470241a = new java.util.HashMap();

    public static void a(java.lang.Object obj, r45.c45 c45Var, boolean z17) {
        com.tencent.mm.plugin.expt.hellhound.ext.session.config.f.a().getClass();
        r45.l16 a17 = x52.g.a();
        if (a17 == null || a17.f379076d) {
            return;
        }
        java.util.Iterator it = a17.f379077e.iterator();
        while (it.hasNext()) {
            r45.m16 m16Var = (r45.m16) it.next();
            if (m16Var != null) {
                java.util.Iterator it6 = m16Var.f380074e.iterator();
                while (it6.hasNext()) {
                    r45.b45 b45Var = (r45.b45) it6.next();
                    if (b45Var != null) {
                        nm5.b e17 = y52.b.e(c45Var.f371270d, obj.getClass().getSimpleName());
                        if (e17 == null) {
                            return;
                        }
                        r45.jw3 jw3Var = (r45.jw3) e17.a(0);
                        z52.b.a(obj, b45Var, jw3Var, true, z17);
                        y52.b.i(jw3Var, ((java.lang.Integer) e17.a(1)).intValue());
                        return;
                    }
                }
                return;
            }
        }
    }

    public static synchronized void b(int i17) {
        android.app.Activity activity;
        synchronized (z52.c.class) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) f470241a).get(java.lang.Integer.valueOf(i17));
            if (weakReference != null && (activity = (android.app.Activity) weakReference.get()) != null) {
                if (activity.isDestroyed()) {
                    return;
                }
                r45.c45 e17 = x52.c.e();
                if (e17 != null) {
                    a(activity, e17, false);
                }
            }
        }
    }

    public static synchronized void c(int i17) {
        android.app.Activity activity;
        synchronized (z52.c.class) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) f470241a).get(java.lang.Integer.valueOf(i17));
            if (weakReference != null && (activity = (android.app.Activity) weakReference.get()) != null) {
                if (activity.isDestroyed()) {
                    return;
                }
                r45.c45 e17 = x52.c.e();
                if (e17 != null) {
                    a(activity, e17, true);
                }
            }
        }
    }
}
