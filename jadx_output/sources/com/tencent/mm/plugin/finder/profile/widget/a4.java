package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class a4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f124479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.e4 f124480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124481f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.n3 f124482g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f124483h;

    public a4(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.profile.widget.e4 e4Var, com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, com.tencent.mm.plugin.finder.profile.widget.n3 n3Var, int i17) {
        this.f124479d = c0Var;
        this.f124480e = e4Var;
        this.f124481f = s4Var;
        this.f124482g = n3Var;
        this.f124483h = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.finder.profile.widget.e4.x(this.f124479d, this.f124480e, this.f124481f, this.f124482g, this.f124483h);
        }
    }
}
