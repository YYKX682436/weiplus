package com.tencent.mm.plugin.finder.profile;

/* loaded from: classes2.dex */
public final class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.w f123405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f123406b;

    public s(com.tencent.mm.plugin.finder.profile.w wVar, long j17) {
        this.f123405a = wVar;
        this.f123406b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.finder.profile.w wVar = this.f123405a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.finder.profile.b0 b0Var = wVar.f124449f;
            if (b0Var != null) {
                java.util.LinkedList list = ((r45.uo2) fVar.f70618d).getList(1);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onLoadSearch] list size=");
                sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
                sb6.append(" queryTime=");
                long j17 = this.f123406b;
                sb6.append(j17);
                sb6.append(", lastQueryTime=");
                sb6.append(b0Var.f123325s);
                com.tencent.mars.xlog.Log.i("Finder.FinderProfilePoiListView", sb6.toString());
                if (j17 > b0Var.f123325s) {
                    b0Var.f123325s = j17;
                    if (list != null) {
                        java.util.LinkedList linkedList = b0Var.f123318i;
                        boolean isEmpty = linkedList.isEmpty();
                        java.util.LinkedList linkedList2 = b0Var.f123317h;
                        if (isEmpty) {
                            linkedList.addAll(linkedList2);
                        }
                        linkedList2.clear();
                        linkedList2.addAll(list);
                        b0Var.c(linkedList2.size());
                        com.tencent.mm.plugin.finder.profile.z zVar = b0Var.f123319m;
                        if (zVar == null) {
                            kotlin.jvm.internal.o.o("adapter");
                            throw null;
                        }
                        zVar.notifyDataSetChanged();
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.UserPoiHandler", "[requestPoiSearch] poi_list size=" + ((r45.uo2) fVar.f70618d).getList(1).size());
        } else {
            com.tencent.mars.xlog.Log.i("Finder.UserPoiHandler", "[requestPoiSearch] errType=" + fVar.f70615a + " errCode=" + fVar.f70616b + " errMsg=" + fVar.f70617c);
        }
        if (wVar.f124452i != 0) {
            wVar.f(true);
        }
        return jz5.f0.f302826a;
    }
}
