package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class c2 implements tg0.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI f174946a;

    public c2(com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI topStoryUploadUI) {
        this.f174946a = topStoryUploadUI;
    }

    @Override // tg0.h1
    public void a(boolean z17) {
        aw4.n0.a(2L, 1L, 3L);
        com.tencent.mars.xlog.Log.i("micromsg.topstory.TopStoryUploadUI", "dismiss");
        o11.g gVar = com.tencent.mm.plugin.topstory.ui.home.TopStoryUploadUI.D;
        this.f174946a.U6();
    }

    @Override // tg0.h1
    public void b() {
        com.tencent.mars.xlog.Log.i("micromsg.topstory.TopStoryUploadUI", "onPosition");
        aw4.n0.a(1L, 1L, 3L);
    }
}
