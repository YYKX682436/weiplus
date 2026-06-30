package qo0;

/* loaded from: classes3.dex */
public abstract class a implements to0.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f365323d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f365324e;

    public a(android.view.ViewGroup root, qo0.c broadcast) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(broadcast, "broadcast");
        this.f365323d = root;
        this.f365324e = new java.util.HashMap();
        broadcast.registerPlugin(this);
    }

    public static boolean t0(qo0.a aVar, java.lang.String permission, int i17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkPermission");
        }
        if ((i19 & 4) != 0) {
            i18 = aVar.hashCode();
        }
        aVar.getClass();
        kotlin.jvm.internal.o.g(permission, "permission");
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = aVar.f365323d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a((android.app.Activity) context, permission, i17, "", "");
        if (!a17) {
            aVar.f365324e.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        }
        return a17;
    }

    public void A0(int i17, int i18, android.content.Intent intent) {
    }

    public boolean B0() {
        return false;
    }

    public void C0(java.util.LinkedHashMap micUserMap) {
        kotlin.jvm.internal.o.g(micUserMap, "micUserMap");
    }

    public abstract void E0(int i17);

    public void F0(int i17, int i18, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
    }

    public void G0(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        java.lang.Integer num = (java.lang.Integer) this.f365324e.get(java.lang.Integer.valueOf(i17));
        if (num == null) {
            num = 0;
        }
        F0(i17, num.intValue(), permissions, grantResults);
    }

    public boolean H0() {
        return false;
    }

    public void I0() {
    }

    public void J0() {
    }

    public abstract void K0(int i17);

    public void L0() {
    }

    public abstract void M0(qo0.b bVar, android.os.Bundle bundle);

    public void N0() {
    }

    public abstract void O0();

    @Override // to0.a
    public abstract java.lang.String name();

    public void s0(int i17, int i18, android.os.Bundle bundle) {
    }

    public int u0() {
        android.content.Context context = this.f365323d.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation();
    }

    public final android.view.ViewGroup v0() {
        return this.f365323d;
    }

    public int w0() {
        return this.f365323d.getVisibility();
    }

    public boolean x0() {
        return this.f365323d.getContext().getResources().getConfiguration().orientation == 2;
    }

    public void y0(boolean z17, int i17) {
    }

    public abstract void z0();
}
