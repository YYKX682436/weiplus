package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class n0 implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.q0 f204894b;

    public n0(com.tencent.mm.ui.chatting.viewitems.q0 q0Var, com.tencent.mm.storage.f9 f9Var) {
        this.f204894b = q0Var;
        this.f204893a = f9Var;
    }

    @Override // db5.r4
    public void a(android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 140 || itemId == 139) {
            yb5.d dVar = this.f204894b.f205289d;
            kotlin.jvm.internal.o.g(menuView, "menuView");
            com.tencent.mm.storage.f9 f9Var = this.f204893a;
            if (f9Var == null || dVar == null) {
                return;
            }
            java.util.Map m07 = ((vb5.l) ((vb5.m) dVar.f460708c.a(vb5.m.class))).m0(f9Var);
            java.lang.String str = itemId != 139 ? itemId != 140 ? "" : "group_msg_set_top_bubble_remove" : "group_msg_set_top_bubble_set";
            if (r26.n0.N(str) || m07 == null) {
                return;
            }
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(menuView, str);
            aVar.ik(menuView, 40, 26356);
            aVar.gk(menuView, m07);
        }
    }
}
