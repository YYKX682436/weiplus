package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class p implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI f208151d;

    public p(com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI) {
        this.f208151d = unreadConversationFmUI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        long j17;
        boolean z17;
        long j18;
        em.e4 e4Var;
        long j19;
        long j27;
        float f17;
        float f18;
        float dismissThreshold;
        com.tencent.mm.ui.conversation.unreadmode.g0 reporter;
        float f19;
        com.tencent.mm.ui.conversation.unreadmode.g0 reporter2;
        boolean z18;
        float f27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI$setupSlideToDismiss$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        boolean z19 = true;
        com.tencent.mm.ui.conversation.unreadmode.UnreadConversationActivity.UnreadConversationFmUI unreadConversationFmUI = this.f208151d;
        if (action != 0) {
            if (action == 1) {
                z17 = unreadConversationFmUI.isDragging;
                if (z17) {
                    unreadConversationFmUI.isDragging = false;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    j18 = unreadConversationFmUI.touchStartTime;
                    long j28 = currentTimeMillis - j18;
                    e4Var = unreadConversationFmUI.viewBinding;
                    if (e4Var == null) {
                        kotlin.jvm.internal.o.o("viewBinding");
                        throw null;
                    }
                    float translationY = e4Var.a().getTranslationY();
                    j19 = unreadConversationFmUI.lastTouchTime;
                    j27 = unreadConversationFmUI.touchStartTime;
                    long j29 = j19 - j27;
                    f17 = unreadConversationFmUI.lastTouchY;
                    f18 = unreadConversationFmUI.touchStartY;
                    float f28 = j29 > 0 ? 1000.0f * ((f17 - f18) / ((float) j29)) : 0.0f;
                    dismissThreshold = unreadConversationFmUI.getDismissThreshold();
                    if (translationY <= dismissThreshold) {
                        f19 = unreadConversationFmUI.dismissVelocityThreshold;
                        if (f28 <= f19) {
                            if (java.lang.Math.abs(translationY) >= 5.0f || j28 >= 100) {
                                unreadConversationFmUI.animateReset();
                            } else {
                                reporter2 = unreadConversationFmUI.getReporter();
                                if (reporter2 != null) {
                                    reporter2.f208141c = 2;
                                }
                                unreadConversationFmUI.animateDismiss();
                            }
                        }
                    }
                    reporter = unreadConversationFmUI.getReporter();
                    if (reporter != null) {
                        reporter.f208141c = 3;
                    }
                    unreadConversationFmUI.animateDismiss();
                }
            } else if (action == 2) {
                z18 = unreadConversationFmUI.isDragging;
                if (z18) {
                    unreadConversationFmUI.lastTouchY = motionEvent.getRawY();
                    unreadConversationFmUI.lastTouchTime = java.lang.System.currentTimeMillis();
                    float rawY = motionEvent.getRawY();
                    f27 = unreadConversationFmUI.touchStartY;
                    float f29 = rawY - f27;
                    if (f29 > 0.0f) {
                        unreadConversationFmUI.updateSlidePosition(f29);
                    }
                }
            } else if (action != 3) {
                z19 = false;
            } else {
                unreadConversationFmUI.isDragging = false;
                unreadConversationFmUI.animateReset();
            }
        } else {
            unreadConversationFmUI.touchStartY = motionEvent.getRawY();
            unreadConversationFmUI.lastTouchY = motionEvent.getRawY();
            unreadConversationFmUI.touchStartTime = java.lang.System.currentTimeMillis();
            j17 = unreadConversationFmUI.touchStartTime;
            unreadConversationFmUI.lastTouchTime = j17;
            unreadConversationFmUI.isDragging = true;
        }
        yj0.a.i(z19, this, "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationActivity$UnreadConversationFmUI$setupSlideToDismiss$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z19;
    }
}
