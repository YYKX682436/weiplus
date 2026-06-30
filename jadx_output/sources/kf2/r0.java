package kf2;

/* loaded from: classes.dex */
public final class r0 extends kf2.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f307296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(df2.k controller, com.tencent.mm.plugin.lite.s liteAppStore) {
        super(controller, liteAppStore);
        kotlin.jvm.internal.o.g(controller, "controller");
        kotlin.jvm.internal.o.g(liteAppStore, "liteAppStore");
        this.f307296d = "GamePendantStartChannelLive";
    }

    @Override // kf2.x
    public boolean d(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        kn0.p pVar;
        kf2.w wVar = kf2.x.f307310c;
        java.lang.Integer b17 = wVar.b(obj, "live_entry_scene");
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        if (!((w0Var == null || (pVar = w0Var.D) == null || !pVar.f()) ? false : true)) {
            com.tencent.mars.xlog.Log.i(this.f307296d, "no float mode, ignore");
            return false;
        }
        if (b17 != null && b17.intValue() == 3) {
            f(1, null);
        } else if (b17 != null && b17.intValue() == 4) {
            f(0, null);
        } else if (b17 != null && b17.intValue() == 5) {
            f(2, null);
        } else if (b17 != null && b17.intValue() == 7) {
            f(3, null);
        } else if (b17 != null && b17.intValue() == 9) {
            f(5, null);
        } else if (b17 != null && b17.intValue() == 10) {
            f(6, null);
        } else if (b17 != null && b17.intValue() == 12) {
            f(11, null);
        } else if (b17 != null && b17.intValue() == 13) {
            f(14, null);
        } else if (b17 != null && b17.intValue() == 14) {
            f(15, wVar.c(obj, "url"));
        } else if (b17 != null && b17.intValue() == 15) {
            f(16, wVar.c(obj, "initDataFromGame"));
        }
        return false;
    }

    @Override // kf2.x
    public java.lang.String e() {
        return "StartChannelLive";
    }

    public final void f(int i17, java.lang.String str) {
        mm2.c1 c1Var = (mm2.c1) dk2.ef.f233372a.i(mm2.c1.class);
        long j17 = c1Var != null ? ((mm2.e1) c1Var.business(mm2.e1.class)).f328983m : 0L;
        com.tencent.mm.plugin.finder.live.controller.gamependant.GamePendantContainer gamePendantContainer = this.f307311a.f230525p;
        if (gamePendantContainer != null) {
            com.tencent.mars.xlog.Log.i(this.f307296d, "goAnchorUIWithAction " + i17 + ", params:" + str);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PARAMS_DO_ACTION", i17);
            if (str != null) {
                intent.putExtra("KEY_PARAMS_DO_ACTION_PARAMS", str);
            }
            em2.u.e(dk2.ef.f233386h, gamePendantContainer, false, j17, null, intent, 8, null);
        }
    }
}
