package com.tencent.mm.plugin.finder.nearby.video;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.video.d0 f122170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.finder.nearby.video.d0 d0Var) {
        super(1);
        this.f122170d = d0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Number) obj).intValue() == -1) {
            com.tencent.mm.plugin.finder.nearby.video.d0 d0Var = this.f122170d;
            return new com.tencent.mm.plugin.finder.convert.i8(new com.tencent.mm.plugin.finder.nearby.video.z(d0Var), new com.tencent.mm.plugin.finder.nearby.video.a0(d0Var), null, false, 12, null);
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.sdk.platformtools.Log.c("RecyclerViewAdapterEx", "type invalid", new java.lang.Object[0]);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }
}
