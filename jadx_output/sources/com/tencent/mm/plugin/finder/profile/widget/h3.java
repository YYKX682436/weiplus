package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class h3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.j32 f124567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(r45.j32 j32Var) {
        super(1);
        this.f124567d = j32Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        com.tencent.mm.plugin.finder.view.dd couponCallback = (com.tencent.mm.plugin.finder.view.dd) obj;
        kotlin.jvm.internal.o.g(couponCallback, "couponCallback");
        r45.ov2 ov2Var = couponCallback.f131889a;
        r45.l1 l1Var = (r45.l1) ov2Var.getCustom(19);
        if (l1Var != null) {
            com.tencent.mm.plugin.finder.assist.a.b(l1Var);
        }
        java.util.LinkedList list = this.f124567d.getList(0);
        java.lang.String str = couponCallback.f131890b;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (kotlin.jvm.internal.o.b(((r45.h32) obj2).getString(4), str)) {
                    break;
                }
            }
            r45.h32 h32Var = (r45.h32) obj2;
            if (h32Var != null) {
                r45.l1 l1Var2 = (r45.l1) ov2Var.getCustom(19);
                if (l1Var2 != null) {
                    com.tencent.mm.plugin.finder.assist.a.b(l1Var2);
                }
                zl2.t.f(h32Var, ov2Var);
            }
        }
        zl2.g gVar = zl2.g.f473770a;
        java.lang.String string = ov2Var.getString(1);
        if (string == null) {
            string = "";
        }
        gVar.c(string, str, true);
        return jz5.f0.f302826a;
    }
}
