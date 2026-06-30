package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class i0 implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.j0 f139149a;

    public i0(com.tencent.mm.plugin.game.chatroom.view.j0 j0Var) {
        this.f139149a = j0Var;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        this.f139149a.notifyItemRangeChanged(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        this.f139149a.notifyItemRangeInserted(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        this.f139149a.notifyItemRangeRemoved(i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        this.f139149a.notifyItemMoved(i17, i18);
    }
}
