package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f115516d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f115517e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f115518f;

    /* renamed from: g, reason: collision with root package name */
    public int f115519g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.j1 f115520h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.n1 f115521i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.tencent.mm.plugin.finder.live.util.j1 j1Var, com.tencent.mm.plugin.finder.live.util.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f115520h = j1Var;
        this.f115521i = n1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.util.g1(this.f115520h, this.f115521i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.util.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.util.j1 j1Var;
        com.tencent.mm.plugin.finder.live.util.n1 n1Var;
        kotlinx.coroutines.sync.d dVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f115519g;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            j1Var = this.f115520h;
            kotlinx.coroutines.sync.d dVar2 = j1Var.f115577j;
            this.f115516d = dVar2;
            this.f115517e = j1Var;
            com.tencent.mm.plugin.finder.live.util.n1 n1Var2 = this.f115521i;
            this.f115518f = n1Var2;
            this.f115519g = 1;
            kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar2;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            n1Var = n1Var2;
            dVar = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n1Var = (com.tencent.mm.plugin.finder.live.util.n1) this.f115518f;
            j1Var = (com.tencent.mm.plugin.finder.live.util.j1) this.f115517e;
            dVar = (kotlinx.coroutines.sync.d) this.f115516d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            int size = j1Var.f115576i.size();
            java.util.Map map = j1Var.f115576i;
            java.lang.String str = j1Var.f115578k;
            if (size > 1000) {
                java.util.Iterator it = ((java.util.LinkedHashMap) map).entrySet().iterator();
                while (it.hasNext()) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    if (java.lang.System.currentTimeMillis() - ((com.tencent.mm.plugin.finder.live.util.n1) entry.getValue()).f115638b > 60000) {
                        it.remove();
                        com.tencent.mars.xlog.Log.i(str, "#putOvertimeCache remove comboid=" + ((com.tencent.mm.plugin.finder.live.util.n1) entry.getValue()).f115637a + " fromNickName=" + ((com.tencent.mm.plugin.finder.live.util.n1) entry.getValue()).f115639c);
                    }
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("#putOvertimeCache comboid=");
            java.lang.String str2 = n1Var.f115637a;
            java.lang.String str3 = n1Var.f115637a;
            java.lang.String str4 = n1Var.f115639c;
            sb6.append(str2);
            sb6.append(" fromNickName=");
            sb6.append(str4);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (str3.length() > 0) {
                if (str4.length() <= 0) {
                    z17 = false;
                }
                if (z17) {
                    map.put(str3, n1Var);
                }
            }
            ((kotlinx.coroutines.sync.k) dVar).d(null);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            ((kotlinx.coroutines.sync.k) dVar).d(null);
            throw th6;
        }
    }
}
