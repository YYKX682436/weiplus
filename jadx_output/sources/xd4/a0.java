package xd4;

/* loaded from: classes4.dex */
public final class a0 implements xd4.f {

    /* renamed from: a, reason: collision with root package name */
    public final n34.v3 f453625a = new n34.v3();

    @Override // xd4.f
    public int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoMoveMargin", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        this.f453625a.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoVideoMoveMargin", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoVideoMoveMargin", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoMoveMargin", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        return 0;
    }

    @Override // xd4.f
    public void b(android.app.Activity context, android.view.ViewStub stub, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineView, r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(stub, "stub");
        kotlin.jvm.internal.o.g(onlineView, "onlineView");
        stub.setLayoutResource(com.tencent.mm.R.layout.epl);
        stub.inflate();
        n34.v3 v3Var = this.f453625a;
        v3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        android.view.WindowInsets rootWindowInsets = context.getWindow().getDecorView().getRootWindowInsets();
        if (rootWindowInsets != null) {
            rootWindowInsets.getSystemWindowInsetBottom();
        }
        v3Var.f334756h = jj4Var;
        v3Var.f334754f = onlineView;
        v3Var.f334753e = context;
        android.view.KeyEvent.Callback videoView = onlineView.getVideoView();
        v3Var.f334755g = videoView instanceof com.tencent.mm.pluginsdk.ui.tools.f4 ? (com.tencent.mm.pluginsdk.ui.tools.f4) videoView : null;
        android.app.Activity activity = v3Var.f334753e;
        v3Var.f334750b = activity != null ? (android.widget.ImageView) activity.findViewById(com.tencent.mm.R.id.gzz) : null;
        android.app.Activity activity2 = v3Var.f334753e;
        v3Var.f334749a = activity2 != null ? (com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView) activity2.findViewById(com.tencent.mm.R.id.ncv) : null;
        android.app.Activity activity3 = v3Var.f334753e;
        v3Var.f334751c = activity3 != null ? activity3.findViewById(com.tencent.mm.R.id.n_0) : null;
        android.app.Activity activity4 = v3Var.f334753e;
        if (activity4 != null) {
        }
        android.app.Activity activity5 = v3Var.f334753e;
        com.tencent.mm.ui.widget.InsectLinearLayout insectLinearLayout = activity5 != null ? (com.tencent.mm.ui.widget.InsectLinearLayout) activity5.findViewById(com.tencent.mm.R.id.u4v) : null;
        if (insectLinearLayout != null) {
            insectLinearLayout.setInsectCallback(new n34.p3(v3Var));
        }
        android.app.Activity activity6 = v3Var.f334753e;
        android.widget.TextView textView = activity6 != null ? (android.widget.TextView) activity6.findViewById(com.tencent.mm.R.id.u2b) : null;
        android.app.Activity activity7 = v3Var.f334753e;
        android.widget.TextView textView2 = activity7 != null ? (android.widget.TextView) activity7.findViewById(com.tencent.mm.R.id.u2c) : null;
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = v3Var.f334749a;
        if (heroSeekBarView != null) {
            heroSeekBarView.setIndCurrentTimeTv(textView);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView2 = v3Var.f334749a;
        if (heroSeekBarView2 != null) {
            heroSeekBarView2.setIndTotalTimeTv(textView2);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView3 = v3Var.f334749a;
        if (heroSeekBarView3 != null) {
            heroSeekBarView3.setVisibleChangeListener(new n34.q3(v3Var));
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView4 = v3Var.f334749a;
        if (heroSeekBarView4 != null) {
            com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView.i(heroSeekBarView4, onlineView.getVideoSpeedRatio(), false, 2, null);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView5 = v3Var.f334749a;
        if (heroSeekBarView5 != null) {
            heroSeekBarView5.setVideoSpeedChangeListener(new n34.r3(onlineView));
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView6 = v3Var.f334749a;
        if (heroSeekBarView6 != null) {
            heroSeekBarView6.setHeroSeekBarChangeListener(new n34.s3(v3Var, onlineView));
        }
        onlineView.setSeekBarHelperCallback(new n34.t3(v3Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
            return;
        }
        int b17 = a06.d.b(jj4Var.R) * 1000;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoShowSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_show_seekbar_duration, 16000);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoConfig", "getSnsVideoShowSeekBarDurationMs: " + Ni);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoShowSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showSeekBarIfLessThanLimit", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(Ni);
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = v3Var.f334755g;
        objArr[1] = f4Var != null ? java.lang.Integer.valueOf(f4Var.getDuration()) : null;
        objArr[2] = java.lang.Integer.valueOf(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsOnlineSeekBarHelper", "showSeekBarIfLessThanLimit limit:%d current:%d total:%d", objArr);
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView7 = v3Var.f334749a;
        if (heroSeekBarView7 != null) {
            heroSeekBarView7.setTotalTimeMs(b17);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView8 = v3Var.f334749a;
        if (heroSeekBarView8 != null) {
            heroSeekBarView8.setVisibility(0);
        }
        android.widget.ImageView imageView = v3Var.f334750b;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView9 = v3Var.f334749a;
        if (heroSeekBarView9 != null) {
            heroSeekBarView9.setVideoPlayDurationProvider(new n34.u3(v3Var));
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView10 = v3Var.f334749a;
        if (heroSeekBarView10 != null) {
            heroSeekBarView10.setInitVisible(ca4.z0.g0() || b17 >= Ni);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView11 = v3Var.f334749a;
        if (heroSeekBarView11 != null) {
            heroSeekBarView11.f();
        }
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView12 = v3Var.f334749a;
        if (heroSeekBarView12 != null) {
            kotlin.jvm.internal.o.d(v3Var.f334755g);
            heroSeekBarView12.setEnableDrag(!android.text.TextUtils.isEmpty(r11.getF174598m()));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showSeekBarIfLessThanLimit", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
    }

    @Override // xd4.f
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeSeekBarVisible", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        n34.v3 v3Var = this.f453625a;
        v3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeSeekBarVisible", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = v3Var.f334749a;
        if (heroSeekBarView != null) {
            heroSeekBarView.setInitVisible(i17 == 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeSeekBarVisible", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeSeekBarVisible", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
    }

    @Override // xd4.f
    public void d(x25.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReporter", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        n34.v3 v3Var = this.f453625a;
        v3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReporter", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = v3Var.f334749a;
        if (heroSeekBarView != null) {
            heroSeekBarView.setReporter(bVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReporter", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReporter", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
    }

    @Override // xd4.f
    public void destroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        n34.v3 v3Var = this.f453625a;
        v3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView heroSeekBarView = v3Var.f334749a;
        if (heroSeekBarView != null) {
            heroSeekBarView.isSeekBarActive = false;
            wu5.c cVar = heroSeekBarView.hideTask;
            if (cVar != null) {
                cVar.cancel(false);
            }
        }
        v3Var.f334754f = null;
        v3Var.f334753e = null;
        v3Var.f334749a = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
    }

    @Override // xd4.f
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        this.f453625a.b(configuration);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
    }
}
