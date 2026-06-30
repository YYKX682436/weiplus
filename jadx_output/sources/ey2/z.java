package ey2;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ey2.b0 f257587d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ey2.b0 b0Var) {
        super(0);
        this.f257587d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ey2.b0 b0Var = this.f257587d;
        b0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_START_HALF_ACTIVITY_PREFERENCE", "settings_finder_switch");
        java.lang.Long l17 = b0Var.f257324d ? com.tencent.mm.ui.t2.f209871e : com.tencent.mm.ui.t2.f209869c;
        kotlin.jvm.internal.o.d(l17);
        intent.putExtra("KEY_ENTER_SCENE", l17.longValue());
        i95.m c17 = i95.n0.c(wd0.z1.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ((vd0.o3) ((wd0.z1) c17)).Zi(b0Var.getContext(), intent);
        return java.lang.Boolean.FALSE;
    }
}
