package ko2;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.question.view.QALikeTextView f309930d;

    public h(com.tencent.mm.plugin.finder.member.question.view.QALikeTextView qALikeTextView) {
        this.f309930d = qALikeTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.finder.member.question.view.QALikeTextView.f121361r;
        com.tencent.mm.plugin.finder.member.question.view.QALikeTextView qALikeTextView = this.f309930d;
        if (qALikeTextView.getLineCount() <= qALikeTextView.maxLine || qALikeTextView.f121362g) {
            return;
        }
        java.lang.CharSequence subSequence = qALikeTextView.oriText.subSequence(0, qALikeTextView.getLayout().getLineVisibleEnd(qALikeTextView.maxLine - 1));
        int L = r26.n0.L(subSequence.toString(), ",", 0, false, 6, null);
        int P = r26.n0.P(subSequence.toString(), ",", 0, false, 6, null);
        if (L == -1) {
            android.text.SpannableStringBuilder append = new android.text.SpannableStringBuilder(qALikeTextView.oriText.subSequence(0, r26.n0.L(qALikeTextView.oriText.toString(), ",", 0, false, 6, null))).append((java.lang.CharSequence) ",").append(qALikeTextView.endText);
            kotlin.jvm.internal.o.f(append, "append(...)");
            qALikeTextView.resultText = append;
            qALikeTextView.setText(append);
            qALikeTextView.f121362g = true;
            return;
        }
        qALikeTextView.endTextView.setText(qALikeTextView.endText);
        qALikeTextView.endTextView.setTextSize(qALikeTextView.getTextSize());
        qALikeTextView.nameTextView.setTextSize(qALikeTextView.getTextSize());
        float measureText = qALikeTextView.endTextView.getPaint().measureText(qALikeTextView.endText.toString());
        while (P > L) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(subSequence.subSequence(P + 1, subSequence.length()));
            qALikeTextView.nameTextView.setText(spannableStringBuilder);
            if (qALikeTextView.nameTextView.getPaint().measureText(spannableStringBuilder.toString()) > measureText) {
                break;
            } else {
                P--;
            }
        }
        android.text.SpannableStringBuilder append2 = new android.text.SpannableStringBuilder(qALikeTextView.oriText.subSequence(0, P)).append((java.lang.CharSequence) ",").append(qALikeTextView.endText);
        kotlin.jvm.internal.o.f(append2, "append(...)");
        qALikeTextView.resultText = append2;
        qALikeTextView.setText(append2);
        qALikeTextView.f121362g = true;
    }
}
