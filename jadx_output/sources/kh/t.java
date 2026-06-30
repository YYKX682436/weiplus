package kh;

/* loaded from: classes12.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final kh.t f307910a = new kh.t();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Class f307911b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Field f307912c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Field f307913d;

    /* renamed from: e, reason: collision with root package name */
    public static int f307914e;

    public final void a(android.animation.Animator animator) {
        java.lang.Class cls;
        java.lang.Class<?> cls2;
        java.lang.Class<?> cls3;
        java.lang.String name;
        java.lang.Class<?> cls4;
        cls = android.animation.ValueAnimator.class;
        if (animator != null) {
            try {
                cls2 = animator.getClass();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.battery.AnimatorTracker", th6, "hookAnimationHandlerErr " + f307914e + ": " + th6.getMessage(), new java.lang.Object[0]);
                int i17 = f307914e % 10;
                if (i17 + ((((i17 ^ 10) & ((-i17) | i17)) >> 31) & 10) == 0) {
                    boolean z17 = kh.k1.f307838n;
                    if (kh.k1.f307838n) {
                        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                        java.lang.Class<?>[] interfaces = (animator != null ? animator.getClass() : android.animation.ValueAnimator.class).getInterfaces();
                        kotlin.jvm.internal.o.f(interfaces, "getInterfaces(...)");
                        int length = interfaces.length;
                        int i18 = 0;
                        while (true) {
                            if (i18 >= length) {
                                cls3 = null;
                                break;
                            }
                            cls3 = interfaces[i18];
                            if (r26.i0.n(cls3.getName(), "$AnimationFrameCallback", false)) {
                                break;
                            } else {
                                i18++;
                            }
                        }
                        if (cls3 != null) {
                            linkedHashMap.put("class", cls3.getName());
                            linkedHashMap.put("modifiers", java.lang.Integer.valueOf(cls3.getModifiers()));
                            try {
                                java.lang.reflect.Field declaredField = java.lang.Class.class.getDeclaredField("accessFlags");
                                declaredField.setAccessible(true);
                                declaredField.setInt(cls3, (declaredField.getInt(cls3) & (-3)) | 1);
                                name = java.lang.String.valueOf(declaredField.getInt(cls3));
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("Matrix.MatrixReportUtils", e17, "modifyAndGetClassAccessFlags failed", new java.lang.Object[0]);
                                java.lang.String message = e17.getMessage();
                                name = message == null ? e17.getClass().getName() : message;
                            }
                            linkedHashMap.put("accessFlags", name);
                        }
                        java.lang.String[] strArr = new java.lang.String[3];
                        strArr[0] = "AnimationFrameCallback";
                        strArr[1] = java.lang.String.valueOf(f307914e);
                        strArr[2] = animator != null ? animator.getClass().getName() : null;
                        ap.a.a(1, "errTrackAnimator", th6, linkedHashMap, strArr);
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            cls2 = cls;
        }
        java.lang.Class<?>[] interfaces2 = cls2.getInterfaces();
        kotlin.jvm.internal.o.f(interfaces2, "getInterfaces(...)");
        int length2 = interfaces2.length;
        int i19 = 0;
        while (true) {
            if (i19 >= length2) {
                cls4 = null;
                break;
            }
            cls4 = interfaces2[i19];
            if (r26.i0.n(cls4.getName(), "$AnimationFrameCallback", false)) {
                break;
            } else {
                i19++;
            }
        }
        kotlin.jvm.internal.o.d(cls4);
        f307911b = cls4;
    }
}
