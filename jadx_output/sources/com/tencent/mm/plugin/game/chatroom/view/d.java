package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes3.dex */
public final class d extends com.tencent.mm.plugin.game.chatroom.view.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.k3 f139063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.l f139064e;

    public d(com.tencent.mm.plugin.game.chatroom.view.l lVar, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        this.f139064e = lVar;
        this.f139063d = viewHolder;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.view.a, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        android.view.View itemView = this.f139063d.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.game.chatroom.view.m.a(itemView);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        androidx.recyclerview.widget.k3 k3Var = this.f139063d;
        android.view.View itemView = k3Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.game.chatroom.view.m.a(itemView);
        com.tencent.mm.plugin.game.chatroom.view.l lVar = this.f139064e;
        lVar.y(k3Var);
        lVar.f139213q.remove(k3Var);
        lVar.E();
    }

    @Override // com.tencent.mm.plugin.game.chatroom.view.a, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f139064e.C(this.f139063d);
    }
}
