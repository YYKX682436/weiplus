package com.tencent.mm.plugin.finder.service;

/* loaded from: classes2.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f126036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f126037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f126038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f126039g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.service.l2 f126040h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f126041i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(int i17, java.util.LinkedList linkedList, boolean z17, int i18, com.tencent.mm.plugin.finder.service.l2 l2Var, int i19) {
        super(1);
        this.f126036d = i17;
        this.f126037e = linkedList;
        this.f126038f = z17;
        this.f126039g = i18;
        this.f126040h = l2Var;
        this.f126041i = i19;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.sv0 it = (r45.sv0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = it.getBoolean(4);
        int i17 = this.f126036d;
        if (!z17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recordPreloadFeed error can_pre_download commentScene:");
            sb6.append(i17);
            sb6.append(' ');
            java.util.LinkedList<r45.rv0> linkedList = this.f126037e;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (r45.rv0 rv0Var : linkedList) {
                arrayList.add("objectId:" + pm0.v.u(rv0Var.getLong(0)) + " exportId:" + rv0Var.getString(1));
            }
            sb6.append(arrayList);
            com.tencent.mars.xlog.Log.e("FinderFeedDetailService", sb6.toString());
        } else if (this.f126038f) {
            com.tencent.mm.plugin.finder.service.l2 l2Var = this.f126040h;
            int i18 = this.f126039g;
            if (i18 != 0) {
                l2Var.f126115f.put(java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(it.getInteger(2)));
            }
            java.util.LinkedList list = it.getList(1);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("recordPreloadFeed commentScene:");
            sb7.append(i17);
            sb7.append(" get ");
            kotlin.jvm.internal.o.d(list);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                arrayList2.add(hc2.o0.m((com.tencent.mm.protocal.protobuf.FinderObject) it6.next()));
            }
            sb7.append(arrayList2);
            com.tencent.mars.xlog.Log.i("FinderFeedDetailService", sb7.toString());
            l2Var.f126114e.a(i17, list, this.f126041i);
        }
        return jz5.f0.f302826a;
    }
}
