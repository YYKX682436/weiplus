package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes5.dex */
public class q implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f139265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.u f139267f;

    public q(com.tencent.mm.plugin.game.chatroom.view.u uVar, android.view.View view, java.lang.String str) {
        this.f139267f = uVar;
        this.f139265d = view;
        this.f139266e = str;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view = this.f139265d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$2", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.game.chatroom.view.u uVar = this.f139267f;
        java.util.HashMap hashMap = (java.util.HashMap) uVar.f139302e.f138878l2;
        java.lang.String str = this.f139266e;
        com.tencent.mm.plugin.game.chatroom.view.v vVar = (com.tencent.mm.plugin.game.chatroom.view.v) hashMap.get(str);
        if (vVar != null) {
            vVar.f139307a = 2;
            ((java.util.HashMap) uVar.f139302e.f138878l2).put(str, vVar);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.view.View view = this.f139265d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatMemberListView$ChatMemberAdapter$2", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
