package us2;

/* loaded from: classes5.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f430515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ us2.f f430516e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(us2.f fVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430516e = fVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new us2.n(this.f430516e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((us2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object g17;
        boolean z17;
        vt3.n nVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f430515d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rt3.e eVar = us2.u.f430559l;
            int i18 = this.f430516e.f430480a;
            this.f430515d = 1;
            eVar.getClass();
            g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new rt3.d(i18, null), this);
            if (g17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
        }
        r45.ep3 ep3Var = (r45.ep3) g17;
        if (ep3Var == null || ep3Var.f373652e.isEmpty()) {
            com.tencent.mars.xlog.Log.i("ShootComposingTemplateManager", "load data failed");
            return jz5.f0.f302826a;
        }
        java.lang.Object obj2 = us2.u.f430554g;
        us2.f fVar = this.f430516e;
        synchronized (obj2) {
            java.util.Map map = us2.u.f430556i;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Integer num = new java.lang.Integer(ep3Var.f373653f);
            long intValue = currentTimeMillis + (((num.intValue() != 0 ? num : null) != null ? r3.intValue() : 300) * 1000);
            java.util.LinkedList<r45.s46> tabs = ep3Var.f373652e;
            kotlin.jvm.internal.o.f(tabs, "tabs");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(tabs, 10));
            for (r45.s46 s46Var : tabs) {
                long j17 = s46Var.f385502d;
                java.lang.String tab_name = s46Var.f385503e;
                kotlin.jvm.internal.o.f(tab_name, "tab_name");
                vt3.n nVar2 = fVar.f430481b;
                if (s46Var.f385505g == 3) {
                    nVar = nVar2;
                    z17 = true;
                } else {
                    z17 = false;
                    nVar = nVar2;
                }
                arrayList.add(new vt3.r(j17, tab_name, nVar, z17));
            }
            ((java.util.HashMap) map).put(fVar, new us2.e(intValue, arrayList));
        }
        return jz5.f0.f302826a;
    }
}
