package wo;

/* loaded from: classes.dex */
public class n0 extends wo.r0 {
    @Override // wo.r0
    public java.lang.String b() {
        try {
            android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("android_id");
            arrayList.add(contentResolver);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            return (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/compatible/deviceinfo/DeviceInfo$8", "newValue", "()Ljava/lang/String;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DeviceInfo", th6, "[-] Fail to get android id.", new java.lang.Object[0]);
            return "";
        }
    }
}
