package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI f174978d;

    public h(com.tencent.mm.plugin.topstory.ui.home.TopStoryHomeUI topStoryHomeUI) {
        this.f174978d = topStoryHomeUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUI", " finish");
        super/*com.tencent.mm.ui.vas.VASActivity*/.finish();
    }
}
