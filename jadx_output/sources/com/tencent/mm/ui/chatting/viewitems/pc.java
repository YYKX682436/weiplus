package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class pc implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f205250d;

    public pc(com.tencent.mm.ui.chatting.viewitems.nc ncVar, yb5.d dVar) {
        this.f205250d = dVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        yb5.d dVar = this.f205250d;
        g4Var.d(291, dVar.s().getColor(com.tencent.mm.R.color.f479482a31), dVar.s().getString(com.tencent.mm.R.string.f490869b40));
    }
}
