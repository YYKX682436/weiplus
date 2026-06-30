package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class a00 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.h00 f133696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.lz f133697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f133698g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f133699h;

    public a00(android.view.View view, java.lang.String str, com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var, com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar, int i17, int i18) {
        this.f133695d = view;
        this.f133696e = h00Var;
        this.f133697f = lzVar;
        this.f133698g = i17;
        this.f133699h = i18;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            android.view.View view = this.f133695d;
            kotlin.jvm.internal.o.f(view, "$view");
            com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var = this.f133696e;
            com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar = this.f133697f;
            hc2.v0.d(view, "person_center_remove_frequently_read", "view_clk", false, null, new com.tencent.mm.plugin.finder.viewmodel.component.zz(h00Var, lzVar, this.f133698g, this.f133699h), 12, null);
            kotlinx.coroutines.l.d(h00Var.f134570h, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.qz(h00Var, lzVar, null), 3, null);
        }
    }
}
