package kl5;

/* loaded from: classes14.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f308977a;

    /* renamed from: b, reason: collision with root package name */
    public int f308978b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f308979c;

    /* renamed from: d, reason: collision with root package name */
    public final java.text.BreakIterator f308980d;

    public b(java.util.Locale locale) {
        this.f308980d = java.text.BreakIterator.getWordInstance(locale);
    }

    public static java.util.List a(java.lang.String str) {
        if (str == null) {
            return new java.util.ArrayList();
        }
        java.text.BreakIterator wordInstance = java.text.BreakIterator.getWordInstance(java.util.Locale.getDefault());
        wordInstance.setText(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int first = wordInstance.first();
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[\\p{Punct}]+");
        while (first != -1) {
            int next = wordInstance.next();
            if (next != -1 && next > first) {
                java.lang.String trim = str.substring(first, next).trim();
                int length = trim.length();
                boolean z17 = false;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        z17 = true;
                        break;
                    }
                    int codePointAt = trim.codePointAt(i17);
                    if (!java.lang.Character.isWhitespace(codePointAt)) {
                        break;
                    }
                    i17 += java.lang.Character.charCount(codePointAt);
                }
                if (!z17 && !compile.matcher(trim).matches()) {
                    arrayList.add(trim);
                }
            }
            first = next;
        }
        return arrayList;
    }

    public static boolean i(int i17) {
        int type = java.lang.Character.getType(i17);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public final void b(int i17) {
        if (this.f308977a > i17 || i17 > this.f308978b) {
            throw new java.lang.IllegalArgumentException("Invalid offset: " + i17 + ". Valid range is [" + this.f308977a + ", " + this.f308978b + "]");
        }
    }

    public final int c(int i17, boolean z17) {
        b(i17);
        try {
            boolean g17 = g(i17);
            java.text.BreakIterator breakIterator = this.f308980d;
            if (g17) {
                return (!breakIterator.isBoundary(i17) || (e(i17) && z17)) ? breakIterator.preceding(i17) : i17;
            }
            if (e(i17)) {
                return breakIterator.preceding(i17);
            }
            return -1;
        } catch (java.lang.Throwable unused) {
            return -1;
        }
    }

    public final int d(int i17, boolean z17) {
        b(i17);
        boolean e17 = e(i17);
        java.text.BreakIterator breakIterator = this.f308980d;
        if (e17) {
            return (!breakIterator.isBoundary(i17) || (g(i17) && z17)) ? breakIterator.following(i17) : i17;
        }
        if (g(i17)) {
            return breakIterator.following(i17);
        }
        return -1;
    }

    public final boolean e(int i17) {
        return this.f308977a < i17 && i17 <= this.f308978b && java.lang.Character.isLetterOrDigit(java.lang.Character.codePointBefore(this.f308979c, i17));
    }

    public boolean f(int i17) {
        if (this.f308977a >= i17 || i17 > this.f308978b) {
            return false;
        }
        return i(java.lang.Character.codePointBefore(this.f308979c, i17));
    }

    public final boolean g(int i17) {
        return this.f308977a <= i17 && i17 < this.f308978b && java.lang.Character.isLetterOrDigit(java.lang.Character.codePointAt(this.f308979c, i17));
    }

    public boolean h(int i17) {
        if (this.f308977a > i17 || i17 >= this.f308978b) {
            return false;
        }
        return i(java.lang.Character.codePointAt(this.f308979c, i17));
    }

    public void j(java.lang.CharSequence charSequence, int i17, int i18) {
        if (i17 < 0 || i18 > charSequence.length()) {
            throw new java.lang.IndexOutOfBoundsException("input indexes are outside the CharSequence");
        }
        this.f308979c = charSequence;
        this.f308977a = java.lang.Math.max(0, i17 - 50);
        int min = java.lang.Math.min(charSequence.length(), i18 + 50);
        this.f308978b = min;
        this.f308980d.setText(new kl5.a(charSequence, this.f308977a, min));
    }
}
