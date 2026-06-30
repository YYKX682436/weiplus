package com.tencent.mm.plugin.finder.presenter.contract;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lir2/v1;", "Lso2/i;", "state", "Ljz5/f0;", "invoke", "(Lir2/v1;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderNotifyContractNew$NotifyPresenter$observeLoaderState$1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter f123182d;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$observeLoaderState$1$2, reason: invalid class name */
    /* loaded from: classes10.dex */
    final class AnonymousClass2 extends kotlin.jvm.internal.q implements yz5.a {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter f123183d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ir2.v1 f123184e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter, ir2.v1 v1Var) {
            super(0);
            this.f123183d = notifyPresenter;
            this.f123184e = v1Var;
        }

        @Override // yz5.a
        public java.lang.Object invoke() {
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f123183d.f123166v;
            if (notifyViewCallback == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            r45.tl6 tl6Var = ((com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData) ((ir2.u1) this.f123184e).f294227a).f123281m;
            if (tl6Var != null) {
                if (notifyViewCallback.f123202p == null) {
                    android.view.View inflate = com.tencent.mm.ui.id.b(notifyViewCallback.f123198i).inflate(com.tencent.mm.R.layout.f489085ee2, (android.view.ViewGroup) null);
                    notifyViewCallback.f123202p = inflate;
                    if (inflate != null) {
                        inflate.setBackgroundColor(inflate.getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
                        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.tu8);
                        if (findViewById != null) {
                            android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
                            layoutParams2.setMarginStart(findViewById.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn));
                            findViewById.setLayoutParams(layoutParams2);
                        }
                        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = notifyViewCallback.f123196g;
                        if (refreshLoadMoreLayout != null) {
                            com.tencent.mm.view.HeadFooterLayout.c(refreshLoadMoreLayout, inflate, false, 2, null);
                        }
                    }
                }
                android.view.View view = notifyViewCallback.f123202p;
                if (view != null) {
                    com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.r(com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a, view, tl6Var, "make_red_envelope_roof_banner", null, null, null, 56, null);
                }
            }
            return jz5.f0.f302826a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderNotifyContractNew$NotifyPresenter$observeLoaderState$1(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter) {
        super(1);
        this.f123182d = notifyPresenter;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.i iVar;
        ir2.v1 state = (ir2.v1) obj;
        kotlin.jvm.internal.o.g(state, "state");
        if (state instanceof ir2.s1) {
            java.lang.String str = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.B;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeLoaderState FirstScreenState isNotEmpty:");
            if (this.f123182d.f123164t == null) {
                kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
                throw null;
            }
            sb6.append(!((java.util.ArrayList) r10.f294091d).isEmpty());
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (this.f123182d.f123164t == null) {
                kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
                throw null;
            }
            if (!((java.util.ArrayList) r2.f294091d).isEmpty()) {
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f123182d.f123166v;
                if (notifyViewCallback == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$dismissRefreshViewOnError$1(notifyViewCallback));
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f123182d;
            no2.c cVar = notifyPresenter.f123165u;
            if (cVar != null) {
                java.util.List data = ((ir2.s1) state).f294217a.f294129a;
                int i17 = notifyPresenter.f123155h;
                int i18 = notifyPresenter.f123153f;
                kotlin.jvm.internal.o.g(data, "data");
                ir2.a1 a1Var = cVar.f338742b;
                if (a1Var != null) {
                    cVar.a(data, new java.util.ArrayList(a1Var.f294091d), i17, i18);
                }
            }
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.T6).getValue()).r()).intValue() == 1 && (iVar = (so2.i) kz5.n0.Z(((ir2.s1) state).f294217a.f294129a)) != null) {
                dm.pd pdVar = iVar.f410411d;
                pdVar.field_type = 33;
                pdVar.field_content = "为你加人气， 把你推荐给100人";
                r45.fb1 fb1Var = new r45.fb1();
                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
                finderJumpInfo.setJumpinfo_type(6);
                r45.k74 k74Var = new r45.k74();
                k74Var.set(0, "wxalited00aacfb50f5dd1a839f104a56d7e048");
                k74Var.set(1, "pages/model/index");
                k74Var.set(7, java.lang.Boolean.TRUE);
                finderJumpInfo.setLite_app_info(k74Var);
                fb1Var.set(0, finderJumpInfo);
                pdVar.field_help_promotion_info = fb1Var;
                pdVar.field_commentId = 0L;
            }
        } else if (state instanceof ir2.u1) {
            ir2.u1 u1Var = (ir2.u1) state;
            ir2.e1 e1Var = u1Var.f294227a;
            kotlin.jvm.internal.o.e(e1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData");
            com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData finderMessageLoaderData = (com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData) e1Var;
            long a17 = c01.id.a();
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter2 = this.f123182d;
            long j17 = a17 - notifyPresenter2.f123162r;
            ir2.a1 a1Var2 = notifyPresenter2.f123164t;
            if (a1Var2 == null) {
                kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
                throw null;
            }
            boolean isEmpty = ((java.util.ArrayList) a1Var2.f294091d).isEmpty();
            this.f123182d.f123162r = 0L;
            java.lang.String str2 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.B;
            com.tencent.mars.xlog.Log.i(str2, "observeLoaderState errorType:" + finderMessageLoaderData.f294084f + " errorCode:" + finderMessageLoaderData.f294085g);
            if (finderMessageLoaderData.f294084f == 0 && finderMessageLoaderData.f294085g == 0) {
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter3 = this.f123182d;
                com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData finderMessageLoaderData2 = (com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageLoaderData) u1Var.f294227a;
                notifyPresenter3.f123159o = finderMessageLoaderData2.f123279k;
                notifyPresenter3.f123160p = finderMessageLoaderData2.f123280l;
                com.tencent.mars.xlog.Log.i(str2, "tabIndex:" + this.f123182d.f123155h + " RefreshedState refreshTime:" + j17 + " isEmpty:" + isEmpty + " size:" + u1Var.f294227a.f294129a.size());
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback2 = this.f123182d.f123166v;
                if (notifyViewCallback2 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                pm0.v.V(0L, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$finishRefresh$1(isEmpty, notifyViewCallback2));
                pm0.v.X(new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyPresenter$observeLoaderState$1.AnonymousClass2(this.f123182d, state));
            } else if (isEmpty) {
                final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback3 = this.f123182d.f123166v;
                if (notifyViewCallback3 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                notifyViewCallback3.f123197h = new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$showRefreshViewOnError$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f491897el4);
                        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9);
                        java.lang.String str3 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t;
                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.this.s(string, color, true);
                    }
                };
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                if (j17 >= ((java.lang.Number) t70Var.F2().r()).longValue()) {
                    java.lang.Runnable runnable = notifyViewCallback3.f123197h;
                    if (runnable != null) {
                        ((com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$showRefreshViewOnError$1) runnable).run();
                    }
                } else {
                    java.lang.Runnable runnable2 = notifyViewCallback3.f123197h;
                    if (runnable2 != null) {
                        long longValue = ((java.lang.Number) t70Var.F2().r()).longValue() - j17;
                        java.util.regex.Pattern pattern = pm0.v.f356802a;
                        com.tencent.mm.sdk.platformtools.u3.i(runnable2, longValue);
                    }
                }
            }
        } else if (state instanceof ir2.t1) {
            long a18 = c01.id.a();
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter4 = this.f123182d;
            long j18 = a18 - notifyPresenter4.f123163s;
            notifyPresenter4.f123163s = 0L;
            java.lang.String str3 = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.B;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tabIndex:");
            sb7.append(this.f123182d.f123155h);
            sb7.append("  LoadedMoreState loadMoreTime:");
            sb7.append(j18);
            sb7.append(" size:");
            ir2.t1 t1Var = (ir2.t1) state;
            sb7.append(t1Var.f294223a.f294129a.size());
            com.tencent.mars.xlog.Log.i(str3, sb7.toString());
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback4 = this.f123182d.f123166v;
            if (notifyViewCallback4 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            java.util.List msgList = t1Var.f294223a.f294129a;
            kotlin.jvm.internal.o.g(msgList, "msgList");
            java.util.ArrayList c17 = notifyViewCallback4.f123194e.c();
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback.f123192t, "finishLoadMore .getData(" + notifyViewCallback4.f123195f + ": " + c17.hashCode() + " --- " + c17 + ')');
            com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            pm0.v.V(j18 >= ((java.lang.Number) t70Var2.F2().r()).longValue() ? 0L : ((java.lang.Number) t70Var2.F2().r()).longValue() - j18, new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew$NotifyViewCallback$finishLoadMore$1(notifyViewCallback4, msgList));
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter5 = this.f123182d;
            no2.c cVar2 = notifyPresenter5.f123165u;
            if (cVar2 != null) {
                java.util.List data2 = t1Var.f294223a.f294129a;
                int i19 = notifyPresenter5.f123155h;
                int i27 = notifyPresenter5.f123153f;
                kotlin.jvm.internal.o.g(data2, "data");
                ir2.a1 a1Var3 = cVar2.f338742b;
                if (a1Var3 != null) {
                    cVar2.a(data2, new java.util.ArrayList(a1Var3.f294091d), i19, i27);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
