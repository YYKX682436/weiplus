package cr2;

/* loaded from: classes2.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr2.x f221873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f221874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f221876g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221877h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(cr2.x xVar, com.tencent.mm.modelbase.f fVar, yz5.l lVar, boolean z17, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f221873d = xVar;
        this.f221874e = fVar;
        this.f221875f = lVar;
        this.f221876g = z17;
        this.f221877h = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cr2.p(this.f221873d, this.f221874e, this.f221875f, this.f221876g, this.f221877h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cr2.p pVar = (cr2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        java.util.LinkedList<r45.fa2> linkedList;
        java.util.LinkedList linkedList2;
        r45.s92 s92Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cr2.x xVar = this.f221873d;
        java.lang.String str = xVar.f221901g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadDataWithCgi cgi end. errType=");
        com.tencent.mm.modelbase.f fVar = this.f221874e;
        sb6.append(fVar.f70615a);
        sb6.append(" errCode=");
        sb6.append(fVar.f70616b);
        sb6.append(" themeId: ");
        sb6.append(xVar.f221899e);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        int i17 = fVar.f70615a;
        yz5.l lVar = this.f221875f;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.yz2 yz2Var = (r45.yz2) fVar.f70618d;
            xVar.f221914t = yz2Var;
            boolean z18 = lVar == null && this.f221876g;
            xVar.getClass();
            java.lang.String str2 = xVar.f221901g;
            com.tencent.mars.xlog.Log.i(str2, "#transResponseToListData cleanCurrent=" + z18);
            if (yz2Var != null && (s92Var = yz2Var.f391529s) != null) {
                xVar.a(s92Var.getInteger(0));
                com.tencent.mars.xlog.Log.i(str2, "transResponseToListData: bottomExtraInfo=" + s92Var.getInteger(1));
                com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory themeLivingItemConvertFactory = xVar.f221913s;
                if (themeLivingItemConvertFactory != null) {
                    themeLivingItemConvertFactory.setBottomExtraInfo(s92Var.getInteger(1));
                }
            }
            java.util.ArrayList arrayList = xVar.f221911q;
            if (z18) {
                int size = arrayList.size();
                arrayList.clear();
                cr2.a aVar2 = xVar.f221912r;
                if (aVar2 != null) {
                    aVar2.notifyItemRangeRemoved(0, size);
                }
            }
            java.util.List c17 = xVar.c();
            int i18 = 10;
            int i19 = 2;
            if (yz2Var != null && (linkedList2 = yz2Var.f391517d) != null) {
                java.util.Iterator it = linkedList2.iterator();
                while (it.hasNext()) {
                    java.util.LinkedList card_list = ((r45.fa2) it.next()).f374129h;
                    kotlin.jvm.internal.o.f(card_list, "card_list");
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                    java.util.Iterator it6 = card_list.iterator();
                    while (it6.hasNext()) {
                        r45.ea2 ea2Var = (r45.ea2) it6.next();
                        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
                        if (((java.util.ArrayList) c17).contains(java.lang.Long.valueOf(finderObject != null ? finderObject.getId() : 0L))) {
                            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("id=");
                            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
                            sb8.append(finderObject2 != null ? java.lang.Long.valueOf(finderObject2.getId()) : null);
                            sb8.append(" name=");
                            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var.getCustom(2);
                            sb8.append(finderObject3 != null ? finderObject3.getNickname() : null);
                            sb7.append(sb8.toString() + '\n');
                            it6.remove();
                        }
                    }
                    java.lang.String sb9 = sb7.toString();
                    kotlin.jvm.internal.o.d(sb9);
                    if (!(sb9.length() > 0)) {
                        sb9 = null;
                    }
                    if (sb9 != null) {
                        com.tencent.mars.xlog.Log.i(str2, "#checkAndRemoveDuplicateData remove: ".concat(sb9));
                        int i27 = sp2.y3.f411292a;
                        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                }
            }
            r45.yz2 yz2Var2 = xVar.f221914t;
            boolean z19 = yz2Var2 != null ? yz2Var2.f391524n : true;
            com.tencent.mars.xlog.Log.i(str2, "#transResponseToListData skipAsyncLoadLiveInfo=" + z19);
            if (yz2Var != null && (linkedList = yz2Var.f391517d) != null) {
                for (r45.fa2 fa2Var : linkedList) {
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder("#transResponseToListData container.type=");
                    sb10.append(fa2Var.f374126e);
                    sb10.append(" container.container_id=");
                    sb10.append(fa2Var.f374125d);
                    sb10.append(" container.card_list.size=");
                    java.util.LinkedList<r45.ea2> linkedList3 = fa2Var.f374129h;
                    sb10.append(linkedList3.size());
                    com.tencent.mars.xlog.Log.i(str2, sb10.toString());
                    int i28 = fa2Var.f374126e;
                    if (i28 == 4 || i28 == i18 || i28 == 11) {
                        for (r45.ea2 ea2Var2 : linkedList3) {
                            com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = (com.tencent.mm.protocal.protobuf.FinderObject) ea2Var2.getCustom(i19);
                            if (finderObject4 != null) {
                                cu2.t tVar = cu2.u.f222441a;
                                java.util.List c18 = kz5.b0.c(finderObject4);
                                int d17 = hc2.d0.d(0);
                                r45.qt2 qt2Var = xVar.f221910p;
                                if (qt2Var == null) {
                                    kotlin.jvm.internal.o.o("contextObj");
                                    throw null;
                                }
                                com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) kz5.n0.Z(tVar.j(c18, d17, qt2Var));
                                if (finderItem != null) {
                                    int integer = ea2Var2.getInteger(1);
                                    if (integer == 4) {
                                        arrayList.add(new vp2.d0(finderItem, ea2Var2, fa2Var, ea2Var2.getString(8), z19));
                                    } else if (integer == 13) {
                                        arrayList.add(new vp2.i0(finderItem, ea2Var2, fa2Var, ea2Var2.getString(8), z19));
                                    }
                                }
                            }
                            cr2.a aVar3 = xVar.f221912r;
                            if (aVar3 != null) {
                                aVar3.notifyItemInserted(arrayList.size() - 1);
                            }
                            i19 = 2;
                        }
                    }
                    i18 = 10;
                    i19 = 2;
                }
            }
            xVar.f221919y.R6(((r45.yz2) fVar.f70618d).f391533w * 1000);
            z17 = true;
        } else {
            z17 = false;
        }
        if (lVar != null) {
            lVar.invoke(fVar);
        } else {
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = xVar.f221908n;
            if (wxRefreshLayout == null) {
                kotlin.jvm.internal.o.o("refreshLayout");
                throw null;
            }
            wxRefreshLayout.i(z17);
            com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout2 = xVar.f221908n;
            if (wxRefreshLayout2 == null) {
                kotlin.jvm.internal.o.o("refreshLayout");
                throw null;
            }
            wxRefreshLayout2.e(z17);
        }
        yz5.l lVar2 = this.f221877h;
        if (lVar2 != null) {
            lVar2.invoke(fVar);
        }
        return jz5.f0.f302826a;
    }
}
