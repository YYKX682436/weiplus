package d85;

/* loaded from: classes12.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final d85.o f227226a = new d85.o();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f227227b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f227228c = new java.util.HashMap();

    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object[] objArr, java.lang.Boolean bool) {
        java.lang.Class[] clsArr;
        com.tencent.mars.xlog.Log.i("ExportFileHooker", "[invokeMethod] enter, methodName:" + str2 + ", caller:" + obj + ", args:" + objArr);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[invokeMethod]  clazz:");
        sb6.append(com.tencent.mm.platformtools.ExportFileUtil.class);
        sb6.append(", inputClassName:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("ExportFileHooker", sb6.toString());
        int hashCode = str2.hashCode();
        if (hashCode == -924832793) {
            if (str2.equals("exportVideoImpl")) {
                clsArr = new java.lang.Class[]{android.content.Context.class, java.lang.String.class, java.lang.String.class};
            }
            clsArr = new java.lang.Class[0];
        } else if (hashCode != -806469907) {
            if (hashCode == 1159024839 && str2.equals("exportImageImpl")) {
                clsArr = new java.lang.Class[]{android.content.Context.class, java.lang.String.class, java.lang.String.class};
            }
            clsArr = new java.lang.Class[0];
        } else {
            if (str2.equals("exportToPublicDownloadDirImpl")) {
                clsArr = new java.lang.Class[]{android.content.Context.class, java.lang.String.class};
            }
            clsArr = new java.lang.Class[0];
        }
        java.lang.reflect.Method declaredMethod = com.tencent.mm.platformtools.ExportFileUtil.class.getDeclaredMethod(str2, (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        com.tencent.mars.xlog.Log.i("ExportFileHooker", "[invokeMethod]  method:" + declaredMethod);
        if (declaredMethod != null) {
            declaredMethod.setAccessible(true);
        }
        java.lang.Object invoke = declaredMethod != null ? declaredMethod.invoke(obj, java.util.Arrays.copyOf(objArr, objArr.length)) : null;
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            pm0.v.X(new d85.i(invoke));
        }
        return invoke;
    }

    public final java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.Object[] objArr, java.lang.Boolean bool) {
        java.lang.Class cls = java.lang.Integer.TYPE;
        java.lang.reflect.Method declaredMethod = com.tencent.mm.sdk.platformtools.x.class.getDeclaredMethod(str2, (java.lang.Class[]) java.util.Arrays.copyOf(new java.lang.Class[]{android.graphics.Bitmap.class, cls, cls, java.lang.String.class, java.lang.Boolean.TYPE}, 5));
        if (declaredMethod != null) {
            declaredMethod.setAccessible(true);
        }
        java.lang.Object invoke = declaredMethod != null ? declaredMethod.invoke(obj, java.util.Arrays.copyOf(objArr, objArr.length)) : null;
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            pm0.v.X(new d85.j(invoke));
        }
        return invoke;
    }
}
