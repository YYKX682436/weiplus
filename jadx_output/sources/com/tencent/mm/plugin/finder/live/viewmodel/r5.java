package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class r5 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f117358m;

    /* renamed from: n, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f117359n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f117360o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.p f117361p;

    /* renamed from: q, reason: collision with root package name */
    public on2.a2 f117362q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.sl f117363r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f117358m = "FinderLivePostCameraOptPanelUIC";
        this.f117360o = new java.util.ArrayList();
    }

    public static final void Z6(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var, r45.q12 q12Var) {
        r5Var.l7(q12Var);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) r5Var.S6(com.tencent.mm.R.id.eqg);
        r5Var.f117359n = recyclerView;
        r5Var.f117361p = new com.tencent.mm.plugin.finder.live.viewmodel.i5(r5Var);
        if (recyclerView != null) {
            recyclerView.setAdapter(new com.tencent.mm.plugin.finder.live.viewmodel.c5(r5Var));
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = r5Var.f117359n;
        if (recyclerView2 != null) {
            final android.content.Context O6 = r5Var.O6();
            recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(O6) { // from class: com.tencent.mm.plugin.finder.live.viewmodel.FinderLivePostCameraOptPanelUIC$initPostLayout$2
                @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
                /* renamed from: canScrollHorizontally */
                public boolean getF98486n() {
                    return false;
                }
            });
        }
        int dimensionPixelSize = r5Var.O6().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
        androidx.recyclerview.widget.RecyclerView recyclerView3 = r5Var.f117359n;
        if (recyclerView3 != null) {
            recyclerView3.N(new com.tencent.mm.plugin.finder.live.viewmodel.e5(r5Var, dimensionPixelSize));
        }
    }

    public final boolean a() {
        return ((mm2.m6) business(mm2.m6.class)).f329248p;
    }

    public final void a7(android.content.Intent intent) {
        android.content.Intent intent2;
        android.content.Intent intent3;
        android.content.Intent intent4;
        com.tencent.mars.xlog.Log.i(this.f117358m, "[checkAutoShow3D]");
        if (intent == null) {
            com.tencent.mm.ui.MMActivity N6 = N6();
            intent = N6 != null ? N6.getIntent() : null;
        }
        int intExtra = intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0;
        if (intExtra == 7) {
            c7();
            com.tencent.mm.ui.MMActivity N62 = N6();
            if (N62 == null || (intent2 = N62.getIntent()) == null) {
                return;
            }
            intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            return;
        }
        if (intExtra == 11) {
            pm0.v.V(1000L, new com.tencent.mm.plugin.finder.live.viewmodel.f5(this));
            com.tencent.mm.ui.MMActivity N63 = N6();
            if (N63 == null || (intent3 = N63.getIntent()) == null) {
                return;
            }
            intent3.putExtra("KEY_PARAMS_DO_ACTION", 0);
            return;
        }
        if (intExtra != 16) {
            return;
        }
        pm0.v.V(1000L, new com.tencent.mm.plugin.finder.live.viewmodel.g5(this, intent));
        com.tencent.mm.ui.MMActivity N64 = N6();
        if (N64 == null || (intent4 = N64.getIntent()) == null) {
            return;
        }
        intent4.putExtra("KEY_PARAMS_DO_ACTION", 0);
    }

    public final boolean b7(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f117360o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.tencent.mm.plugin.finder.live.viewmodel.c6) obj).f116973a == i17) {
                break;
            }
        }
        return obj != null;
    }

    public final void c7() {
        int i17;
        r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329071i).getValue();
        r45.z53 z53Var = n73Var != null ? (r45.z53) n73Var.getCustom(1) : null;
        com.tencent.mm.plugin.finder.assist.b3.f102022a.o(getStore().getLiveRoomData(), 2, 2 - (z53Var != null ? z53Var.getInteger(13) : 0), z53Var != null ? z53Var.getString(0) : null);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = ((mm2.c1) business(mm2.c1.class)).W2;
        if (finderJumpInfo != null) {
            bf3.x0 x0Var = bf3.x0.f19674a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            int i18 = x0Var.a(context).y;
            com.tencent.mm.ui.MMActivity N6 = N6();
            int i19 = i18 - (N6 != null ? com.tencent.mm.ui.bk.m(N6).bottom : 0);
            com.tencent.mm.protocal.protobuf.MiniAppInfo mini_app_info = finderJumpInfo.getMini_app_info();
            int half_page_custom_height = mini_app_info != null ? mini_app_info.getHalf_page_custom_height() : 0;
            boolean k17 = com.tencent.mm.ui.bk.k(O6());
            if (half_page_custom_height > 0) {
                i17 = i65.a.b(O6(), half_page_custom_height) + (k17 ? i19 : 0);
            } else {
                i17 = 544;
            }
            com.tencent.mars.xlog.Log.i(this.f117358m, "half_page_custom_height=" + half_page_custom_height + " navHeight=" + i19 + " isNavigationBarVisibility=" + k17);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context O6 = O6();
            r45.l34 l34Var = new r45.l34();
            r45.m34 m34Var = new r45.m34();
            m34Var.set(3, java.lang.Integer.valueOf(i17));
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            m34Var.set(0, bool);
            m34Var.set(1, bool);
            m34Var.set(2, java.lang.Boolean.TRUE);
            l34Var.set(2, m34Var);
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453238c = l34Var;
            xc2.y2.i(y2Var, O6, p0Var, 0, null, 8, null);
        }
    }

    public final void d7(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(this.f117358m, "clickBeauty");
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = (com.tencent.mm.plugin.finder.live.plugin.a5) R6(com.tencent.mm.plugin.finder.live.plugin.a5.class);
        if (!((mm2.c1) business(mm2.c1.class)).l7()) {
            if (a5Var != null) {
                a5Var.x1(true, bundle);
                return;
            }
            return;
        }
        if (bundle != null) {
            bundle.putBoolean("PARAM_FINDER_LIVE_CAMERA_ACTION_SHOULD_TRY_OPEN", true);
        } else {
            bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_CAMERA_ACTION_SHOULD_TRY_OPEN", true);
        }
        if (a5Var != null) {
            a5Var.x1(true, bundle);
        }
    }

    public final void e7(int i17) {
        com.tencent.mars.xlog.Log.i(this.f117358m, "clickFlipCamera");
        com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = (com.tencent.mm.plugin.finder.live.plugin.a5) R6(com.tencent.mm.plugin.finder.live.plugin.a5.class);
        if (!((mm2.c1) business(mm2.c1.class)).l7()) {
            if (a5Var != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("PARAM_FINDER_LIVE_CAMERA_ACTION_OPEN_SOURCE", i17);
                a5Var.z1(bundle);
                return;
            }
            return;
        }
        if (a5Var != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("PARAM_FINDER_LIVE_CAMERA_ACTION_SHOULD_TRY_OPEN", true);
            bundle2.putInt("PARAM_FINDER_LIVE_CAMERA_ACTION_OPEN_SOURCE", i17);
            a5Var.z1(bundle2);
        }
    }

    public final void f7() {
        sf2.x xVar;
        sf2.x xVar2;
        boolean L = zl2.r4.f473950a.L(getStore().getLiveRoomData());
        boolean a17 = a();
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "clickMusic enableAnchorMusic=" + L + ", enableNewSongList=" + a() + ", hasNewSingSong=" + a17);
        if (a17 && L) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "clickMusic -> branch1: MUSIC_SELECT_SHOW");
            com.tencent.mm.ui.MMActivity N6 = N6();
            if (N6 != null) {
                com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = (com.tencent.mm.plugin.finder.live.viewmodel.b8) pf5.z.f353948a.a(N6).e(com.tencent.mm.plugin.finder.live.viewmodel.b8.class);
                if (b8Var != null) {
                    b8Var.f116946q = com.tencent.mm.plugin.finder.live.viewmodel.d6.f117036f;
                }
                com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var2 = (com.tencent.mm.plugin.finder.live.viewmodel.b8) pf5.z.f353948a.a(N6).e(com.tencent.mm.plugin.finder.live.viewmodel.b8.class);
                if (b8Var2 != null) {
                    b8Var2.S6();
                }
            }
            if2.b.Y6(this, qo0.b.f365399p2, null, 2, null);
        } else if (a17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "clickMusic -> branch2: showSingSongListPanel");
            com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f291099e;
            if (ubVar != null && (xVar2 = (sf2.x) ubVar.getController(sf2.x.class)) != null) {
                xVar2.s7(false);
            }
            com.tencent.mm.plugin.finder.live.view.ub ubVar2 = this.f291099e;
            if (ubVar2 != null && (xVar = (sf2.x) ubVar2.getController(sf2.x.class)) != null) {
                xVar.c7();
            }
        } else if (L) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "clickMusic -> branch3: MUSIC_SHOW");
            if2.b.Y6(this, qo0.b.f365382m2, null, 2, null);
        }
        if (((mm2.e1) business(mm2.e1.class)).d7()) {
            if (!L) {
                if (a()) {
                    ll2.e.d(ll2.e.f319133a, "anchorlive.bottom.newmusic.song", false, false, 6, null);
                } else {
                    ll2.e.f319133a.j("anchorlive.bottom.music.song", false);
                }
                ll2.e.f319133a.j("anchorlive.bottom.music.bgmusic", false);
            }
            if (a()) {
                return;
            }
            ll2.e.b(ll2.e.f319133a, h7(), false, false, 6, null);
        }
    }

    public final jz5.l g7(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        if (zl2.r4.f473950a.L(getStore().getLiveRoomData())) {
            return new jz5.l(context.getString(com.tencent.mm.R.string.due), java.lang.Integer.valueOf(z17 ? com.tencent.mm.R.raw.icon_finder_live_add_bg_music_filled : com.tencent.mm.R.raw.icon_finder_live_add_bg_music));
        }
        return new jz5.l(context.getString(com.tencent.mm.R.string.d5l), java.lang.Integer.valueOf(com.tencent.mm.R.raw.icon_song_filled));
    }

    public final java.lang.String h7() {
        return a() ? "startlive.more.newmusic" : "startlive.bottom.music";
    }

    public final android.view.View i7(r45.d62 type) {
        int i17;
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        int i18 = -1;
        java.util.ArrayList arrayList = this.f117360o;
        if (ordinal == 4) {
            java.util.Iterator it = arrayList.iterator();
            i17 = 0;
            while (it.hasNext()) {
                if (((com.tencent.mm.plugin.finder.live.viewmodel.c6) it.next()).f116973a == 7) {
                    i18 = i17;
                    break;
                }
                i17++;
            }
        } else if (ordinal == 15) {
            java.util.Iterator it6 = arrayList.iterator();
            i17 = 0;
            while (it6.hasNext()) {
                if (((com.tencent.mm.plugin.finder.live.viewmodel.c6) it6.next()).f116973a == 9) {
                    i18 = i17;
                    break;
                }
                i17++;
            }
        } else if (ordinal == 22) {
            java.util.Iterator it7 = arrayList.iterator();
            i17 = 0;
            while (it7.hasNext()) {
                if (((com.tencent.mm.plugin.finder.live.viewmodel.c6) it7.next()).f116973a == 8) {
                    i18 = i17;
                    break;
                }
                i17++;
            }
        } else if (ordinal == 59) {
            java.util.Iterator it8 = arrayList.iterator();
            int i19 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                if (((com.tencent.mm.plugin.finder.live.viewmodel.c6) it8.next()).f116973a == 4) {
                    i18 = i19;
                    break;
                }
                i19++;
            }
        } else if (ordinal == 60) {
            java.util.Iterator it9 = arrayList.iterator();
            i17 = 0;
            while (it9.hasNext()) {
                if (((com.tencent.mm.plugin.finder.live.viewmodel.c6) it9.next()).f116973a == 6) {
                    i18 = i17;
                    break;
                }
                i17++;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : arrayList.size() - 1;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f117359n;
        if (recyclerView != null) {
            return n3.u1.a(recyclerView, intValue);
        }
        return null;
    }

    public final void l7(r45.q12 q12Var) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "loadOptions exptFilterEnable:" + ((mm2.c1) business(mm2.c1.class)).O3 + ", exptBeautyEnable:" + ((mm2.c1) business(mm2.c1.class)).N3);
        java.util.ArrayList arrayList = this.f117360o;
        arrayList.clear();
        java.lang.String str = this.f117358m;
        if (q12Var == null) {
            com.tencent.mars.xlog.Log.i(str, "[loadOptions] mode null, return");
            return;
        }
        arrayList.clear();
        zl2.r4 r4Var = zl2.r4.f473950a;
        if (r4Var.n2(q12Var)) {
            arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(13));
            arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(12));
            arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(11));
            return;
        }
        if (r4Var.G1(q12Var)) {
            boolean P6 = ((mm2.n0) business(mm2.n0.class)).P6(xy2.c.e(O6()));
            com.tencent.mars.xlog.Log.i(str, "[loadOptions] CoLive isInitiator=" + P6);
            if (!P6) {
                arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(5));
                arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(14));
                return;
            } else {
                arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(13));
                arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(12));
                arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(11));
                return;
            }
        }
        boolean z18 = true;
        if (r4Var.p2(q12Var)) {
            if (q12Var.getInteger(1) == 8) {
                arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(4));
                arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(11));
                return;
            }
            if (r4Var.L(getStore().getLiveRoomData()) || a()) {
                arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(6));
                m7();
            }
            arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(11));
            return;
        }
        if (r4Var.T1(q12Var)) {
            if (kotlin.jvm.internal.o.b(((mm2.c1) business(mm2.c1.class)).f328805f6.getValue(), java.lang.Boolean.TRUE)) {
                arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(2));
            }
            if (((mm2.c1) business(mm2.c1.class)).X2) {
                arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(1));
                z17 = true;
            } else {
                z17 = false;
            }
            if (!z17) {
                if (!r4Var.L(getStore().getLiveRoomData()) && !a()) {
                    z18 = false;
                }
                if (z18) {
                    arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(6));
                    m7();
                }
            }
            arrayList.add(new com.tencent.mm.plugin.finder.live.viewmodel.c6(11));
        }
    }

    public final void m7() {
        com.tencent.mm.ui.MMActivity N6;
        java.util.List list = ((mm2.c1) business(mm2.c1.class)).Z6().f233874c;
        if (!(!list.isEmpty()) || (N6 = N6()) == null) {
            return;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        gk2.e liveRoomData = getStore().getLiveRoomData();
        r45.xl1 xl1Var = new r45.xl1();
        xl1Var.set(1, new java.util.LinkedList(list));
        r4Var.L2(N6, liveRoomData, xl1Var, null);
    }

    public final void n7() {
        androidx.recyclerview.widget.f2 adapter;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f117359n;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    @Override // if2.e
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        mf2.b0 b0Var;
        r45.re2 re2Var;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        r45.re2 re2Var2;
        java.util.LinkedList list3;
        java.util.LinkedList list4;
        boolean z17 = false;
        java.lang.String tag = this.f117358m;
        int i19 = -1;
        if (i18 == -1 && i17 == 1004) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("KEY_LUCKY_MONEY_CHAT_ROOM_USERNAME") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new java.util.ArrayList<>();
            }
            com.tencent.mars.xlog.Log.i(tag, "onActivityResult REQUEST_CODE_SELECT_LUCKY_MONEY_ROOM chatroomList:" + stringArrayListExtra);
            ((mm2.c1) business(mm2.c1.class)).f328803f4.f309049a.clear();
            ((mm2.c1) business(mm2.c1.class)).f328803f4.f309049a.addAll(stringArrayListExtra);
            mm2.y6 y6Var = (mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329078s).getValue();
            y6Var.getClass();
            if (y6Var.d() || y6Var.f329581e == 0) {
                y6Var.b();
            } else {
                for (java.lang.String str : stringArrayListExtra) {
                    java.util.ArrayList arrayList = y6Var.f329583g;
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                    if (y6Var.f329590n == null) {
                        y6Var.j(new r45.re2());
                    }
                    r45.re2 re2Var3 = y6Var.f329590n;
                    if (((re2Var3 == null || (list4 = re2Var3.getList(0)) == null || list4.contains(str)) ? false : true) && (re2Var2 = y6Var.f329590n) != null && (list3 = re2Var2.getList(0)) != null) {
                        list3.add(str);
                    }
                    r45.re2 re2Var4 = y6Var.f329590n;
                    if (((re2Var4 == null || (list2 = re2Var4.getList(2)) == null || list2.contains(str)) ? false : true) && (re2Var = y6Var.f329590n) != null && (list = re2Var.getList(2)) != null) {
                        list.add(str);
                    }
                }
            }
            if (N6() != null && (b0Var = (if2.b) controller(yf2.g0.class)) != null && (b0Var instanceof jm2.b)) {
            }
        }
        kotlin.jvm.internal.o.g(tag, "tag");
        if (i18 == -1 && i17 == 1002) {
            if (intent != null && intent.hasExtra("KEY_PARAMS_LOTTERY_SOURCE")) {
                i19 = intent.getIntExtra("KEY_PARAMS_LOTTERY_SOURCE", -1);
                com.tencent.mars.xlog.Log.i(tag, "onActivityResult source:" + i19 + '!');
            } else {
                com.tencent.mars.xlog.Log.i(tag, "onActivityResult but KEY_PARAMS_LOTTERY_SOURCE is null!");
            }
            if (i19 == 1) {
                z17 = true;
            }
        }
        if (z17) {
            if (this.f117362q == null) {
                this.f117362q = new on2.a2(O6(), getStore().getLiveRoomData(), 1);
            }
            df2.gq gqVar = (df2.gq) controller(df2.gq.class);
            if (gqVar != null) {
                gqVar.b7();
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.e
    public void onNewIntent(android.content.Intent intent) {
        a7(intent);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        a7(null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.k5(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.m5(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.o5(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new com.tencent.mm.plugin.finder.live.viewmodel.q5(this, pluginLayout, null), 3, null);
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        ll2.e eVar = ll2.e.f319133a;
        eVar.e("startlive.bottom.videosetting", false);
        eVar.e("startlive.bottom.audiosetting", false);
        eVar.e("startlive.bottom.link", false);
        eVar.e(h7(), false);
        eVar.e("startlive.bottom.lottery", false);
        eVar.e("startlive.bottom.shopping", false);
        this.f117359n = null;
    }
}
