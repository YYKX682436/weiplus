package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class n5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q5 f113589a;

    public n5(com.tencent.mm.plugin.finder.live.plugin.q5 q5Var) {
        this.f113589a = q5Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveAnchorDescEditPlugin", "CgiFinderLiveModBasicInfo errType:" + fVar.f70615a + " errCode:" + fVar.f70616b);
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.finder.live.plugin.q5 q5Var = this.f113589a;
        if (i17 == 0 && fVar.f70616b == 0) {
            db5.t7.h(q5Var.f365323d.getContext(), q5Var.f365323d.getContext().getString(com.tencent.mm.R.string.dc9));
        } else {
            db5.t7.h(q5Var.f365323d.getContext(), q5Var.f365323d.getContext().getString(com.tencent.mm.R.string.dc_));
        }
        q5Var.t1(false);
        q5Var.K0(8);
        return jz5.f0.f302826a;
    }
}
