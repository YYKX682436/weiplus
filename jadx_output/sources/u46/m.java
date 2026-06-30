package u46;

/* loaded from: classes12.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f424685a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f424686b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f424687c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f424688d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f424689e;

    static {
        java.lang.String str;
        d("awt.toolkit");
        d("file.encoding");
        d("file.separator");
        d("java.awt.fonts");
        d("java.awt.graphicsenv");
        d("java.awt.headless");
        d("java.awt.printerjob");
        d("java.class.path");
        d("java.class.version");
        d("java.compiler");
        d("java.endorsed.dirs");
        d("java.ext.dirs");
        d("java.home");
        d("java.io.tmpdir");
        d("java.library.path");
        d("java.runtime.name");
        d("java.runtime.version");
        d("java.specification.name");
        d("java.specification.vendor");
        d("java.specification.version");
        d("java.util.prefs.PreferencesFactory");
        d("java.vendor");
        d("java.vendor.url");
        java.lang.String d17 = d("java.version");
        f424685a = d17;
        d("java.vm.info");
        d("java.vm.name");
        d("java.vm.specification.name");
        d("java.vm.specification.vendor");
        d("java.vm.specification.version");
        d("java.vm.vendor");
        d("java.vm.version");
        f424686b = d("line.separator");
        d("os.arch");
        f424687c = d("os.name");
        f424688d = d("os.version");
        d("path.separator");
        d(d("user.country") == null ? "user.region" : "user.country");
        d("user.dir");
        d("user.home");
        d("user.language");
        d("user.name");
        d("user.timezone");
        if (d17 != null) {
            for (int i17 = 0; i17 < d17.length(); i17++) {
                char charAt = d17.charAt(i17);
                if (charAt >= '0' && charAt <= '9') {
                    str = d17.substring(i17);
                    break;
                }
            }
        }
        str = null;
        f424689e = str;
        int[] e17 = e(f424685a, 3);
        if (e17.length != 0) {
            if (e17.length == 1) {
                int i18 = e17[0];
            } else {
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                stringBuffer.append(e17[0]);
                stringBuffer.append('.');
                for (int i19 = 1; i19 < e17.length; i19++) {
                    stringBuffer.append(e17[i19]);
                }
                try {
                    java.lang.Float.parseFloat(stringBuffer.toString());
                } catch (java.lang.Exception unused) {
                }
            }
        }
        int[] e18 = e(f424685a, 3);
        int length = e18.length;
        if (length >= 1) {
            int i27 = e18[0];
        }
        if (length >= 2) {
            int i28 = e18[1];
        }
        if (length >= 3) {
            int i29 = e18[2];
        }
        a("1.1");
        a("1.2");
        a("1.3");
        a("1.4");
        a("1.5");
        a("1.6");
        a("1.7");
        c("AIX");
        c("HP-UX");
        c("Irix");
        if (!c("Linux")) {
            c("LINUX");
        }
        c("Mac");
        c("Mac OS X");
        c("OS/2");
        c("Solaris");
        c("SunOS");
        c("Windows");
        b("Windows", "5.0");
        b("Windows 9", "4.0");
        b("Windows 9", "4.1");
        b("Windows", "4.9");
        c("Windows NT");
        b("Windows", "5.1");
        b("Windows", "6.0");
        b("Windows", "6.1");
    }

    public static boolean a(java.lang.String str) {
        java.lang.String str2 = f424689e;
        if (str2 == null) {
            return false;
        }
        return str2.startsWith(str);
    }

    public static boolean b(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4 = f424687c;
        return str4 != null && (str3 = f424688d) != null && str4.startsWith(str) && str3.startsWith(str2);
    }

    public static boolean c(java.lang.String str) {
        java.lang.String str2 = f424687c;
        if (str2 == null) {
            return false;
        }
        return str2.startsWith(str);
    }

    public static java.lang.String d(java.lang.String str) {
        try {
            return java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            java.io.PrintStream printStream = java.lang.System.err;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("Caught a SecurityException reading the system property '");
            stringBuffer.append(str);
            stringBuffer.append("'; the SystemUtils property value will default to null.");
            printStream.println(stringBuffer.toString());
            return null;
        }
    }

    public static int[] e(java.lang.String str, int i17) {
        if (str == null) {
            return u46.a.f424658c;
        }
        java.lang.String[] q17 = u46.l.q(str, "._- ");
        int min = java.lang.Math.min(i17, q17.length);
        int[] iArr = new int[min];
        int i18 = 0;
        for (int i19 = 0; i19 < q17.length && i18 < i17; i19++) {
            java.lang.String str2 = q17[i19];
            if (str2.length() > 0) {
                try {
                    iArr[i18] = java.lang.Integer.parseInt(str2);
                    i18++;
                } catch (java.lang.Exception unused) {
                }
            }
        }
        if (min <= i18) {
            return iArr;
        }
        int[] iArr2 = new int[i18];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, i18);
        return iArr2;
    }
}
