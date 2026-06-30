package h12;

/* loaded from: classes5.dex */
public final class j implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f278094d;

    public j(java.lang.CharSequence charSequence) {
        this.f278094d = charSequence;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        android.text.SpannableString spannableString = (android.text.SpannableString) this.f278094d;
        return spannableString.getSpanStart((al5.w) obj) - spannableString.getSpanStart((al5.w) obj2);
    }
}
