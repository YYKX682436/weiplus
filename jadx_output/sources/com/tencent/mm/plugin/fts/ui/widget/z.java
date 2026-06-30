package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class z implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g23.f f138367a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.a0 f138368b;

    public z(g23.f fVar, com.tencent.mm.plugin.fts.ui.widget.a0 a0Var) {
        this.f138367a = fVar;
        this.f138368b = a0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public final void a() {
        java.lang.String str = this.f138367a.f267909b;
        boolean b17 = kotlin.jvm.internal.o.b(str, "add");
        z50.d dVar = z50.e.f470163a;
        com.tencent.mm.plugin.fts.ui.widget.a0 a0Var = this.f138368b;
        if (b17) {
            dVar.b(vu4.a.H, vu4.b.f440270t, a0Var.f138243b.a7(), a0Var.f138243b.f469401g);
        } else if (kotlin.jvm.internal.o.b(str, "photo")) {
            dVar.b(vu4.a.H, vu4.b.f440265o, a0Var.f138243b.a7(), a0Var.f138243b.f469401g);
        }
    }
}
