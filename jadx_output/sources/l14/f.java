package l14;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final l14.f f315010a = new l14.f();

    public final void a(int i17, r45.ov6 userAuthApp) {
        kotlin.jvm.internal.o.g(userAuthApp, "userAuthApp");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = userAuthApp.f382560d;
        objArr[2] = userAuthApp.f382561e;
        objArr[3] = java.lang.String.valueOf(userAuthApp.f382562f);
        java.util.LinkedList linkedList = userAuthApp.f382563g;
        objArr[4] = linkedList == null ? "" : kz5.n0.g0(linkedList, ";", null, null, 0, null, k14.i0.f303341d, 30, null);
        g0Var.d(24370, objArr);
    }
}
