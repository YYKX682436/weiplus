package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class r1 implements com.tencent.mm.smiley.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f193358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f193360c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193361d;

    public r1(java.lang.StringBuilder sb6, java.lang.String str, kotlin.jvm.internal.f0 f0Var, java.lang.String str2) {
        this.f193358a = sb6;
        this.f193359b = str;
        this.f193360c = f0Var;
        this.f193361d = str2;
    }

    @Override // com.tencent.mm.smiley.b1
    public boolean a(com.tencent.mm.smiley.a1 item, int i17, int i18) {
        kotlin.jvm.internal.o.g(item, "item");
        if (!(item instanceof com.tencent.mm.smiley.h1)) {
            return false;
        }
        java.lang.String str = this.f193359b;
        kotlin.jvm.internal.f0 f0Var = this.f193360c;
        int i19 = f0Var.f310116d;
        java.lang.StringBuilder sb6 = this.f193358a;
        sb6.append((java.lang.CharSequence) str, i19, i17);
        sb6.append(this.f193361d);
        f0Var.f310116d = i18;
        return false;
    }
}
