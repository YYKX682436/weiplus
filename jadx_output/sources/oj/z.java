package oj;

/* loaded from: classes7.dex */
public abstract class z {
    public static final java.lang.String a(android.app.ActivityManager.RecentTaskInfo contentToString) {
        kotlin.jvm.internal.o.g(contentToString, "$this$contentToString");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            java.lang.String obj = contentToString.toString();
            kotlin.jvm.internal.o.f(obj, "this.toString()");
            return obj;
        }
        try {
            return "RecentTaskInfo{id=" + contentToString.id + " persistentId=" + contentToString.persistentId + " baseIntent=" + contentToString.baseIntent + " baseActivity=" + contentToString.baseActivity + " topActivity=" + contentToString.topActivity + " origActivity=" + contentToString.origActivity + " numActivities=" + contentToString.numActivities + "}";
        } catch (java.lang.Throwable unused) {
            java.lang.String obj2 = contentToString.toString();
            kotlin.jvm.internal.o.f(obj2, "this.toString()");
            return obj2;
        }
    }
}
