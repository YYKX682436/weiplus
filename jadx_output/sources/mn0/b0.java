package mn0;

/* loaded from: classes10.dex */
public interface b0 extends ls5.m {
    static /* synthetic */ void B(mn0.b0 b0Var, com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setPlayerView");
        }
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        ((mn0.y) b0Var).O(tXCloudVideoView, aVar);
    }

    static /* synthetic */ void C(mn0.b0 b0Var, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stopPlay");
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        if ((i17 & 4) != 0) {
            z19 = false;
        }
        ((mn0.y) b0Var).T(z17, z18, z19);
    }

    static /* synthetic */ void D(mn0.b0 b0Var, java.lang.String str, int i17, r45.ka4 ka4Var, r45.p72 p72Var, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPlay");
        }
        if ((i18 & 8) != 0) {
            p72Var = null;
        }
        ((mn0.y) b0Var).R(str, i17, ka4Var, p72Var, (i18 & 16) != 0 ? false : z17, (i18 & 32) != 0 ? false : z18);
    }

    static /* synthetic */ void L(mn0.b0 b0Var, r45.nw1 nw1Var, r45.p72 p72Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPlay");
        }
        if ((i17 & 2) != 0) {
            p72Var = null;
        }
        ((mn0.y) b0Var).S(nw1Var, p72Var);
    }

    static /* synthetic */ void M(mn0.b0 b0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        ((mn0.y) b0Var).s(z17);
    }

    void A(int i17, int i18);

    void I(java.lang.String str);

    void callExperimentalAPI(java.lang.String str);

    void v(android.view.Surface surface, int i17, int i18);

    void z(com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView, int i17, int i18);
}
