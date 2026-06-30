package u65;

/* loaded from: classes5.dex */
public abstract class b {
    public static java.util.Set a() {
        try {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new com.tencent.mm.vfs.z6("/proc/" + android.os.Process.myPid() + "/maps"));
            com.tencent.mars.xlog.Log.i("MicroMsg.NativeLibraries", "Dump NativeLibrares:");
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (readLine.endsWith(".so")) {
                    hashSet.add(readLine.substring(readLine.lastIndexOf(" ") + 1));
                }
            }
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NativeLibraries", "" + ((java.lang.String) it.next()));
            }
            return hashSet;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NativeLibraries", th6, "", new java.lang.Object[0]);
            return null;
        }
    }
}
