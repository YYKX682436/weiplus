package df2;

/* loaded from: classes3.dex */
public final class vd extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231594m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231594m = "LiveAutoOpenProductDetailController";
    }

    public final void Z6(android.view.ViewGroup viewGroup) {
        android.content.Intent intent;
        byte[] byteArrayExtra;
        android.content.Intent intent2;
        if (!((mm2.c1) business(mm2.c1.class)).a8()) {
            com.tencent.mars.xlog.Log.i(this.f231594m, "tryDoProductAction but live is not started");
            return;
        }
        com.tencent.mm.ui.MMActivity N6 = N6();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = null;
        java.lang.Integer valueOf = (N6 == null || (intent2 = N6.getIntent()) == null) ? null : java.lang.Integer.valueOf(intent2.getIntExtra("KEY_PARAMS_DO_ACTION", 0));
        if (valueOf != null && valueOf.intValue() == 19) {
            com.tencent.mm.ui.MMActivity N62 = N6();
            if (N62 != null && (intent = N62.getIntent()) != null && (byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_AUTO_OPEN_JUMP_INFO")) != null) {
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                try {
                    finderJumpInfo2.parseFrom(byteArrayExtra);
                    finderJumpInfo = finderJumpInfo2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            if (finderJumpInfo == null) {
                return;
            }
            android.content.Context context = viewGroup.getContext();
            i95.m c17 = i95.n0.c(c61.yb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            kotlin.jvm.internal.o.d(context);
            r45.ac4 ac4Var = new r45.ac4();
            ac4Var.set(1, finderJumpInfo);
            c61.yb.Yi((c61.yb) c17, context, ac4Var, null, null, 8, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        java.lang.Object obj = this.f291099e;
        android.view.ViewGroup viewGroup = obj instanceof android.view.ViewGroup ? (android.view.ViewGroup) obj : null;
        if (viewGroup != null) {
            Z6(viewGroup);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        Z6(pluginLayout);
    }
}
