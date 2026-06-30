package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class d6 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h6 f151098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(com.tencent.mm.plugin.mv.ui.uic.h6 h6Var) {
        super(2);
        this.f151098d = h6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        dk4.a mediaInfo = (dk4.a) obj2;
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        long j17 = longValue - mediaInfo.f234477n;
        long j18 = mediaInfo.f234478o;
        if (j18 <= 0) {
            j18 = mediaInfo.f234470g;
        }
        com.tencent.mm.plugin.mv.ui.uic.h6 h6Var = this.f151098d;
        yz5.p pVar = h6Var.f151183h;
        if (pVar != null) {
            pVar.invoke(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        }
        yz5.l lVar = h6Var.f151184i;
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(longValue));
        }
        return jz5.f0.f302826a;
    }
}
