package xc2;

/* loaded from: classes2.dex */
public class b1 extends xc2.o {
    @Override // xc2.j
    public void l() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.protocal.protobuf.NativeInfo native_info;
        java.lang.String necessary_params;
        xc2.p0 p0Var = this.f453162b;
        if (p0Var == null || (finderJumpInfo = p0Var.f453234a) == null || (native_info = finderJumpInfo.getNative_info()) == null) {
            return;
        }
        if (!(native_info.getNative_type() == 25)) {
            native_info = null;
        }
        if (native_info == null || (necessary_params = native_info.getNecessary_params()) == null) {
            return;
        }
        try {
            su4.z0 z0Var = (su4.z0) i95.n0.c(su4.z0.class);
            int optInt = new cl0.g(necessary_params).optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            cl0.g gVar = new cl0.g();
            gVar.h("necessaryParams", necessary_params);
            ((sg0.a2) z0Var).fj(optInt, 14, gVar);
            "HotspotEventHandler, doPreload search，params: ".concat(necessary_params);
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // xc2.j
    public int p() {
        return 1;
    }
}
