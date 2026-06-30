package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class a0 implements com.tencent.mm.ui.widget.dialog.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AlertActivity f197111a;

    public a0(com.tencent.mm.ui.AlertActivity alertActivity) {
        this.f197111a = alertActivity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.r3
    public void a(android.app.Dialog dialog, int i17) {
        com.tencent.mm.ui.widget.dialog.r3 r3Var = this.f197111a.f196565g;
        if (r3Var != null) {
            r3Var.a(dialog, i17);
        }
    }
}
