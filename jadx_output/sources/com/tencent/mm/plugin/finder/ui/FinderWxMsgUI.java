package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderWxMsgUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderWxMsgUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.ArrayList f128796u = kz5.c0.d(new int[]{7, 2, 8, 18, 25, 35, 36, 39}, new int[]{3, 5, 40});

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f128797v = {7, 8};

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter f128798t = new com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter(2, f128797v, f128796u);

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 117;
    }

    public final boolean c7() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.R6).getValue()).r()).intValue() == 1;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return !c7() ? kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.cb0.class, hy2.f.class, com.tencent.mm.plugin.finder.viewmodel.component.uo.class}) : kz5.z.D0(new java.lang.Class[]{hy2.f.class, vy2.e.class, com.tencent.mm.plugin.finder.viewmodel.component.uo.class});
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (c7()) {
            setBackBtn(new com.tencent.mm.plugin.finder.ui.uk(this));
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.fsn);
        findViewById.setContentDescription(getString(com.tencent.mm.R.string.enf));
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.ui.vk(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM finderMsgOperateVM;
        super.onActivityResult(i17, i18, intent);
        if (!c7() || (finderMsgOperateVM = this.f128798t.f123013p) == null) {
            return;
        }
        finderMsgOperateVM.e(i17, i17, intent);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (c7()) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.ut) ((zy2.k9) pf5.z.f353948a.a(this).c(zy2.k9.class))).f136177i = true;
            initView();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_COMMENT_INT_SYNC, 0);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_LIKE_INT_SYNC, 0);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_OBJECT_LIEK_LIKE_INT_SYNC, 0);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_OBJECT_RECOMMEND_LIKE_INT_SYNC, 0);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_FOLLOW_ACCEPT_INT_SYNC, 0);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_WX_MENTION_FRIEND_RECOMMEND_INT_SYNC, 0);
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N("TLWxBubble");
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f128798t;
            notifyPresenter.f123017t.alive();
            notifyPresenter.f123019v.alive();
            notifyPresenter.f123018u.alive();
            int i17 = notifyPresenter.f123004d;
            if (i17 == 1 || i17 == 2) {
                java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                if (Ri == null) {
                    Ri = "";
                }
                com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = notifyPresenter.f123015r;
                finderMsgUIItemBrowseStruct.f57427d = finderMsgUIItemBrowseStruct.b("SessionId", Ri, true);
                finderMsgUIItemBrowseStruct.f57441r = 2L;
            }
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        t70Var.j2().l();
        t70Var.U1().l();
        t70Var.S0().l();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.fsn);
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E3).getValue()).r()).intValue() == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderWxMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderWxMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderWxMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderWxMsgUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderWxMsgUI)).Rj(this, iy1.a.Finder);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.plugin.finder.viewmodel.component.uo) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.uo.class)).f136152h = true;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        char c17;
        super.onDestroy();
        if (c7()) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f128798t;
            notifyPresenter.f123017t.dead();
            notifyPresenter.f123019v.dead();
            notifyPresenter.f123018u.dead();
            java.util.ArrayList arrayList = notifyPresenter.f123012o;
            boolean z17 = true;
            char c18 = 2;
            int i17 = notifyPresenter.f123004d;
            if (i17 == 1 || i17 == 2) {
                java.util.Iterator it = arrayList.iterator();
                int i18 = 0;
                while (true) {
                    boolean hasNext = it.hasNext();
                    com.tencent.mm.autogen.mmdata.rpt.FinderMsgUIItemBrowseStruct finderMsgUIItemBrowseStruct = notifyPresenter.f123015r;
                    if (!hasNext) {
                        finderMsgUIItemBrowseStruct.k();
                        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(finderMsgUIItemBrowseStruct);
                        break;
                    }
                    java.lang.Object next = it.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback = (com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback) next;
                    java.util.List list = notifyPresenter.f123008h;
                    if (!((i18 < 0 || i18 >= ((java.util.ArrayList) list).size()) ? false : z17)) {
                        list = null;
                    }
                    if (list != null ? ((java.lang.Boolean) list.get(i18)).booleanValue() : false) {
                        java.lang.Long l17 = (java.lang.Long) notifyPresenter.f123009i.get(java.lang.Integer.valueOf(i18));
                        long longValue = l17 == null ? 0L : l17.longValue();
                        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = notifyViewCallback.f123085m;
                        android.util.LongSparseArray longSparseArray = wxRecyclerAdapter != null ? wxRecyclerAdapter.C : null;
                        if (longSparseArray != null) {
                            int size = longSparseArray.size();
                            int i27 = 0;
                            while (i27 < size) {
                                longSparseArray.keyAt(i27);
                                in5.c cVar = ((in5.x0) longSparseArray.valueAt(i27)).f293158a;
                                if (cVar instanceof so2.i) {
                                    if (cVar.getItemId() < longValue || longValue == 0) {
                                        int i28 = ((so2.i) cVar).f410411d.field_type;
                                        if (i28 != 1) {
                                            c17 = 2;
                                            if (i28 == 2) {
                                                finderMsgUIItemBrowseStruct.f57437n++;
                                            } else if (i28 == 3) {
                                                finderMsgUIItemBrowseStruct.f57438o++;
                                            } else if (i28 == 5) {
                                                finderMsgUIItemBrowseStruct.f57439p++;
                                            }
                                        } else {
                                            c17 = 2;
                                            finderMsgUIItemBrowseStruct.f57436m++;
                                        }
                                        finderMsgUIItemBrowseStruct.f57431h++;
                                    } else {
                                        int i29 = ((so2.i) cVar).f410411d.field_type;
                                        if (i29 == 1) {
                                            finderMsgUIItemBrowseStruct.f57432i++;
                                        } else if (i29 == 2) {
                                            finderMsgUIItemBrowseStruct.f57433j++;
                                        } else if (i29 == 3) {
                                            finderMsgUIItemBrowseStruct.f57434k++;
                                        } else if (i29 == 5) {
                                            finderMsgUIItemBrowseStruct.f57435l++;
                                        }
                                        finderMsgUIItemBrowseStruct.f57430g++;
                                        c17 = 2;
                                    }
                                    finderMsgUIItemBrowseStruct.f57429f++;
                                } else {
                                    c17 = 2;
                                }
                                i27++;
                                c18 = c17;
                            }
                        }
                    }
                    c18 = c18;
                    i18 = i19;
                    z17 = true;
                }
            }
            com.tencent.mars.xlog.Log.i(notifyPresenter.f123007g, "onDetach " + notifyPresenter.f123005e);
            arrayList.clear();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback notifyViewCallback;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        super.onResume();
        if (c7()) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f128798t;
            notifyPresenter.getClass();
            notifyPresenter.f123011n = java.lang.System.currentTimeMillis();
            if (!notifyPresenter.f123020w) {
                java.util.Iterator it = notifyPresenter.f123014q.iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.util.ArrayList arrayList = (java.util.ArrayList) next;
                    if (arrayList.size() > 0 && (notifyViewCallback = (com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyViewCallback) kz5.n0.a0(notifyPresenter.f123012o, i17)) != null && (wxRecyclerAdapter = notifyViewCallback.f123085m) != null) {
                        wxRecyclerAdapter.notifyItemRangeChanged(0, arrayList.size(), 3);
                    }
                    i17 = i18;
                }
            }
            notifyPresenter.f123020w = false;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (c7()) {
            com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.NotifyPresenter notifyPresenter = this.f128798t;
            notifyPresenter.getClass();
            notifyPresenter.f123015r.f57440q = java.lang.System.currentTimeMillis() - notifyPresenter.f123011n;
            pf5.u uVar = pf5.u.f353936a;
            int X6 = ((vy2.e) uVar.c(this).a(vy2.e.class)).X6();
            ey2.w2 w2Var = (ey2.w2) uVar.e(c61.l7.class).a(ey2.w2.class);
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
            w2Var.S6(1, X6, r17);
        }
    }
}
