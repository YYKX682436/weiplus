package com.tencent.mm.plugin.finder.service;

/* loaded from: classes2.dex */
public final class d2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f126027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f126028c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f126029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l2 f126030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f126031f;

    public d2(int i17, java.util.LinkedList linkedList, boolean z17, int i18, com.tencent.mm.plugin.finder.service.l2 l2Var, int i19) {
        this.f126026a = i17;
        this.f126027b = linkedList;
        this.f126028c = z17;
        this.f126029d = i18;
        this.f126030e = l2Var;
        this.f126031f = i19;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar2.f70615a;
        java.util.LinkedList<r45.rv0> linkedList = this.f126027b;
        int i18 = this.f126026a;
        if (i17 != 0 || fVar2.f70616b != 0 || (fVar = fVar2.f70618d) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordPreloadFeed error commentScene:");
            sb6.append(i18);
            sb6.append(' ');
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.rv0 rv0Var : linkedList) {
                arrayList.add("objectId:" + rv0Var.getLong(0) + " exportId:" + rv0Var.getString(1));
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.e("FinderFeedDetailService", sb6.toString());
        } else if (!((r45.sv0) fVar).getBoolean(4)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("recordPreloadFeed error can_pre_download commentScene:");
            sb7.append(i18);
            sb7.append(' ');
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.rv0 rv0Var2 : linkedList) {
                arrayList2.add("objectId:" + pm0.v.u(rv0Var2.getLong(0)) + " exportId:" + rv0Var2.getString(1));
            }
            sb7.append(arrayList2);
            com.tencent.mars.xlog.Log.e("FinderFeedDetailService", sb7.toString());
        } else if (this.f126028c) {
            com.tencent.mm.plugin.finder.service.l2 l2Var = this.f126030e;
            int i19 = this.f126029d;
            if (i19 != 0) {
                l2Var.f126115f.put(java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(((r45.sv0) fVar2.f70618d).getInteger(2)));
            }
            java.util.LinkedList list = ((r45.sv0) fVar2.f70618d).getList(1);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("recordPreloadFeed commentScene:");
            sb8.append(i18);
            sb8.append(" get ");
            kotlin.jvm.internal.o.d(list);
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(hc2.o0.m((com.tencent.mm.protocal.protobuf.FinderObject) it.next()));
            }
            sb8.append(arrayList3);
            com.tencent.mars.xlog.Log.i("FinderFeedDetailService", sb8.toString());
            l2Var.f126114e.a(i18, list, this.f126031f);
        }
        return jz5.f0.f302826a;
    }
}
