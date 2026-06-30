package sm2;

/* loaded from: classes3.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409753d;

    public v2(sm2.o4 o4Var) {
        this.f409753d = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var;
        xh2.a aVar;
        in0.q qVar;
        xh2.i iVar;
        in0.q qVar2;
        xh2.i iVar2;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        sm2.o4 o4Var = this.f409753d;
        com.tencent.mars.xlog.Log.i(o4Var.f409610f, "restoreLinkMicUI curLinkMicUser:" + ((mm2.o4) o4Var.c(mm2.o4.class)).l7() + " liveData.business(LiveCommonSlice::class.java).audienceLinkMicUserList:" + ((mm2.o4) o4Var.c(mm2.o4.class)).f329327v + ",isWaitingRandomMatch:" + ((mm2.o4) o4Var.c(mm2.o4.class)).D);
        java.util.List list = ((mm2.o4) o4Var.c(mm2.o4.class)).f329324s;
        kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                km2.q qVar3 = (km2.q) it.next();
                in0.q qVar4 = o4Var.f19597e;
                if (qVar4 != null) {
                    qVar4.P0(qVar3.f309170a);
                }
                fm2.a aVar2 = o4Var.f19595c;
                if (aVar2 != null) {
                    in0.q qVar5 = o4Var.f19597e;
                    cl0.g gVar = qVar5 != null ? qVar5.T1 : null;
                    org.json.JSONObject J2 = qVar5 != null ? qVar5.J() : null;
                    in0.q qVar6 = o4Var.f19597e;
                    com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(aVar2, gVar, J2, qVar6 != null ? qVar6.W0() : null, false, null, 24, null);
                }
            }
        }
        kotlin.jvm.internal.o.f(((mm2.o4) o4Var.c(mm2.o4.class)).f329327v, "<get-audienceLinkMicUserList>(...)");
        if (!r1.isEmpty()) {
            java.util.List<km2.q> list2 = ((mm2.o4) o4Var.c(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list2, "<get-audienceLinkMicUserList>(...)");
            synchronized (list2) {
                for (km2.q qVar7 : list2) {
                    com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = o4Var.f409616i;
                    int i17 = 0;
                    if (o9Var != null) {
                        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.i9(o9Var, qVar7.f309170a, 0));
                    }
                    xh2.c cVar = (xh2.c) ((mm2.o4) o4Var.c(mm2.o4.class)).A.getValue();
                    if (cVar == null || (linkedList = cVar.f454531a) == null) {
                        aVar = null;
                    } else {
                        java.util.Iterator it6 = linkedList.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                obj = it6.next();
                                if (kotlin.jvm.internal.o.b(((xh2.a) obj).b(), qVar7.f309170a)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        aVar = (xh2.a) obj;
                    }
                    java.lang.String str = o4Var.f409610f;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append("restoreLinkMicUI micCoverData us: ");
                    sb6.append((aVar == null || (iVar2 = aVar.f454521b) == null) ? null : java.lang.Integer.valueOf(iVar2.f454557i));
                    sb6.append(" id: ");
                    sb6.append(qVar7.f309170a);
                    com.tencent.mars.xlog.Log.i(str, sb6.toString());
                    if (((mm2.y2) o4Var.c(mm2.y2.class)).X6()) {
                        if (aVar != null && (iVar = aVar.f454521b) != null) {
                            i17 = iVar.f454557i;
                        }
                        if (!pm0.v.z(i17, 2) && (qVar = o4Var.f19597e) != null) {
                            qVar.P0(qVar7.f309170a);
                        }
                    } else if (qVar7.f309174e == 2 && (qVar2 = o4Var.f19597e) != null) {
                        qVar2.P0(qVar7.f309170a);
                    }
                }
            }
            fm2.a aVar3 = o4Var.f19595c;
            if (aVar3 != null) {
                in0.q qVar8 = o4Var.f19597e;
                cl0.g gVar2 = qVar8 != null ? qVar8.T1 : null;
                org.json.JSONObject J3 = qVar8 != null ? qVar8.J() : null;
                in0.q qVar9 = o4Var.f19597e;
                com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(aVar3, gVar2, J3, qVar9 != null ? qVar9.W0() : null, false, null, 24, null);
            }
        }
        if (((mm2.o4) o4Var.c(mm2.o4.class)).D && (v70Var = o4Var.L) != null) {
            com.tencent.mm.plugin.finder.live.plugin.gp0 gp0Var = com.tencent.mm.plugin.finder.live.plugin.gp0.f112725e;
            float f17 = com.tencent.mm.plugin.finder.live.plugin.v70.W;
            v70Var.x1(gp0Var, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var2 = o4Var.L;
        if (v70Var2 != null) {
            if (!((mm2.o4) v70Var2.P0(mm2.o4.class)).f329330x0) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onRestoreLinkMicUI not in chatting mode");
            } else if (v70Var2.f114683q != com.tencent.mm.plugin.finder.live.plugin.gp0.f112724d) {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onRestoreLinkMicUI curState is not hide");
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "onRestoreLinkMicUI");
                v70Var2.v1();
            }
        }
    }
}
