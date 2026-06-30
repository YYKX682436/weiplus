package cw2;

/* loaded from: classes2.dex */
public interface ca {
    static /* synthetic */ void d(cw2.ca caVar, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enterSeekMode");
        }
        if ((i17 & 1) != 0) {
            str = "";
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        caVar.f(str, z17);
    }

    void b(float f17);

    void f(java.lang.String str, boolean z17);

    int getCurrentProgress();

    int getDragStyle();

    void h(float f17, long j17, long j18);

    boolean i();

    boolean l();

    void n(com.tencent.mm.plugin.finder.storage.FeedData feedData);

    void o(float f17, int i17, int i18);

    void onVideoEnded();

    void p(int i17, int i18);

    boolean r();

    void setProgress(int i17);

    void setSeekBarCallback(cw2.ba baVar);

    void setVisibility(int i17);

    void t(java.lang.String str);
}
