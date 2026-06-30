package q46;

/* loaded from: classes13.dex */
public final class a implements java.security.PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public java.lang.Object run() {
        int i17;
        java.lang.String property = java.lang.System.getProperty("java.util.jar.Pack200.Unpacker", "org.apache.commons.compress.harmony.unpack200.Pack200UnpackerAdapter");
        try {
            return java.lang.ClassLoader.getSystemClassLoader().loadClass(property).newInstance();
        } catch (java.lang.Exception e17) {
            java.lang.Object[] objArr = {property};
            java.util.ResourceBundle resourceBundle = p46.a.f351963a;
            java.lang.String str = "archive.3E";
            if (resourceBundle != null) {
                try {
                    str = resourceBundle.getString("archive.3E");
                } catch (java.util.MissingResourceException unused) {
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.length() + 20);
            java.lang.String[] strArr = new java.lang.String[1];
            int i18 = 0;
            java.lang.Object obj = objArr[0];
            if (obj == null) {
                strArr[0] = "<null>";
            } else {
                strArr[0] = obj.toString();
            }
            while (true) {
                int indexOf = str.indexOf(123, i18);
                if (indexOf < 0) {
                    break;
                }
                if (indexOf != 0) {
                    int i19 = indexOf - 1;
                    if (str.charAt(i19) == '\\') {
                        if (indexOf != 1) {
                            sb6.append(str.substring(i18, i19));
                        }
                        sb6.append('{');
                        i17 = indexOf + 1;
                        i18 = i17;
                    }
                }
                if (indexOf > str.length() - 3) {
                    sb6.append(str.substring(i18));
                    i18 = str.length();
                } else {
                    int i27 = indexOf + 1;
                    byte digit = (byte) java.lang.Character.digit(str.charAt(i27), 10);
                    if (digit < 0 || str.charAt(indexOf + 2) != '}') {
                        sb6.append(str.substring(i18, i27));
                        i18 = i27;
                    } else {
                        sb6.append(str.substring(i18, indexOf));
                        if (digit >= 1) {
                            sb6.append("<missing argument>");
                        } else {
                            sb6.append(strArr[digit]);
                        }
                        i17 = indexOf + 3;
                        i18 = i17;
                    }
                }
            }
            if (i18 < str.length()) {
                sb6.append(str.substring(i18));
            }
            throw new java.lang.Error(sb6.toString(), e17);
        }
    }
}
