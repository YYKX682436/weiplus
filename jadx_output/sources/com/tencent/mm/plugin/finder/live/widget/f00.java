package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class f00 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.widget.f00 f118299a = new com.tencent.mm.plugin.finder.live.widget.f00();

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorGameTeamWidget", "ljd do CgiFinderLiveRespondGameInvitation success");
        } else {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveVisitorGameTeamWidget", "ljd do CgiFinderLiveRespondGameInvitation fail errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f70616b), fVar.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
