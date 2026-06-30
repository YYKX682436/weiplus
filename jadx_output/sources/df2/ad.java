package df2;

/* loaded from: classes3.dex */
public final class ad extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public if2.d0 f229707m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f229708n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final android.view.ViewGroup Z6() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) T6(com.tencent.mm.R.id.eju, com.tencent.mm.R.id.ejt);
        if (viewGroup == null) {
            return null;
        }
        viewGroup.setOnTouchListener(new df2.xc(this));
        return viewGroup;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        r45.yd5 yd5Var;
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        android.view.ViewGroup Z6 = Z6();
        if (Z6 != null) {
            if2.d0 d0Var = new if2.d0(Z6, new df2.vc());
            this.f291103i = new df2.wc(d0Var);
            this.f229707m = d0Var;
        }
        r45.j52 j52Var = ((mm2.c1) business(mm2.c1.class)).X;
        if (j52Var == null || (yd5Var = (r45.yd5) j52Var.getCustom(2)) == null) {
            return;
        }
        if (yd5Var.getLong(0) == 2) {
            java.lang.String string = yd5Var.getString(1);
            if (string == null || string.length() == 0) {
                return;
            }
            java.lang.String string2 = yd5Var.getString(1);
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String str = string2;
            long integer = 1000 * yd5Var.getInteger(3);
            kotlinx.coroutines.r2 r2Var = this.f229708n;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f229708n = com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.zc(this, str, integer, null), 3, null);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        if2.d0 d0Var = this.f229707m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        kotlinx.coroutines.r2 r2Var = this.f229708n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
