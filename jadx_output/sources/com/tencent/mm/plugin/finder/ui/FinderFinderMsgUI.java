package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderFinderMsgUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderFinderMsgUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: t, reason: collision with root package name */
    public static final java.util.ArrayList f128574t = kz5.c0.d(new int[]{2, 15, 25, 29, 33, 35, 36, 39}, new int[]{3, 5, 28, 40}, new int[]{1, 10, 17, 30});

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.ArrayList f128575u = kz5.c0.d(new int[]{2, 15, 25, 35, 36}, new int[]{3, 5}, new int[]{1, 10, 17});

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f128576v = {3, 4, 5};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f128577w = {12, 13, 14};

    /* renamed from: x, reason: collision with root package name */
    public static int f128578x = -1;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        if (f128578x == -1) {
            getIntent().getIntExtra("key_mention_business_type", -1);
        }
        return f128578x == 1 ? 269 : 7;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void dealContentView(android.view.View view) {
        super.dealContentView(view);
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.fp.class, com.tencent.mm.plugin.finder.viewmodel.component.uo.class});
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.cqn);
        setBackBtn(new com.tencent.mm.plugin.finder.ui.d6(this));
        findViewById(com.tencent.mm.R.id.fsn).setOnClickListener(new com.tencent.mm.plugin.finder.ui.e6(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pf5.z zVar = pf5.z.f353948a;
        ((com.tencent.mm.plugin.finder.viewmodel.component.ut) ((zy2.k9) zVar.a(this).c(zy2.k9.class))).f136177i = true;
        initView();
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.f123149a.getClass();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.f123150b;
        finderMsgUIItemBrowseStruct.f57427d = finderMsgUIItemBrowseStruct.b("SessionId", Ri, true);
        finderMsgUIItemBrowseStruct.f57441r = 2L;
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderFinderMsgUI)).Rj(this, iy1.a.Finder);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        t70Var.j2().l();
        t70Var.U1().l();
        t70Var.S0().l();
        ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127951tb).getValue()).l();
        int intExtra = getIntent().getIntExtra("key_mention_business_type", 0);
        f128578x = intExtra;
        if (intExtra == 0) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.fsn);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderFinderMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderFinderMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (intExtra == 1) {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.fsn);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderFinderMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/ui/FinderFinderMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.finder.viewmodel.component.uo) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.uo.class)).f136152h = true;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter;
        com.tencent.mars.xlog.Log.i("FinderMsgNotifyUI", "onDestroy lastTabIndex :" + ((com.tencent.mm.plugin.finder.viewmodel.component.fp) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).X6());
        super.onDestroy();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.viewmodel.component.fp fpVar = (com.tencent.mm.plugin.finder.viewmodel.component.fp) pf5.z.f353948a.a(this).e(com.tencent.mm.plugin.finder.viewmodel.component.fp.class);
        if (fpVar != null) {
            for (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment : fpVar.Y6()) {
                kotlin.jvm.internal.o.g(fragment, "fragment");
                com.tencent.mm.plugin.finder.viewmodel.component.kq kqVar = (com.tencent.mm.plugin.finder.viewmodel.component.kq) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.kq.class);
                if (kqVar != null && (notifyPresenter = kqVar.f134986h) != null) {
                    arrayList.add(notifyPresenter);
                }
            }
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.f123149a.getClass();
        com.tencent.mars.xlog.Log.i("Finder.NotifyContractNew", "reportBrowser");
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.f123150b;
            if (!hasNext) {
                finderMsgUIItemBrowseStruct.k();
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderMsgUIItemBrowseStruct);
                return;
            }
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter notifyPresenter2 = (com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyPresenter) it.next();
            if (notifyPresenter2.f123158n) {
                long j17 = notifyPresenter2.f123159o;
                com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.NotifyViewCallback notifyViewCallback = notifyPresenter2.f123166v;
                if (notifyViewCallback == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = notifyViewCallback.f123205s;
                android.util.LongSparseArray longSparseArray = wxRecyclerAdapter != null ? wxRecyclerAdapter.C : null;
                if (longSparseArray != null) {
                    int size = longSparseArray.size();
                    for (int i17 = 0; i17 < size; i17++) {
                        longSparseArray.keyAt(i17);
                        in5.x0 x0Var = (in5.x0) longSparseArray.valueAt(i17);
                        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContractNew.f123149a.getClass();
                        in5.c cVar = x0Var.f293158a;
                        if (cVar instanceof so2.i) {
                            if (cVar.getItemId() < j17 || j17 == 0) {
                                int i18 = ((so2.i) cVar).f410411d.field_type;
                                if (i18 == 1) {
                                    finderMsgUIItemBrowseStruct.f57436m++;
                                } else if (i18 == 2) {
                                    finderMsgUIItemBrowseStruct.f57437n++;
                                } else if (i18 == 3) {
                                    finderMsgUIItemBrowseStruct.f57438o++;
                                } else if (i18 == 5) {
                                    finderMsgUIItemBrowseStruct.f57439p++;
                                }
                                finderMsgUIItemBrowseStruct.f57431h++;
                            } else {
                                int i19 = ((so2.i) cVar).f410411d.field_type;
                                if (i19 == 1) {
                                    finderMsgUIItemBrowseStruct.f57432i++;
                                } else if (i19 == 2) {
                                    finderMsgUIItemBrowseStruct.f57433j++;
                                } else if (i19 == 3) {
                                    finderMsgUIItemBrowseStruct.f57434k++;
                                } else if (i19 == 5) {
                                    finderMsgUIItemBrowseStruct.f57435l++;
                                }
                                finderMsgUIItemBrowseStruct.f57430g++;
                            }
                            finderMsgUIItemBrowseStruct.f57429f++;
                        }
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("FinderMsgNotifyUI", "onPause");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("FinderMsgNotifyUI", "onResume");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        pf5.u uVar = pf5.u.f353936a;
        int X6 = ((com.tencent.mm.plugin.finder.viewmodel.component.fp) uVar.c(this).a(com.tencent.mm.plugin.finder.viewmodel.component.fp.class)).X6();
        com.tencent.mars.xlog.Log.i("FinderMsgNotifyUI", "onStop lastTabIndex :" + X6);
        int i17 = f128578x == 1 ? 2 : 1;
        ey2.f2 f2Var = (ey2.f2) uVar.e(c61.l7.class).a(ey2.f2.class);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        f2Var.S6(i17, X6, xy2.c.e(context));
    }
}
