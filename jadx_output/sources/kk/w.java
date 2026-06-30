package kk;

/* loaded from: classes3.dex */
public abstract class w {
    public static java.lang.String a(java.lang.String str, boolean z17) {
        try {
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(str, z17);
            if (i17 == null) {
                return str;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VFSFileOpEx", "exportExternalPath:%s to realPath:%s", str, i17);
            return i17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VFSFileOpEx", th6, "exportExternalPath failed", new java.lang.Object[0]);
            return str;
        }
    }
}
