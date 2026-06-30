package l75;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Properties f316937a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f316938b;

    public a(java.lang.String str) {
        java.io.InputStream inputStream = null;
        this.f316937a = null;
        this.f316938b = null;
        java.util.Properties properties = new java.util.Properties();
        this.f316937a = properties;
        this.f316938b = str;
        try {
            inputStream = com.tencent.mm.vfs.w6.E(str);
            properties.load(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReadConfig", "Close File: %s Failed. [%s]", str, e17.getLocalizedMessage());
                }
            }
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReadConfig", "Read File: %s Failed. [%s]", str, th6.getLocalizedMessage());
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e18) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ReadConfig", "Close File: %s Failed. [%s]", str, e18.getLocalizedMessage());
                    }
                }
            } catch (java.lang.Throwable th7) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ReadConfig", "Close File: %s Failed. [%s]", str, e19.getLocalizedMessage());
                    }
                }
                throw th7;
            }
        }
    }

    public static java.lang.Long b(java.lang.String str, java.lang.String str2) {
        java.lang.String c17 = new l75.a(str).c(str2);
        if (c17 == null) {
            return null;
        }
        try {
            return java.lang.Long.valueOf(java.lang.Long.parseLong(c17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReadConfig", "getLongValue ParseLong : %s Failed. [%s]", c17, e17.getLocalizedMessage());
            return null;
        }
    }

    public java.lang.Integer a(java.lang.String str) {
        java.lang.String c17 = c(str);
        if (c17 == null) {
            return null;
        }
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt(c17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReadConfig", "getIntegerValue ParseInteger : %s Failed. [%s]", c17, e17.getLocalizedMessage());
            return null;
        }
    }

    public java.lang.String c(java.lang.String str) {
        java.util.Properties properties = this.f316937a;
        if (properties == null || !properties.containsKey(str)) {
            return null;
        }
        return properties.getProperty(str);
    }

    public boolean d(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = this.f316938b;
        java.io.OutputStream outputStream = null;
        try {
            try {
                java.io.OutputStream K = com.tencent.mm.vfs.w6.K(str3, false);
                java.util.Properties properties = this.f316937a;
                properties.setProperty(str, str2);
                properties.store(K, "");
                if (K == null) {
                    return true;
                }
                try {
                    K.close();
                    return true;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReadConfig", "Close File: %s Failed. [%s]", str3, e17.getLocalizedMessage());
                    return true;
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ReadConfig", "Write File: %s Failed. [%s]", str3, e18.getLocalizedMessage());
                if (0 != 0) {
                    try {
                        outputStream.close();
                    } catch (java.io.IOException e19) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ReadConfig", "Close File: %s Failed. [%s]", str3, e19.getLocalizedMessage());
                    }
                }
                return false;
            }
        } catch (java.lang.Throwable th6) {
            if (0 != 0) {
                try {
                    outputStream.close();
                } catch (java.io.IOException e27) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ReadConfig", "Close File: %s Failed. [%s]", str3, e27.getLocalizedMessage());
                }
            }
            throw th6;
        }
    }
}
