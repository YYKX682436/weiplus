package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class d3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.z9 f124517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.f3 f124518e;

    public d3(com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var, com.tencent.mm.plugin.finder.profile.widget.f3 f3Var) {
        this.f124517d = z9Var;
        this.f124518e = f3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        r45.xs2 xs2Var;
        com.tencent.mm.protobuf.g byteString;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderRedPackWidget$refreshRedPack$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = this.f124517d;
        if (z9Var != null && (jbVar = z9Var.f105329c) != null && (xs2Var = jbVar.N) != null && (byteString = xs2Var.getByteString(11)) != null) {
            com.tencent.mm.plugin.finder.profile.widget.f3 f3Var = this.f124518e;
            java.lang.String e17 = xy2.c.e(f3Var.f124539a);
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).yk(5, 2, "");
            r45.f03 b07 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0("FinderProfileBanner", e17);
            com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "FinderProfileBanner", e17, false, false, 12, null);
            if (S0 != null && b07 != null) {
                com.tencent.mm.plugin.finder.report.x2.i(com.tencent.mm.plugin.finder.report.x2.f125429a, "3", S0, b07, 2, f3Var.f124540b, 0, null, 0, 0, 480, null);
            }
            com.tencent.mm.plugin.finder.profile.widget.f3.a(f3Var, 1);
            i95.m c17 = i95.n0.c(c61.t8.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((c61.t8) c17).Bi(f3Var.f124539a, byteString, "FinderMpCardEntry", e17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderRedPackWidget$refreshRedPack$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
