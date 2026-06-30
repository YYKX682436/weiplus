package qn4;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public android.text.style.CharacterStyle f365255a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f365256b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f365257c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f365258d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f365259e;

    public final void a() {
        this.f365259e = false;
        this.f365255a = null;
        java.lang.ref.WeakReference weakReference = this.f365256b;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f365256b = null;
        java.lang.ref.WeakReference weakReference2 = this.f365257c;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f365257c = null;
        this.f365258d = null;
    }

    public final void b(android.widget.TextView textView, com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView, java.lang.CharSequence charSequence, boolean z17) {
        android.content.Context context;
        com.tencent.mars.xlog.Log.i("TranslationSpeechSpeechMarque", "startMarquee, text length: " + charSequence.length() + ", isFromUser: " + z17);
        if (textView != null) {
            this.f365256b = new java.lang.ref.WeakReference(textView);
        }
        if (mMNeat7extView != null) {
            this.f365257c = new java.lang.ref.WeakReference(mMNeat7extView);
        }
        this.f365258d = charSequence;
        this.f365259e = true;
        if (textView == null || (context = textView.getContext()) == null) {
            context = mMNeat7extView != null ? mMNeat7extView.getContext() : null;
        }
        if (context == null) {
            a();
            return;
        }
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(context.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        this.f365255a = foregroundColorSpan;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append(charSequence.subSequence(0, charSequence.length())).setSpan(foregroundColorSpan, 0, charSequence.length(), 33);
        if (textView != null) {
            textView.setText(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE);
        }
        if (mMNeat7extView != null) {
            mMNeat7extView.c(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE, null);
        }
    }
}
