package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public final class f3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f192664d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f192665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f192666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192667g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.g3 f192668h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(long j17, java.lang.String str, kotlin.coroutines.Continuation continuation, com.tencent.mm.sdk.platformtools.g3 g3Var) {
        super(2, continuation);
        this.f192666f = j17;
        this.f192667g = str;
        this.f192668h = g3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.sdk.platformtools.f3 f3Var = new com.tencent.mm.sdk.platformtools.f3(this.f192666f, this.f192667g, continuation, this.f192668h);
        f3Var.f192665e = obj;
        return f3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.sdk.platformtools.f3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        java.util.ArrayList<java.util.List> arrayList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f192664d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f192665e;
            long j17 = this.f192666f;
            this.f192665e = y0Var2;
            this.f192664d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (kotlinx.coroutines.y0) this.f192665e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!kotlinx.coroutines.z0.h(y0Var)) {
            return jz5.f0.f302826a;
        }
        com.tencent.mm.sdk.platformtools.ca caVar = com.tencent.mm.sdk.platformtools.ca.f192506a;
        java.lang.String str = this.f192667g;
        synchronized (caVar) {
            java.util.HashMap hashMap = com.tencent.mm.sdk.platformtools.ca.f192508c;
            java.lang.Object obj2 = hashMap.get(str);
            arrayList = null;
            java.util.Queue queue = obj2 instanceof java.util.Queue ? (java.util.Queue) obj2 : null;
            if (queue != null) {
                hashMap.remove(str);
                arrayList = new java.util.ArrayList(queue);
            }
        }
        if (arrayList != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.util.List list : arrayList) {
                kotlin.jvm.internal.o.d(list);
                kz5.h0.u(arrayList2, list);
            }
            if (!arrayList2.isEmpty()) {
                com.tencent.mars.xlog.Log.i(this.f192668h.f192714f, "clear file slots:\n".concat(kz5.n0.g0(arrayList2, "\n", null, null, 0, null, null, 62, null)));
                ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.sdk.platformtools.e3(arrayList2));
            }
        }
        com.tencent.mm.sdk.platformtools.ca caVar2 = com.tencent.mm.sdk.platformtools.ca.f192506a;
        com.tencent.mm.sdk.platformtools.ca.f192507b.remove(this.f192667g);
        return jz5.f0.f302826a;
    }
}
