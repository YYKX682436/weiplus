package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f149571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c f149572e;

    public f(com.tencent.mm.plugin.multitalk.ilinkservice.c cVar, java.util.List list) {
        this.f149572e = cVar;
        this.f149571d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = this.f149572e;
        if (cVar.f149514a != null) {
            java.util.List<com.tencent.mm.modeltalkroom.VideoGroupMember> list = this.f149571d;
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onVideoGroupMemberChange:%s", list);
            com.tencent.mm.plugin.multitalk.model.v0 v0Var = cVar.f149514a;
            if (v0Var.x()) {
                v0Var.f150174q.clear();
                com.tencent.mm.plugin.multitalk.model.a2 n17 = v0Var.n();
                boolean z17 = false;
                for (com.tencent.mm.modeltalkroom.VideoGroupMember videoGroupMember : list) {
                    int i17 = videoGroupMember.f71621g;
                    if (i17 == 2 || i17 == 3) {
                        v0Var.f150174q.add(videoGroupMember.f71619e);
                    }
                    if (n17 != null && videoGroupMember.f71622h == 101) {
                        n17.j(videoGroupMember.f71619e);
                        v0Var.f150174q.add(videoGroupMember.f71619e);
                        z17 = true;
                    }
                }
                zj3.g gVar = zj3.g.f473302a;
                zj3.g.f473314m = java.lang.Math.max(zj3.g.f473314m, v0Var.f150174q.size());
                if (v0Var.L == null) {
                    v0Var.L = new com.tencent.mm.plugin.multitalk.model.k2();
                }
                com.tencent.mm.plugin.multitalk.model.k2 k2Var = v0Var.L;
                if (k2Var != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkScreenCastManager", "memberList is " + list);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        if (!kotlin.jvm.internal.o.b(((com.tencent.mm.modeltalkroom.VideoGroupMember) obj).f71619e, c01.z1.r())) {
                            arrayList2.add(obj);
                        }
                    }
                    java.util.Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.modeltalkroom.VideoGroupMember videoGroupMember2 = (com.tencent.mm.modeltalkroom.VideoGroupMember) it.next();
                        yz5.l lVar = (yz5.l) k2Var.f150031d.get(java.lang.Integer.valueOf(videoGroupMember2.f71622h));
                        if (lVar != null) {
                            java.lang.String wxUserName = videoGroupMember2.f71619e;
                            kotlin.jvm.internal.o.f(wxUserName, "wxUserName");
                            lVar.invoke(wxUserName);
                        }
                        int i18 = videoGroupMember2.f71622h;
                        if (i18 == 101 || i18 == 102) {
                            arrayList.add(videoGroupMember2.f71619e);
                        }
                    }
                    k2Var.f150030c = arrayList;
                    zj3.g gVar2 = zj3.g.f473302a;
                    zj3.g.f473316o = java.lang.Math.max(zj3.g.f473316o, arrayList.size());
                }
                java.util.ArrayList arrayList3 = (java.util.ArrayList) v0Var.f150175r;
                arrayList3.clear();
                arrayList3.addAll(list);
                if (n17 != null && !z17) {
                    n17.k();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MT.MultiTalkManager", "onVideoGroupMemberChange %s", v0Var.f150174q);
                com.tencent.mm.plugin.multitalk.model.z zVar = v0Var.C;
                if (zVar != null) {
                    zVar.i4();
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MT.MultiTalkManager", "uiCallback is NULL !!!");
                }
            }
        }
    }
}
