package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class t0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f195318d;

    /* renamed from: e, reason: collision with root package name */
    public int f195319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.b0 f195320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dw5.h f195321g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(com.tencent.mm.storage.b0 b0Var, dw5.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f195320f = b0Var;
        this.f195321g = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.storage.t0(this.f195320f, this.f195321g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.storage.t0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.storage.a1 a1Var;
        r45.il ilVar;
        java.util.LinkedList linkedList;
        r45.vn vnVar;
        r45.qm5 qm5Var;
        r45.vn vnVar2;
        r45.vn vnVar3;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f195319e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.storage.a1 a1Var2 = com.tencent.mm.storage.a1.f193716a;
            this.f195318d = a1Var2;
            this.f195319e = 1;
            java.lang.Object e17 = com.tencent.mm.storage.a1.e(a1Var2, true, this.f195320f, this.f195321g, this);
            if (e17 == aVar) {
                return aVar;
            }
            a1Var = a1Var2;
            obj = e17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1Var = (com.tencent.mm.storage.a1) this.f195318d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        a1Var.getClass();
        com.tencent.mm.storage.a1.f193724i = (r45.rm5) obj;
        com.tencent.mm.storage.a1 a1Var3 = com.tencent.mm.storage.a1.f193716a;
        r45.cm5 cm5Var = com.tencent.mm.storage.a1.f193723h;
        java.lang.Integer num = null;
        r45.qm5 qm5Var2 = (cm5Var == null || (vnVar3 = cm5Var.f371667d) == null) ? null : vnVar3.f388390n;
        if (qm5Var2 != null) {
            qm5Var2.f384095d = com.tencent.mm.storage.a1.f193724i;
        }
        r45.cm5 cm5Var2 = com.tencent.mm.storage.a1.f193723h;
        r45.qm5 qm5Var3 = (cm5Var2 == null || (vnVar2 = cm5Var2.f371667d) == null) ? null : vnVar2.f388390n;
        if (qm5Var3 != null) {
            qm5Var3.f384096e = null;
        }
        if (cm5Var2 != null) {
            com.tencent.mm.storage.x xVar = com.tencent.mm.storage.x.f196314e;
            cm5Var2.f371669f = 1;
        }
        r45.cm5 cm5Var3 = com.tencent.mm.storage.a1.f193723h;
        if (cm5Var3 != null) {
            com.tencent.mm.storage.a1.f193727l.add(cm5Var3);
        }
        r45.cm5 cm5Var4 = com.tencent.mm.storage.a1.f193723h;
        r45.rm5 rm5Var = (cm5Var4 == null || (vnVar = cm5Var4.f371667d) == null || (qm5Var = vnVar.f388390n) == null) ? null : qm5Var.f384095d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reddot_report ACT_TYPE_EXPOSE_BOX 1. begin_moment time= ");
        sb6.append(rm5Var != null ? new java.lang.Long(rm5Var.f385015f) : null);
        sb6.append("  scene=");
        sb6.append(rm5Var != null ? new java.lang.Integer(rm5Var.f385014e) : null);
        sb6.append("  last_page_name=");
        sb6.append(rm5Var != null ? rm5Var.f385016g : null);
        sb6.append(" tab_box size=");
        if (rm5Var != null && (ilVar = rm5Var.f385013d) != null && (linkedList = ilVar.f377126i) != null) {
            num = new java.lang.Integer(linkedList.size());
        }
        sb6.append(num);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", sb6.toString());
        a1Var3.p(com.tencent.mm.storage.x.f196314e);
        return jz5.f0.f302826a;
    }
}
