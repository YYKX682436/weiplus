package oq;

/* loaded from: classes12.dex */
public final class a implements com.tencent.mm.smiley.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final f21.e f347294a;

    /* renamed from: b, reason: collision with root package name */
    public final f21.f f347295b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f347296c;

    public a(f21.e eggInfo, int i17, f21.f keyword) {
        kotlin.jvm.internal.o.g(eggInfo, "eggInfo");
        kotlin.jvm.internal.o.g(keyword, "keyword");
        this.f347294a = eggInfo;
        this.f347295b = keyword;
        java.lang.String keyWord = keyword.f258891d;
        kotlin.jvm.internal.o.f(keyWord, "keyWord");
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = keyWord.toLowerCase(locale);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        int length = lowerCase.length();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        while (i18 < length) {
            int codePointAt = lowerCase.codePointAt(i18);
            linkedList.add(java.lang.Integer.valueOf(codePointAt));
            i18 += java.lang.Character.charCount(codePointAt);
        }
        this.f347296c = kz5.n0.R0(linkedList);
    }

    @Override // com.tencent.mm.smiley.a1
    public int[] a() {
        return this.f347296c;
    }
}
