package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wp extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f114989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp(com.tencent.mm.plugin.finder.live.plugin.dq dqVar) {
        super(1);
        this.f114989d = dqVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.dq dqVar = this.f114989d;
        if (booleanValue) {
            if (dqVar.C != -1) {
                ((mm2.f7) dqVar.P0(mm2.f7.class)).f329060h.postValue(new mm2.a7(true, qs5.s.f366468h));
            } else {
                qo0.c.a(dqVar.f112321p, qo0.b.S1, null, 2, null);
            }
        } else if (dqVar.C != -1) {
            ((mm2.f7) dqVar.P0(mm2.f7.class)).f329060h.postValue(new mm2.a7(true, qs5.s.f366468h));
        }
        return jz5.f0.f302826a;
    }
}
