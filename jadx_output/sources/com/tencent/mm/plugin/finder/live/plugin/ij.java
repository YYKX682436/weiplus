package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ij extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112980d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij(com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(1);
        this.f112980d = hmVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.lj contact = (com.tencent.mm.plugin.finder.live.plugin.lj) obj;
        kotlin.jvm.internal.o.g(contact, "contact");
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f112980d;
        com.tencent.mars.xlog.Log.i(hmVar.f112831r, "bottomSheetClickListener contact:" + contact);
        com.tencent.mm.plugin.finder.live.plugin.hm.w1(hmVar, contact);
        com.tencent.mm.plugin.finder.live.plugin.hm.v1(hmVar);
        hmVar.M.h();
        return jz5.f0.f302826a;
    }
}
