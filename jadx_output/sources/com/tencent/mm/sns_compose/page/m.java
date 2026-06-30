package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f193529e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f193530f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f193531g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, boolean z17, yz5.a aVar, int i17) {
        super(2);
        this.f193528d = str;
        this.f193529e = z17;
        this.f193530f = aVar;
        this.f193531g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f193531g | 1;
        boolean z17 = this.f193529e;
        yz5.a aVar = this.f193530f;
        com.tencent.mm.sns_compose.page.s0.d(this.f193528d, z17, aVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
