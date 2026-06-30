package com.tencent.mm.plugin.game.luggage.liteapp.ui;

/* loaded from: classes8.dex */
public abstract class d extends com.tencent.mm.plugin.game.luggage.liteapp.ui.e {
    public com.tencent.mm.plugin.webview.luggage.RedDotView A;
    public m02.u B;
    public android.view.View C;
    public android.view.View D;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f139817y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView f139818z;

    public d(android.content.Context context, android.os.Bundle bundle) {
        super(context);
        if (!(bundle.getInt("share_report_from_scene", -1) >= 0)) {
            setBackBtn(com.tencent.mm.R.raw.actionbar_icon_light_back);
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.bgv, (android.view.ViewGroup) this.f139820e, false);
        this.C = inflate;
        this.D = inflate.findViewById(com.tencent.mm.R.id.piw);
    }

    @Override // com.tencent.mm.plugin.game.luggage.liteapp.ui.e
    public com.tencent.mm.plugin.webview.luggage.menu.y getMenuHelp() {
        if (this.f139828p == null) {
            this.f139828p = new a53.a();
        }
        return this.f139828p;
    }

    @Override // com.tencent.mm.plugin.game.luggage.liteapp.ui.e, android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        if (f17 == 0.0f) {
            f17 = 1.0f;
        }
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        int i17 = (int) (f17 * 255.0f);
        com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView downloadProgressImageView = this.f139818z;
        if (downloadProgressImageView != null) {
            downloadProgressImageView.setImageAlpha(i17);
        }
    }
}
