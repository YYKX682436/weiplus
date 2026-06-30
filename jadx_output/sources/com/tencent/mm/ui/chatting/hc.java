package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class hc {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f201669a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ScrollView f201670b;

    /* renamed from: e, reason: collision with root package name */
    public int f201673e;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f201675g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f201676h;

    /* renamed from: i, reason: collision with root package name */
    public final long f201677i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.a f201678j;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Handler f201671c = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public boolean f201672d = true;

    /* renamed from: f, reason: collision with root package name */
    public int f201674f = 1;

    public hc(com.tencent.mm.ui.chatting.ec ecVar, kotlin.jvm.internal.i iVar) {
        this.f201669a = ecVar.f200473a;
        this.f201670b = ecVar.f200474b;
        this.f201675g = ecVar.f200475c;
        this.f201676h = ecVar.f200476d;
        this.f201677i = ecVar.f200477e;
        this.f201678j = ecVar.f200478f;
    }

    public final android.text.SpannableString a(android.text.SpannableString spannableString, int i17) {
        android.widget.ScrollView scrollView;
        int i18;
        int i19;
        kotlin.jvm.internal.o.g(spannableString, "spannableString");
        int i27 = this.f201673e;
        android.view.View view = this.f201669a;
        spannableString.setSpan(new com.tencent.mm.ui.chatting.dc(view, i17, this.f201673e, this.f201674f + 1), wl5.y.h(view, wl5.y.d(view, i27)), java.lang.Math.min(this.f201674f + 1, spannableString.length()), 17);
        boolean z17 = this.f201676h;
        if (z17) {
            android.os.Handler handler = this.f201671c;
            handler.removeCallbacksAndMessages(null);
            this.f201672d = true;
            if (z17) {
                handler.postDelayed(new com.tencent.mm.ui.chatting.gc(this), this.f201677i);
            }
        }
        boolean z18 = this.f201675g;
        if (z18 && (scrollView = this.f201670b) != null && z18 && (i18 = this.f201673e) != -1 && (i19 = this.f201674f) != -1) {
            android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.post(new com.tencent.mm.ui.chatting.fc(textView, scrollView, i18, i19));
            }
        }
        return spannableString;
    }

    public final void b() {
        if (this.f201672d) {
            this.f201672d = false;
            android.view.View view = this.f201669a;
            java.lang.CharSequence o17 = wl5.y.o(view);
            android.text.Spannable spannable = o17 instanceof android.text.Spannable ? (android.text.Spannable) o17 : null;
            if (spannable != null) {
                java.lang.Object[] spans = spannable.getSpans(0, spannable.length(), com.tencent.mm.ui.chatting.dc.class);
                kotlin.jvm.internal.o.f(spans, "getSpans(...)");
                for (java.lang.Object obj : spans) {
                    spannable.removeSpan((com.tencent.mm.ui.chatting.dc) obj);
                }
                wl5.y.q(view, spannable, android.widget.TextView.BufferType.SPANNABLE);
            }
            yz5.a aVar = this.f201678j;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }
}
