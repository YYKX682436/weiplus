package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class b2 implements com.tencent.mm.smiley.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.smiley.g1 f193220a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f193221b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f193222c;

    public b2(java.util.List codePointList, com.tencent.mm.smiley.g1 picItem, boolean z17) {
        kotlin.jvm.internal.o.g(codePointList, "codePointList");
        kotlin.jvm.internal.o.g(picItem, "picItem");
        this.f193220a = picItem;
        this.f193221b = z17;
        this.f193222c = new int[codePointList.size()];
        int i17 = 0;
        for (java.lang.Object obj : codePointList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            this.f193222c[i17] = ((java.lang.Number) obj).intValue();
            i17 = i18;
        }
    }

    @Override // com.tencent.mm.smiley.a1
    public int[] a() {
        return this.f193222c;
    }
}
