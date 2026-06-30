package com.tencent.mm.plugin.voip.widget;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.widget.e f177151d;

    public f(com.tencent.mm.plugin.voip.widget.e eVar) {
        this.f177151d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.widget.e eVar = this.f177151d;
        if (eVar.f177139q || !eVar.f177146x) {
            return;
        }
        eVar.f177139q = true;
        eVar.f177146x = false;
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = eVar.f177133h;
        voIPRenderTextureView.setVisibility(0);
        voIPRenderTextureView.a(true);
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView2 = eVar.f177134i;
        voIPRenderTextureView2.a(false);
        voIPRenderTextureView2.animate().alpha(0.0f).setDuration(500L).setListener(new com.tencent.mm.plugin.voip.widget.j(eVar)).start();
    }
}
