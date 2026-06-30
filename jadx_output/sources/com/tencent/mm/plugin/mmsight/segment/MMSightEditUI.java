package com.tencent.mm.plugin.mmsight.segment;

@db5.a(3)
/* loaded from: classes10.dex */
public class MMSightEditUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f148857t = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f148858d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView f148859e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.VideoSeekBarEditorView f148860f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f148861g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.ui.a2 f148862h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f148863i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f148865n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f148866o;

    /* renamed from: m, reason: collision with root package name */
    public final k55.k f148864m = new k55.k(com.tencent.mm.sdk.platformtools.x2.f193071a);

    /* renamed from: p, reason: collision with root package name */
    public boolean f148867p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f148868q = true;

    /* renamed from: r, reason: collision with root package name */
    public boolean f148869r = false;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.tools.a4 f148870s = new com.tencent.mm.plugin.mmsight.segment.o(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c1x;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f148862h;
        if (a2Var != null) {
            boolean z17 = false;
            if (a2Var.C) {
                if (a2Var.f149286v) {
                    a2Var.c();
                    z17 = true;
                } else {
                    qk.o9 o9Var = a2Var.f149275k;
                    if (o9Var != null) {
                        z17 = o9Var.e();
                    }
                }
            }
            if (z17) {
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().addFlags(2097280);
        if (fp.h.c(19)) {
            getWindow().setFlags(201327616, 201327616);
            ai3.d.f5107a = true;
        } else {
            getWindow().setFlags(1024, 1024);
            ai3.d.f5107a = false;
        }
        k55.k kVar = this.f148864m;
        com.tencent.mm.plugin.mmsight.model.CaptureMMProxy.createProxy(new com.tencent.mm.plugin.mmsight.model.CaptureMMProxy(kVar));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        kVar.a(new com.tencent.mm.plugin.mmsight.segment.k(this, android.os.SystemClock.elapsedRealtime()));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f148859e;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.stop();
        }
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f148862h;
        if (a2Var != null) {
            if (this.f148869r) {
                gi3.c.a(new gi3.a(a2Var.f149289y));
            }
            this.f148862h.e();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f148859e;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.pause();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = this.f148859e;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.start();
        }
    }
}
