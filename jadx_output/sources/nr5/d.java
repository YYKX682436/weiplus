package nr5;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static android.app.Application f339344a;

    public static android.app.Application a(android.content.Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (context instanceof android.app.Application) {
                return (android.app.Application) context;
            }
            if (context instanceof android.app.Activity) {
                return ((android.app.Activity) context).getApplication();
            }
            android.content.Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof android.app.Application) {
                return (android.app.Application) applicationContext;
            }
            return null;
        } catch (java.lang.Exception e17) {
            or5.b.c(3, e17, "Get Application failed", new java.lang.Object[0]);
            return null;
        }
    }
}
