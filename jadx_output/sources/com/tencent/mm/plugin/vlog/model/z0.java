package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f175800d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f175801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f175802f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f175802f = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.vlog.model.z0 z0Var = new com.tencent.mm.plugin.vlog.model.z0(this.f175802f, continuation);
        z0Var.f175801e = obj;
        return z0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.vlog.model.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object a17;
        java.util.List list;
        long j17;
        com.tencent.mm.plugin.vlog.model.b1 b1Var;
        long j18;
        int i17;
        int i18;
        com.tencent.mm.plugin.vlog.model.b1 b1Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i19 = this.f175800d;
        java.util.List list2 = this.f175802f;
        java.lang.Object[] objArr = null;
        int i27 = 1;
        if (i19 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f175801e;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(kotlinx.coroutines.l.b(y0Var, null, null, new com.tencent.mm.plugin.vlog.model.y0((com.tencent.mm.plugin.vlog.model.b1) it.next(), null), 3, null));
            }
            this.f175800d = 1;
            a17 = kotlinx.coroutines.h.a(arrayList, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i19 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = obj;
        }
        java.util.List V = kz5.n0.V((java.lang.Iterable) a17);
        int i28 = 0;
        for (java.lang.Object obj2 : V) {
            int i29 = i28 + 1;
            if (i28 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) obj2;
            com.tencent.mm.plugin.vlog.model.b1 b1Var3 = (com.tencent.mm.plugin.vlog.model.b1) list2.get(i28);
            int i37 = i1Var.f175617b;
            com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem editItem = i1Var.f175626k;
            if (i37 == i27) {
                list = list2;
                kotlin.jvm.internal.o.e(b1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.ImageSource");
                editItem.type = i27;
                j17 = 4000;
                b1Var2 = (com.tencent.mm.plugin.vlog.model.o0) b1Var3;
            } else if (i37 != 2) {
                java.lang.String str = "unknown track type:" + i1Var.f175617b;
                int i38 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("MicroMsg.SourceMaterial", str, objArr);
                list = list2;
                j17 = 0;
                b1Var2 = b1Var3;
            } else {
                kotlin.jvm.internal.o.e(b1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoSource");
                com.tencent.mm.plugin.vlog.model.q1 q1Var = (com.tencent.mm.plugin.vlog.model.q1) b1Var3;
                list = list2;
                j17 = q1Var.f175715f;
                long j19 = j17 <= 60000 ? j17 : 60000L;
                editItem.type = 2;
                j18 = j19;
                b1Var = q1Var;
                i1Var.d(0L);
                i1Var.c(j18);
                editItem.originDuration = j17;
                editItem.targetDuration = j17;
                i17 = b1Var.f175568a;
                i18 = b1Var.f175569b;
                if (i17 <= 1080 || i18 > 1280) {
                    float max = java.lang.Math.max((i17 * 1.0f) / 1080, (i18 * 1.0f) / 1280);
                    i1Var.f175621f = (int) (b1Var.f175568a / max);
                    i1Var.f175622g = (int) (i18 / max);
                    i1Var.f175623h = max;
                } else {
                    i1Var.f175621f = i17;
                    i1Var.f175622g = i18;
                }
                i28 = i29;
                list2 = list;
                objArr = null;
                i27 = 1;
            }
            j18 = j17;
            b1Var = b1Var2;
            i1Var.d(0L);
            i1Var.c(j18);
            editItem.originDuration = j17;
            editItem.targetDuration = j17;
            i17 = b1Var.f175568a;
            i18 = b1Var.f175569b;
            if (i17 <= 1080) {
            }
            float max2 = java.lang.Math.max((i17 * 1.0f) / 1080, (i18 * 1.0f) / 1280);
            i1Var.f175621f = (int) (b1Var.f175568a / max2);
            i1Var.f175622g = (int) (i18 / max2);
            i1Var.f175623h = max2;
            i28 = i29;
            list2 = list;
            objArr = null;
            i27 = 1;
        }
        rm5.i iVar = rm5.j.f397498v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(V, 10));
        java.util.Iterator it6 = V.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.tencent.mm.plugin.vlog.model.i1) it6.next()).f175627l);
        }
        iVar.a(arrayList2);
        return V;
    }
}
