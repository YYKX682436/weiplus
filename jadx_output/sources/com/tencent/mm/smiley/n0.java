package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class n0 implements com.tencent.mm.smiley.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f193317b;

    public n0(int i17, kotlin.jvm.internal.f0 f0Var) {
        this.f193316a = i17;
        this.f193317b = f0Var;
    }

    @Override // com.tencent.mm.smiley.b1
    public boolean a(com.tencent.mm.smiley.a1 item, int i17, int i18) {
        kotlin.jvm.internal.o.g(item, "item");
        int i19 = this.f193316a;
        if (!(i17 <= i19 && i19 <= i18)) {
            return i17 >= i19 && i18 >= i19;
        }
        this.f193317b.f310116d = i17 - 1;
        return true;
    }
}
