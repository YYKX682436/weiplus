package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public class fk extends com.tencent.mm.plugin.finder.profile.uic.i6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    public static /* synthetic */ void Q6(com.tencent.mm.plugin.finder.profile.uic.fk fkVar, r45.sd1 sd1Var, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: gotoLiteApp");
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        fkVar.P6(sd1Var, str);
    }

    public final int O6(int i17) {
        return java.lang.Math.max((int) ((com.tencent.mm.ui.bk.h(com.tencent.mm.sdk.platformtools.x2.f193071a).y - i17) * 0.3d), getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479718db));
    }

    public final void P6(r45.sd1 liteApp, java.lang.String str) {
        kotlin.jvm.internal.o.g(liteApp, "liteApp");
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String string = liteApp.getString(0);
        java.lang.String string2 = liteApp.getString(1);
        if (string2 == null) {
            string2 = "";
        }
        java.lang.String string3 = liteApp.getString(2);
        if (string3 == null) {
            string3 = "";
        }
        if (!(str == null || r26.n0.N(str))) {
            if (r26.n0.N(string3)) {
                string3 = "repostId=" + str;
            } else {
                string3 = string3 + "&repostId=" + str;
            }
        }
        java.lang.String string4 = liteApp.getString(4);
        if (string4 == null) {
            string4 = "";
        }
        bundle.putString("appId", string);
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, string2);
        bundle.putString("query", string3);
        bundle.putString("minVersion", string4);
        if (liteApp.getInteger(5) == 1) {
            bundle.putBoolean("forbidRightGesture", true);
            bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, true);
            bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477879e3);
            bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477877e1);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderTingProfileFragmentUIC", "gotoLiteApp appId: " + string + ", path: " + string2 + " query: " + string3);
        qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
        if (string == null) {
            string = "";
        }
        ((ef0.l4) i9Var).aj(string);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(getContext(), bundle, true, false, new com.tencent.mm.plugin.finder.profile.uic.ek(this));
    }
}
