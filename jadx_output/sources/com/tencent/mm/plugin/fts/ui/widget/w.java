package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class w implements xj.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.a0 f138337a;

    public w(com.tencent.mm.plugin.fts.ui.widget.a0 a0Var) {
        this.f138337a = a0Var;
    }

    @Override // xj.l
    public void onJumpAppCancel() {
        z50.d dVar = z50.e.f470163a;
        vu4.a aVar = vu4.a.H;
        vu4.b bVar = vu4.b.f440271u;
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = this.f138337a;
        dVar.b(aVar, bVar, a0Var.f138243b.a7(), a0Var.f138243b.f469401g);
    }

    @Override // xj.l
    public void onJumpAppCheckExpose() {
        z50.d dVar = z50.e.f470163a;
        vu4.a aVar = vu4.a.I;
        vu4.b bVar = vu4.b.f440271u;
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = this.f138337a;
        dVar.b(aVar, bVar, a0Var.f138243b.a7(), a0Var.f138243b.f469401g);
    }

    @Override // xj.l
    public void onJumpAppFail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSActionBarAISearchViewModel", "[handleYuanbaoAdClick] adInfo is not null but jump failed.");
    }

    @Override // xj.l
    public void onJumpAppSuccess() {
        z50.d dVar = z50.e.f470163a;
        vu4.a aVar = vu4.a.G;
        vu4.b bVar = vu4.b.f440271u;
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = this.f138337a;
        dVar.b(aVar, bVar, a0Var.f138243b.a7(), a0Var.f138243b.f469401g);
    }

    @Override // xj.l
    public void onJumpDownloadPage() {
        z50.d dVar = z50.e.f470163a;
        vu4.a aVar = vu4.a.f440247q;
        vu4.b bVar = vu4.b.f440271u;
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = this.f138337a;
        dVar.b(aVar, bVar, a0Var.f138243b.a7(), a0Var.f138243b.f469401g);
    }
}
