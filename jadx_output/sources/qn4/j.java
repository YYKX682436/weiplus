package qn4;

/* loaded from: classes12.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.m f365251d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qn4.m mVar) {
        super(0);
        this.f365251d = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var = jz5.f0.f302826a;
        qn4.m mVar = this.f365251d;
        mVar.getClass();
        com.tencent.mars.xlog.Log.i("TranslationSpeechSpeechMarque", "stopMarquee");
        mVar.f365259e = false;
        java.lang.ref.WeakReference weakReference = mVar.f365256b;
        jz5.f0 f0Var2 = null;
        android.widget.TextView textView = weakReference != null ? (android.widget.TextView) weakReference.get() : null;
        java.lang.ref.WeakReference weakReference2 = mVar.f365257c;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = weakReference2 != null ? (com.tencent.mm.ui.widget.MMNeat7extView) weakReference2.get() : null;
        android.text.style.CharacterStyle characterStyle = mVar.f365255a;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (textView != null) {
                java.lang.CharSequence text = textView.getText();
                if ((text instanceof android.text.Spannable) && characterStyle != null) {
                    ((android.text.Spannable) text).removeSpan(characterStyle);
                    textView.setText(text, android.widget.TextView.BufferType.SPANNABLE);
                }
            }
            if (mMNeat7extView != null) {
                java.lang.CharSequence a17 = mMNeat7extView.a();
                if ((a17 instanceof android.text.Spannable) && characterStyle != null) {
                    ((android.text.Spannable) a17).removeSpan(characterStyle);
                    mMNeat7extView.c(a17, android.widget.TextView.BufferType.SPANNABLE, null);
                }
                f0Var2 = f0Var;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var2);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("TranslationSpeechSpeechMarque", "stopMarqueeInternal: remove span failed", m524exceptionOrNullimpl);
        }
        mVar.a();
        return f0Var;
    }
}
