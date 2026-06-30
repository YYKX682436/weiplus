package te2;

/* loaded from: classes3.dex */
public interface j0 extends fs2.a, te2.l0 {
    static /* synthetic */ void M3(te2.j0 j0Var, dk2.vg vgVar, int i17, boolean z17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playMusic");
        }
        if ((i18 & 4) != 0) {
            z17 = true;
        }
        ((te2.p1) j0Var).m(vgVar, i17, z17);
    }

    static /* synthetic */ void N4(te2.j0 j0Var, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMusicView");
        }
        if ((i17 & 1) != 0) {
            str = "";
        }
        ((te2.p1) j0Var).s(str);
    }
}
