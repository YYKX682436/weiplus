package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ac f115320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb(com.tencent.mm.plugin.finder.live.plugin.ac acVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f115320d = acVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.zb(this.f115320d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.zb zbVar = (com.tencent.mm.plugin.finder.live.plugin.zb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zbVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.plugin.ac acVar = this.f115320d;
        acVar.f111850t.O6();
        fe2.q qVar = (fe2.q) acVar.X0(fe2.q.class);
        if (qVar != null) {
            he2.h hVar = qVar.f261531v;
            java.util.Iterator it = hVar.f280898e.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (((ee2.a) it.next()).f251583g instanceof com.tencent.mm.plugin.finder.live.plugin.tb) {
                    break;
                }
                i17++;
            }
            java.util.ArrayList arrayList = hVar.f280898e;
            pm0.v.b0(arrayList, he2.g.f280893d);
            com.google.android.material.tabs.TabLayout tabLayout = qVar.f261528s;
            if (i17 >= 0 && i17 < tabLayout.getTabCount()) {
                tabLayout.o(i17);
            }
            tabLayout.setVisibility(arrayList.size() <= 1 ? 8 : 0);
            he2.f fVar = qVar.f261532w;
            if (fVar != null) {
                fVar.notifyDataSetChanged();
            }
            qVar.B1();
            ((mm2.e0) qVar.P0(mm2.e0.class)).O6();
        }
        return jz5.f0.f302826a;
    }
}
