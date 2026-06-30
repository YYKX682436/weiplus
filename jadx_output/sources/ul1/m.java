package ul1;

/* loaded from: classes7.dex */
public final class m extends android.text.Spannable.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final int f428587a;

    public m(int i17) {
        this.f428587a = i17;
    }

    @Override // android.text.Spannable.Factory
    public android.text.Spannable newSpannable(java.lang.CharSequence charSequence) {
        android.text.Spannable newSpannable = super.newSpannable(charSequence);
        if (newSpannable == null) {
            return null;
        }
        newSpannable.setSpan(new ul1.l(this.f428587a), 0, newSpannable.length(), 18);
        return newSpannable;
    }
}
