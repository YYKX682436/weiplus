package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f f211761d;

    public d(com.tencent.mm.ui.widget.dialog.f fVar) {
        this.f211761d = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.dialog.f fVar = this.f211761d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = fVar.f211785c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        fVar.f211785c = null;
    }
}
