package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f158528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.x0 f158529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.plugin.ringtone.uic.x0 x0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158529e = x0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.w0(this.f158529e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f158528d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.ringtone.uic.x0 x0Var = this.f158529e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                ux3.e eVar = new ux3.e(x0Var.f158539g, x0Var.f158538f + 1);
                this.f158528d = 1;
                a17 = rm0.h.a(eVar, 0L, null, this, 3, null);
                if (a17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                a17 = obj;
            }
            t45.n nVar = (t45.n) a17;
            x0Var.f158537e = nVar.f415613d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            boolean z17 = x0Var.f158538f == -1;
            java.util.LinkedList<t45.l> Infos = nVar.f415614e;
            kotlin.jvm.internal.o.f(Infos, "Infos");
            for (t45.l lVar : Infos) {
                int i18 = x0Var.f158538f;
                if (i18 == -1 || i18 < lVar.f415600e) {
                    x0Var.f158538f = lVar.f415600e;
                }
                arrayList.add(lVar);
            }
            x0Var.f158536d = arrayList;
            if (z17) {
                androidx.appcompat.app.AppCompatActivity activity = x0Var.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                ox3.l lVar2 = ((com.tencent.mm.plugin.ringtone.uic.g) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.g.class)).f158407d;
                lVar2.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataViewModel", "clearDataSource");
                ((kotlinx.coroutines.flow.q2) lVar2.f349764d).e(new ed0.s0(null, 1));
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = x0Var.f158536d.iterator();
            while (it.hasNext()) {
                t45.n0 n0Var = ((t45.l) it.next()).f415599d;
                if (n0Var != null) {
                    arrayList2.add(new ox3.g(n0Var));
                }
            }
            return f0Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneFinderAuthorDataUIC", "GetFinderAuthorRingBack failed: " + e17.getMessage());
            x0Var.f158537e = false;
            x0Var.f158536d = new java.util.ArrayList();
            androidx.appcompat.app.AppCompatActivity activity2 = x0Var.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((com.tencent.mm.plugin.ringtone.uic.g) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.ringtone.uic.g.class)).O6();
            return f0Var;
        }
    }
}
