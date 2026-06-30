package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class o1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f124654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124656f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f124657g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f124658h;

    public o1(kotlin.jvm.internal.c0 c0Var, java.lang.String str, com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, boolean z17, boolean z18) {
        this.f124654d = c0Var;
        this.f124655e = str;
        this.f124656f = s1Var;
        this.f124657g = z17;
        this.f124658h = z18;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.finder.profile.widget.s1.m(this.f124654d, this.f124655e, this.f124656f, this.f124657g, this.f124658h);
        }
    }
}
