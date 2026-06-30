package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class s0 extends wl5.v {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.q0 f205480a;

    public s0(com.tencent.mm.ui.chatting.viewitems.q0 q0Var) {
        this.f205480a = q0Var;
    }

    @Override // wl5.v
    public void a() {
        com.tencent.mm.ui.chatting.viewitems.q0 q0Var = this.f205480a;
        rl5.r rVar = q0Var.f205292g;
        if (rVar == null || !rVar.a()) {
            return;
        }
        q0Var.f205292g = null;
    }

    @Override // wl5.v
    public void b() {
        yb5.d dVar = this.f205480a.f205289d;
        if (dVar != null) {
            dVar.P(false);
        }
    }

    @Override // wl5.v
    public void c(android.view.View view) {
        this.f205480a.onLongClick(view);
    }

    @Override // wl5.v
    public void d() {
        yb5.d dVar = this.f205480a.f205289d;
        if (dVar != null) {
            dVar.V(true);
        }
    }

    @Override // wl5.v
    public void e() {
        yb5.d dVar = this.f205480a.f205289d;
        if (dVar != null) {
            dVar.V(false);
        }
    }

    @Override // wl5.v
    public void f(android.view.View view) {
        this.f205480a.g(view);
    }
}
