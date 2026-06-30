package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.smiley.w1 f193313a = com.tencent.mm.smiley.e0.f193238a.f193250a;

    /* renamed from: b, reason: collision with root package name */
    public int f193314b;

    public final void a(com.tencent.mm.smiley.h1 item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f193313a.b(item, 0, com.tencent.mm.smiley.j1.f193293d);
        this.f193314b = java.lang.Math.max(this.f193314b, item.f193270e.length);
    }

    public void b(java.lang.CharSequence charSequence, int i17, int i18, com.tencent.mm.smiley.b1 matchCallback) {
        kotlin.jvm.internal.o.g(matchCallback, "matchCallback");
        new com.tencent.mm.smiley.r(this.f193313a).a(charSequence, i17, i18, matchCallback);
    }
}
