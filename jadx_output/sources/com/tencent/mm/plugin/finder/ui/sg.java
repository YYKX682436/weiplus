package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class sg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f129809d;

    /* renamed from: e, reason: collision with root package name */
    public int f129810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI f129811f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI finderSettingInfoUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f129811f = finderSettingInfoUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.sg(this.f129811f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.ui.sg) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object x17;
        com.tencent.mm.plugin.finder.ui.FinderSettingInfoUI finderSettingInfoUI;
        java.lang.Object obj2;
        java.lang.Object obj3;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f129810e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g92.b bVar = g92.b.f269769e;
            this.f129810e = 1;
            x17 = bVar.x1(2, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
            x17 = ((kotlin.Result) obj).getValue();
        }
        if (kotlin.Result.m528isSuccessimpl(x17)) {
            r45.lk2 lk2Var = (r45.lk2) x17;
            r45.nc4 nc4Var = new r45.nc4();
            java.util.LinkedList list = lk2Var.getList(20);
            kotlin.jvm.internal.o.f(list, "getFinder_list(...)");
            java.util.Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                finderSettingInfoUI = this.f129811f;
                if (!hasNext) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.ac5) obj2).getCustom(1);
                if (kotlin.jvm.internal.o.b(finderContact != null ? finderContact.getUsername() : null, finderSettingInfoUI.f128722d)) {
                    break;
                }
            }
            r45.ac5 ac5Var = (r45.ac5) obj2;
            byte[] byteArray = ac5Var != null ? ac5Var.toByteArray() : null;
            if (byteArray != null) {
                try {
                    nc4Var.parseFrom(byteArray);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            finderSettingInfoUI.f128724f = nc4Var;
            java.util.LinkedList list2 = lk2Var.getList(20);
            kotlin.jvm.internal.o.f(list2, "getFinder_list(...)");
            java.util.Iterator it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it6.next();
                com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.ac5) obj3).getCustom(1);
                if (kotlin.jvm.internal.o.b(finderContact2 != null ? finderContact2.getUsername() : null, finderSettingInfoUI.f128722d)) {
                    break;
                }
            }
            r45.ac5 ac5Var2 = (r45.ac5) obj3;
            finderSettingInfoUI.f128725g = ac5Var2 != null ? (r45.d1) ac5Var2.getCustom(10) : null;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.ui.rg rgVar = new com.tencent.mm.plugin.finder.ui.rg(finderSettingInfoUI, null);
            this.f129809d = x17;
            this.f129810e = 2;
            if (kotlinx.coroutines.l.g(g3Var, rgVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
