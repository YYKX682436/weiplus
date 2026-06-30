package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f158336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b0 f158337e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.ringtone.uic.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158337e = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.a0(this.f158337e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.ringtone.uic.b0 b0Var;
        px3.j jVar;
        java.lang.Object a17;
        px3.j jVar2;
        com.tencent.mm.storage.k4 Bi;
        com.tencent.mm.storage.z3 n17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f158336d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.ringtone.uic.b0 b0Var2 = this.f158337e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (!b0Var2.f158344e) {
                    px3.j jVar3 = b0Var2.f158346g;
                    if (jVar3 != null) {
                        jVar3.N6(b0Var2.f158345f);
                    }
                    return f0Var;
                }
                ux3.d dVar = new ux3.d(b0Var2.f158343d);
                this.f158336d = 1;
                b0Var = b0Var2;
                b0Var2 = null;
                try {
                    a17 = rm0.h.a(dVar, 0L, null, this, 3, null);
                    if (a17 == aVar) {
                        return aVar;
                    }
                } catch (rm0.j e17) {
                    e = e17;
                    b0Var.f158344e = false;
                    com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneExclusiveDataUIC", "GetAllFriendRingBackCgi failed: " + e.f397426g);
                    if (b0Var.f158343d == -1 && (jVar = b0Var.f158346g) != null) {
                        jVar.f358954i = kotlinx.coroutines.l.d(jVar.f358950e, null, null, new px3.g(jVar, null), 3, null);
                    }
                    px3.j jVar4 = b0Var.f158346g;
                    if (jVar4 != null) {
                        jVar4.N6(b0Var.f158345f);
                    }
                    return f0Var;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                a17 = obj;
                b0Var = b0Var2;
            }
            t45.k kVar = (t45.k) a17;
            b0Var.f158343d = -1L;
            b0Var.f158344e = kVar.f415595d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.LinkedList<t45.i> Infos = kVar.f415596e;
            kotlin.jvm.internal.o.f(Infos, "Infos");
            for (t45.i iVar : Infos) {
                long j17 = b0Var.f158343d;
                if (j17 == -1 || j17 > iVar.f415591g) {
                    b0Var.f158343d = iVar.f415591g;
                }
                java.lang.String str = iVar.f415588d;
                if (str != null) {
                    vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
                    if ((x3Var == null || (Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) x3Var).Bi()) == null || (n17 = Bi.n(str, true)) == null) ? false : n17.r2()) {
                        java.util.ArrayList arrayList2 = b0Var.f158345f;
                        if (!arrayList2.contains(str)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneExclusiveDataUIC", "ringtone username is ".concat(str));
                            arrayList2.add(str);
                            arrayList.add(new ox3.a(iVar));
                        }
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.RingtoneExclusiveDataUIC", str.concat(" is not you friend"));
                }
            }
            px3.j jVar5 = b0Var.f158346g;
            if (jVar5 != null) {
                jVar5.f358954i = kotlinx.coroutines.l.d(jVar5.f358950e, null, null, new px3.d(jVar5, arrayList, null), 3, null);
            }
            if (!b0Var.f158344e && (jVar2 = b0Var.f158346g) != null) {
                jVar2.N6(b0Var.f158345f);
            }
            return f0Var;
        } catch (rm0.j e18) {
            e = e18;
            b0Var = b0Var2;
        }
    }
}
