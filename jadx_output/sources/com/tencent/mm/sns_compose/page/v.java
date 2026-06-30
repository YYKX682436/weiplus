package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f193592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f193593f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f193594g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, java.util.List list, yz5.l lVar, int i17) {
        super(2);
        this.f193591d = str;
        this.f193592e = list;
        this.f193593f = lVar;
        this.f193594g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f193594g | 1;
        java.util.List list = this.f193592e;
        yz5.l lVar = this.f193593f;
        com.tencent.mm.sns_compose.page.s0.f(this.f193591d, list, lVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
