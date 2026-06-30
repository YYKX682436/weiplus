package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class co implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f203741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f203742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f203743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate f203744g;

    public co(com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate, java.lang.CharSequence charSequence, long j17, int i17) {
        this.f203744g = chattingItemTranslate;
        this.f203741d = charSequence;
        this.f203742e = j17;
        this.f203743f = i17;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.lang.CharSequence charSequence;
        int i17;
        int i18;
        com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate = this.f203744g;
        chattingItemTranslate.f203219r.clear();
        android.text.SpannableStringBuilder spannableStringBuilder = chattingItemTranslate.f203219r;
        int i19 = chattingItemTranslate.f203213i;
        long j17 = this.f203742e;
        chattingItemTranslate.getClass();
        if (spannableStringBuilder != null && (charSequence = this.f203741d) != null && charSequence.length() != 0) {
            int length = charSequence.length();
            if (charSequence.length() >= i19) {
                int i27 = i19 + 20;
                if (i27 > charSequence.length()) {
                    i27 = charSequence.length();
                }
                i18 = i19;
                i17 = i27;
            } else {
                i17 = length;
                i18 = i17;
            }
            jl1.a aVar = new jl1.a(0, chattingItemTranslate.getResources().getColor(com.tencent.mm.R.color.a0c));
            android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("ratio", 0.0f, 1.0f));
            ofPropertyValuesHolder.addUpdateListener(new com.tencent.mm.ui.chatting.viewitems.Cdo(chattingItemTranslate, aVar, spannableStringBuilder, charSequence, i17, i18, j17));
            ofPropertyValuesHolder.addListener(new com.tencent.mm.ui.chatting.viewitems.eo(chattingItemTranslate, j17, spannableStringBuilder, charSequence, i17, i18));
            ofPropertyValuesHolder.setDuration(150L).start();
        }
        int i28 = chattingItemTranslate.f203213i + 20;
        int i29 = this.f203743f;
        if (i28 > i29) {
            i28 = i29;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemTranslate", "(%s)currentContentLength:%s newCurrentContentLength:%s endNum:%s animating:%s", java.lang.Integer.valueOf(chattingItemTranslate.f203209e.hashCode()), java.lang.Integer.valueOf(chattingItemTranslate.f203213i), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), java.lang.Boolean.valueOf(chattingItemTranslate.f203214m));
        chattingItemTranslate.f203213i = i28;
        if (i29 != i28) {
            return true;
        }
        if (chattingItemTranslate.f203214m) {
            return false;
        }
        com.tencent.mm.autogen.events.RecallVoiceTransTextActEvent recallVoiceTransTextActEvent = new com.tencent.mm.autogen.events.RecallVoiceTransTextActEvent();
        recallVoiceTransTextActEvent.f54649g.f7737a = this.f203742e;
        recallVoiceTransTextActEvent.e();
        return false;
    }
}
