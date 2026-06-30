package kz4;

/* loaded from: classes5.dex */
public class b implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.Spanned f313948d;

    public b(android.text.Spanned spanned) {
        this.f313948d = spanned;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        android.text.style.CharacterStyle characterStyle = (android.text.style.CharacterStyle) obj;
        android.text.style.CharacterStyle characterStyle2 = (android.text.style.CharacterStyle) obj2;
        android.text.Spanned spanned = this.f313948d;
        int spanStart = spanned.getSpanStart(characterStyle);
        int spanStart2 = spanned.getSpanStart(characterStyle2);
        if (spanStart != spanStart2) {
            return spanStart - spanStart2;
        }
        int spanEnd = spanned.getSpanEnd(characterStyle);
        int spanEnd2 = spanned.getSpanEnd(characterStyle2);
        return spanEnd != spanEnd2 ? spanEnd2 - spanEnd : characterStyle.getClass().getName().compareTo(characterStyle2.getClass().getName());
    }
}
