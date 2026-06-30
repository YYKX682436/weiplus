package z2;

/* loaded from: classes13.dex */
public abstract class h extends b3.l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f469448a = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(android.app.Activity activity, java.lang.String[] strArr, int i17) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i18 = 0; i18 < strArr.length; i18++) {
            if (android.text.TextUtils.isEmpty(strArr[i18])) {
                throw new java.lang.IllegalArgumentException("Permission request for permissions " + java.util.Arrays.toString(strArr) + " must not contain null or empty values");
            }
            if (android.os.Build.VERSION.SDK_INT < 33 && android.text.TextUtils.equals(strArr[i18], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(java.lang.Integer.valueOf(i18));
            }
        }
        int size = hashSet.size();
        java.lang.String[] strArr2 = size > 0 ? new java.lang.String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i19 = 0;
            for (int i27 = 0; i27 < strArr.length; i27++) {
                if (!hashSet.contains(java.lang.Integer.valueOf(i27))) {
                    strArr2[i19] = strArr[i27];
                    i19++;
                }
            }
        }
        if (activity instanceof z2.g) {
            ((z2.g) activity).validateRequestPermissionsRequestCode(i17);
        }
        z2.c.b(activity, strArr, i17);
    }

    public static boolean b(android.app.Activity activity, java.lang.String str) {
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 33 || !android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return i17 >= 32 ? z2.e.a(activity, str) : i17 == 31 ? z2.d.b(activity, str) : z2.c.c(activity, str);
        }
        return false;
    }
}
