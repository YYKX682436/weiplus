package tw;

/* loaded from: classes9.dex */
public final class i extends wm3.a implements pr1.i, pr1.h {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView f422402d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f422403e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f422404f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f422405g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f422406h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f422407i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f422408m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f422409n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f422410o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Runnable f422411p;

    /* renamed from: q, reason: collision with root package name */
    public final e31.i f422412q;

    /* renamed from: r, reason: collision with root package name */
    public final e31.g f422413r;

    /* renamed from: s, reason: collision with root package name */
    public final e31.h f422414s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.Runnable f422415t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f422416u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f422406h = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f422407i = "MicroMsg.BrandEcsNotifySettingUIC_SubscribeStatus_" + hashCode();
        this.f422408m = "MicroMsg.BrandEcsNotifySettingUIC_NotifySwitchInfo_" + hashCode();
        this.f422409n = "MicroMsg.BrandEcsNotifySettingUIC_GlobalNotifySwitchInfo_" + hashCode();
        this.f422410o = new java.util.LinkedHashSet();
        this.f422412q = new tw.d(this);
        this.f422413r = new tw.b(this);
        this.f422414s = new tw.c(this);
        this.f422415t = new tw.e(activity, this);
        this.f422416u = jz5.h.b(tw.g.f422400d);
    }

    public static final void T6(tw.i iVar) {
        java.util.Map map;
        java.lang.String string;
        java.util.Set set = iVar.f422410o;
        if (set.isEmpty()) {
            return;
        }
        java.util.List<java.lang.String> S0 = kz5.n0.S0(set);
        set.clear();
        java.lang.Runnable runnable = iVar.f422411p;
        if (runnable != null) {
            iVar.f422406h.removeCallbacks(runnable);
            iVar.f422411p = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "triggerBatchUpdate: updating " + S0.size() + " items");
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = iVar.f422402d;
        if (brandServiceSortView == null) {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
        android.widget.ListView listView = brandServiceSortView.getListView();
        if (listView == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BrandEcsNotifySettingUIC", "triggerBatchUpdate: listView is null");
            return;
        }
        int headerViewsCount = listView.getHeaderViewsCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int childCount = listView.getChildCount();
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView2 = iVar.f422402d;
        if (brandServiceSortView2 == null) {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
        fb5.m adapter = brandServiceSortView2.getAdapter();
        if (adapter == null) {
            map = kz5.q0.f314001d;
        } else {
            java.util.Map linkedHashMap = new java.util.LinkedHashMap();
            int count = adapter.getCount();
            for (int i17 = 0; i17 < count; i17++) {
                java.lang.Object item = adapter.getItem(i17);
                fb5.n nVar = item instanceof fb5.n ? (fb5.n) item : null;
                if (nVar != null) {
                    java.lang.Object obj = nVar.f260898b;
                    r45.co coVar = obj instanceof r45.co ? (r45.co) obj : null;
                    if (coVar != null) {
                        java.lang.String userName = coVar.f371676d;
                        kotlin.jvm.internal.o.f(userName, "userName");
                        if (userName.length() > 0) {
                            java.lang.String userName2 = coVar.f371676d;
                            kotlin.jvm.internal.o.f(userName2, "userName");
                            linkedHashMap.put(userName2, java.lang.Integer.valueOf(i17));
                        }
                    }
                }
            }
            map = linkedHashMap;
        }
        for (java.lang.String str : S0) {
            java.lang.Integer num = (java.lang.Integer) map.get(str);
            int intValue = num != null ? num.intValue() : -1;
            if (intValue < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BrandEcsNotifySettingUIC", "triggerBatchUpdate: item not found");
            } else {
                int i18 = (intValue + headerViewsCount) - firstVisiblePosition;
                if (i18 >= 0 && i18 < childCount) {
                    android.view.View childAt = listView.getChildAt(i18);
                    if (childAt == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.BrandEcsNotifySettingUIC", "triggerBatchUpdate: view is null at visiblePosition=" + i18);
                    } else {
                        android.widget.TextView textView = (android.widget.TextView) childAt.findViewById(com.tencent.mm.R.id.t3k);
                        if (textView == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.BrandEcsNotifySettingUIC", "triggerBatchUpdate: detail_text not found in view");
                        } else {
                            e31.k U6 = iVar.U6();
                            if (U6 != null ? ((g31.l) U6).n(str) : false) {
                                e31.k U62 = iVar.U6();
                                int l17 = U62 != null ? ((g31.l) U62).l(str) : 0;
                                string = l17 > 0 ? iVar.getContext().getString(com.tencent.mm.R.string.o6c, java.lang.Integer.valueOf(l17)) : iVar.getContext().getString(com.tencent.mm.R.string.o5p);
                            } else {
                                string = iVar.getContext().getString(com.tencent.mm.R.string.f492119o34);
                            }
                            kotlin.jvm.internal.o.d(string);
                            textView.setText(string);
                        }
                    }
                }
            }
        }
    }

    @Override // pr1.i
    public void S4(int i17, java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        boolean z17 = true;
        if (username.length() == 0) {
            username = null;
        }
        if (username != null) {
            e31.k U6 = U6();
            if (U6 != null) {
                U6.hashCode();
            }
            e31.k U62 = U6();
            if (U62 != null) {
                g31.y yVar = ((g31.l) U62).f268091d;
                yVar.getClass();
                if (username.length() == 0) {
                    return;
                }
                java.util.Map map = yVar.f268130b;
                g31.r rVar = (g31.r) ((java.util.LinkedHashMap) map).get(username);
                if (rVar == null) {
                    map.put(username, new g31.r(username, 0L, null, 0, 14, null));
                } else {
                    g31.s sVar = rVar.f268110c;
                    g31.s sVar2 = g31.s.f268115g;
                    if (sVar == sVar2 && java.lang.System.currentTimeMillis() - rVar.f268109b < 3600000) {
                        return;
                    }
                    g31.s sVar3 = rVar.f268110c;
                    if (sVar3 == sVar2) {
                        if (!(sVar3 == sVar2 && java.lang.System.currentTimeMillis() - rVar.f268109b < 3600000)) {
                            rVar.f268110c = g31.s.f268112d;
                        }
                    }
                    if (rVar.f268110c == g31.s.f268114f) {
                        if (rVar.f268111d < 3) {
                            rVar.f268110c = g31.s.f268112d;
                        }
                    }
                    z17 = false;
                }
                if (z17) {
                    if (!com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SubscribeSwitchInfoBatchFetcher", "fetchNotifyInfoIfNeeded: network is not reachable, skip update");
                        return;
                    }
                    android.os.Handler handler = yVar.f268133e;
                    java.lang.Runnable runnable = yVar.f268134f;
                    handler.removeCallbacks(runnable);
                    handler.postDelayed(runnable, 250L);
                }
            }
        }
    }

    public final e31.k U6() {
        return (e31.k) ((jz5.n) this.f422416u).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tw.i.V6():void");
    }

    @Override // pr1.i
    public void X5(int i17, java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
    }

    @Override // pr1.i
    public void b6(int i17, java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        if (username.length() == 0) {
            return;
        }
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(username);
        e31.k U6 = U6();
        if (U6 != null) {
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.d(e17);
            U6.e(context, 5, username, e17);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488242e03;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ndr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = (com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView) findViewById;
        this.f422402d = brandServiceSortView;
        brandServiceSortView.setServiceType(1);
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView2 = this.f422402d;
        if (brandServiceSortView2 == null) {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
        brandServiceSortView2.setShowFooterView(true);
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView3 = this.f422402d;
        if (brandServiceSortView3 == null) {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
        brandServiceSortView3.setReturnResult(false);
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView4 = this.f422402d;
        if (brandServiceSortView4 == null) {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
        brandServiceSortView4.setShowItemDetailView(true);
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView5 = this.f422402d;
        if (brandServiceSortView5 == null) {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
        brandServiceSortView5.setIsItemLongClickDisabled(true);
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView6 = this.f422402d;
        if (brandServiceSortView6 == null) {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
        brandServiceSortView6.setIsCustomItemClickEnabled(true);
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView7 = this.f422402d;
        if (brandServiceSortView7 == null) {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
        brandServiceSortView7.setDelegate(this);
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView8 = this.f422402d;
        if (brandServiceSortView8 == null) {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
        brandServiceSortView8.setDataSource(this);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(getActivity());
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView9 = this.f422402d;
        if (brandServiceSortView9 == null) {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
        android.view.View inflate = from.inflate(com.tencent.mm.R.layout.f488241e02, (android.view.ViewGroup) brandServiceSortView9, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        this.f422403e = (android.view.ViewGroup) inflate;
        ((h00.b) ((c00.a3) i95.n0.c(c00.a3.class))).getClass();
        bw5.i6 a17 = h00.a.f277808a.a();
        bw5.h6 h6Var = a17 != null ? a17.f28478i[2] ? a17.f28474e : new bw5.h6() : null;
        if (h6Var != null) {
            java.lang.String str = h6Var.f28092m[3] ? h6Var.f28088f : "";
            if (str != null) {
                if (!(str.length() > 0)) {
                    str = null;
                }
                if (str != null) {
                    android.view.ViewGroup viewGroup = this.f422403e;
                    if (viewGroup == null) {
                        kotlin.jvm.internal.o.o("headerView");
                        throw null;
                    }
                    ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.sg7)).setText(str);
                }
            }
        }
        if (h6Var != null) {
            java.lang.String str2 = h6Var.f28092m[4] ? h6Var.f28089g : "";
            if (str2 != null) {
                if (!(str2.length() > 0)) {
                    str2 = null;
                }
                if (str2 != null) {
                    android.view.ViewGroup viewGroup2 = this.f422403e;
                    if (viewGroup2 == null) {
                        kotlin.jvm.internal.o.o("headerView");
                        throw null;
                    }
                    ((android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.sg6)).setText(str2);
                }
            }
        }
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView10 = this.f422402d;
        if (brandServiceSortView10 == null) {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
        android.view.ViewGroup viewGroup3 = this.f422403e;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.o.o("headerView");
            throw null;
        }
        android.widget.ListView listView = brandServiceSortView10.f94053x;
        if (listView != null) {
            listView.addHeaderView(viewGroup3);
        }
        e31.k U6 = U6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[NotifySwitchCB] initData: service=");
        sb6.append(U6);
        sb6.append(", serviceClass=");
        sb6.append(U6 != null ? U6.getClass().getName() : null);
        sb6.append(", serviceHashCode=");
        sb6.append(U6 != null ? java.lang.Integer.valueOf(U6.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNotifySettingUIC", sb6.toString());
        if (U6 != null) {
            e31.g callback = this.f422413r;
            g31.l lVar = (g31.l) U6;
            java.lang.String key = this.f422409n;
            kotlin.jvm.internal.o.g(key, "key");
            kotlin.jvm.internal.o.g(callback, "callback");
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "registerGlobalNotifySwitchInfoCallback key: %s", key);
            g31.i iVar = new g31.i(callback);
            g31.c0 c0Var = lVar.f268092e;
            c0Var.getClass();
            java.util.Map map = c0Var.f268072d;
            map.put(key, new java.lang.ref.WeakReference(iVar));
            com.tencent.mars.xlog.Log.i("SubscribeSwitchInfoSyncer", "[registerGlobalCallback] key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "[NotifySwitchCB] initData: registered global callback, key=".concat(key));
            e31.h hVar = this.f422414s;
            java.lang.String str3 = this.f422408m;
            lVar.t(str3, hVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "[NotifySwitchCB] initData: registered notify switch info callback, key=".concat(str3));
            e31.i iVar2 = this.f422412q;
            java.lang.String str4 = this.f422407i;
            lVar.u(str4, iVar2);
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsNotifySettingUIC", "[NotifySwitchCB] initData: registered subscribe status callback, key=".concat(str4));
            com.tencent.mars.xlog.Log.i("SubscribeSwitchInfoSyncer", "[fetchNotifySwitchInfo] start");
            if (c0Var.f268070b != null) {
                com.tencent.mars.xlog.Log.i("SubscribeSwitchInfoSyncer", "[fetchNotifySwitchInfo] cancel previous task");
                l31.i iVar3 = c0Var.f268070b;
                if (iVar3 != null) {
                    iVar3.a();
                }
            }
            l31.i iVar4 = new l31.i(c0Var.f268069a, new g31.a0(c0Var));
            c0Var.f268070b = iVar4;
            iVar4.run();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BrandEcsNotifySettingUIC", "[NotifySwitchCB] initData: subscribeMsgService is null");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle(com.tencent.mm.R.string.o6r);
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setBackBtn(new tw.a(this));
        }
        V6();
        com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView11 = this.f422402d;
        if (brandServiceSortView11 != null) {
            brandServiceSortView11.i();
        } else {
            kotlin.jvm.internal.o.o("sortView");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f422406h;
        n3Var.removeCallbacks(this.f422415t);
        java.lang.Runnable runnable = this.f422411p;
        if (runnable != null) {
            n3Var.removeCallbacks(runnable);
        }
        e31.k U6 = U6();
        if (U6 != null) {
            java.lang.String key = this.f422409n;
            kotlin.jvm.internal.o.g(key, "key");
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSubscribeMsgService", "unregisterGlobalNotifySwitchInfoCallback key: %s", key);
            g31.c0 c0Var = ((g31.l) U6).f268092e;
            c0Var.getClass();
            java.util.Map map = c0Var.f268072d;
            map.remove(key);
            com.tencent.mars.xlog.Log.i("SubscribeSwitchInfoSyncer", "[unregisterGlobalCallback] key=%s, totalSize=%d", key, java.lang.Integer.valueOf(map.size()));
        }
        e31.k U62 = U6();
        if (U62 != null) {
            ((g31.l) U62).v(this.f422408m);
        }
        e31.k U63 = U6();
        if (U63 != null) {
            ((g31.l) U63).w(this.f422407i);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f422405g = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f422405g) {
            this.f422405g = false;
            V6();
            com.tencent.mm.plugin.brandservice.ui.base.BrandServiceSortView brandServiceSortView = this.f422402d;
            if (brandServiceSortView != null) {
                brandServiceSortView.i();
            } else {
                kotlin.jvm.internal.o.o("sortView");
                throw null;
            }
        }
    }
}
