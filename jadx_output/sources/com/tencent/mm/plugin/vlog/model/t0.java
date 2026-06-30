package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f175722d;

    /* renamed from: e, reason: collision with root package name */
    public int f175723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.u0 f175724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f175725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f175726h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f175727i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.plugin.vlog.model.u0 u0Var, java.util.List list, java.util.List list2, java.util.List list3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f175724f = u0Var;
        this.f175725g = list;
        this.f175726h = list2;
        this.f175727i = list3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.vlog.model.t0(this.f175724f, this.f175725g, this.f175726h, this.f175727i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.vlog.model.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        java.util.LinkedList linkedList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f175723e;
        com.tencent.mm.plugin.vlog.model.u0 u0Var = this.f175724f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            u0Var.f175730d.clear();
            u0Var.f175731e.clear();
            u0Var.f175732f.clear();
            u0Var.f175733g.clear();
            java.util.LinkedList linkedList2 = u0Var.f175730d;
            java.util.List list = this.f175725g;
            linkedList2.addAll(list);
            java.util.LinkedList linkedList3 = u0Var.f175731e;
            java.util.List list2 = this.f175726h;
            linkedList3.addAll(list2);
            u0Var.f175732f.addAll(com.tencent.mm.plugin.vlog.model.b1.f175567d.a(list, list2, this.f175727i));
            java.util.LinkedList linkedList4 = u0Var.f175732f;
            if (!(linkedList4 instanceof java.util.Collection) || !linkedList4.isEmpty()) {
                java.util.Iterator it = linkedList4.iterator();
                while (it.hasNext()) {
                    if (!(((com.tencent.mm.plugin.vlog.model.b1) it.next()) instanceof com.tencent.mm.plugin.vlog.model.o0)) {
                        z17 = false;
                        break;
                    }
                }
            }
            z17 = true;
            u0Var.f175734h = z17;
            java.util.LinkedList linkedList5 = u0Var.f175732f;
            if (!(linkedList5 instanceof java.util.Collection) || !linkedList5.isEmpty()) {
                java.util.Iterator it6 = linkedList5.iterator();
                while (it6.hasNext()) {
                    if (!(((com.tencent.mm.plugin.vlog.model.b1) it6.next()) instanceof com.tencent.mm.plugin.vlog.model.q1)) {
                        z18 = false;
                        break;
                    }
                }
            }
            z18 = true;
            u0Var.f175735i = z18;
            dq4.c cVar = dq4.c.f242369a;
            float f17 = (((com.tencent.mm.plugin.vlog.model.b1) u0Var.f175732f.get(0)).f175569b * 1.0f) / ((com.tencent.mm.plugin.vlog.model.b1) u0Var.f175732f.get(0)).f175568a;
            if (f17 > cVar.c()) {
                f17 = cVar.c();
            } else if (f17 < 0.5625f) {
                f17 = 0.5625f;
            }
            u0Var.f175738o = f17;
            java.util.LinkedList linkedList6 = u0Var.f175733g;
            java.util.LinkedList linkedList7 = u0Var.f175732f;
            this.f175722d = linkedList6;
            this.f175723e = 1;
            java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new com.tencent.mm.plugin.vlog.model.z0(linkedList7, null), this);
            if (g17 == aVar) {
                return aVar;
            }
            linkedList = linkedList6;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            linkedList = (java.util.LinkedList) this.f175722d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        linkedList.addAll((java.util.Collection) obj);
        com.tencent.mm.plugin.vlog.model.i1 i1Var = (com.tencent.mm.plugin.vlog.model.i1) kz5.n0.a0(u0Var.f175733g, 0);
        if (i1Var == null) {
            return null;
        }
        rm5.h a17 = rm5.h.f397489h.a(i1Var.f175627l);
        a17.setSize(63, 112);
        a17.a(kz5.b0.c(new java.lang.Long(0L)), new com.tencent.mm.plugin.vlog.model.s0(u0Var));
        return jz5.f0.f302826a;
    }
}
