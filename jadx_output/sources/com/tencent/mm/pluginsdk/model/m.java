package com.tencent.mm.pluginsdk.model;

/* loaded from: classes11.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f189372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f189373e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.pluginsdk.model.m(this.f189373e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.pluginsdk.model.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f189372d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
            if (!com.tencent.mm.pluginsdk.model.b0.f189222z) {
                java.lang.String str = this.f189373e;
                if (b0Var.C(str)) {
                    com.tencent.mm.pluginsdk.model.b0.f189222z = true;
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.add(str);
                    this.f189372d = 1;
                    obj = b0Var.d(7, linkedList, null, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            }
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        r45.qk qkVar = (r45.qk) obj;
        com.tencent.mm.pluginsdk.model.b0 b0Var2 = com.tencent.mm.pluginsdk.model.b0.f189197a;
        com.tencent.mm.pluginsdk.model.b0.f189222z = false;
        java.util.LinkedList<r45.lk> linkedList2 = qkVar != null ? qkVar.f384063d : null;
        if (linkedList2 == null) {
            return f0Var;
        }
        for (r45.lk lkVar : linkedList2) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(lkVar.f379534e)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizFinderLiveLogic", "checkLiveRedDotNotify live stop!");
                com.tencent.mm.pluginsdk.model.b0 b0Var3 = com.tencent.mm.pluginsdk.model.b0.f189197a;
                b0Var3.x(lkVar);
                java.lang.String str2 = lkVar.f379533d;
                java.lang.String str3 = com.tencent.mm.pluginsdk.model.b0.f189217u;
                if (str3 != null && kotlin.jvm.internal.o.b(str2, str3)) {
                    com.tencent.mm.pluginsdk.model.b0.f189217u = null;
                    com.tencent.mm.pluginsdk.model.b0.f189218v = null;
                    com.tencent.mm.pluginsdk.model.b0.f189219w = null;
                }
                b0Var3.w();
                b0Var3.E();
            } else {
                com.tencent.mm.pluginsdk.model.b0.f189197a.x(lkVar);
                com.tencent.mm.pluginsdk.model.b0.f189219w = lkVar.f379538i;
            }
        }
        return f0Var;
    }
}
