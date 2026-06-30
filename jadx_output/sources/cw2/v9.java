package cw2;

/* loaded from: classes2.dex */
public interface v9 {
    static /* synthetic */ void j(cw2.v9 v9Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pause");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        v9Var.f(z17);
    }

    static /* synthetic */ void n(cw2.v9 v9Var, int i17, kz2.a aVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: play");
        }
        if ((i18 & 1) != 0) {
            i17 = 0;
        }
        if ((i18 & 2) != 0) {
            aVar = null;
        }
        if ((i18 & 4) != 0) {
            baseFinderFeed = null;
        }
        v9Var.m(i17, aVar, baseFinderFeed);
    }

    void f(boolean z17);

    java.lang.String g();

    cw2.h8 getPlayInfo();

    cw2.da getVideoView();

    /* renamed from: h */
    boolean getIsPreRenderFirstFrame();

    /* renamed from: isMute */
    boolean getIsMute();

    void m(int i17, kz2.a aVar, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed);

    void p(int i17);

    void setMute(boolean z17);

    void setSelectedToPlay(boolean z17);
}
