package nf;

/* loaded from: classes7.dex */
public abstract class z {
    public static java.lang.String a(java.lang.String str) {
        int indexOf;
        return (!android.text.TextUtils.isEmpty(str) && (indexOf = str.indexOf(63)) >= 0) ? str.substring(0, indexOf) : str;
    }

    public static java.lang.String b(java.lang.String str) {
        int indexOf;
        if (android.text.TextUtils.isEmpty(str) || (indexOf = str.indexOf(63)) < 0) {
            return "";
        }
        int i17 = indexOf + 1;
        int lastIndexOf = str.lastIndexOf(38);
        int lastIndexOf2 = str.lastIndexOf(35);
        if (lastIndexOf2 >= 0 && lastIndexOf2 > lastIndexOf && i17 <= lastIndexOf2) {
            return str.substring(i17, lastIndexOf2);
        }
        return str.substring(i17, str.length());
    }

    public static java.util.Map c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String b17 = b(str);
        if (android.text.TextUtils.isEmpty(b17)) {
            return hashMap;
        }
        int length = b17.length();
        int i17 = 0;
        while (true) {
            int indexOf = b17.indexOf(38, i17);
            int i18 = indexOf != -1 ? indexOf : length;
            int indexOf2 = b17.indexOf(61, i17);
            if (indexOf2 > i18 || indexOf2 == -1) {
                indexOf2 = i18;
            }
            hashMap.put(android.net.Uri.decode(b17.substring(i17, indexOf2)), indexOf2 == i18 ? "" : b17.substring(indexOf2 + 1, i18));
            if (indexOf == -1) {
                return hashMap;
            }
            i17 = indexOf + 1;
        }
    }

    public static boolean d(java.lang.String str, java.lang.String str2) {
        return str != null && str2 != null && str.length() >= 0 && str2.length() >= 0 && str2.length() <= str.length() && str2.equalsIgnoreCase(str.substring(0, str2.length()));
    }
}
