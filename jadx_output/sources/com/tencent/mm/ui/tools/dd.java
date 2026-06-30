package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class dd implements com.tencent.mm.pluginsdk.ui.tools.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210361a;

    public dd(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210361a = showVideoUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.o5
    public void a(int i17, int i18) {
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210361a;
        ((g90.s) vVar).sj(showVideoUI, showVideoUI.f210236x, 2, i17, i18);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.o5
    public void b(float f17, float f18) {
        h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210361a;
        ((g90.s) vVar).tj(showVideoUI, showVideoUI.f210236x, 2, f17, f18);
    }
}
