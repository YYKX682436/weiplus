package jh;

/* loaded from: classes13.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Map f299768a;

    public static int a(android.content.Context context, java.lang.String str) {
        if (f299768a == null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.io.File j17 = jh.a0.j(context);
            java.lang.String h17 = jh.a0.h(j17, 512000);
            if (h17 == null) {
                oj.j.f("Matrix.Backtrace.WarmUp", "Read unfinished maps file failed, file size %s", java.lang.Long.valueOf(j17.length()));
                if (j17.length() > 512000) {
                    j17.delete();
                }
            } else {
                for (java.lang.String str2 : h17.split("\n")) {
                    int lastIndexOf = str2.lastIndexOf("|");
                    if (lastIndexOf >= 0) {
                        try {
                            hashMap.put(str2.substring(0, lastIndexOf), java.lang.Integer.valueOf(java.lang.Integer.parseInt(str2.substring(lastIndexOf + 1))));
                        } catch (java.lang.Throwable th6) {
                            oj.j.d("Matrix.Backtrace.WarmUp", th6, "", new java.lang.Object[0]);
                        }
                    }
                }
            }
            f299768a = hashMap;
        }
        java.lang.Integer num = (java.lang.Integer) f299768a.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
