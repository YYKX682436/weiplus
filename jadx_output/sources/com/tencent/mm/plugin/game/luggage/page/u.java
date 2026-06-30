package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class u extends com.tencent.mm.plugin.webview.luggage.y1 {
    public final com.tencent.mm.plugin.game.luggage.page.x0 E;
    public b53.c F;
    public a53.b G;
    public b53.f H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView f139940J;
    public com.tencent.mm.plugin.webview.luggage.RedDotView K;
    public m02.u L;
    public android.view.View M;
    public android.view.View N;
    public android.widget.TextView P;
    public java.lang.String Q;
    public java.lang.String R;
    public int S;
    public java.lang.String T;
    public java.lang.String U;

    public u(com.tencent.mm.plugin.game.luggage.page.x0 x0Var) {
        super(x0Var);
        this.E = x0Var;
        if (!(x0Var.f406657n.getInt("share_report_from_scene", -1) >= 0)) {
            setBackBtn(com.tencent.mm.R.raw.actionbar_icon_light_back);
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.bgv, (android.view.ViewGroup) this.f182695g, false);
        this.M = inflate;
        this.N = inflate.findViewById(com.tencent.mm.R.id.piw);
        this.P = (android.widget.TextView) this.M.findViewById(com.tencent.mm.R.id.kbq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b53.c getH5GameMenuHelp() {
        if (this.F == null) {
            this.F = new b53.c(this.E.f406657n.getString("game_hv_menu_appid"));
        }
        return this.F;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.y1
    public void c() {
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = this.E;
        if (!g53.j.b(x0Var)) {
            x0Var.p(!(x0Var instanceof com.tencent.mm.plugin.game.luggage.page.a));
            return;
        }
        if (g53.j.f268920d == 0) {
            return;
        }
        ((vz.x1) i95.n0.c(vz.x1.class)).getClass();
        android.content.Context context = this.f182694f;
        java.lang.String appId = g53.j.f268918b;
        java.lang.String str = g53.j.f268919c;
        com.tencent.mm.plugin.game.luggage.page.m mVar = new com.tencent.mm.plugin.game.luggage.page.m(this);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        c02.l lVar2 = new c02.l();
        lVar2.f37605d = appId;
        lVar.f70664a = lVar2;
        lVar.f70665b = new c02.m();
        lVar.f70666c = "/cgi-bin/mmgame-bin/getcloudgamedownloadinfo";
        lVar.f70667d = 4786;
        com.tencent.mm.ipcinvoker.wx_extension.h0.a(lVar.a(), new k02.q(mVar, context, str, appId, 1));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.y1
    public void d() {
        m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
        m02.u uVar = this.L;
        ((l02.q) sVar).getClass();
        java.util.LinkedList linkedList = com.tencent.mm.plugin.downloader_app.model.l0.D;
        com.tencent.mm.plugin.downloader_app.model.j0.f97286a.getClass();
        com.tencent.mm.plugin.downloader_app.model.l0.D.remove(uVar);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.y1
    public void e(boolean z17) {
        android.widget.ImageView imageView = this.f182701p;
        android.widget.ImageView imageView2 = this.f182698m;
        android.widget.TextView textView = this.f182699n;
        if (z17) {
            textView.setTextColor(-1);
            imageView2.postDelayed(new com.tencent.mm.plugin.webview.luggage.h2(this), 100L);
            if (!this.f182707v) {
                imageView.setImageResource(com.tencent.mm.R.raw.actionbar_icon_light_more);
            }
        } else {
            textView.setTextColor(-16777216);
            imageView2.postDelayed(new com.tencent.mm.plugin.webview.luggage.g2(this), 100L);
            if (!this.f182707v) {
                imageView.setImageResource(com.tencent.mm.R.raw.actionbar_icon_dark_more);
            }
        }
        com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView downloadProgressImageView = this.f139940J;
        if (downloadProgressImageView != null) {
            downloadProgressImageView.setDarkMode(z17);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.y1
    public com.tencent.mm.plugin.webview.luggage.menu.y getMenuHelp() {
        if (this.f182703r == null) {
            this.f182703r = new a53.a();
        }
        return this.f182703r;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.y1
    public void i() {
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.game.luggage.page.n(this), getContext() instanceof com.tencent.mm.ui.MMActivity ? ((com.tencent.mm.ui.MMActivity) getContext()).hideVKBHavingResult() : false ? 100L : 0L);
    }

    public synchronized void k() {
        if (this.I != null) {
            return;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.bdo, (android.view.ViewGroup) this.f182700o, false);
        this.I = inflate;
        this.f139940J = (com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView) inflate.findViewById(com.tencent.mm.R.id.d3w);
        this.K = (com.tencent.mm.plugin.webview.luggage.RedDotView) this.I.findViewById(com.tencent.mm.R.id.d3y);
        this.f182700o.addView(this.I, 0);
        l();
        this.L = new com.tencent.mm.plugin.game.luggage.page.p(this);
        m02.s sVar = (m02.s) i95.n0.c(m02.s.class);
        m02.u uVar = this.L;
        ((l02.q) sVar).getClass();
        java.util.LinkedList linkedList = com.tencent.mm.plugin.downloader_app.model.l0.D;
        com.tencent.mm.plugin.downloader_app.model.j0.f97286a.getClass();
        com.tencent.mm.plugin.downloader_app.model.l0.D.add(uVar);
    }

    public void l() {
        if (this.K == null) {
            return;
        }
        if (((l02.q) ((m02.s) i95.n0.c(m02.s.class))).Ni()) {
            this.K.setVisibility(0);
        } else {
            this.K.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.y1, android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        if (f17 == 0.0f) {
            f17 = 1.0f;
        }
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        int i17 = (int) (f17 * 255.0f);
        com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView downloadProgressImageView = this.f139940J;
        if (downloadProgressImageView != null) {
            downloadProgressImageView.setImageAlpha(i17);
        }
    }
}
