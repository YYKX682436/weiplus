package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class q1 implements com.tencent.mm.smiley.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f193345b;

    public q1(int i17, kotlin.jvm.internal.h0 h0Var) {
        this.f193344a = i17;
        this.f193345b = h0Var;
    }

    @Override // com.tencent.mm.smiley.b1
    public boolean a(com.tencent.mm.smiley.a1 item, int i17, int i18) {
        kotlin.jvm.internal.o.g(item, "item");
        if (i17 != this.f193344a || !(item instanceof com.tencent.mm.smiley.h1)) {
            return true;
        }
        this.f193345b.f310123d = item;
        return true;
    }
}
