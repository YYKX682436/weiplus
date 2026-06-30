package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderMsgContract$MsgViewCallback$finishLoadMore$1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback f122875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f122876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f122877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f122878g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgViewCallback$finishLoadMore$1(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback, java.util.List list, boolean z17, kotlin.jvm.internal.f0 f0Var) {
        super(0);
        this.f122875d = msgViewCallback;
        this.f122876e = list;
        this.f122877f = z17;
        this.f122878g = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        dm.pd pdVar;
        int i18;
        int i19;
        int i27;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = this.f122875d;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = msgViewCallback.f122859f;
        java.util.ArrayList raw = msgPresenter.f122828i;
        java.util.List increment = this.f122876e;
        kotlin.jvm.internal.o.g(increment, "increment");
        kotlin.jvm.internal.o.g(raw, "raw");
        boolean isEmpty = raw.isEmpty();
        java.lang.String str = msgPresenter.f122826g;
        if (isEmpty) {
            raw.addAll(increment);
        } else {
            raw.get(kz5.c0.h(raw));
            for (so2.i iVar : kz5.n0.x0(increment)) {
                java.util.Iterator it = raw.iterator();
                int i28 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        i28 = -1;
                        break;
                    }
                    dm.pd pdVar2 = ((so2.i) it.next()).f410411d;
                    long j17 = pdVar2.field_id;
                    dm.pd pdVar3 = iVar.f410411d;
                    if (j17 == pdVar3.field_id && pdVar2.field_createTime == pdVar3.field_createTime) {
                        i17 = -1;
                        break;
                    }
                    i28++;
                }
                if (i28 == i17) {
                    dm.pd pdVar4 = iVar.f410411d;
                    if (pdVar4.field_type == 10 && !com.tencent.mm.sdk.platformtools.t8.K0(pdVar4.field_clientMsgId)) {
                        java.util.Iterator it6 = raw.iterator();
                        int i29 = 0;
                        while (true) {
                            boolean hasNext = it6.hasNext();
                            pdVar = iVar.f410411d;
                            if (!hasNext) {
                                i18 = -1;
                                break;
                            }
                            if (kotlin.jvm.internal.o.b(((so2.i) it6.next()).f410411d.field_clientMsgId, pdVar.field_clientMsgId)) {
                                i18 = i29;
                                break;
                            }
                            i29++;
                        }
                        if (i18 >= 0) {
                            raw.remove(i18);
                            com.tencent.mars.xlog.Log.i(str, "remove same clientMsgId, " + pdVar.field_clientMsgId);
                        }
                    }
                    raw.add(iVar);
                } else {
                    raw.set(i28, iVar);
                }
            }
            kz5.g0.t(raw, new java.util.Comparator() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$sortMentionList$comparator$1
                @Override // java.util.Comparator
                public int compare(java.lang.Object obj, java.lang.Object obj2) {
                    dm.pd pdVar5 = ((so2.i) obj).f410411d;
                    int i37 = pdVar5.field_createTime;
                    dm.pd pdVar6 = ((so2.i) obj2).f410411d;
                    int i38 = pdVar6.field_createTime;
                    return i37 == i38 ? kotlin.jvm.internal.o.j(pdVar6.field_id, pdVar5.field_id) : kotlin.jvm.internal.o.i(i38, i37);
                }
            });
        }
        com.tencent.mars.xlog.Log.i(str, "increment size " + increment.size());
        if ((!increment.isEmpty()) && msgPresenter.f122829m > 0) {
            java.util.ListIterator listIterator = raw.listIterator(raw.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i27 = -1;
                    break;
                }
                if (((so2.i) listIterator.previous()).f410411d.field_id == msgPresenter.f122829m) {
                    i27 = listIterator.nextIndex();
                    break;
                }
            }
            com.tencent.mars.xlog.Log.i(str, "unread index " + i27 + ", raw size " + raw.size());
            if (i27 != -1) {
                if (i27 >= 0) {
                    int i37 = 0;
                    while (true) {
                        ((so2.i) raw.get(i37)).f410412e = false;
                        if (i37 == i27) {
                            break;
                        }
                        i37++;
                    }
                }
                if (i27 != kz5.c0.h(raw)) {
                    ((so2.i) raw.get(i27)).f410412e = true;
                }
            }
        }
        if (msgViewCallback.f122859f.f122828i.isEmpty()) {
            i19 = 0;
            pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$showRefreshTip$1(msgViewCallback.getResources().getString(com.tencent.mm.R.string.epa), msgViewCallback, false, msgViewCallback.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3)));
        } else {
            i19 = 0;
            pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$showRefreshTip$1(null, msgViewCallback, false, 0));
        }
        if (this.f122877f) {
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = msgViewCallback.f122863m;
            if (refreshLoadMoreLayout == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout.P(i19);
            androidx.recyclerview.widget.RecyclerView recyclerView = msgViewCallback.f122862i;
            if (recyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        } else {
            ym5.s3 s3Var = new ym5.s3(1);
            s3Var.f463522g = false;
            s3Var.f463521f = true ^ increment.isEmpty();
            s3Var.f463523h = increment.size();
            androidx.recyclerview.widget.RecyclerView recyclerView2 = msgViewCallback.f122862i;
            if (recyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeInserted(this.f122878g.f310116d, increment.size());
            }
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = msgViewCallback.f122863m;
            if (refreshLoadMoreLayout2 == null) {
                kotlin.jvm.internal.o.o("rlLayout");
                throw null;
            }
            refreshLoadMoreLayout2.onPreFinishLoadMoreSmooth(s3Var);
        }
        return jz5.f0.f302826a;
    }
}
