package zv2;

/* loaded from: classes10.dex */
public final class a0 extends zv2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.appcompat.app.AppCompatActivity activity, com.tencent.mm.plugin.finder.view.FinderJumperView jumpView) {
        super(activity, jumpView);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        r45.lp2 lp2Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        r45.k74 lite_app_info;
        m92.b j37 = g92.a.j3(g92.b.f269769e, xy2.c.e(this.f476395d), false, 2, null);
        if (j37 == null || (lp2Var = (r45.lp2) j37.u0().getCustom(58)) == null || (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) lp2Var.getCustom(1)) == null || (lite_app_info = finderJumpInfo.getLite_app_info()) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.ta.f(ya2.e1.f460472a, this.f476395d, lite_app_info.getString(0), lite_app_info.getString(1), lite_app_info.getString(2), false, false, lite_app_info.getBoolean(7), lite_app_info.getString(10), new zv2.x(this), 48, null);
    }

    @Override // zv2.b
    public void d(com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f476397f;
        if (finderJumpInfo == null || (str = finderJumpInfo.getWording()) == null) {
            str = "";
        }
        com.tencent.mm.plugin.finder.view.FinderJumperView.c(this.f476396e, str, false, 2, null);
    }

    @Override // zv2.b
    public void f() {
        super.f();
        com.tencent.mm.plugin.finder.view.FinderJumperView finderJumperView = this.f476396e;
        finderJumperView.setDefaultIconId(com.tencent.mm.R.raw.finder_playlist_regular);
        finderJumperView.setFilledIconId(com.tencent.mm.R.raw.finder_playlist_filled);
    }

    @Override // zv2.b
    public void g() {
        int i17;
        com.tencent.mm.protocal.protobuf.NativeInfo native_info;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = this.f476397f;
        java.lang.String necessary_params = (finderJumpInfo == null || (native_info = finderJumpInfo.getNative_info()) == null) ? null : native_info.getNecessary_params();
        boolean z17 = true;
        if (necessary_params == null || necessary_params.length() == 0) {
            return;
        }
        com.tencent.mm.protobuf.e fromJson = new r45.vx0().fromJson(necessary_params);
        r45.vx0 vx0Var = fromJson instanceof r45.vx0 ? (r45.vx0) fromJson : null;
        if (vx0Var == null) {
            return;
        }
        com.tencent.mm.plugin.finder.playlist.d2 d2Var = new com.tencent.mm.plugin.finder.playlist.d2(0L, null, "", true, vx0Var, null, "", vx0Var.getString(20));
        d2Var.f122290j = true;
        androidx.appcompat.app.AppCompatActivity activity = this.f476395d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.playlist.w1 w1Var = (com.tencent.mm.plugin.finder.playlist.w1) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.playlist.w1.class);
        if (w1Var != null) {
            int c17 = com.tencent.mm.ui.bl.c(activity == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : activity);
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i18 = b17.x;
            int i19 = b17.y;
            java.lang.System.nanoTime();
            if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
                z17 = false;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (z17) {
                i17 = i19 - c17;
            } else {
                if (i19 >= i18) {
                    i18 = i19;
                }
                i17 = i18 - c17;
            }
            w1Var.S6(d2Var, 0, 0, (int) (i17 * kx2.a.f313278a.a(activity)));
        }
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f401398a.a(this.f476395d, kz5.c0.i(new ry2.f(1, 0, 0, new zv2.y(this), null, 22, null), new ry2.f(2, com.tencent.mm.R.color.Red_100, 0, new zv2.z(this), null, 20, null)), null);
    }
}
