package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f112850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f112851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hn0(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        super(2, continuation);
        this.f112850d = hVar;
        this.f112851e = wn0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.hn0(this.f112850d, continuation, this.f112851e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.hn0 hn0Var = (com.tencent.mm.plugin.finder.live.plugin.hn0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        hn0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.vu1 vu1Var = (r45.vu1) ((xg2.i) this.f112850d).f454393b;
        boolean z17 = false;
        if (vu1Var.getList(1) != null && (!r0.isEmpty())) {
            z17 = true;
        }
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f112851e;
        wn0Var.f114979v = z17;
        if (zl2.r4.f473950a.w1()) {
            ln2.d dVar = (ln2.d) wn0Var.x1().y().getValue();
            wn0Var.x1().y().postValue(new ln2.d(vu1Var, true, dVar != null ? dVar.f319880c : null, false, dVar != null ? dVar.f319882e : null, false, 32, null));
            if (!dk2.ef.f233372a.x()) {
                wn0Var.z1().E();
                com.tencent.mm.plugin.finder.live.wish.widget.t0 z18 = wn0Var.z1();
                java.util.LinkedList list = vu1Var.getList(1);
                if (!vu1Var.getBoolean(8)) {
                    vu1Var = null;
                }
                z18.G(list, vu1Var != null ? vu1Var.getList(7) : null);
            }
        } else {
            ln2.e eVar = (ln2.e) wn0Var.y1().y().getValue();
            wn0Var.y1().y().postValue(new ln2.e(vu1Var, true, eVar != null ? eVar.f319886c : null, false, eVar != null ? eVar.f319888e : null, false, 32, null));
        }
        wn0Var.f114981x.remove(com.tencent.mm.plugin.finder.live.plugin.mm0.f113536d);
        wn0Var.u1();
        return jz5.f0.f302826a;
    }
}
