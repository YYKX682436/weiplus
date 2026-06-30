package kd3;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final kd3.c f306874a = new kd3.c();

    public final java.util.List a(java.lang.String bizName) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        java.util.List V0 = kz5.n0.V0(kz5.c0.i(new ce3.a(bizName), new ce3.d(bizName), new kd3.b(), new kd3.a(), new md3.t(), new rd3.j(), new rd3.k(), new sd3.c(), new sd3.b()));
        if (kotlin.jvm.internal.o.b(bizName, "MagicAdBrandService") || kotlin.jvm.internal.o.b(bizName, "MagicEcsTimeline")) {
            ((java.util.ArrayList) V0).addAll(kz5.c0.i(new md3.a0(), new md3.b0(), new md3.c(), new md3.o(), new qd3.b(), new vd3.c(), new md3.w()));
        }
        return V0;
    }
}
