package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class k1 implements com.tencent.mm.smiley.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f193306b;

    public k1(int i17, kotlin.jvm.internal.f0 f0Var) {
        this.f193305a = i17;
        this.f193306b = f0Var;
    }

    @Override // com.tencent.mm.smiley.b1
    public boolean a(com.tencent.mm.smiley.a1 item, int i17, int i18) {
        kotlin.jvm.internal.o.g(item, "item");
        int i19 = this.f193305a;
        if (i18 <= i19) {
            return false;
        }
        if (i17 >= i19) {
            return true;
        }
        this.f193306b.f310116d = i18;
        return true;
    }
}
