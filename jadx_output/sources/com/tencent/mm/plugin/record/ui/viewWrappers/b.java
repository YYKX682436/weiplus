package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes12.dex */
public class b implements kd0.n2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.m f155505a;

    public b(com.tencent.mm.plugin.record.ui.viewWrappers.m mVar) {
        this.f155505a = mVar;
    }

    @Override // kd0.n2
    public void a() {
        com.tencent.mm.plugin.record.ui.viewWrappers.m mVar = this.f155505a;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = mVar.f155539c;
        if (k0Var == null || !k0Var.i()) {
            return;
        }
        ((com.tencent.mm.plugin.record.ui.viewWrappers.i) mVar.f155546j).onLongClick(null);
    }
}
