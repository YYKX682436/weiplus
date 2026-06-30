package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ro extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f114172d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro(com.tencent.mm.plugin.finder.live.plugin.ap apVar) {
        super(2);
        this.f114172d = apVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).floatValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.f114172d;
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) apVar.A.get(apVar.f111921v);
        if (tnVar != null) {
            tnVar.d(booleanValue);
        }
        return jz5.f0.f302826a;
    }
}
