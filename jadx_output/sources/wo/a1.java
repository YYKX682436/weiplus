package wo;

/* loaded from: classes7.dex */
public abstract class a1 {
    public static boolean a() {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("com.huawei.system.BuildEx");
            java.lang.String str = (java.lang.String) cls.getMethod("getOsBrand", new java.lang.Class[0]).invoke(cls, new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.i("MicroMsg.HarmonyOSHelper", "OsBrand: %s", str);
            return "harmony".equals(str);
        } catch (java.lang.ClassNotFoundException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HarmonyOSHelper", "occured ClassNotFoundException");
            return false;
        } catch (java.lang.NoSuchMethodException unused2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HarmonyOSHelper", "occured NoSuchMethodException");
            return false;
        } catch (java.lang.Exception unused3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HarmonyOSHelper", "occur other problem");
            return false;
        }
    }
}
