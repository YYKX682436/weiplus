package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class h1 implements com.tencent.mm.smiley.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f193266a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f193267b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f193268c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193269d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f193270e;

    public h1(int i17, java.lang.String key, java.lang.String text, java.lang.String str) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(text, "text");
        this.f193266a = i17;
        this.f193267b = key;
        this.f193268c = text;
        this.f193269d = str;
        int length = text.length();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        while (i18 < length) {
            int codePointAt = text.codePointAt(i18);
            linkedList.add(java.lang.Integer.valueOf(codePointAt));
            i18 += java.lang.Character.charCount(codePointAt);
        }
        this.f193270e = kz5.n0.R0(linkedList);
    }

    @Override // com.tencent.mm.smiley.a1
    public int[] a() {
        return this.f193270e;
    }
}
