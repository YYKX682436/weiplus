package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class eo implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f203894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableStringBuilder f203895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f203896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f203897g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f203898h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate f203899i;

    public eo(com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate, long j17, android.text.SpannableStringBuilder spannableStringBuilder, java.lang.CharSequence charSequence, int i17, int i18) {
        this.f203899i = chattingItemTranslate;
        this.f203894d = j17;
        this.f203895e = spannableStringBuilder;
        this.f203896f = charSequence;
        this.f203897g = i17;
        this.f203898h = i18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate = this.f203899i;
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(chattingItemTranslate.getResources().getColor(com.tencent.mm.R.color.a0c));
        android.text.SpannableStringBuilder spannableStringBuilder = this.f203895e;
        spannableStringBuilder.clear();
        java.lang.CharSequence charSequence = this.f203896f;
        int i17 = this.f203897g;
        spannableStringBuilder.append(charSequence.subSequence(0, i17)).setSpan(foregroundColorSpan, this.f203898h, i17, 33);
        chattingItemTranslate.f203209e.c(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE, null);
        if (((com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) ((yb5.d) chattingItemTranslate.f203216o.get()).f460708c.a(sb5.k2.class))).o0(this.f203894d)) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate.a(chattingItemTranslate);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTranslate", "renderVoiceTextAppendNew onAnimationCancel!!");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTranslate", "renderVoiceTextAppendNew onAnimationEnd!!");
        com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate = this.f203899i;
        if (((com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) ((yb5.d) chattingItemTranslate.f203216o.get()).f460708c.a(sb5.k2.class))).o0(this.f203894d)) {
            chattingItemTranslate.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.eo$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate.a(com.tencent.mm.ui.chatting.viewitems.eo.this.f203899i);
                }
            }, 200L);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
