package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class SnsAdNativeLandingTestUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f166766h = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.VideoSightView f166767d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar f166768e;

    /* renamed from: f, reason: collision with root package name */
    public double f166769f = 0.0d;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f166770g = new com.tencent.mm.sdk.platformtools.n3();

    public static /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoSightView T6(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView = snsAdNativeLandingTestUI.f166767d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        return videoSightView;
    }

    public static void U6(com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI snsAdNativeLandingTestUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        snsAdNativeLandingTestUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        snsAdNativeLandingTestUI.f166767d.b(snsAdNativeLandingTestUI.f166769f);
        snsAdNativeLandingTestUI.f166767d.start();
        snsAdNativeLandingTestUI.f166770g.post(new com.tencent.mm.plugin.sns.ui.gd(snsAdNativeLandingTestUI));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        return com.tencent.mm.R.layout.f489494cq4;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
        super.onCreate(bundle);
        this.mController.J();
        getWindow().setFlags(1024, 1024);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.n59)).setOnClickListener(new com.tencent.mm.plugin.sns.ui.xc(this));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.n58);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) getContext().getSystemService("layout_inflater");
        android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
        int width = windowManager.getDefaultDisplay().getWidth();
        int height = windowManager.getDefaultDisplay().getHeight();
        java.lang.String Bi = ((n34.q2) ((p94.e0) i95.n0.c(p94.e0.class))).Bi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adId_image_");
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        sb6.append(com.tencent.mm.sdk.platformtools.w2.b("http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150".getBytes()));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = "adId_stream_" + com.tencent.mm.sdk.platformtools.w2.b("http://wxsnsdy.tc.qq.com/105/20210/snsdyvideodownload?filekey=30280201010421301f0201690402534804105d999cf2831eae6ca6e65b177800230f0204009297fd0400&amp;bizid=1023&amp;hy=SH&amp;fileparam=302c020101042530230204136ffd9302045719f85d02024ef202031e8d7f02030f42400204045a320a0201000400".getBytes());
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.cpx, (android.view.ViewGroup) null);
        inflate.setMinimumHeight(height);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.n4r);
        com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView = new com.tencent.mm.pluginsdk.ui.tools.VideoSightView(getContext());
        this.f166767d = videoSightView;
        videoSightView.setLoop(false);
        viewGroup2.addView(this.f166767d, 0, new android.widget.LinearLayout.LayoutParams(-1, -1));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.bottomMargin = com.tencent.mm.sdk.platformtools.j.d(getContext(), getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479888i1));
        com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar = new com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar(getContext());
        this.f166768e = snsAdNativeLandingPagesVideoPlayerLoadingBar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(snsAdNativeLandingPagesVideoPlayerLoadingBar, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        snsAdNativeLandingPagesVideoPlayerLoadingBar.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(snsAdNativeLandingPagesVideoPlayerLoadingBar, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f166767d.setPlayProgressCallback(true);
        ((android.view.ViewGroup) inflate).addView(this.f166768e, layoutParams);
        this.f166768e.setIplaySeekCallback(new com.tencent.mm.plugin.sns.ui.yc(this));
        this.f166768e.setOnPlayButtonClickListener(new com.tencent.mm.plugin.sns.ui.zc(this));
        this.f166768e.setIsPlay(this.f166767d.isPlaying());
        com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar snsAdNativeLandingPagesVideoPlayerLoadingBar2 = this.f166768e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(snsAdNativeLandingPagesVideoPlayerLoadingBar2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        snsAdNativeLandingPagesVideoPlayerLoadingBar2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(snsAdNativeLandingPagesVideoPlayerLoadingBar2, "com/tencent/mm/plugin/sns/ui/SnsAdNativeLandingTestUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f166768e.a(0);
        this.f166767d.setVideoCallback(new com.tencent.mm.plugin.sns.ui.bd(this));
        this.f166767d.setEnableConfigChanged(false);
        this.f166767d.setOnClickListener(new com.tencent.mm.plugin.sns.ui.cd(this));
        viewGroup.addView(inflate, new android.widget.LinearLayout.LayoutParams(width, height));
        this.f166767d.post(new com.tencent.mm.plugin.sns.ui.dd(this));
        new com.tencent.mm.plugin.sns.ui.md(Bi, sb7, com.tencent.mm.plugin.sns.model.l4.Tj(), new com.tencent.mm.plugin.sns.ui.ed(this), 0).execute("http://mmsns.qpic.cn/mmsns/pUBe8EmICSCsszwvTNz7XO46mx3SDurmV95hHIeQvib0AEVBGYU02Mg/150");
        new com.tencent.mm.plugin.sns.ui.md(Bi, str, com.tencent.mm.plugin.sns.model.l4.Tj(), new com.tencent.mm.plugin.sns.ui.fd(this), com.tencent.tmassistantsdk.downloadservice.Downloads.SPLIT_RANGE_SIZE_WAP).execute("http://wxsnsdy.tc.qq.com/105/20210/snsdyvideodownload?filekey=30280201010421301f0201690402534804105d999cf2831eae6ca6e65b177800230f0204009297fd0400&amp;bizid=1023&amp;hy=SH&amp;fileparam=302c020101042530230204136ffd9302045719f85d02024ef202031e8d7f02030f42400204045a320a0201000400");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingTestUI");
    }
}
