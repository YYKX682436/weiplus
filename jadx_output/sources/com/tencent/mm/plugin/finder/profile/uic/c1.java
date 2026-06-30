package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC f123578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wx0 f123579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC, r45.wx0 wx0Var) {
        super(0);
        this.f123578d = finderProfileAllLayoutUIC;
        this.f123579e = wx0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protobuf.g byteString;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC = this.f123578d;
        intent.putExtra("finder_username", finderProfileAllLayoutUIC.getUsername());
        r45.wx0 wx0Var = this.f123579e;
        intent.putExtra("KEY_LAST_BUFFER", (wx0Var == null || (byteString = wx0Var.getByteString(2)) == null) ? null : byteString.g());
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).ek(finderProfileAllLayoutUIC.getContext(), intent);
        return jz5.f0.f302826a;
    }
}
