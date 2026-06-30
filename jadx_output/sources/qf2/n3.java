package qf2;

/* loaded from: classes3.dex */
public final class n3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f362497f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(xg2.h hVar, kotlin.coroutines.Continuation continuation, yz5.l lVar, qf2.q3 q3Var) {
        super(2, continuation);
        this.f362495d = hVar;
        this.f362496e = lVar;
        this.f362497f = q3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.n3(this.f362495d, continuation, this.f362496e, this.f362497f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.n3 n3Var = (qf2.n3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.r7 r7Var;
        r45.nb nbVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.nu1 nu1Var = (r45.nu1) ((xg2.i) this.f362495d).f454393b;
        com.tencent.mars.xlog.Log.i("FinderLivePayMicControl", "requestPurchaseInfo success");
        if (nu1Var != null && (nbVar = (r45.nb) nu1Var.getCustom(2)) != null) {
            mm2.g5 g5Var = (mm2.g5) this.f362497f.business(mm2.g5.class);
            if (g5Var != null) {
                g5Var.f329089f = nbVar.getDouble(0);
            }
            mm2.g5 g5Var2 = (mm2.g5) this.f362497f.business(mm2.g5.class);
            if (g5Var2 != null) {
                g5Var2.f329092i = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) nbVar.getCustom(1);
            }
        }
        if (zl2.r4.f473950a.x1() && nu1Var != null && (r7Var = (r45.r7) nu1Var.getCustom(1)) != null) {
            mm2.g5 g5Var3 = (mm2.g5) this.f362497f.business(mm2.g5.class);
            if (g5Var3 != null) {
                g5Var3.f329089f = r7Var.getDouble(3);
            }
            mm2.g5 g5Var4 = (mm2.g5) this.f362497f.business(mm2.g5.class);
            if (g5Var4 != null) {
                g5Var4.f329092i = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r7Var.getCustom(5);
            }
            mm2.g5 g5Var5 = (mm2.g5) this.f362497f.business(mm2.g5.class);
            if (g5Var5 != null) {
                g5Var5.f329091h = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) r7Var.getCustom(4);
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.List<km2.q> list = ((mm2.o4) this.f362497f.business(mm2.o4.class)).f329318o;
            kotlin.jvm.internal.o.f(list, "<get-linkMicUserList>(...)");
            synchronized (list) {
                for (km2.q qVar : list) {
                    kotlin.jvm.internal.o.b(hashMap.get(qVar.f309170a), qVar);
                }
            }
            ((mm2.o4) this.f362497f.business(mm2.o4.class)).f329318o.clear();
            java.util.LinkedList<r45.if5> list2 = r7Var.getList(2);
            kotlin.jvm.internal.o.f(list2, "getApplyed_audience_list(...)");
            for (r45.if5 if5Var : list2) {
                qf2.q3 q3Var = this.f362497f;
                java.util.List list3 = ((mm2.o4) q3Var.business(mm2.o4.class)).f329318o;
                kotlin.jvm.internal.o.f(list3, "<get-linkMicUserList>(...)");
                kotlin.jvm.internal.o.d(if5Var);
                qf2.q3.Z6(q3Var, list3, if5Var, hashMap);
            }
            java.util.LinkedList<r45.if5> list4 = r7Var.getList(1);
            kotlin.jvm.internal.o.f(list4, "getCur_in_mic_audience(...)");
            for (r45.if5 if5Var2 : list4) {
                qf2.q3 q3Var2 = this.f362497f;
                java.util.List list5 = ((mm2.o4) q3Var2.business(mm2.o4.class)).f329318o;
                kotlin.jvm.internal.o.f(list5, "<get-linkMicUserList>(...)");
                kotlin.jvm.internal.o.d(if5Var2);
                km2.q Z6 = qf2.q3.Z6(q3Var2, list5, if5Var2, hashMap);
                if (Z6.f309174e == 2) {
                    Z6.f309181l = 4;
                } else {
                    Z6.f309181l = 3;
                }
            }
        }
        yz5.l lVar = this.f362496e;
        if (lVar != null) {
            lVar.invoke(nu1Var);
        }
        return jz5.f0.f302826a;
    }
}
