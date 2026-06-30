package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes10.dex */
public final class f2 implements zh2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.j2 f116284a;

    public f2(com.tencent.mm.plugin.finder.live.view.j2 j2Var) {
        this.f116284a = j2Var;
    }

    @Override // zh2.d
    public void a() {
        kj2.o inviteWidget;
        com.tencent.mm.plugin.finder.live.view.j2 j2Var = this.f116284a;
        if (j2Var.o()) {
            inviteWidget = j2Var.getInviteWidget();
            inviteWidget.d();
        }
    }
}
