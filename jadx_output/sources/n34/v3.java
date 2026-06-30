package n34;

/* loaded from: classes4.dex */
public final class v3 {

    /* renamed from: l, reason: collision with root package name */
    public static final n34.n3 f334748l = new n34.n3(null);

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView f334749a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f334750b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f334751c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f334752d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f334753e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.OnlineVideoView f334754f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f334755g;

    /* renamed from: h, reason: collision with root package name */
    public r45.jj4 f334756h;

    /* renamed from: i, reason: collision with root package name */
    public int f334757i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f334758j = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public final n34.o3 f334759k = new n34.o3(this);

    public static final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView a(n34.v3 v3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSeekBarView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = v3Var.f334749a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSeekBarView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        return heroSeekBarView;
    }

    public final void b(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (configuration != null && configuration.orientation == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutLandScape", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = this.f334754f;
            android.view.View videoContainer = onlineVideoView != null ? onlineVideoView.getVideoContainer() : null;
            if (videoContainer == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutLandScape", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
            } else {
                com.tencent.mm.ui.kk.d(videoContainer, 0);
                com.tencent.mm.ui.kk.f(videoContainer, 0);
                videoContainer.requestLayout();
                com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = this.f334749a;
                if (heroSeekBarView == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutLandScape", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                } else {
                    int h17 = i65.a.h(this.f334753e, com.tencent.mm.R.dimen.ajf);
                    heroSeekBarView.setPadding(h17, heroSeekBarView.getPaddingTop(), h17, i65.a.h(this.f334753e, com.tencent.mm.R.dimen.ajw));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutLandScape", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                }
            }
        } else {
            if (configuration != null && configuration.orientation == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                r45.jj4 jj4Var = this.f334756h;
                if (jj4Var == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                } else {
                    r45.lj4 lj4Var = jj4Var.f377865p;
                    if (lj4Var == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                    } else if (lj4Var.f379520d <= 0.0f || lj4Var.f379521e <= 0.0f) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                    } else {
                        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView2 = this.f334749a;
                        if (heroSeekBarView2 == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                        } else {
                            android.app.Activity activity = this.f334753e;
                            android.view.WindowManager windowManager = (android.view.WindowManager) (activity != null ? activity.getSystemService("window") : null);
                            if (windowManager == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                            } else {
                                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                                int i17 = displayMetrics.widthPixels;
                                int i18 = displayMetrics.heightPixels;
                                if (i18 <= 0) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                } else {
                                    int i19 = this.f334757i;
                                    int h18 = i65.a.h(this.f334753e, com.tencent.mm.R.dimen.aii);
                                    heroSeekBarView2.setPadding(h18, heroSeekBarView2.getPaddingTop(), h18, heroSeekBarView2.getPaddingBottom());
                                    android.widget.ImageView imageView = this.f334750b;
                                    if (imageView != null) {
                                        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                                        layoutParams.height = i65.a.b(this.f334753e, 170) + i19;
                                        imageView.setLayoutParams(layoutParams);
                                    }
                                    int p17 = com.tencent.mm.ui.bk.p(this.f334753e);
                                    r45.lj4 lj4Var2 = jj4Var.f377865p;
                                    float f17 = lj4Var2.f379520d;
                                    float f18 = lj4Var2.f379521e;
                                    int i27 = f17 / f18 > ((float) (i17 / i18)) ? (int) ((f18 * i17) / f17) : i18;
                                    int i28 = i18 - i27;
                                    int i29 = i28 / 2;
                                    n34.n3 n3Var = f334748l;
                                    int a17 = n3Var.a(this.f334753e, this.f334752d, true);
                                    int i37 = a17 + i19;
                                    if (i29 > i37) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                    } else if (((i28 - a17) - p17) - i19 >= 0) {
                                        int i38 = i37 - i29;
                                        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2 = this.f334754f;
                                        android.view.View videoContainer2 = onlineVideoView2 != null ? onlineVideoView2.getVideoContainer() : null;
                                        if (videoContainer2 == null) {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                        } else {
                                            c(videoContainer2, i38);
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                        }
                                    } else {
                                        int a18 = n3Var.a(this.f334753e, false, false);
                                        if (!this.f334752d || ((i28 - i19) - p17) - a18 < 0) {
                                            int h19 = i65.a.h(this.f334753e, com.tencent.mm.R.dimen.ajw);
                                            int i39 = (i18 - p17) - i27;
                                            if ((i39 - h19) - i19 > 0) {
                                                int i47 = (i19 + h19) - i29;
                                                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView3 = this.f334754f;
                                                android.view.View videoContainer3 = onlineVideoView3 != null ? onlineVideoView3.getVideoContainer() : null;
                                                if (videoContainer3 == null) {
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                                } else {
                                                    c(videoContainer3, i47);
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                                }
                                            } else if (i39 > 0) {
                                                int i48 = i39 - i29;
                                                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView4 = this.f334754f;
                                                android.view.View videoContainer4 = onlineVideoView4 != null ? onlineVideoView4.getVideoContainer() : null;
                                                if (videoContainer4 == null) {
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                                } else {
                                                    c(videoContainer4, i48);
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                                }
                                            } else {
                                                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView5 = this.f334754f;
                                                android.view.View videoView = onlineVideoView5 != null ? onlineVideoView5.getVideoView() : null;
                                                if (videoView == null) {
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                                } else {
                                                    android.view.ViewGroup.LayoutParams layoutParams2 = videoView.getLayoutParams();
                                                    kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                                                    android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) layoutParams2;
                                                    layoutParams3.addRule(12);
                                                    videoView.setLayoutParams(layoutParams3);
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                                }
                                            }
                                        } else {
                                            int i49 = (a18 + i19) - i29;
                                            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView6 = this.f334754f;
                                            android.view.View videoContainer5 = onlineVideoView6 != null ? onlineVideoView6.getVideoContainer() : null;
                                            if (videoContainer5 == null) {
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                            } else {
                                                c(videoContainer5, i49);
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
    }

    public final void c(android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewMargin", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (i17 > 0) {
            com.tencent.mm.ui.kk.d(view, i17 * 2);
            view.requestLayout();
        } else {
            com.tencent.mm.ui.kk.f(view, (-i17) * 2);
            view.requestLayout();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewMargin", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
    }
}
