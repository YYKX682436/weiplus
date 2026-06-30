package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class y implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g23.f f138361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f138362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.a0 f138363f;

    public y(g23.f fVar, long j17, com.tencent.mm.plugin.fts.ui.widget.a0 a0Var) {
        this.f138361d = fVar;
        this.f138362e = j17;
        this.f138363f = a0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        g23.i iVar = (g23.i) ((java.util.ArrayList) this.f138361d.f267913f).get(i17);
        z50.b bVar = z50.c.f470162a;
        kotlin.jvm.internal.o.d(iVar);
        long j17 = this.f138362e;
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = this.f138363f;
        bVar.c(iVar, j17, a0Var.f138242a, a0Var.f138243b.c7(), a0Var.f138243b.a7(), a0Var.f138243b.f469401g);
    }
}
