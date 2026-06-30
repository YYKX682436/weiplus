package u4;

/* loaded from: classes13.dex */
public final class m extends android.util.Property {
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // android.util.Property
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        android.graphics.Matrix matrix = (android.graphics.Matrix) obj2;
        if (!u4.f0.f424474b) {
            try {
                java.lang.reflect.Method declaredMethod = android.widget.ImageView.class.getDeclaredMethod("animateTransform", android.graphics.Matrix.class);
                u4.f0.f424473a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            u4.f0.f424474b = true;
        }
        java.lang.reflect.Method method = u4.f0.f424473a;
        if (method != null) {
            try {
                method.invoke(imageView, matrix);
            } catch (java.lang.IllegalAccessException unused2) {
            } catch (java.lang.reflect.InvocationTargetException e17) {
                throw new java.lang.RuntimeException(e17.getCause());
            }
        }
    }
}
