package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes11.dex */
public class e1 implements om4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI f174962a;

    public e1(com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI topStorySettingUI) {
        this.f174962a = topStorySettingUI;
    }

    @Override // om4.v
    public void a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showSafeDialogCheck, onFail, lastRecommendSwithIsChecked = ");
        com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI topStorySettingUI = this.f174962a;
        sb6.append(topStorySettingUI.f174898n);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingUI", sb6.toString());
        topStorySettingUI.f174894g.S(topStorySettingUI.f174898n);
    }

    @Override // om4.v
    public void b(r45.wv6 wv6Var) {
        int i17 = wv6Var.f389542d;
        com.tencent.mm.plugin.topstory.ui.home.TopStorySettingUI topStorySettingUI = this.f174962a;
        if (i17 != 1 && i17 != 2) {
            topStorySettingUI.f174894g.S(topStorySettingUI.f174898n);
            com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingUI", "error happen, unkonw state.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStorySettingUI", "showSafeDialogCheck, onSuccess, response.state = " + wv6Var.f389542d);
        topStorySettingUI.f174894g.S(wv6Var.f389542d == 2);
        com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("TopStorySettingUI_settings_top_story_recommend", topStorySettingUI.f174894g.N());
    }
}
