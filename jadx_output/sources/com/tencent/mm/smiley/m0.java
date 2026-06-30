package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class m0 implements com.tencent.mm.smiley.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f193311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f193312c;

    public m0(int i17, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2) {
        this.f193310a = i17;
        this.f193311b = f0Var;
        this.f193312c = f0Var2;
    }

    @Override // com.tencent.mm.smiley.b1
    public boolean a(com.tencent.mm.smiley.a1 item, int i17, int i18) {
        kotlin.jvm.internal.o.g(item, "item");
        int i19 = i18 - 1;
        if (i19 <= this.f193310a) {
            this.f193311b.f310116d = i19;
        }
        this.f193312c.f310116d = i19;
        return true;
    }
}
