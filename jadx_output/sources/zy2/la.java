package zy2;

/* loaded from: classes8.dex */
public interface la {
    static /* synthetic */ java.util.HashMap M(zy2.la laVar, java.lang.String str, java.util.List list, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectFindTabRedDot");
        }
        if ((i17 & 2) != 0) {
            list = null;
        }
        return laVar.d(str, list);
    }

    void F0(boolean z17, com.tencent.mm.plugin.finder.extension.reddot.e3 e3Var);

    void M0(android.app.Activity activity);

    void Q0(com.tencent.mm.autogen.events.RedDotExposureEventEvent redDotExposureEventEvent);

    void U(r45.at2 at2Var);

    void V();

    void Z();

    java.util.HashMap d(java.lang.String str, java.util.List list);

    zy2.ga e0();

    void j();

    void k0();

    void n(int i17, boolean z17);

    void p0();

    void prepare();

    void q(com.tencent.mm.plugin.finder.extension.reddot.b3 b3Var);

    void r(com.tencent.mm.plugin.finder.extension.reddot.b3 b3Var, com.tencent.mm.ui.base.preference.h0 h0Var);

    void s(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference, com.tencent.mm.ui.base.preference.n0 n0Var);

    void s0();
}
