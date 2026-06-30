package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.x f129216d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.ui.fav.x xVar) {
        super(4);
        this.f129216d = xVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        q40.h hVar;
        in5.s0 holder = (in5.s0) obj;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed item = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj4).booleanValue();
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.ui.fav.a aVar = this.f129216d.f129219c;
        com.tencent.mm.plugin.finder.ui.fav.g gVar = aVar instanceof com.tencent.mm.plugin.finder.ui.fav.g ? (com.tencent.mm.plugin.finder.ui.fav.g) aVar : null;
        if (gVar != null && (hVar = gVar.f129167g) != null) {
            hVar.a3(intValue, booleanValue ? 111 : com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT);
        }
        return jz5.f0.f302826a;
    }
}
