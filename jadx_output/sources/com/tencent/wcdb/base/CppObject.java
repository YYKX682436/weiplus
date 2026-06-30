package com.tencent.wcdb.base;

/* loaded from: classes12.dex */
public class CppObject implements com.tencent.wcdb.base.CppObjectConvertible {
    private byte _hellAccFlag_;
    protected long cppObj = 0;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("WCDB");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/wcdb/base/CppObject", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/wcdb/base/CppObject", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    public static long get(com.tencent.wcdb.base.CppObject cppObject) {
        if (cppObject == null) {
            return 0L;
        }
        return cppObject.cppObj;
    }

    public static native void releaseCPPObject(long j17);

    @Override // com.tencent.wcdb.base.CppObjectConvertible
    public com.tencent.wcdb.base.CppObject asCppObject() {
        return this;
    }

    public void finalize() {
        long j17 = this.cppObj;
        this.cppObj = 0L;
        if (j17 != 0) {
            releaseCPPObject(j17);
        }
        super.finalize();
    }

    public static long get(com.tencent.wcdb.base.CppObjectConvertible cppObjectConvertible) {
        if (cppObjectConvertible == null) {
            return 0L;
        }
        return cppObjectConvertible.asCppObject().cppObj;
    }
}
