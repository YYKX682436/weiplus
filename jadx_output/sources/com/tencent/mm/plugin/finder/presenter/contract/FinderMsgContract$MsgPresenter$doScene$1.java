package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lr45/n81;", "<anonymous parameter 0>", "Ljava/util/LinkedList;", "Ldm/pd;", "newMenList", "Lr45/qk4;", "<anonymous parameter 2>", "Ljz5/f0;", "invoke", "(Lr45/n81;Ljava/util/LinkedList;Lr45/qk4;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderMsgContract$MsgPresenter$doScene$1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f122835d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter f122836e;

    @qz5.f(c = "com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$1$1", f = "FinderMsgContract.kt", l = {}, m = "invokeSuspend")
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/y0;", "Ljz5/f0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$1$1, reason: invalid class name */
    /* loaded from: classes10.dex */
    final class AnonymousClass1 extends qz5.l implements yz5.p {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ java.util.LinkedList f122837d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter f122838e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter, kotlin.coroutines.Continuation continuation) {
            super(2, continuation);
            this.f122837d = linkedList;
            this.f122838e = msgPresenter;
        }

        @Override // qz5.a
        public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            return new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$1.AnonymousClass1(this.f122837d, this.f122838e, continuation);
        }

        @Override // yz5.p
        public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$1.AnonymousClass1 anonymousClass1 = (com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$1.AnonymousClass1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
            jz5.f0 f0Var = jz5.f0.f302826a;
            anonymousClass1.invokeSuspend(f0Var);
            return f0Var;
        }

        @Override // qz5.a
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            pz5.a aVar = pz5.a.f359186d;
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.LinkedList linkedList = this.f122837d;
            dm.pd pdVar = (dm.pd) kz5.n0.k0(linkedList);
            long j17 = pdVar != null ? pdVar.field_id : 0L;
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter = this.f122838e;
            com.tencent.mars.xlog.Log.i(msgPresenter.f122826g, "newUnreadMention " + j17 + ", unreadMention " + msgPresenter.f122829m);
            if (j17 > 0) {
                long j18 = msgPresenter.f122829m;
                if (j18 == 0) {
                    msgPresenter.f122829m = j17;
                } else if (j17 < j18) {
                    msgPresenter.f122829m = j17;
                }
            }
            com.tencent.mars.xlog.Log.i(msgPresenter.f122826g, "unreadMention " + msgPresenter.f122829m + " newMenList:" + linkedList.size());
            if (bq.q0.f23513t.b()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    so2.i j19 = cu2.b0.f222371a.j((dm.pd) it.next());
                    if (j19 != null) {
                        arrayList2.add(j19);
                    }
                }
                arrayList.addAll(arrayList2);
                if (msgPresenter.f122828i.size() == 0 && arrayList.size() > 0) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LATEST_NOTIFICATION_TIME_LONG_SYNC, new java.lang.Long(((so2.i) kz5.n0.X(arrayList)).f410411d.field_createTime));
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LATEST_NOTIFICATION_BRIEF_STRING_SYNC, ((so2.i) kz5.n0.X(arrayList)).f410411d.field_notify.getString(0));
                }
                msgPresenter.getClass();
                com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgViewCallback msgViewCallback = msgPresenter.f122827h;
                if (msgViewCallback != null) {
                    if (msgPresenter.f122823d == 1) {
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            dm.pd pdVar2 = ((so2.i) it6.next()).f410411d;
                            long j27 = pdVar2.field_id;
                            long j28 = msgPresenter.f122829m;
                            com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = msgPresenter.f122832p;
                            if (j27 < j28 || j28 == 0) {
                                int i17 = pdVar2.field_type;
                                if (i17 == 1) {
                                    finderMsgUIItemBrowseStruct.f57436m++;
                                } else if (i17 == 2) {
                                    finderMsgUIItemBrowseStruct.f57437n++;
                                } else if (i17 == 3) {
                                    finderMsgUIItemBrowseStruct.f57438o++;
                                } else if (i17 == 5) {
                                    finderMsgUIItemBrowseStruct.f57439p++;
                                }
                                finderMsgUIItemBrowseStruct.f57431h++;
                            } else {
                                int i18 = pdVar2.field_type;
                                if (i18 == 1) {
                                    finderMsgUIItemBrowseStruct.f57432i++;
                                } else if (i18 == 2) {
                                    finderMsgUIItemBrowseStruct.f57433j++;
                                } else if (i18 == 3) {
                                    finderMsgUIItemBrowseStruct.f57434k++;
                                } else if (i18 == 5) {
                                    finderMsgUIItemBrowseStruct.f57435l++;
                                }
                                finderMsgUIItemBrowseStruct.f57430g++;
                            }
                            finderMsgUIItemBrowseStruct.f57429f++;
                        }
                    }
                    msgViewCallback.s(arrayList, true, msgPresenter.f122828i.size() == 0);
                }
            } else {
                this.f122838e.f(com.tencent.wcdb.core.Database.DictDefaultMatchValue, linkedList.size(), true, true);
            }
            return jz5.f0.f302826a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMsgContract$MsgPresenter$doScene$1(kotlinx.coroutines.y0 y0Var, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.MsgPresenter msgPresenter) {
        super(3);
        this.f122835d = y0Var;
        this.f122836e = msgPresenter;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.util.LinkedList newMenList = (java.util.LinkedList) obj2;
        kotlin.jvm.internal.o.g((r45.n81) obj, "<anonymous parameter 0>");
        kotlin.jvm.internal.o.g(newMenList, "newMenList");
        kotlinx.coroutines.y0 y0Var = this.f122835d;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$doScene$1.AnonymousClass1(newMenList, this.f122836e, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
