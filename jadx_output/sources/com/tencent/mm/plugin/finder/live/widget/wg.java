package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wg implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bh f120187d;

    public wg(int i17, com.tencent.mm.plugin.finder.live.widget.bh bhVar, int i18) {
        this.f120187d = bhVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f120187d;
        g4Var.f(0, bhVar.getContext().getString(com.tencent.mm.R.string.f491523lu2));
        g4Var.f(1, bhVar.getContext().getString(com.tencent.mm.R.string.luo));
    }
}
