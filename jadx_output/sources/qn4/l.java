package qn4;

/* loaded from: classes12.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.m f365253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f365254e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(qn4.m mVar, float f17) {
        super(0);
        this.f365253d = mVar;
        this.f365254e = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.CharSequence charSequence;
        android.text.style.CharacterStyle characterStyle;
        java.lang.Object m521constructorimpl;
        qn4.m mVar = this.f365253d;
        boolean z17 = mVar.f365259e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17) {
            java.lang.ref.WeakReference weakReference = mVar.f365256b;
            jz5.f0 f0Var2 = null;
            android.widget.TextView textView = weakReference != null ? (android.widget.TextView) weakReference.get() : null;
            java.lang.ref.WeakReference weakReference2 = mVar.f365257c;
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = weakReference2 != null ? (com.tencent.mm.ui.widget.MMNeat7extView) weakReference2.get() : null;
            if ((textView != null || mMNeat7extView != null) && (charSequence = mVar.f365258d) != null && (characterStyle = mVar.f365255a) != null) {
                int ceil = (int) java.lang.Math.ceil(charSequence.length() * e06.p.e(this.f365254e, 0.0f, 1.0f));
                int length = charSequence.length();
                if (ceil > length) {
                    ceil = length;
                }
                charSequence.length();
                if (ceil < charSequence.length()) {
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
                        spannableStringBuilder.append(charSequence.subSequence(0, charSequence.length())).setSpan(characterStyle, ceil, charSequence.length(), 33);
                        if (textView != null) {
                            textView.setText(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE);
                        }
                        if (mMNeat7extView != null) {
                            mMNeat7extView.c(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE, null);
                            f0Var2 = f0Var;
                        }
                        m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var2);
                    } catch (java.lang.Throwable th6) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    }
                    java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                    if (m524exceptionOrNullimpl != null) {
                        com.tencent.mars.xlog.Log.e("TranslationSpeechSpeechMarque", "Update progress failed", m524exceptionOrNullimpl);
                    }
                }
            }
        }
        return f0Var;
    }
}
