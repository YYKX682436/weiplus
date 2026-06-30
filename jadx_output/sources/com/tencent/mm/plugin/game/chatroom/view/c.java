package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes3.dex */
public final class c extends com.tencent.mm.plugin.game.chatroom.view.a {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.k3 f139048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.l f139049e;

    public c(com.tencent.mm.plugin.game.chatroom.view.l lVar, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        this.f139049e = lVar;
        this.f139048d = viewHolder;
    }

    @Override // com.tencent.mm.plugin.game.chatroom.view.a, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        android.view.View itemView = this.f139048d.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.game.chatroom.view.m.a(itemView);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        androidx.recyclerview.widget.k3 k3Var = this.f139048d;
        android.view.View itemView = k3Var.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.game.chatroom.view.m.a(itemView);
        com.tencent.mm.plugin.game.chatroom.view.l lVar = this.f139049e;
        lVar.h(k3Var);
        lVar.f139211o.remove(k3Var);
        lVar.E();
    }

    @Override // com.tencent.mm.plugin.game.chatroom.view.a, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        this.f139049e.getClass();
    }
}
