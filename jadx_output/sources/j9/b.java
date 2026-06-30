package j9;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f298262a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f298263b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f298264c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f298265d = new android.text.SpannableStringBuilder();

    /* renamed from: e, reason: collision with root package name */
    public int f298266e;

    /* renamed from: f, reason: collision with root package name */
    public int f298267f;

    /* renamed from: g, reason: collision with root package name */
    public int f298268g;

    /* renamed from: h, reason: collision with root package name */
    public int f298269h;

    /* renamed from: i, reason: collision with root package name */
    public int f298270i;

    /* renamed from: j, reason: collision with root package name */
    public int f298271j;

    public b(int i17, int i18) {
        c(i17, i18);
    }

    public android.text.SpannableString a() {
        int i17;
        android.text.SpannableStringBuilder spannableStringBuilder = this.f298265d;
        int length = spannableStringBuilder.length();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            java.util.List list = this.f298262a;
            if (i19 >= ((java.util.ArrayList) list).size()) {
                break;
            }
            spannableStringBuilder.setSpan(((java.util.ArrayList) list).get(i19), 0, length, 33);
            i19++;
        }
        while (true) {
            java.util.List list2 = this.f298263b;
            if (i18 >= ((java.util.ArrayList) list2).size()) {
                break;
            }
            j9.a aVar = (j9.a) ((java.util.ArrayList) list2).get(i18);
            int size = ((java.util.ArrayList) list2).size();
            int i27 = aVar.f298261c;
            if (i18 < size - i27) {
                i17 = ((j9.a) ((java.util.ArrayList) list2).get(i27 + i18)).f298260b;
            } else {
                i17 = length;
            }
            spannableStringBuilder.setSpan(aVar.f298259a, aVar.f298260b, i17, 33);
            i18++;
        }
        if (this.f298271j != -1) {
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), this.f298271j, length, 33);
        }
        return new android.text.SpannableString(spannableStringBuilder);
    }

    public boolean b() {
        return ((java.util.ArrayList) this.f298262a).isEmpty() && ((java.util.ArrayList) this.f298263b).isEmpty() && this.f298264c.isEmpty() && this.f298265d.length() == 0;
    }

    public void c(int i17, int i18) {
        this.f298262a.clear();
        this.f298263b.clear();
        this.f298264c.clear();
        this.f298265d.clear();
        this.f298266e = 15;
        this.f298267f = 0;
        this.f298268g = 0;
        this.f298269h = i17;
        this.f298270i = i18;
        this.f298271j = -1;
    }

    public void d(android.text.style.CharacterStyle characterStyle, int i17) {
        ((java.util.ArrayList) this.f298263b).add(new j9.a(characterStyle, this.f298265d.length(), i17));
    }

    public java.lang.String toString() {
        return this.f298265d.toString();
    }
}
