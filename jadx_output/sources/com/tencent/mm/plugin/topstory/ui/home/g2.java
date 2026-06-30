package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class g2 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI f174977d;

    public g2(com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI topStoryUploadUI) {
        this.f174977d = topStoryUploadUI;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        boolean z18 = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getBoolean("tophitory_show_comment_dialog", false);
        if (!z17 || z18) {
            return;
        }
        com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI topStoryUploadUI = this.f174977d;
        topStoryUploadUI.f174932x.clearFocus();
        aw4.n0.f14901a.d(topStoryUploadUI.f174932x.getContext(), new com.tencent.mm.plugin.topstory.ui.home.f2(this), true);
    }
}
