package cq;

/* loaded from: classes2.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.network.v0 f221232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f221233b;

    public l(com.tencent.mm.network.v0 v0Var, long j17) {
        this.f221232a = v0Var;
        this.f221233b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = ((r45.sv0) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list, "getObjects(...)");
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("has contact: ");
            int i17 = 0;
            sb6.append(finderObject.getContact() != null);
            sb6.append(", contact nickname: ");
            com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
            sb6.append(contact != null ? contact.getNickname() : null);
            sb6.append(", contact isBiz: ");
            com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
            sb6.append((contact2 != null ? ya2.d.a(contact2, false) : null) != null);
            com.tencent.mars.xlog.Log.i("NetSceneFinderFeedBase", sb6.toString());
            bu2.j jVar = bu2.j.f24534a;
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0);
            com.tencent.mm.network.v0 v0Var = this.f221232a;
            if (v0Var != null) {
                i17 = v0Var.getType();
            }
            jVar.n(a17, new bu2.h(i17, this.f221233b));
        }
        java.util.LinkedList list2 = ((r45.sv0) fVar.f70618d).getList(1);
        kotlin.jvm.internal.o.f(list2, "getObjects(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId()));
        }
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("");
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            sb7.append(pm0.v.u(((java.lang.Number) it6.next()).longValue()));
            sb7.append(",");
        }
        java.lang.String sb8 = sb7.toString();
        kotlin.jvm.internal.o.f(sb8, "toString(...)");
        java.lang.String Z = r26.n0.Z(sb8, ",");
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6926i = Z;
        iaVar.f6919b = 33;
        return java.lang.Boolean.valueOf(feedUpdateEvent.e());
    }
}
