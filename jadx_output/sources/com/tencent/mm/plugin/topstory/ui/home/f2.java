package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class f2 implements tg0.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.g2 f174970a;

    public f2(com.tencent.mm.plugin.topstory.ui.home.g2 g2Var) {
        this.f174970a = g2Var;
    }

    @Override // tg0.h1
    public void a(boolean z17) {
        this.f174970a.f174977d.f174932x.clearFocus();
        com.tencent.mars.xlog.Log.i("micromsg.topstory.TopStoryUploadUI", "commentEt clearFocus");
        aw4.n0.a(2L, 2L, 3L);
    }

    @Override // tg0.h1
    public void b() {
        this.f174970a.f174977d.f174932x.requestFocus();
        com.tencent.mars.xlog.Log.i("micromsg.topstory.TopStoryUploadUI", "commentEt onPosition");
        aw4.n0.a(1L, 2L, 3L);
    }
}
