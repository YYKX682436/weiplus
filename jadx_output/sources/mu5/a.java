package mu5;

/* loaded from: classes15.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final mu5.a f331462d = new mu5.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            java.lang.reflect.Field declaredField = java.lang.reflect.Field.class.getDeclaredField("modifiers");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (java.lang.NoSuchFieldException e17) {
            mu5.d.b(e17);
            return null;
        }
    }
}
