package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class qp extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f114036d;

    /* renamed from: e, reason: collision with root package name */
    public int f114037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f114038f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(com.tencent.mm.plugin.finder.live.plugin.dq dqVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114038f = dqVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.qp(this.f114038f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.qp) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList toRestore;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f114037e;
        com.tencent.mm.plugin.finder.live.plugin.dq dqVar = this.f114038f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.y72 y72Var = new r45.y72();
            y72Var.set(1, db2.t4.f228171a.a(15763));
            y72Var.set(2, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(dqVar.f365323d.getContext()));
            y72Var.set(3, java.lang.Long.valueOf(((mm2.e1) dqVar.P0(mm2.e1.class)).f328983m));
            y72Var.set(4, java.lang.Long.valueOf(((mm2.e1) dqVar.P0(mm2.e1.class)).f328988r.getLong(0)));
            y72Var.set(7, pm0.b0.h(((mm2.e1) dqVar.P0(mm2.e1.class)).f328985o));
            y72Var.set(5, dqVar.f112325r);
            y72Var.set(6, zl2.q4.f473933a.m());
            y72Var.set(8, new java.util.LinkedList(dqVar.f112320l1));
            y72Var.set(9, 1);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", "send free gifts " + dqVar.f112320l1);
            java.util.LinkedList linkedList = new java.util.LinkedList(dqVar.f112320l1);
            ((java.util.ArrayList) dqVar.f112320l1).clear();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70667d = 15763;
            lVar.f70666c = "/cgi-bin/micromsg-bin/finderliverewardfreegift";
            lVar.f70664a = y72Var;
            lVar.f70665b = new r45.z72();
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.modelbase.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
            wi6.p(a17);
            this.f114036d = linkedList;
            this.f114037e = 1;
            obj = rm0.h.b(wi6, this);
            if (obj == aVar) {
                return aVar;
            }
            toRestore = linkedList;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            toRestore = (java.util.LinkedList) this.f114036d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.b()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("send freeGifts ");
            sb6.append(toRestore);
            sb6.append(" success, succItems = ");
            sb6.append(((r45.z72) fVar.f70618d).getList(1));
            sb6.append(" failItems = ");
            java.util.LinkedList<r45.ct5> list = ((r45.z72) fVar.f70618d).getList(2);
            kotlin.jvm.internal.o.f(list, "getFail_items(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (r45.ct5 ct5Var : list) {
                arrayList.add("giftId " + ct5Var.getString(0) + ", failReason: " + ct5Var.getInteger(1));
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", sb6.toString());
            je2.t tVar = (je2.t) dqVar.P0(je2.t.class);
            java.util.LinkedList list2 = ((r45.z72) fVar.f70618d).getList(2);
            kotlin.jvm.internal.o.f(list2, "getFail_items(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (true) {
                java.lang.String str = "";
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String string = ((r45.ct5) it.next()).getString(0);
                if (string != null) {
                    str = string;
                }
                arrayList2.add(str);
            }
            synchronized (tVar) {
                tVar.f299277w.removeAll(kz5.n0.X0(arrayList2));
                tVar.Q6();
            }
            com.tencent.mm.plugin.finder.live.plugin.dq dqVar2 = this.f114038f;
            java.lang.String str2 = dqVar2.f112325r;
            com.tencent.mm.plugin.finder.live.plugin.dq.v1(dqVar2, str2 == null ? "" : str2, dqVar2.f112330w, dqVar2.f112326s, dqVar2.f112329v, ((r45.z72) fVar.f70618d).getList(1).size());
        } else {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveGiftSendPlugin", "send freeGifts " + toRestore + " failed, errCode = " + fVar.f70616b + ", errType = " + fVar.f70615a);
            je2.t tVar2 = (je2.t) dqVar.P0(je2.t.class);
            kotlin.jvm.internal.o.g(toRestore, "toRestore");
            synchronized (tVar2) {
                tVar2.f299277w.removeAll(kz5.n0.X0(toRestore));
                tVar2.Q6();
            }
        }
        return jz5.f0.f302826a;
    }
}
