package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class i6 implements com.tencent.mm.plugin.ipcall.ui.i2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.l6 f142874a;

    public i6(com.tencent.mm.plugin.ipcall.ui.l6 l6Var) {
        this.f142874a = l6Var;
    }

    @Override // com.tencent.mm.plugin.ipcall.ui.i2
    public void a(boolean z17) {
        com.tencent.mm.plugin.ipcall.ui.l6 l6Var = this.f142874a;
        if (z17) {
            if (l6Var.f142925x == null) {
                l6Var.f142906e.setVisibility(8);
            } else {
                l6Var.f142906e.setVisibility(4);
            }
            l6Var.f142906e.setVisibility(8);
            l6Var.f142905d.setVisibility(8);
            l6Var.f142902a.setText("");
            l6Var.f142903b.setText("");
            l6Var.f142911j.setVisibility(0);
        } else {
            if (l6Var.f142925x != null) {
                l6Var.f142906e.setVisibility(0);
                l6Var.f142905d.setVisibility(8);
            } else {
                l6Var.f142905d.setVisibility(0);
                l6Var.f142906e.setVisibility(8);
            }
            l6Var.h(l6Var.f142921t);
            l6Var.f142911j.setVisibility(4);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12057, 0, 0, 1, 0);
    }
}
