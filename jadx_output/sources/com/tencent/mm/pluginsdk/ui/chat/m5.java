package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f190485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f190486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout f190487f;

    public m5(com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout, int i17, boolean z17) {
        this.f190487f = chattingScrollLayout;
        this.f190485d = i17;
        this.f190486e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        rc5.m mVar;
        rc5.m mVar2;
        com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout = this.f190487f;
        chattingScrollLayout.f190123e = null;
        int i17 = chattingScrollLayout.f190125g - chattingScrollLayout.f190124f;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingScrollLayout", "scrollContentTo: in runnable " + i17);
        int i18 = this.f190485d == 0 ? com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_INT_AUDIO_STREAM_TYPE : 175;
        android.widget.OverScroller overScroller = chattingScrollLayout.f190122d;
        int i19 = chattingScrollLayout.f190124f;
        if (!this.f190486e) {
            i18 = 0;
        }
        overScroller.startScroll(0, i19, 0, i17, i18);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.k(chattingScrollLayout);
        int i27 = chattingScrollLayout.f190125g;
        chattingScrollLayout.getClass();
        java.util.Iterator it = new java.util.ArrayList(chattingScrollLayout.f190134s).iterator();
        while (it.hasNext()) {
            rc5.x xVar = ((rc5.t) ((com.tencent.mm.pluginsdk.ui.chat.o5) it.next())).f394192a;
            if (i27 > 0) {
                java.lang.ref.WeakReference weakReference = xVar.A;
                if (weakReference != null && (mVar = (rc5.m) weakReference.get()) != null && !mVar.f394183v && !mVar.f394182u) {
                    android.animation.Animator animator = mVar.A;
                    if (animator != null) {
                        animator.cancel();
                    }
                    android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(mVar.getLayoutParams().height, mVar.f394172h);
                    ofInt.setInterpolator(mVar.f394185x);
                    ofInt.addUpdateListener(new rc5.w(mVar.f394187z));
                    ofInt.addListener(new rc5.j(mVar));
                    android.animation.ValueAnimator duration = ofInt.setDuration(200L);
                    kotlin.jvm.internal.o.f(duration, "setDuration(...)");
                    duration.start();
                    mVar.A = duration;
                }
            } else {
                java.lang.ref.WeakReference weakReference2 = xVar.A;
                if (weakReference2 != null && (mVar2 = (rc5.m) weakReference2.get()) != null && mVar2.f394183v && !mVar2.f394182u) {
                    android.animation.Animator animator2 = mVar2.A;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(mVar2.getLayoutParams().height, mVar2.f394173i);
                    ofInt2.setInterpolator(mVar2.f394185x);
                    ofInt2.addListener(new rc5.g(new kotlin.jvm.internal.h0(), mVar2));
                    ofInt2.addUpdateListener(new rc5.i(mVar2));
                    android.animation.ValueAnimator duration2 = ofInt2.setDuration(200L);
                    kotlin.jvm.internal.o.f(duration2, "setDuration(...)");
                    duration2.start();
                    mVar2.A = duration2;
                }
            }
        }
    }
}
