package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes8.dex */
public final class h3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xl3 f154347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var, r45.xl3 xl3Var) {
        super(0);
        this.f154346d = s4Var;
        this.f154347e = xl3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList<r45.el5> linkedList;
        com.tencent.mm.plugin.profile.ui.tab.s4 s4Var = this.f154346d;
        s4Var.j().setAlpha(0.0f);
        s4Var.j().setVisibility(0);
        s4Var.j().animate().alpha(1.0f).setDuration(200L).start();
        com.tencent.mm.plugin.profile.ui.tab.view.BizProfileFollowMoreView j17 = s4Var.j();
        com.tencent.mm.storage.z3 z3Var = s4Var.f154555f;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        r45.xl3 xl3Var = this.f154347e;
        boolean z17 = xl3Var != null;
        int i17 = s4Var.f154551d.f154467v;
        java.lang.Object value = ((jz5.n) s4Var.N).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(((android.view.View) value).getWidth());
        java.util.ArrayList arrayList = j17.f154637n;
        arrayList.clear();
        j17.f154638o = d17;
        j17.f154640q = new as3.b(xl3Var != null ? java.lang.Integer.valueOf(xl3Var.f390214g) : null, i17, xl3Var != null ? xl3Var.f390213f : null, null, 0, 24, null);
        if (xl3Var != null && (linkedList = xl3Var.f390211d) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.el5 el5Var : linkedList) {
                kotlin.jvm.internal.o.d(el5Var);
                as3.b bVar = j17.f154640q;
                if (bVar == null) {
                    kotlin.jvm.internal.o.o("reportInfo");
                    throw null;
                }
                arrayList2.add(new vr3.a(el5Var, bVar));
            }
            arrayList.addAll(arrayList2);
        }
        d75.b.g(new as3.i(j17, z17, xl3Var, valueOf));
        return jz5.f0.f302826a;
    }
}
