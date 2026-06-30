package tu2;

/* loaded from: classes10.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final tu2.r f422151d = new tu2.r();

    public r() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("短视频录制:");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        sb7.append(t70Var.L2());
        sb7.append("\n-----------------\n");
        sb6.append(sb7.toString());
        sb6.append("短视频相册:" + t70Var.K2() + "\n-----------------\n");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("长视频:");
        sb8.append(tu2.s.f422152a.i());
        sb6.append(sb8.toString());
        if (activity != null) {
            lu2.j jVar = lu2.j.f321376a;
            java.lang.String sb9 = sb6.toString();
            kotlin.jvm.internal.o.f(sb9, "toString(...)");
            jVar.a(activity, sb9, "");
        } else {
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, sb6.toString(), 1).show();
        }
        return jz5.f0.f302826a;
    }
}
