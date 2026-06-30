package yh;

/* loaded from: classes12.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yh.a f462359d = new yh.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        try {
            com.tencent.matrix.hook.jnihook.JniHookJni.jniPlaceHolder();
            java.lang.reflect.Method placeHolderMethod = com.tencent.matrix.hook.jnihook.JniHookJni.class.getDeclaredMethod("jniPlaceHolder", new java.lang.Class[0]);
            kotlin.jvm.internal.o.f(placeHolderMethod, "placeHolderMethod");
            i17 = com.tencent.matrix.hook.jnihook.JniHookJni.initJniHookByPlaceHolderMethod(placeHolderMethod);
        } catch (java.lang.NoSuchMethodException e17) {
            oj.j.f("Matrix.JniHookJni", "initJniHook err:" + e17, new java.lang.Object[0]);
            i17 = -1;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
