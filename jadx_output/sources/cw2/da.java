package cw2;

/* loaded from: classes2.dex */
public interface da extends zy2.g5 {
    ig2.n E(long j17, long j18);

    boolean F();

    void G();

    boolean K();

    float getAlpha();

    android.graphics.Bitmap getBitmap();

    /* renamed from: getContextTag */
    int getF124907z();

    android.widget.ImageView getCoverImage();

    ls5.m getEventDetector();

    int getHeight();

    boolean getIsNeverStart();

    boolean getIsShouldPlayResume();

    android.view.ViewParent getParentView();

    java.lang.Object getPlayer();

    java.lang.Object getTag();

    java.lang.Object getTag(int i17);

    cw2.y9 getVideoAdapter();

    java.lang.String getVideoMediaId();

    /* renamed from: getVideoMediaInfo */
    cw2.wa getF124897p();

    int getWidth();

    void i();

    /* renamed from: m */
    boolean getF124901t();

    void n(mn2.j4 j4Var, boolean z17, com.tencent.mm.plugin.finder.storage.FeedData feedData);

    void p();

    default void s(mn0.d0 scene, int i17) {
        kotlin.jvm.internal.o.g(scene, "scene");
    }

    void setAlpha(float f17);

    void setContextTag(int i17);

    void setFinderVideoPlayTrace(kz2.a aVar);

    void setInterceptDetach(boolean z17);

    void setIsShouldPlayResume(boolean z17);

    void setIsShowBasicControls(boolean z17);

    void setPreloadedView(boolean z17);

    void setPreview(boolean z17);

    void setScaleType(com.tencent.mm.pluginsdk.ui.e1 e1Var);

    void setTag(int i17, java.lang.Object obj);

    void setTag(java.lang.Object obj);

    void setVideoMuteListener(cw2.xa xaVar);

    void setVideoPlayLifecycle(cw2.fb fbVar);

    int w();

    default void x(mn0.b0 txPlayer, int i17, int i18, long j17, java.lang.Float f17) {
        kotlin.jvm.internal.o.g(txPlayer, "txPlayer");
    }

    /* renamed from: y */
    boolean getIsPreloadedView();
}
