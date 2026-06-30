package vy2;

/* loaded from: classes10.dex */
public final class a extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.UICallbackListener {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String[] f441454m = {"WxMessageLike", "WxMessageComment"};

    /* renamed from: d, reason: collision with root package name */
    public int f441455d;

    /* renamed from: e, reason: collision with root package name */
    public int f441456e;

    /* renamed from: f, reason: collision with root package name */
    public int f441457f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f441458g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback f441459h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f441460i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f441455d = -1;
    }

    @Override // com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback.UICallbackListener
    public void F(dm.pd mention) {
        kotlin.jvm.internal.o.g(mention, "mention");
    }

    public final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter O6() {
        androidx.fragment.app.Fragment fragment = getFragment();
        if (!((fragment != null ? fragment.getActivity() : null) instanceof com.tencent.mm.plugin.finder.ui.FinderWxMsgUI)) {
            return null;
        }
        androidx.fragment.app.Fragment fragment2 = getFragment();
        androidx.fragment.app.FragmentActivity activity = fragment2 != null ? fragment2.getActivity() : null;
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.FinderWxMsgUI");
        return ((com.tencent.mm.plugin.finder.ui.FinderWxMsgUI) activity).f128798t;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b3y;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        java.util.List list;
        int i17;
        java.lang.StringBuilder sb6;
        super.onCreateAfter(bundle);
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.f441456e = ((vy2.e) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(vy2.e.class)).f441461w;
        this.f441460i = O6();
        androidx.fragment.app.Fragment fragment = getFragment();
        androidx.fragment.app.FragmentActivity activity = fragment != null ? fragment.getActivity() : null;
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View rootView = getRootView();
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter O6 = O6();
        kotlin.jvm.internal.o.d(O6);
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback((com.tencent.mm.ui.MMActivity) activity, rootView, O6, this, this.f441455d);
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f441460i;
        if (notifyPresenter != null) {
            bq.p0 p0Var = bq.q0.f23513t;
            bq.q0.f23514u.clear();
            java.util.ArrayList arrayList = notifyPresenter.f123012o;
            arrayList.add(notifyViewCallback);
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new java.util.Comparator() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyPresenter$onAttach$$inlined$sortBy$1
                    @Override // java.util.Comparator
                    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                        return mz5.a.b(java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback) obj).f123079d), java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback) obj2).f123079d));
                    }
                });
            }
            if (notifyPresenter.f123013p == null) {
                notifyPresenter.f123013p = new com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM(notifyViewCallback.f123083h, notifyPresenter.f123004d);
            }
            com.tencent.mars.xlog.Log.i(notifyPresenter.f123007g, "onAttach " + notifyPresenter.f123005e);
        }
        notifyViewCallback.b();
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        java.lang.String[] strArr = f441454m;
        r45.f03 I0 = nk6.I0(strArr[this.f441455d]);
        this.f441457f = I0 != null ? I0.f373888e : 0;
        androidx.fragment.app.Fragment fragment2 = getFragment();
        kotlin.jvm.internal.o.d(fragment2);
        androidx.fragment.app.FragmentActivity activity2 = fragment2.getActivity();
        kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        zx2.i b76 = ((vy2.e) zVar.a((com.tencent.mm.ui.MMActivity) activity2).a(vy2.e.class)).b7(this.f441455d);
        if ((b76 instanceof gy2.b) && (i17 = this.f441457f) > 0) {
            if (i17 > 9999) {
                sb6 = new java.lang.StringBuilder("+");
                sb6.append(this.f441457f / 10000);
                sb6.append((char) 19975);
            } else {
                sb6 = new java.lang.StringBuilder("+");
                sb6.append(this.f441457f);
            }
            java.lang.String sb7 = sb6.toString();
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "setRedDot " + this.f441455d + ':' + sb7);
            ((gy2.b) b76).r(sb7, this.f441456e == this.f441455d);
        }
        int i18 = this.f441456e;
        int i19 = this.f441455d;
        if (i18 == i19) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter2 = this.f441460i;
            if (notifyPresenter2 != null && (list = notifyPresenter2.f123008h) != null) {
            }
            notifyViewCallback.x();
            this.f441458g = true;
        } else if (!this.f441458g) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "refresh index: " + this.f441455d);
            notifyViewCallback.y();
            this.f441458g = true;
        }
        if (this.f441457f > 0) {
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().N(strArr[this.f441455d]);
        }
        this.f441459h = notifyViewCallback;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        super.onPause();
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f441459h;
        if (notifyViewCallback == null || (wxRecyclerAdapter = notifyViewCallback.f123085m) == null) {
            return;
        }
        wxRecyclerAdapter.z0();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = this.f441459h;
        if (notifyViewCallback == null || (wxRecyclerAdapter = notifyViewCallback.f123085m) == null) {
            return;
        }
        wxRecyclerAdapter.A0();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        java.util.List list;
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onUserVisibleFocused:" + this.f441458g + "  " + this.f441455d);
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f441460i;
        if (notifyPresenter == null || (list = notifyPresenter.f123008h) == null) {
            return;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onUserVisibleUnFocused:" + this.f441458g + "  " + this.f441455d);
    }
}
