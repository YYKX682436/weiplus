package yj5;

/* loaded from: classes8.dex */
public final class k extends yj5.a {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.ArrayList f462718h = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f462719f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final yj5.j f462720g = new yj5.j(this);

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f454885g;
        return xj5.a.f454890o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        kz5.p0 p0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkerInfo, "talkerInfo");
        java.lang.String hostRoomId = talkerInfo.f460742a;
        this.f462719f.clear();
        java.util.ArrayList arrayList = this.f462719f;
        rl2.v wi6 = ((vd2.u0) ((ss5.c0) i95.n0.c(ss5.c0.class))).wi();
        if (wi6 != null) {
            kotlin.jvm.internal.o.g(hostRoomId, "hostRoomId");
            java.util.LinkedList<dm.s4> linkedList = new java.util.LinkedList();
            java.util.Vector vector = rl2.v.f397214g;
            synchronized (vector) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = vector.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (kotlin.jvm.internal.o.b(((dm.s4) next).field_hostRoomId, hostRoomId)) {
                        arrayList2.add(next);
                    }
                }
                linkedList.addAll(kz5.n0.F0(arrayList2, new rl2.r()));
            }
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
            java.util.List m17 = c01.v1.m(hostRoomId);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (dm.s4 s4Var : linkedList) {
                java.lang.String str = s4Var.field_anchorWxUsername;
                if (str == null) {
                    str = "";
                }
                if (!((java.util.LinkedList) m17).contains(str)) {
                    wi6.z0(s4Var.field_liveId, false);
                    arrayList3.add(s4Var);
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarStorage", "delete " + pm0.v.u(s4Var.field_liveId) + ", anchorWxUsername:" + str + " is not in chatroom:" + hostRoomId);
                }
            }
            linkedList.removeAll(arrayList3);
            for (dm.s4 s4Var2 : linkedList) {
                s4Var2.field_markRead = true;
                wi6.update(s4Var2, "liveId");
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarStorage", "getTipsBarDataByHostRoomId " + hostRoomId + ", " + kz5.n0.g0(linkedList, null, null, null, 0, null, rl2.q.f397207d, 31, null));
            p0Var = linkedList;
        } else {
            p0Var = kz5.p0.f313996d;
        }
        arrayList.addAll(p0Var);
        java.util.ArrayList arrayList4 = this.f462719f;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(arrayList4, 10));
        java.util.Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            arrayList5.add(new xj5.d((dm.s4) it6.next()));
        }
        return arrayList5;
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.l(ui6, tipsBarContext, this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        f462718h.add(this.f462720g);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        f462718h.remove(this.f462720g);
    }
}
