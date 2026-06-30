package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jk extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f113126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(2);
        this.f113126d = hmVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f113126d;
        if (booleanValue) {
            com.tencent.mm.plugin.finder.live.plugin.hm.T1(hmVar, null, null, null, 7, null);
            hmVar.f112834u.getRv().post(new com.tencent.mm.plugin.finder.live.plugin.ik(hmVar));
        } else {
            com.tencent.mars.xlog.Log.i(hmVar.f112831r, "[giftPkgBuySuccess] doGetGiftList faild, errcode = " + intValue + ", return");
        }
        return jz5.f0.f302826a;
    }
}
