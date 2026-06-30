package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.l f141545d;

    public e(com.tencent.mm.plugin.game.ui.message.l lVar) {
        this.f141545d = lVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (this.f141545d.f141579d.f141490q == 0) {
            g4Var.a(0, com.tencent.mm.R.string.flb);
        } else {
            g4Var.a(1, com.tencent.mm.R.string.fop);
            g4Var.a(2, com.tencent.mm.R.string.fld);
        }
    }
}
