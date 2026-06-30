package yf2;

/* loaded from: classes3.dex */
public final class o extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f461756m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f461757n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f461758o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public static final void Z6(yf2.o oVar, long j17, long j18) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        if (oVar.f461757n) {
            return;
        }
        oVar.f461757n = true;
        com.tencent.mm.ui.MMActivity N6 = oVar.N6();
        if (N6 == null || N6.isFinishing() || N6.isDestroyed()) {
            com.tencent.mars.xlog.Log.w("Finder.CoLiveController", "handleInviteeLiveStarted: activity unavailable, abort");
            return;
        }
        mm2.n0 n0Var = (mm2.n0) oVar.business(mm2.n0.class);
        r45.f50 f50Var = (r45.f50) ((kotlinx.coroutines.flow.l2) n0Var.f329265g).getValue();
        java.lang.String username = (f50Var == null || (finderContact = f50Var.f374017h) == null) ? null : finderContact.getUsername();
        if (username == null || username.length() == 0) {
            com.tencent.mars.xlog.Log.e("Finder.CoLiveController", "handleInviteeLiveStarted: no initiator username, abort");
            com.tencent.mm.ui.widget.dialog.u3 u3Var = oVar.f461756m;
            if (u3Var != null) {
                if (!u3Var.isShowing()) {
                    u3Var = null;
                }
                if (u3Var != null) {
                    u3Var.dismiss();
                }
            }
            oVar.f461756m = null;
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.CoLiveController", "handleInviteeLiveStarted: objectId=" + j17 + ", liveId=" + j18 + ", initiator=" + username);
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = oVar.f461756m;
        if (u3Var2 != null) {
            if (!u3Var2.isShowing()) {
                u3Var2 = null;
            }
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
        oVar.f461756m = null;
        n0Var.f329274s = true;
        re2.e0 e0Var = re2.j1.f394438b;
        if (e0Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveTaskManager", "destroy: invitationId=" + e0Var.f394390c + ", phase=" + e0Var.f394389b);
            e0Var.a();
        }
        re2.j1.f394438b = null;
        n0Var.N6();
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.FALSE);
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Di(N6, new android.content.Intent(), username, null, wk0Var, null);
        N6.finish();
    }

    public static final void a7(yf2.o oVar) {
        r45.q12 q12Var = (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) oVar.business(mm2.g1.class)).f329068f).getValue();
        if (zl2.r4.f473950a.G1(q12Var)) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchToCoLiveModeIfNeeded: currentMode=");
        sb6.append(q12Var != null ? java.lang.Integer.valueOf(q12Var.getInteger(0)) : null);
        sb6.append(" → setLiveMode(CoLive)");
        com.tencent.mars.xlog.Log.i("Finder.CoLiveController", sb6.toString());
        r45.q12 q12Var2 = new r45.q12();
        q12Var2.set(0, 5);
        q12Var2.set(1, 1);
        yf2.m1 m1Var = (yf2.m1) oVar.getStore().controller(yf2.m1.class);
        if (m1Var != null) {
            m1Var.e7(q12Var2);
        }
        mm2.c1 c1Var = (mm2.c1) oVar.business(mm2.c1.class);
        if (c1Var.l7()) {
            com.tencent.mars.xlog.Log.i("Finder.CoLiveController", "switchToCoLiveModeIfNeeded: clear residual FLAG_AUDIO_MODE for CoLive");
            int i17 = (int) c1Var.f328866q;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            c1Var.p8(i17 & (-257));
            c1Var.D8(0);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.h(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.n(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.e(this, null), 3, null);
        kotlinx.coroutines.r2 r2Var = this.f461758o;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f461758o = com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.l(this, null), 3, null);
    }
}
