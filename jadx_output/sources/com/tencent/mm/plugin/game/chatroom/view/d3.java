package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class d3 implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.i3 f139071a;

    public d3(com.tencent.mm.plugin.game.chatroom.view.i3 i3Var) {
        this.f139071a = i3Var;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = this.f139071a;
        i3Var.f139176r.f138960f2.notifyItemRangeChanged(i17, i18, obj);
        int i19 = i3Var.f139176r.f138967m2;
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        this.f139071a.f139176r.f138960f2.notifyItemRangeInserted(i17, i18);
        if (this.f139071a.f139176r.f138967m2 == 1) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.game.chatroom.view.c3 c3Var = new com.tencent.mm.plugin.game.chatroom.view.c3(this, i17, i18);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(c3Var, 0L, false);
        }
        int i19 = this.f139071a.f139176r.f138967m2;
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = this.f139071a;
        i3Var.f139176r.f138960f2.notifyItemRangeRemoved(i17, i18);
        int i19 = i3Var.f139176r.f138967m2;
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        com.tencent.mm.plugin.game.chatroom.view.i3 i3Var = this.f139071a;
        i3Var.f139176r.f138960f2.notifyItemMoved(i17, i18);
        int i19 = i3Var.f139176r.f138967m2;
    }
}
