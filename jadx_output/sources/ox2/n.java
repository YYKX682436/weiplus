package ox2;

/* loaded from: classes2.dex */
public final class n implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f349688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg f349689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f349690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f349691g;

    public n(yz5.a aVar, com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg, yz5.a aVar2, com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg2, android.view.View view) {
        this.f349688d = aVar;
        this.f349689e = centerInteractionEasterEgg;
        this.f349690f = aVar2;
        this.f349691g = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f349690f.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f349688d.invoke();
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = this.f349689e;
        if (centerInteractionEasterEgg.isPreview) {
            return;
        }
        hc2.f1.d(centerInteractionEasterEgg);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = this.f349689e;
        java.lang.Float valueOf = java.lang.Float.valueOf(1.0f);
        centerInteractionEasterEgg.setAlpha(1.0f);
        centerInteractionEasterEgg.setVisibility(0);
        centerInteractionEasterEgg.f132382t = true;
        centerInteractionEasterEgg.h();
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = centerInteractionEasterEgg.f132373h;
        if (finderEmojiView != null) {
            finderEmojiView.setAlpha(1.0f);
        }
        android.view.View view = centerInteractionEasterEgg.f132371f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(valueOf);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$turnAnimation$lambda$7$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$turnAnimation$lambda$7$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = this.f349691g;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$turnAnimation$lambda$7$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$turnAnimation$lambda$7$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.f349691g;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(valueOf);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$turnAnimation$lambda$7$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEgg$turnAnimation$lambda$7$$inlined$addListener$default$1", "onAnimationStart", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        centerInteractionEasterEgg.getClass();
        try {
            if (!centerInteractionEasterEgg.f132387y) {
                com.tencent.mars.xlog.Log.w("InteractionEasterEggCenter", "playPag: initPagSuccess is false");
                if (!centerInteractionEasterEgg.c()) {
                    com.tencent.mars.xlog.Log.w("InteractionEasterEggCenter", "playPag: initPag return false");
                }
            }
            com.tencent.mm.view.MMPAGView mMPAGView = centerInteractionEasterEgg.f132375m;
            if (mMPAGView != null) {
                mMPAGView.setVisibility(0);
                mMPAGView.setProgress(0.0d);
                mMPAGView.setRepeatCount(1);
                mMPAGView.g();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("InteractionEasterEggCenter", "playPag e:" + th6);
        }
    }
}
