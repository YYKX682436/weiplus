package kh;

/* loaded from: classes12.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final kh.h f307816a = new kh.h();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.reflect.Field f307817b;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.reflect.Field f307818c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.reflect.Field f307819d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Field f307820e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.reflect.Field f307821f;

    public final java.lang.String a(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        if (!(animator instanceof android.animation.ObjectAnimator)) {
            return null;
        }
        android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) animator;
        if (!(objectAnimator.getTarget() instanceof android.view.View)) {
            return null;
        }
        java.lang.Object target = objectAnimator.getTarget();
        kotlin.jvm.internal.o.e(target, "null cannot be cast to non-null type android.view.View");
        return c((android.view.View) target);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b8 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(java.lang.Object r5) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.h.b(java.lang.Object):java.lang.String");
    }

    public final java.lang.String c(android.view.View view) {
        if (view == null) {
            return null;
        }
        java.lang.String name = view.getClass().getName();
        boolean z17 = false;
        if (!r26.i0.y(name, "android.", false) && !r26.i0.y(name, "androidx.", false) && !r26.i0.y(name, "java.", false) && !r26.i0.y(name, "dalvik.", false) && !r26.i0.y(name, "$Proxy", false)) {
            z17 = true;
        }
        if (z17) {
            return "vt-".concat(name);
        }
        try {
            return "vid-" + view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
