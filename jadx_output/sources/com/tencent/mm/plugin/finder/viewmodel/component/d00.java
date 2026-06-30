package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class d00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f134052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.h00 f134053e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.lz f134054f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f134055g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f134056h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d00(android.view.View view, java.lang.String str, com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var, com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar, int i17, int i18) {
        super(0);
        this.f134052d = view;
        this.f134053e = h00Var;
        this.f134054f = lzVar;
        this.f134055g = i17;
        this.f134056h = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f134052d;
        com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var = this.f134053e;
        com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar = this.f134054f;
        int i17 = this.f134055g;
        int i18 = this.f134056h;
        hc2.v0.d(view, "person_center_remove_frequently_read", "view_clk", false, null, new com.tencent.mm.plugin.finder.viewmodel.component.c00(h00Var, lzVar, i17, i18), 12, null);
        com.tencent.mm.plugin.finder.viewmodel.component.h00.P6(h00Var, lzVar, i17, i18);
        return jz5.f0.f302826a;
    }
}
