package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class a2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.d2 f124475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vr0 f124476e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124477f;

    public a2(com.tencent.mm.plugin.finder.profile.widget.d2 d2Var, r45.vr0 vr0Var, java.lang.String str) {
        this.f124475d = d2Var;
        this.f124476e = vr0Var;
        this.f124477f = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/profile/widget/HeaderMemberWidget$handleMemberView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_member_inlet_source", 7);
        com.tencent.mm.plugin.finder.profile.widget.d2 d2Var = this.f124475d;
        intent.putExtra("key_self_flag", d2Var.f124514b);
        r45.vr0 vr0Var = this.f124476e;
        if (vr0Var.f388454d == 2) {
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Hk(d2Var.f124513a, intent, this.f124477f, vr0Var.f388454d, vr0Var.f388455e);
        } else {
            d2Var.getClass();
            int i17 = vr0Var.f388455e;
            java.lang.String str = this.f124477f;
            boolean z17 = true;
            if (i17 != 1 && i17 != 2 && !kotlin.jvm.internal.o.b(str, xy2.c.e(d2Var.f124513a))) {
                z17 = false;
            }
            if (z17) {
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Gk(d2Var.f124513a, intent, str);
            } else if (vr0Var.f388455e == 0) {
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Kk(d2Var.f124513a, intent, str);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/profile/widget/HeaderMemberWidget$handleMemberView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
