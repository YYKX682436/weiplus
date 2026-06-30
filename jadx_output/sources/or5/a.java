package or5;

/* loaded from: classes7.dex */
public final class a implements or5.c {
    @Override // or5.c
    public void a(int i17, java.lang.String str, java.lang.String str2, java.lang.Throwable th6) {
        int min;
        if (i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5 || i17 == 6) {
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            if (th6 != null) {
                str2 = str2 + "\n" + android.util.Log.getStackTraceString(th6);
            }
            if (4000 >= str2.length()) {
                android.util.Log.println(i17, str, str2);
                return;
            }
            int length = str2.length();
            int i18 = 0;
            while (i18 < length) {
                int indexOf = str2.indexOf(10, i18);
                if (-1 == indexOf) {
                    indexOf = length;
                }
                while (true) {
                    min = java.lang.Math.min(indexOf, i18 + 4000);
                    android.util.Log.println(i17, str, str2.substring(i18, min));
                    if (min >= indexOf) {
                        break;
                    } else {
                        i18 = min;
                    }
                }
                i18 = min + 1;
            }
        }
    }
}
