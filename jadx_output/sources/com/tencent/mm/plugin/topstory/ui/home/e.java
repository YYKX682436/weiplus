package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI f174958d;

    public e(com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI topStoryHomeAffinityUI) {
        this.f174958d = topStoryHomeAffinityUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeAffinityUI topStoryHomeAffinityUI = this.f174958d;
        if (topStoryHomeAffinityUI.isFinishing()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeAffinityUI", "kill self in background");
        topStoryHomeAffinityUI.finish();
    }
}
