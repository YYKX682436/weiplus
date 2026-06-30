package km4;

/* loaded from: classes11.dex */
public final class s extends rk4.y3 {

    /* renamed from: f, reason: collision with root package name */
    public static final km4.r f309318f = new km4.r(null);

    public s() {
        super(null, 1, null);
    }

    public final void a(java.util.Map map) {
        java.util.Map map2;
        if (map == null || (map2 = this.f397098e) == null) {
            return;
        }
        map2.putAll(map);
    }

    public final void d(bw5.f20 bizType) {
        kotlin.jvm.internal.o.g(bizType, "bizType");
        bw5.j20 j20Var = this.f443458d;
        j20Var.f28772e = bizType;
        j20Var.f28775h[2] = true;
    }

    public final void e(java.lang.String routerName) {
        kotlin.jvm.internal.o.g(routerName, "routerName");
        bw5.j20 j20Var = this.f443458d;
        j20Var.f28773f = routerName;
        j20Var.f28775h[3] = true;
    }
}
