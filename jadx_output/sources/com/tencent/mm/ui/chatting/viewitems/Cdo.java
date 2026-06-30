package com.tencent.mm.ui.chatting.viewitems;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.do, reason: invalid class name */
/* loaded from: classes5.dex */
public class Cdo implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jl1.a f203812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableStringBuilder f203813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f203814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f203815g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f203816h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f203817i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate f203818m;

    public Cdo(com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate, jl1.a aVar, android.text.SpannableStringBuilder spannableStringBuilder, java.lang.CharSequence charSequence, int i17, int i18, long j17) {
        this.f203818m = chattingItemTranslate;
        this.f203812d = aVar;
        this.f203813e = spannableStringBuilder;
        this.f203814f = charSequence;
        this.f203815g = i17;
        this.f203816h = i18;
        this.f203817i = j17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(this.f203812d.a(((java.lang.Float) valueAnimator.getAnimatedValue("ratio")).floatValue()));
        android.text.SpannableStringBuilder spannableStringBuilder = this.f203813e;
        spannableStringBuilder.clear();
        java.lang.CharSequence charSequence = this.f203814f;
        int i17 = this.f203815g;
        spannableStringBuilder.append(charSequence.subSequence(0, i17)).setSpan(foregroundColorSpan, this.f203816h, i17, 33);
        com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate = this.f203818m;
        chattingItemTranslate.f203209e.c(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE, null);
        if (((com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) ((yb5.d) chattingItemTranslate.f203216o.get()).f460708c.a(sb5.k2.class))).o0(this.f203817i)) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate.a(chattingItemTranslate);
        }
    }
}
