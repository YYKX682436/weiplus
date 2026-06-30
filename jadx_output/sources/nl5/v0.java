package nl5;

/* loaded from: classes14.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.text.BreakIterator f338383a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f338384b;

    /* renamed from: c, reason: collision with root package name */
    public int f338385c;

    public v0(java.util.Locale locale) {
        kotlin.jvm.internal.o.g(locale, "locale");
        java.text.BreakIterator wordInstance = java.text.BreakIterator.getWordInstance(locale);
        kotlin.jvm.internal.o.f(wordInstance, "getWordInstance(...)");
        this.f338383a = wordInstance;
        this.f338384b = "";
    }
}
