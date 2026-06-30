package ke2;

/* loaded from: classes2.dex */
public final class k0 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306961t;

    /* renamed from: u, reason: collision with root package name */
    public final zy2.l5 f306962u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.protobuf.g gVar, int i17, float f17, float f18, zy2.l5 callback) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f306961t = "Finder.CgiFinderLiveStream";
        this.f306962u = callback;
        r45.wa2 wa2Var = new r45.wa2();
        wa2Var.set(2, gVar);
        wa2Var.set(3, java.lang.Integer.valueOf(i17));
        wa2Var.set(4, java.lang.Float.valueOf(f17));
        wa2Var.set(5, java.lang.Float.valueOf(f18));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = wa2Var;
        r45.xa2 xa2Var = new r45.xa2();
        xa2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) xa2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = xa2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivestream";
        lVar.f70667d = 4151;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveStream", "CgiFinderLiveStream init " + wa2Var.getInteger(3) + ',' + wa2Var.getByteString(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        r45.nw1 liveInfo;
        r45.xa2 resp = (r45.xa2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306961t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        com.tencent.mm.plugin.finder.convert.ph phVar = (com.tencent.mm.plugin.finder.convert.ph) this.f306962u;
        phVar.getClass();
        com.tencent.mm.plugin.finder.convert.th thVar = phVar.f104263a;
        thVar.f104618m = false;
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.plugin.finder.convert.th.n(thVar);
            com.tencent.mars.xlog.Log.i("FinderFeedLiveListConvert", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + '}');
            return;
        }
        com.tencent.mm.plugin.finder.convert.th.n(thVar);
        com.tencent.mars.xlog.Log.i("FinderFeedLiveListConvert", "before merge live list:" + thVar.f104617i);
        so2.i1 i1Var = thVar.f104617i;
        i1Var.getClass();
        java.util.LinkedList list = resp.getList(1);
        com.tencent.mars.xlog.Log.i("FinderFeedLiveList", "merge remote list size:" + list.size());
        i1Var.f410416d = resp.getByteString(2);
        i1Var.f410419g = resp.getInteger(3) > 0;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = i1Var.f410417e;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
            java.util.Iterator it6 = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i19 = -1;
                    break;
                } else {
                    if (((so2.j5) it6.next()).getItemId() == finderObject.getId()) {
                        break;
                    } else {
                        i19++;
                    }
                }
            }
            java.util.Iterator it7 = linkedList.iterator();
            int i27 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i27 = -1;
                    break;
                } else {
                    if (((com.tencent.mm.protocal.protobuf.FinderObject) it7.next()).getId() == finderObject.getId()) {
                        break;
                    } else {
                        i27++;
                    }
                }
            }
            if (i19 == -1 && i27 == -1 && cm2.a.f43328a.t(finderObject)) {
                linkedList.add(finderObject);
            } else {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("merge live list feed:");
                sb6.append((finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0));
                sb6.append(',');
                sb6.append(finderObject.getNickname());
                sb6.append(" exist!");
                com.tencent.mars.xlog.Log.i("FinderFeedLiveList", sb6.toString());
            }
        }
        if (linkedList.size() > 0) {
            arrayList2 = i1Var.i(linkedList);
            arrayList.addAll(arrayList2);
            i1Var.k();
            i1Var.g();
        } else {
            arrayList2 = null;
        }
        if (!(arrayList2 == null || arrayList2.isEmpty())) {
            pm0.v.X(new com.tencent.mm.plugin.finder.convert.oh(thVar, arrayList2));
        }
        com.tencent.mm.plugin.finder.convert.th.n(thVar);
        com.tencent.mars.xlog.Log.i("FinderFeedLiveListConvert", "after merge live list:" + thVar.f104617i);
    }
}
