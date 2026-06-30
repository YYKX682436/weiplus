package m34;

/* loaded from: classes4.dex */
public class n extends com.tencent.mm.ui.widget.dialog.k2 implements c01.i {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f323359d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f323360e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f323361f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f323362g;

    /* renamed from: h, reason: collision with root package name */
    public int f323363h;

    /* renamed from: i, reason: collision with root package name */
    public int f323364i;

    /* renamed from: m, reason: collision with root package name */
    public int f323365m;

    /* renamed from: n, reason: collision with root package name */
    public final c01.k f323366n;

    public n(android.content.Context context) {
        super(context, com.tencent.mm.R.style.x_);
        this.f323359d = null;
        this.f323360e = null;
        this.f323363h = 0;
        this.f323364i = 0;
        this.f323365m = 0;
        this.f323366n = new c01.k();
    }

    @Override // c01.i
    public void P0() {
    }

    @Override // c01.i
    public void U5() {
    }

    @Override // c01.i
    public void V3() {
    }

    public final void c() {
        if (this.f323359d.isPlaying()) {
            this.f323359d.pause();
            this.f323366n.a();
        }
        new com.tencent.mm.sdk.platformtools.n3().post(new m34.m(this));
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (com.tencent.mm.booter.b.d() != null) {
            com.tencent.mm.booter.b.d().b();
        }
        com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = this.f323359d;
        if (f4Var != null) {
            f4Var.setVideoCallback(null);
            this.f323359d.stop();
            this.f323359d.onDetach();
            findViewById(com.tencent.mm.R.id.oy7).setOnClickListener(null);
        }
        if (isShowing()) {
            com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
            am.mz mzVar = uIStatusChangedEvent.f54907g;
            mzVar.f7378a = 0;
            mzVar.f7379b = this.f323364i;
            mzVar.f7380c = this.f323365m;
            mzVar.f7381d = this.f323363h;
            uIStatusChangedEvent.e();
        }
        super.dismiss();
        this.f323366n.b(true);
    }

    @Override // c01.i
    public void g3() {
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
        getWindow().setFlags(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62);
        setContentView(com.tencent.mm.R.layout.cn8);
        if (com.tencent.mm.booter.b.d() != null) {
            com.tencent.mm.booter.b.d().a();
        }
        fp.k.b();
        this.f323360e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487334ob5);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mva);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sight/decode/ui/SightPopupHelper", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.oy7);
        viewGroup.setBackgroundResource(com.tencent.mm.R.color.f478712f3);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPopupHelper", "getVideoView, is normal video");
        if (fp.h.c(14)) {
            this.f323359d = new com.tencent.mm.pluginsdk.ui.tools.VideoTextureView(getContext(), null);
        } else {
            this.f323359d = new com.tencent.mm.pluginsdk.ui.tools.VideoSurfaceView(getContext(), null);
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        viewGroup.addView((android.view.View) this.f323359d, layoutParams);
        this.f323359d.setVideoCallback(new m34.j(this));
        findViewById(com.tencent.mm.R.id.oy7).setOnClickListener(new m34.k(this));
        ((android.view.View) this.f323359d).setOnClickListener(new m34.l(this));
        if (this.f323361f != null) {
            this.f323359d.stop();
            this.f323359d.setVideoPath(this.f323361f);
        }
        java.lang.System.currentTimeMillis();
        com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
        uIStatusChangedEvent.f54907g.f7378a = 1;
        uIStatusChangedEvent.e();
    }
}
