package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124496d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f124498f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f124499g;

    public c1(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, java.lang.String str, boolean z17, boolean z18) {
        this.f124496d = s1Var;
        this.f124497e = str;
        this.f124498f = z17;
        this.f124499g = z18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.fw4 fw4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleNextLiveNoticeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f124497e;
        boolean z17 = this.f124498f;
        boolean z18 = this.f124499g;
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.f124496d;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) s1Var.f124721e.get(str);
        r45.c32 c32Var = l2Var != null ? l2Var.B : null;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        boolean z19 = (c32Var == null || (fw4Var = (r45.fw4) c32Var.getCustom(1)) == null) ? false : fw4Var.getBoolean(2);
        c0Var.f310112d = z19;
        if (z19) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) s1Var.f124718b, 1, true);
            k0Var.X1 = true;
            k0Var.f211872n = new com.tencent.mm.plugin.finder.profile.widget.n1(s1Var);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.profile.widget.o1(c0Var, str, s1Var, z17, z18);
            k0Var.v();
        } else {
            com.tencent.mm.plugin.finder.profile.widget.s1.m(c0Var, str, s1Var, z17, z18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget$handleNextLiveNoticeInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
