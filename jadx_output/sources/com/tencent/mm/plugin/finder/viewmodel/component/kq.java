package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class kq extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f134980i = {"NotificationCenterLike", "NotificationCenterComment", "NotificationCenterFollow"};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f134981m = {"MemberNotificationCenterLike", "MemberNotificationCenterComment", "MemberNotificationCenterJoin"};

    /* renamed from: d, reason: collision with root package name */
    public int f134982d;

    /* renamed from: e, reason: collision with root package name */
    public int f134983e;

    /* renamed from: f, reason: collision with root package name */
    public int f134984f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback f134985g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter f134986h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f134982d = -1;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b3y;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f134986h;
        if (notifyPresenter != null) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM = notifyPresenter.f123167w;
            if (finderMsgOperateVM != null) {
                finderMsgOperateVM.e(i17, i18, intent);
            } else {
                kotlin.jvm.internal.o.o("msgOperateVM");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback;
        java.lang.String str;
        java.lang.StringBuilder sb6;
        super.onCreateAfter(bundle);
        pf5.u uVar = pf5.u.f353936a;
        this.f134983e = ((ey2.f2) uVar.e(c61.l7.class).a(ey2.f2.class)).N6("FinderNotifyUIC", 1, xy2.c.e(getContext()));
        int i17 = (((com.tencent.mm.plugin.finder.viewmodel.component.fp) uVar.b(getContext()).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).f134417w == 1 ? com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI.f128577w : com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI.f128576v)[this.f134982d];
        androidx.fragment.app.Fragment fragment = getFragment();
        kotlin.jvm.internal.o.d(fragment);
        java.lang.Object obj = (((com.tencent.mm.plugin.finder.viewmodel.component.fp) uVar.b(getContext()).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).f134417w == 1 ? com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI.f128575u : com.tencent.mm.plugin.finder.ui.FinderFinderMsgUI.f128574t).get(this.f134982d);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        this.f134986h = new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter(fragment, 1, i17, (int[]) obj, this.f134982d, ((com.tencent.mm.plugin.finder.viewmodel.component.fp) uVar.b(getContext()).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).f134417w);
        androidx.fragment.app.Fragment fragment2 = getFragment();
        kotlin.jvm.internal.o.d(fragment2);
        android.view.View rootView = getRootView();
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f134986h;
        kotlin.jvm.internal.o.d(notifyPresenter);
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback2 = new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback(fragment2, rootView, notifyPresenter, this.f134982d);
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter2 = this.f134986h;
        if (notifyPresenter2 != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onAttach ");
            int i18 = notifyPresenter2.f123152e;
            sb7.append(i18);
            sb7.append(' ');
            sb7.append(notifyPresenter2.f123153f);
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.B, sb7.toString());
            notifyPresenter2.f123166v = notifyViewCallback2;
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback3 = notifyPresenter2.f123166v;
            if (notifyViewCallback3 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            notifyPresenter2.f123167w = new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM(notifyViewCallback3.getActivity(), i18);
            notifyPresenter2.f123169y.alive();
            notifyPresenter2.A.alive();
            notifyPresenter2.f123170z.alive();
            boolean b17 = bq.q0.f23513t.b();
            androidx.fragment.app.Fragment fragment3 = notifyPresenter2.f123151d;
            if (b17) {
                int i19 = notifyPresenter2.f123152e;
                int i27 = notifyPresenter2.f123153f;
                int[] iArr = notifyPresenter2.f123154g;
                notifyViewCallback = notifyViewCallback2;
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback4 = notifyPresenter2.f123166v;
                if (notifyViewCallback4 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource finderMessageCgiSource = new com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource(i19, i27, iArr, xy2.c.e(notifyViewCallback4.getActivity()), notifyPresenter2.f123156i);
                int i28 = notifyPresenter2.f123152e;
                int i29 = notifyPresenter2.f123153f;
                int[] iArr2 = notifyPresenter2.f123154g;
                str = "FinderNotifyUIC";
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback5 = notifyPresenter2.f123166v;
                if (notifyViewCallback5 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource finderMessageCgiSource2 = new com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource(i28, i29, iArr2, xy2.c.e(notifyViewCallback5.getActivity()), notifyPresenter2.f123156i);
                int i37 = notifyPresenter2.f123152e;
                int i38 = notifyPresenter2.f123153f;
                int[] iArr3 = notifyPresenter2.f123154g;
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback6 = notifyPresenter2.f123166v;
                if (notifyViewCallback6 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource finderMessageCgiSource3 = new com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource(i37, i38, iArr3, xy2.c.e(notifyViewCallback6.getActivity()), notifyPresenter2.f123156i);
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback7 = notifyPresenter2.f123166v;
                if (notifyViewCallback7 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = notifyViewCallback7.f123196g;
                kotlin.jvm.internal.o.g(fragment3, "fragment");
                androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(fragment3).a(ir2.a1.class);
                kotlin.jvm.internal.o.e(a17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.newloader.Loader<T of com.tencent.mm.plugin.finder.newloader.Loader.LoaderBuilder>");
                ir2.a1 a1Var = (ir2.a1) a17;
                a1Var.f294093f = finderMessageCgiSource;
                a1Var.f294094g = null;
                a1Var.f294095h = finderMessageCgiSource2;
                a1Var.f294096i = finderMessageCgiSource3;
                a1Var.f294097m = null;
                a1Var.f294098n = refreshLoadMoreLayout;
                notifyPresenter2.f123164t = a1Var;
                notifyPresenter2.f();
            } else {
                notifyViewCallback = notifyViewCallback2;
                str = "FinderNotifyUIC";
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback8 = notifyPresenter2.f123166v;
                if (notifyViewCallback8 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageDbSource finderMessageDbSource = new com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageDbSource(notifyPresenter2.f123154g, i18, xy2.c.e(notifyViewCallback8.getActivity()), notifyPresenter2.f123156i);
                finderMessageDbSource.f123277i = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
                finderMessageDbSource.f123278m = 20;
                notifyPresenter2.f123168x = finderMessageDbSource;
                int i39 = notifyPresenter2.f123152e;
                int i47 = notifyPresenter2.f123153f;
                int[] iArr4 = notifyPresenter2.f123154g;
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback9 = notifyPresenter2.f123166v;
                if (notifyViewCallback9 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource finderMessageCgiSource4 = new com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageCgiSource(i39, i47, iArr4, xy2.c.e(notifyViewCallback9.getActivity()), notifyPresenter2.f123156i);
                com.tencent.mm.plugin.finder.presenter.contract.message.FinderMessageDbSource finderMessageDbSource2 = notifyPresenter2.f123168x;
                kotlin.jvm.internal.o.d(finderMessageDbSource2);
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback10 = notifyPresenter2.f123166v;
                if (notifyViewCallback10 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = notifyViewCallback10.f123196g;
                kotlin.jvm.internal.o.g(fragment3, "fragment");
                androidx.lifecycle.c1 a18 = pf5.z.f353948a.b(fragment3).a(ir2.a1.class);
                kotlin.jvm.internal.o.e(a18, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.newloader.Loader<T of com.tencent.mm.plugin.finder.newloader.Loader.LoaderBuilder>");
                ir2.a1 a1Var2 = (ir2.a1) a18;
                a1Var2.f294093f = finderMessageDbSource;
                a1Var2.f294094g = null;
                a1Var2.f294095h = finderMessageCgiSource4;
                a1Var2.f294096i = finderMessageDbSource2;
                a1Var2.f294097m = null;
                a1Var2.f294098n = refreshLoadMoreLayout2;
                notifyPresenter2.f123164t = a1Var2;
                notifyPresenter2.f();
                ir2.a1 a1Var3 = notifyPresenter2.f123164t;
                if (a1Var3 == null) {
                    kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
                    throw null;
                }
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback11 = notifyPresenter2.f123166v;
                if (notifyViewCallback11 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) notifyViewCallback11.getActivity();
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback12 = notifyPresenter2.f123166v;
                if (notifyViewCallback12 == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                notifyPresenter2.f123165u = new no2.c(i18, a1Var3, mMActivity, notifyViewCallback12.f123196g);
            }
        } else {
            notifyViewCallback = notifyViewCallback2;
            str = "FinderNotifyUIC";
        }
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int i48 = ((com.tencent.mm.plugin.finder.viewmodel.component.fp) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).f134417w;
        java.lang.String[] strArr = f134981m;
        java.lang.String[] strArr2 = f134980i;
        r45.f03 b07 = nk6.b0((i48 == 1 ? strArr : strArr2)[this.f134982d], xy2.c.e(getContext()));
        this.f134984f = b07 != null ? b07.f373888e : 0;
        androidx.fragment.app.Fragment fragment4 = getFragment();
        kotlin.jvm.internal.o.d(fragment4);
        androidx.fragment.app.FragmentActivity activity = fragment4.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        zx2.i b76 = ((com.tencent.mm.plugin.finder.viewmodel.component.fp) zVar.a((com.tencent.mm.ui.MMActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).b7(this.f134982d);
        if ((b76 instanceof gy2.b) && b07 != null) {
            if (this.f134984f > 9999) {
                sb6 = new java.lang.StringBuilder("+");
                sb6.append(this.f134984f / 10000);
                sb6.append((char) 19975);
            } else {
                sb6 = new java.lang.StringBuilder("+");
                sb6.append(this.f134984f);
            }
            java.lang.String sb8 = sb6.toString();
            if (this.f134984f > 0) {
                com.tencent.mars.xlog.Log.i(str, "setRedDot " + this.f134982d + ':' + sb8);
                ((gy2.b) b76).r(sb8, false);
            } else {
                ((gy2.b) b76).r(sb8, false);
            }
        }
        notifyViewCallback.b();
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter3 = this.f134986h;
        if (notifyPresenter3 != null) {
            if (this.f134983e == this.f134982d) {
                notifyPresenter3.f123158n = true;
            }
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter.B, "loadFirstScreen:");
            ir2.a1 a1Var4 = notifyPresenter3.f123164t;
            if (a1Var4 == null) {
                kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
                throw null;
            }
            pf5.e.launch$default(a1Var4, null, null, new ir2.m0(a1Var4, null), 3, null);
            notifyPresenter3.g();
        }
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String w76 = ((com.tencent.mm.plugin.finder.viewmodel.component.fp) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).w7(this.f134982d);
        com.tencent.mm.plugin.finder.extension.reddot.jb S0 = zy2.ia.S0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), w76, xy2.c.e(getContext()), false, false, 12, null);
        r45.f03 b08 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().b0(w76, xy2.c.e(getContext()));
        androidx.fragment.app.Fragment fragment5 = getFragment();
        if (S0 != null && b08 != null && fragment5 != null) {
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            androidx.fragment.app.FragmentActivity activity2 = fragment5.getActivity();
            kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((com.tencent.mm.ui.MMActivity) activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            com.tencent.mm.plugin.finder.report.x2.i(x2Var, "5", S0, b08, 1, nyVar != null ? nyVar.V6() : null, 0, null, 0, 0, 480, null);
            if (this.f134983e == this.f134982d) {
                androidx.fragment.app.FragmentActivity activity3 = fragment5.getActivity();
                kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((com.tencent.mm.ui.MMActivity) activity3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                com.tencent.mm.plugin.finder.report.x2.i(x2Var, "5", S0, b08, 3, nyVar2 != null ? nyVar2.V6() : null, 1, null, 0, 0, com.tencent.wcdb.FileUtils.S_IRWXU, null);
            }
        }
        if (this.f134984f > 0) {
            zy2.fa nk7 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            android.app.Activity context3 = getContext();
            kotlin.jvm.internal.o.g(context3, "context");
            if (!(context3 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            if (((com.tencent.mm.plugin.finder.viewmodel.component.fp) zVar.a((androidx.appcompat.app.AppCompatActivity) context3).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).f134417w != 1) {
                strArr = strArr2;
            }
            nk7.y(strArr[this.f134982d], xy2.c.e(getContext()));
        }
        this.f134985g = notifyViewCallback;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f134986h;
        if (notifyPresenter != null) {
            notifyPresenter.onDetach();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        super.onPause();
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f134985g;
        if (notifyViewCallback == null || (wxRecyclerAdapter = notifyViewCallback.f123205s) == null) {
            return;
        }
        wxRecyclerAdapter.z0();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f134986h;
        if (notifyPresenter != null) {
            notifyPresenter.f123161q = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = this.f134985g;
        if (notifyViewCallback == null || (wxRecyclerAdapter = notifyViewCallback.f123205s) == null) {
            return;
        }
        wxRecyclerAdapter.A0();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f134986h;
        if (notifyPresenter != null) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.f123149a.getClass();
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.f123150b.f57440q = java.lang.System.currentTimeMillis() - notifyPresenter.f123161q;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        com.tencent.mars.xlog.Log.i("FinderNotifyUIC", "onUserVisibleFocused:  " + this.f134982d);
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter = this.f134986h;
        if (notifyPresenter == null) {
            return;
        }
        notifyPresenter.f123158n = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        com.tencent.mars.xlog.Log.i("FinderNotifyUIC", "onUserVisibleUnFocused:  " + this.f134982d);
    }
}
