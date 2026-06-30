package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes11.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym3.c f208153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.unreadmode.s f208154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym3.d f208155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u26.w f208156g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ym3.c cVar, com.tencent.mm.ui.conversation.unreadmode.s sVar, ym3.d dVar, u26.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f208153d = cVar;
        this.f208154e = sVar;
        this.f208155f = dVar;
        this.f208156g = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.conversation.unreadmode.r(this.f208153d, this.f208154e, this.f208155f, this.f208156g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.conversation.unreadmode.r rVar = (com.tencent.mm.ui.conversation.unreadmode.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        long j17;
        long j18;
        boolean z17;
        com.tencent.mm.ui.conversation.unreadmode.r rVar;
        boolean z18;
        boolean z19;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ym3.c cVar = this.f208153d;
        java.lang.Object obj2 = cVar.f463146d;
        int i17 = cVar.f463145c;
        java.lang.Long l17 = obj2 instanceof java.lang.Long ? (java.lang.Long) obj2 : null;
        long longValue = l17 != null ? l17.longValue() : com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        com.tencent.mm.ui.conversation.unreadmode.s sVar = this.f208154e;
        yf5.w wVar = sVar.f208157d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            p75.d dVar = dm.i2.M;
            p75.m0 o17 = dVar.o(0);
            p75.d dVar2 = dm.i2.W;
            p75.m c17 = o17.c(dVar2.m());
            p75.d dVar3 = dm.i2.T;
            p75.y yVar = (p75.y) c17;
            yVar.f(dVar3.w(java.lang.Long.valueOf(longValue)));
            p75.m a17 = g95.x.f269827a.a(yVar);
            p75.n0 n0Var = dm.i2.K;
            p75.i0 i18 = n0Var.i();
            i18.f352657d = a17;
            i18.e(dVar3.u());
            i18.c(i17, 0);
            p75.l0 a18 = i18.a();
            jz5.g gVar = sVar.f208159f;
            java.util.List k17 = a18.k(((jm0.l) ((jz5.n) gVar).getValue()).Q4(), com.tencent.mm.storage.l4.class);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) k17;
            j17 = longValue;
            try {
                boolean z27 = arrayList2.size() >= i17;
                try {
                    com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) kz5.n0.k0(k17);
                    j18 = l4Var != null ? l4Var.G0() : 0L;
                    try {
                        if (arrayList2.size() < i17 || ((com.tencent.mm.storage.l4) kz5.n0.X(k17)).G0() != ((com.tencent.mm.storage.l4) kz5.n0.i0(k17)).G0()) {
                            z19 = z27;
                        } else {
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getUnreadConvList: all flag is same, count: ");
                            sb6.append(arrayList2.size());
                            sb6.append(", flag: ");
                            z19 = z27;
                            try {
                                sb6.append(((com.tencent.mm.storage.l4) kz5.n0.X(k17)).G0());
                                com.tencent.mars.xlog.Log.w("MicroMsg.UnreadConversationDataSource", sb6.toString());
                                p75.i0 i19 = n0Var.i();
                                p75.y yVar2 = (p75.y) dVar.o(0).c(dVar2.m());
                                yVar2.f(dVar3.i(java.lang.Long.valueOf(((com.tencent.mm.storage.l4) kz5.n0.X(k17)).G0())));
                                i19.f352657d = yVar2;
                                i19.e(dVar3.u());
                                k17 = i19.a().k(((jm0.l) ((jz5.n) gVar).getValue()).Q4(), com.tencent.mm.storage.l4.class);
                                j18 = ((com.tencent.mm.storage.l4) kz5.n0.i0(k17)).G0() - 1;
                            } catch (java.lang.Exception e17) {
                                e = e17;
                                z17 = z19;
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UnreadConversationDataSource", e, "getUnreadConvList error", new java.lang.Object[0]);
                                rVar = this;
                                z18 = z17;
                                ym3.d dVar4 = rVar.f208155f;
                                dVar4.f463149c.addAll(arrayList);
                                dVar4.f463148b = z18;
                                dVar4.f463150d = java.lang.Long.valueOf(j18);
                                com.tencent.mars.xlog.Log.i("MicroMsg.UnreadConversationDataSource", "getUnreadConvList: size: " + dVar4.f463149c.size() + ", lastFlag:" + j17 + " continueFlag: " + dVar4.f463148b + ", pageSize: " + i17);
                                u26.w wVar2 = rVar.f208156g;
                                wVar2.e(dVar4);
                                u26.x0.a(wVar2, null, 1, null);
                                return jz5.f0.f302826a;
                            }
                        }
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj3 : k17) {
                            if (!kotlin.jvm.internal.o.b(((com.tencent.mm.storage.l4) obj3).h1(), "qmessage")) {
                                arrayList3.add(obj3);
                            }
                        }
                        java.util.Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.storage.l4 l4Var2 = (com.tencent.mm.storage.l4) it.next();
                            yf5.x xVar = (yf5.x) wVar.f461972s.get(l4Var2.h1());
                            if (xVar == null) {
                                xVar = wVar.d(l4Var2, null);
                            }
                            if (xVar == null || xVar.f462014z != 2) {
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                sb7.append("getUnreadConvList: buildConvItem error, username=");
                                sb7.append(l4Var2.h1());
                                sb7.append(", countShowType=");
                                sb7.append(xVar != null ? java.lang.Integer.valueOf(xVar.f462014z) : null);
                                com.tencent.mars.xlog.Log.e("MicroMsg.UnreadConversationDataSource", sb7.toString());
                            } else {
                                arrayList.add(xVar);
                                java.util.Set set = sVar.f208160g;
                                java.lang.String h17 = l4Var2.h1();
                                kotlin.jvm.internal.o.f(h17, "getUsername(...)");
                                set.add(h17);
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.UnreadConversationDataSource", "getUnreadConvList lastFlag=%d, pageSize=%d, result=%d", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(arrayList.size()));
                        rVar = this;
                        z18 = z19;
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        z19 = z27;
                    }
                } catch (java.lang.Exception e19) {
                    e = e19;
                    z19 = z27;
                    j18 = j17;
                }
            } catch (java.lang.Exception e27) {
                e = e27;
                j18 = j17;
                z17 = false;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UnreadConversationDataSource", e, "getUnreadConvList error", new java.lang.Object[0]);
                rVar = this;
                z18 = z17;
                ym3.d dVar42 = rVar.f208155f;
                dVar42.f463149c.addAll(arrayList);
                dVar42.f463148b = z18;
                dVar42.f463150d = java.lang.Long.valueOf(j18);
                com.tencent.mars.xlog.Log.i("MicroMsg.UnreadConversationDataSource", "getUnreadConvList: size: " + dVar42.f463149c.size() + ", lastFlag:" + j17 + " continueFlag: " + dVar42.f463148b + ", pageSize: " + i17);
                u26.w wVar22 = rVar.f208156g;
                wVar22.e(dVar42);
                u26.x0.a(wVar22, null, 1, null);
                return jz5.f0.f302826a;
            }
        } catch (java.lang.Exception e28) {
            e = e28;
            j17 = longValue;
        }
        ym3.d dVar422 = rVar.f208155f;
        dVar422.f463149c.addAll(arrayList);
        dVar422.f463148b = z18;
        dVar422.f463150d = java.lang.Long.valueOf(j18);
        com.tencent.mars.xlog.Log.i("MicroMsg.UnreadConversationDataSource", "getUnreadConvList: size: " + dVar422.f463149c.size() + ", lastFlag:" + j17 + " continueFlag: " + dVar422.f463148b + ", pageSize: " + i17);
        u26.w wVar222 = rVar.f208156g;
        wVar222.e(dVar422);
        u26.x0.a(wVar222, null, 1, null);
        return jz5.f0.f302826a;
    }
}
