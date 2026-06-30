package n3;

/* loaded from: classes14.dex */
public abstract class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.reflect.Field f334413a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.reflect.Field f334414b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.reflect.Field f334415c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f334416d;

    static {
        try {
            java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAttachInfo");
            f334413a = declaredField;
            declaredField.setAccessible(true);
            java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f334414b = declaredField2;
            declaredField2.setAccessible(true);
            java.lang.reflect.Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f334415c = declaredField3;
            declaredField3.setAccessible(true);
            f334416d = true;
        } catch (java.lang.ReflectiveOperationException e17) {
            e17.getMessage();
        }
    }
}
