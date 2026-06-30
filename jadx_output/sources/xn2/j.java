package xn2;

/* loaded from: classes2.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f455513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455514e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xg2.h hVar, kotlin.coroutines.Continuation continuation, xn2.p0 p0Var) {
        super(2, continuation);
        this.f455513d = hVar;
        this.f455514e = p0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xn2.j(this.f455513d, continuation, this.f455514e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xn2.j jVar = (xn2.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.tw0 tw0Var = (r45.tw0) ((xg2.i) this.f455513d).f454393b;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        xn2.p0 p0Var = this.f455514e;
        p0Var.f455564v = currentTimeMillis;
        p0Var.f455563u = tw0Var.getByteString(4);
        r45.rw0 rw0Var = (r45.rw0) tw0Var.getCustom(3);
        if (rw0Var != null) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_FEED_SAFE_CHECK_INTERVAL_SEC_INT_SYNC, new java.lang.Integer(rw0Var.getInteger(0)));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_FEED_SAFE_CHECK_LAST_COUNT_INT_SYNC, new java.lang.Integer(rw0Var.getInteger(1)));
        }
        java.util.LinkedList list = tw0Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getCheck_result(...)");
        java.util.ArrayList<r45.e20> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj4 : list) {
            if (((r45.e20) obj4).getLong(1) != 0) {
                arrayList.add(obj4);
            }
        }
        com.tencent.mars.xlog.Log.i(p0Var.f455545c, "mega_verify spam list size: %d", new java.lang.Integer(arrayList.size()));
        if (arrayList.size() > 0) {
            for (r45.e20 e20Var : arrayList) {
                long j17 = e20Var.getLong(0);
                java.util.Iterator it = p0Var.j().getDataListJustForAdapter().iterator();
                while (true) {
                    obj2 = null;
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    so2.j5 j5Var = (so2.j5) obj3;
                    if ((j5Var instanceof zn2.a) && j5Var.getItemId() == j17) {
                        break;
                    }
                }
                so2.j5 j5Var2 = (so2.j5) obj3;
                java.util.Iterator it6 = p0Var.j().getDataListJustForAdapter().iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it6.next();
                    so2.j5 j5Var3 = (so2.j5) next;
                    if ((j5Var3 instanceof zn2.c) && j5Var3.getItemId() == j17) {
                        obj2 = next;
                        break;
                    }
                }
                so2.j5 j5Var4 = (so2.j5) obj2;
                if (j5Var2 != null) {
                    if (e20Var.getBoolean(3)) {
                        com.tencent.mars.xlog.Log.i(p0Var.f455545c, "mega_verify spam lv all scene: %s", new java.lang.Long(j17));
                        com.tencent.mm.autogen.events.FeedDeleteEvent feedDeleteEvent = new com.tencent.mm.autogen.events.FeedDeleteEvent();
                        feedDeleteEvent.f54247g.f6437a = j5Var2.getItemId();
                        feedDeleteEvent.e();
                    } else {
                        xn2.p0.b(p0Var, j5Var2, true);
                    }
                } else if (j5Var4 == null) {
                    com.tencent.mars.xlog.Log.i(p0Var.f455545c, "mega_verify unkown feed: %s", new java.lang.Long(j17));
                } else if (e20Var.getBoolean(3)) {
                    com.tencent.mars.xlog.Log.i(p0Var.f455545c, "mega_verify spam later all scene: %s", new java.lang.Long(j17));
                    com.tencent.mm.autogen.events.MegaVideoSeeLaterDeletedEvent megaVideoSeeLaterDeletedEvent = new com.tencent.mm.autogen.events.MegaVideoSeeLaterDeletedEvent();
                    megaVideoSeeLaterDeletedEvent.f54493g.f7714a = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var4;
                    megaVideoSeeLaterDeletedEvent.e();
                } else {
                    xn2.p0.b(p0Var, j5Var4, false);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
