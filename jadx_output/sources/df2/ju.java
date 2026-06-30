package df2;

/* loaded from: classes3.dex */
public final class ju extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public if2.d0 f230499m;

    /* renamed from: n, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230500n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public static final android.view.View Z6(df2.ju juVar) {
        android.view.ViewGroup c76 = juVar.c7();
        if (c76 != null) {
            return c76.findViewById(com.tencent.mm.R.id.rc8);
        }
        return null;
    }

    public static final android.view.View a7(df2.ju juVar) {
        android.view.ViewGroup c76 = juVar.c7();
        if (c76 != null) {
            return c76.findViewById(com.tencent.mm.R.id.fjj);
        }
        return null;
    }

    public static final android.widget.TextView b7(df2.ju juVar) {
        android.view.ViewGroup c76 = juVar.c7();
        if (c76 != null) {
            return (android.widget.TextView) c76.findViewById(com.tencent.mm.R.id.f484806fl2);
        }
        return null;
    }

    public final android.view.ViewGroup c7() {
        return (android.view.ViewGroup) T6(com.tencent.mm.R.id.f484808fl4, com.tencent.mm.R.id.f484807fl3);
    }

    public final void d7() {
        if2.d0 d0Var = this.f230499m;
        if (d0Var != null) {
            d0Var.d(8);
        }
        android.view.ViewGroup c76 = c7();
        if (c76 != null) {
            c76.setOnClickListener(df2.au.f229752d);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        r45.ku1 ku1Var = new r45.ku1();
        ku1Var.set(0, java.lang.Long.valueOf(((mm2.e1) business(mm2.e1.class)).f328983m));
        ku1Var.set(1, xy2.c.e(O6()));
        dk2.ef.f233392k.e(24, ku1Var, new df2.iu(this, r45.lu1.class), false);
        android.view.ViewGroup c76 = c7();
        if (c76 != null) {
            if2.d0 d0Var = new if2.d0(c76, new df2.bu());
            this.f291103i = new df2.cu(d0Var);
            this.f230499m = d0Var;
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        d7();
        kotlinx.coroutines.r2 r2Var = this.f230500n;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        dk2.ef.f233392k.f(24);
        this.f230499m = null;
    }
}
