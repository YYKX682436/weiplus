package tx1;

/* loaded from: classes8.dex */
public abstract class a {
    public static void a(java.lang.reflect.Field field) {
        try {
            java.lang.reflect.Field declaredField = java.lang.reflect.Field.class.getDeclaredField("accessFlags");
            declaredField.setAccessible(true);
            declaredField.setInt(field, field.getModifiers() & (-17));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HookUtils", e17.getMessage());
        }
    }
}
