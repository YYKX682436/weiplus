package com.tencent.mm.plugin.finder.presenter.contract.message;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageCgiSource;", "Lir2/c;", "Lso2/i;", "Lbq/a;", "Lr45/n81;", "Companion", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderMessageCgiSource extends ir2.c {

    /* renamed from: e, reason: collision with root package name */
    public final int f123267e;

    /* renamed from: f, reason: collision with root package name */
    public final int f123268f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f123269g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f123270h;

    /* renamed from: i, reason: collision with root package name */
    public final int f123271i;

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/message/FinderMessageCgiSource$Companion;", "", "()V", "TAG", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }
    }

    static {
        new com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource.Companion(null);
    }

    public FinderMessageCgiSource(int i17, int i18, int[] messageTypes, java.lang.String username, int i19) {
        kotlin.jvm.internal.o.g(messageTypes, "messageTypes");
        kotlin.jvm.internal.o.g(username, "username");
        this.f123267e = i17;
        this.f123268f = i18;
        this.f123269g = messageTypes;
        this.f123270h = username;
        this.f123271i = i19;
    }

    @Override // ir2.c
    public ir2.a e(int i17, int i18, java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData finderMessageLoaderData = new com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData(new java.util.ArrayList(), false);
        finderMessageLoaderData.f294085g = i18;
        finderMessageLoaderData.f294084f = i17;
        finderMessageLoaderData.f294086h = errorMsg;
        return finderMessageLoaderData;
    }

    @Override // ir2.c
    public ir2.a f(com.tencent.mm.protobuf.f fVar) {
        java.lang.Object obj;
        int i17;
        r45.n81 resp = (r45.n81) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.wg2 wg2Var = (r45.wg2) resp.getCustom(1);
        cu2.a0 a0Var = cu2.b0.f222371a;
        boolean z17 = false;
        if (wg2Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.MessageCgiSource", "GetMentionList size " + wg2Var.getList(0).size());
            java.util.LinkedList list = wg2Var.getList(0);
            kotlin.jvm.internal.o.f(list, "getMentions(...)");
            list.isEmpty();
            java.util.LinkedList list2 = wg2Var.getList(0);
            kotlin.jvm.internal.o.f(list2, "getMentions(...)");
            java.util.Iterator it = list2.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                i17 = this.f123267e;
                if (!hasNext) {
                    break;
                }
                r45.pg2 pg2Var = (r45.pg2) it.next();
                kotlin.jvm.internal.o.d(pg2Var);
                linkedList.add(a0Var.k(i17, pg2Var, this.f123270h));
            }
            if (bq.q0.f23513t.b()) {
                i(resp.getByteString(4));
            } else {
                java.util.LinkedList list3 = wg2Var.getList(0);
                kotlin.jvm.internal.o.f(list3, "getMentions(...)");
                list3.isEmpty();
                java.util.LinkedList<r45.pg2> list4 = wg2Var.getList(0);
                kotlin.jvm.internal.o.f(list4, "getMentions(...)");
                for (r45.pg2 pg2Var2 : list4) {
                    if (pg2Var2.getInteger(2) == 10 && !com.tencent.mm.sdk.platformtools.t8.K0(pg2Var2.getString(25))) {
                        com.tencent.mars.xlog.Log.i("Finder.MessageCgiSource", "MENTION_TYPE_FOLLOW_APPLICATION APPROVED, clean db, username:" + pg2Var2.getString(18) + ", clientMsgId:" + pg2Var2.getString(25) + " scene:" + i17);
                        java.lang.String string = pg2Var2.getString(25);
                        if (string == null) {
                            string = "";
                        }
                        a0Var.i(string, i17);
                    }
                }
                if (!linkedList.isEmpty()) {
                    a0Var.h(linkedList, i17);
                }
                i(resp.getByteString(2));
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            if (kz5.z.F(this.f123269g, ((dm.pd) obj2).field_type)) {
                arrayList.add(obj2);
            }
        }
        dm.pd pdVar = (dm.pd) kz5.n0.k0(arrayList);
        long j17 = pdVar != null ? pdVar.field_id : -1L;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            so2.i j18 = a0Var.j((dm.pd) it6.next());
            if (j18 != null) {
                arrayList2.add(j18);
            }
        }
        r45.qk4 qk4Var = (r45.qk4) resp.getCustom(5);
        if (qk4Var != null) {
            java.util.ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((so2.i) obj).f410411d.field_svrMentionId > qk4Var.getLong(0)) {
                    break;
                }
            }
            so2.i iVar = (so2.i) obj;
            if (iVar != null) {
                iVar.f410412e = true;
                iVar.f410413f = qk4Var.getInteger(1) == 1;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load:");
        sb6.append(arrayList2.size());
        sb6.append(" unreadMentionId:");
        sb6.append(j17);
        sb6.append(" lastReadInfo: ");
        sb6.append(qk4Var != null ? java.lang.Long.valueOf(qk4Var.getLong(0)) : null);
        sb6.append(" folded: ");
        if (qk4Var != null && qk4Var.getInteger(1) == 1) {
            z17 = true;
        }
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("Finder.MessageCgiSource", sb6.toString());
        com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData finderMessageLoaderData = new com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData(arrayList2, true);
        finderMessageLoaderData.f123279k = j17;
        finderMessageLoaderData.f123280l = qk4Var;
        finderMessageLoaderData.f123281m = (r45.tl6) resp.getCustom(3);
        return finderMessageLoaderData;
    }

    @Override // ir2.c, ir2.a0, ay1.m
    /* renamed from: getKey */
    public ir2.z getF123276h() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f123267e);
        sb6.append('-');
        sb6.append(this.f123268f);
        sb6.append('-');
        sb6.append(this.f123271i);
        return new ir2.z(sb6.toString());
    }

    @Override // ir2.c
    public az2.j h() {
        return new bq.a(this.f123267e, this.f123268f, this.f123270h, false);
    }

    public final void i(com.tencent.mm.protobuf.g gVar) {
        if (gVar != null) {
            bq.p0 p0Var = bq.q0.f23513t;
            p0Var.g(this.f123267e, this.f123268f, gVar.g(), this.f123270h, p0Var.b());
        }
        if (gVar != null && gVar.f192156a.length == 0) {
            int a17 = bq.q0.f23513t.a(this.f123267e);
            if (a17 == 2) {
                int i17 = this.f123268f;
                if (i17 == 1) {
                    jx3.f.INSTANCE.idkeyStat(1279L, 50L, 1L, false);
                } else if (i17 == 2) {
                    jx3.f.INSTANCE.idkeyStat(1279L, 51L, 1L, false);
                }
            } else if (a17 == 1) {
                jx3.f.INSTANCE.idkeyStat(1279L, 52L, 1L, false);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("lastBuf ");
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.f192156a.length) : "null");
        com.tencent.mars.xlog.Log.i("Finder.MessageCgiSource", sb6.toString());
    }
}
