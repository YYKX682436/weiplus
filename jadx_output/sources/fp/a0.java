package fp;

/* loaded from: classes5.dex */
public class a0 extends fp.b0 {
    public a0(fp.x xVar) {
        super(null);
    }

    @Override // fp.b0
    public void b(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/compatible/util/LoadLibrary$LibraryLoader$SystemImpl", "loadByName", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/mm/compatible/util/LoadLibrary$LibraryLoader$SystemImpl", "loadByName", "(Ljava/lang/String;)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    @Override // fp.b0
    public java.lang.String c(java.lang.String str) {
        java.lang.System.load(str);
        return str;
    }

    @Override // fp.b0
    public java.lang.String d(java.lang.String str) {
        return str;
    }
}
