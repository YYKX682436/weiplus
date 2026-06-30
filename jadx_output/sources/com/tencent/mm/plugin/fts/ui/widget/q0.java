package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class q0 implements com.tencent.mm.plugin.fts.ui.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.w0 f138316a;

    public q0(com.tencent.mm.plugin.fts.ui.widget.w0 w0Var) {
        this.f138316a = w0Var;
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.a1
    public void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.fts.ui.widget.w0 w0Var = this.f138316a;
        ((com.tencent.mm.plugin.fts.ui.l0) w0Var.f138338p).a(str, str2);
        w0Var.dismiss();
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.a1
    public void b(java.lang.String str) {
        ((com.tencent.mm.plugin.fts.ui.l0) this.f138316a.f138338p).b(str);
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.a1
    public void c(boolean z17, boolean z18, java.lang.String str) {
        ((com.tencent.mm.plugin.fts.ui.l0) this.f138316a.f138338p).c(z17, z18, str);
    }

    @Override // com.tencent.mm.plugin.fts.ui.widget.a1
    public void d() {
        ((com.tencent.mm.plugin.fts.ui.l0) this.f138316a.f138338p).d();
    }
}
