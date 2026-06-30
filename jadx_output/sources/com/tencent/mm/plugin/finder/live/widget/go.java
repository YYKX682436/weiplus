package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class go implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.io f118467a;

    public go(com.tencent.mm.plugin.finder.live.widget.io ioVar) {
        this.f118467a = ioVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        b92.d1 d1Var = (b92.d1) ((c61.zb) i95.n0.c(c61.zb.class));
        com.tencent.mm.plugin.finder.live.widget.io ioVar = this.f118467a;
        d1Var.mj(ioVar);
        com.tencent.mm.ui.widget.dialog.h2 h2Var = ioVar.K;
        if (h2Var != null) {
            h2Var.onDismiss();
        }
    }
}
