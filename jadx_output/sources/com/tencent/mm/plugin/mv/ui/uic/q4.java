package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class q4 implements gm3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.v4 f151383a;

    public q4(com.tencent.mm.plugin.mv.ui.uic.v4 v4Var) {
        this.f151383a = v4Var;
    }

    @Override // gm3.f
    public void a(int i17, gm3.c item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFlexEditUIC", "OnDelBtnClicked, pos:" + i17 + ", type:" + item.f273544e);
        com.tencent.mm.plugin.mv.ui.uic.v4 v4Var = this.f151383a;
        gm3.f fVar = v4Var.f151495o;
        if (fVar != null) {
            fVar.a(i17, item);
        }
        v4Var.f151491h.u(item);
        v4Var.f151491h.D();
    }
}
