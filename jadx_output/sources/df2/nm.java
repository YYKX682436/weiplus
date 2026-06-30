package df2;

/* loaded from: classes3.dex */
public final class nm extends if2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public final void Z6(com.tencent.mm.protocal.protobuf.FinderJumpInfo info) {
        android.view.ViewGroup rootView;
        android.content.Context context;
        com.tencent.mm.plugin.finder.live.view.ub ubVar;
        qo0.c liveStatus;
        com.tencent.mm.protocal.protobuf.NativeInfo native_info;
        com.tencent.mm.protocal.protobuf.NativeInfo native_info2;
        kotlin.jvm.internal.o.g(info, "info");
        r45.ac4 ac4Var = new r45.ac4();
        ac4Var.set(1, info);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ac4Var.getCustom(1);
        if ((finderJumpInfo == null || (native_info2 = finderJumpInfo.getNative_info()) == null || native_info2.getNative_type() != 57) ? false : true) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) ac4Var.getCustom(1);
            com.tencent.mm.protobuf.g necessary_params_bytes = (finderJumpInfo2 == null || (native_info = finderJumpInfo2.getNative_info()) == null) ? null : native_info.getNecessary_params_bytes();
            if (necessary_params_bytes == null || necessary_params_bytes.f192156a.length == 0) {
                com.tencent.mars.xlog.Log.i("FinderLiveJumpPlugin", "no necessary_params_bytes");
            } else {
                r45.u84 u84Var = new r45.u84();
                try {
                    u84Var.parseFrom(necessary_params_bytes.g());
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
                if (u84Var.getInteger(0) == 13 && (ubVar = this.f291099e) != null && (liveStatus = ubVar.getLiveStatus()) != null) {
                    qo0.c.a(liveStatus, qo0.b.f365349f2, null, 2, null);
                }
            }
        }
        com.tencent.mm.plugin.finder.live.view.ub ubVar2 = this.f291099e;
        if (ubVar2 == null || (rootView = ubVar2.rootView()) == null || (context = rootView.getContext()) == null) {
            return;
        }
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Bi(context, ac4Var, null, null);
    }
}
