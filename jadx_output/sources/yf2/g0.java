package yf2;

/* loaded from: classes3.dex */
public final class g0 extends if2.b implements jm2.b, if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f461697m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f461698n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f461699o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f461697m = "FinderStartLivePostGroupVisibilityUIC";
        this.f461698n = true;
    }

    public static void a7(yf2.g0 g0Var, mm2.y6 y6Var, r45.q12 q12Var, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            y6Var = (mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) g0Var.business(mm2.g1.class)).f329078s).getValue();
        }
        if ((i17 & 2) != 0) {
            q12Var = (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) g0Var.business(mm2.g1.class)).f329068f).getValue();
        }
        g0Var.getClass();
        if (!zl2.r4.f473950a.T1(q12Var) || y6Var == null) {
            return;
        }
        y6Var.i(null);
    }

    public final void Z6(r45.q12 q12Var, boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", "visibilityGroup click, firstShow:" + this.f461698n + '!');
        com.tencent.mm.ui.MMActivity N6 = N6();
        if (N6 != null) {
            c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PARAMS_FIRST_ENTER_WHITE_LIST", this.f461698n);
            if (this.f461698n) {
                this.f461698n = false;
            }
            ((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329078s).getValue()).c(intent);
            intent.putExtra("KEY_PARAMS_WHITE_LIST_CHATROOM_ID", ((mm2.c1) business(mm2.c1.class)).H5);
            intent.putExtra("KEY_PARAMS_MAX_ROOM_COUNT", ((mm2.e1) business(mm2.e1.class)).a7() ? ((mm2.o2) business(mm2.o2.class)).f329301g : ((mm2.c1) business(mm2.c1.class)).f328869q4);
            intent.putExtra("KEY_PARAMS_MAX_USER_COUNT", ((mm2.e1) business(mm2.e1.class)).a7() ? ((mm2.o2) business(mm2.o2.class)).f329303i : ((mm2.c1) business(mm2.c1.class)).f328875r4);
            intent.putExtra("KEY_PARAMS_IS_NOTICE_PAY_LIVE", ((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329078s).getValue()).f329591o);
            r45.eq1 eq1Var = ((mm2.n2) getStore().getLiveRoomData().a(mm2.n2.class)).f329279g;
            intent.putExtra("KEY_PARAMS_IS_SUPER_FANS_CLUB", eq1Var != null ? eq1Var.getBoolean(10) : false);
            intent.putExtra("KEY_PARAMS_FREE_OF_CHARGE_FLAG", ((mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329078s).getValue()).f329589m);
            if (z17) {
                intent.putExtra("KEY_PARAMS_IS_TEST_LIVE", true);
                intent.putExtra("KEY_PARAMS_VISIBILITY_MODE", 128);
            } else {
                zl2.r4 r4Var = zl2.r4.f473950a;
                if (r4Var.T1(q12Var) || r4Var.X1(q12Var)) {
                    intent.putExtra("KEY_PARAMS_LIVE_CHARGE_HIDE", true);
                }
            }
            if (zl2.r4.E1(getStore().getLiveRoomData())) {
                intent.putExtra("KEY_PARAMS_IS_CO_LIVE", true);
                intent.putExtra("KEY_PARAMS_LIVE_CHARGE_HIDE", true);
            }
            ((com.tencent.mm.plugin.finder.assist.i0) ubVar).getClass();
            intent.setClass(N6, (java.lang.Class) ((jz5.n) jz2.x0.f302767n).getValue());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(1001);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(N6, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderLiveVisitorWhiteListUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.util.ArrayList] */
    @Override // if2.e
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String string;
        java.util.Collection collection;
        java.util.Collection collection2;
        ?? p07;
        java.util.Collection collection3;
        r45.re2 re2Var;
        r45.re2 re2Var2;
        java.util.LinkedList list;
        r45.re2 re2Var3;
        r45.re2 re2Var4;
        if (i18 == -1 && i17 == 1001) {
            mm2.y6 y6Var = (mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329078s).getValue();
            y6Var.g(intent);
            boolean z17 = y6Var.f329582f == 1;
            boolean d17 = y6Var.d();
            zl2.r4 r4Var = zl2.r4.f473950a;
            int i19 = y6Var.f329581e;
            if (d17) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e57);
                kotlin.jvm.internal.o.d(string);
            } else if (z17) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e6d);
                kotlin.jvm.internal.o.d(string);
            } else if (i19 == 0) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e5z);
                kotlin.jvm.internal.o.d(string);
            } else if (pm0.v.z(i19, 231)) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e6d);
                kotlin.jvm.internal.o.d(string);
            } else if (i19 == 8) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e6c);
                kotlin.jvm.internal.o.d(string);
            } else if (i19 == 16) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.luv);
                kotlin.jvm.internal.o.d(string);
            } else if (pm0.v.z(i19, 8) && pm0.v.z(i19, 16)) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.luu);
                kotlin.jvm.internal.o.d(string);
            } else {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e5z);
                kotlin.jvm.internal.o.d(string);
            }
            db5.t7.f(O6(), string, yf2.a0.f461654a);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult visibilityChooseByteArray size:");
            java.util.List list2 = y6Var.f329580d;
            sb6.append(list2 != null ? java.lang.Integer.valueOf(list2.size()) : null);
            sb6.append(",chooseRoomList:");
            sb6.append(y6Var.f329583g);
            sb6.append(",chooseUserList:");
            sb6.append(y6Var.f329584h);
            sb6.append(",chooseLabelList:");
            sb6.append(y6Var.f329585i);
            sb6.append(",partWhiteList:");
            r45.re2 re2Var5 = y6Var.f329590n;
            sb6.append(re2Var5 != null ? pm0.b0.b(re2Var5) : null);
            sb6.append(",liveChargePost:");
            r45.hn1 hn1Var = y6Var.f329587k;
            sb6.append(hn1Var != null ? pm0.b0.b(hn1Var) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLivePostUIC", sb6.toString());
            a7(this, null, (r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329068f).getValue(), 1, null);
            android.content.Context O6 = O6();
            pf5.z zVar = pf5.z.f353948a;
            if (!(O6 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.live.viewmodel.b8 b8Var = (com.tencent.mm.plugin.finder.live.viewmodel.b8) zVar.a((androidx.appcompat.app.AppCompatActivity) O6).e(com.tencent.mm.plugin.finder.live.viewmodel.b8.class);
            if (b8Var != null) {
                b8Var.c7(false);
            }
            mm2.y6 y6Var2 = (mm2.y6) ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329078s).getValue();
            int i27 = pm0.v.z(y6Var2.f329581e, 64) ? 3 : y6Var2.e() ? 2 : 1;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            boolean d18 = y6Var2.d();
            if (d18) {
                r45.hn1 hn1Var2 = y6Var2.f329587k;
                collection = (hn1Var2 == null || (re2Var4 = (r45.re2) hn1Var2.getCustom(2)) == null) ? null : re2Var4.getList(0);
            } else {
                collection = y6Var2.f329583g;
            }
            if (collection != null) {
                java.util.Collection collection4 = collection.isEmpty() ^ true ? collection : null;
                if (collection4 != null) {
                    sb7.append("1:");
                    sb7.append(kz5.n0.g0(collection4, "|", null, null, 0, null, null, 62, null));
                }
            }
            if (d18) {
                r45.hn1 hn1Var3 = y6Var2.f329587k;
                collection2 = (hn1Var3 == null || (re2Var3 = (r45.re2) hn1Var3.getCustom(2)) == null) ? null : re2Var3.getList(1);
            } else {
                collection2 = y6Var2.f329584h;
            }
            if (collection2 != null) {
                java.util.Collection collection5 = collection2.isEmpty() ^ true ? collection2 : null;
                if (collection5 != null) {
                    if (sb7.length() > 0) {
                        sb7.append("#");
                    }
                    sb7.append("2:");
                    sb7.append(kz5.n0.g0(collection5, "|", null, null, 0, null, null, 62, null));
                }
            }
            if (d18) {
                r45.hn1 hn1Var4 = y6Var2.f329587k;
                if (hn1Var4 != null && (re2Var2 = (r45.re2) hn1Var4.getCustom(2)) != null && (list = re2Var2.getList(3)) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : list) {
                        java.lang.String string2 = ((r45.il1) obj).getString(0);
                        if (!(string2 == null || string2.length() == 0)) {
                            arrayList.add(obj);
                        }
                    }
                    p07 = new java.util.ArrayList();
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        java.lang.String string3 = ((r45.il1) it.next()).getString(0);
                        if (string3 != null) {
                            p07.add(string3);
                        }
                    }
                }
                p07 = 0;
            } else {
                java.util.List list3 = y6Var2.f329580d;
                if (!(!(list3 == null || list3.isEmpty()))) {
                    list3 = null;
                }
                if (list3 != null) {
                    p07 = r4Var.p0(list3);
                }
                p07 = 0;
            }
            if (p07 != 0) {
                java.lang.Iterable iterable = p07.isEmpty() ^ true ? p07 : null;
                if (iterable != null) {
                    if (sb7.length() > 0) {
                        sb7.append("#");
                    }
                    sb7.append("3:");
                    sb7.append(kz5.n0.g0(iterable, "|", null, null, 0, null, yf2.f0.f461688d, 30, null));
                }
            }
            if (d18) {
                r45.hn1 hn1Var5 = y6Var2.f329587k;
                collection3 = (hn1Var5 == null || (re2Var = (r45.re2) hn1Var5.getCustom(2)) == null) ? null : re2Var.getList(4);
            } else {
                collection3 = y6Var2.f329585i;
            }
            if (collection3 != null) {
                java.util.Collection collection6 = collection3.isEmpty() ^ true ? collection3 : null;
                if (collection6 != null) {
                    if (sb7.length() > 0) {
                        sb7.append("#");
                    }
                    sb7.append("4:");
                    sb7.append(kz5.n0.g0(collection6, "|", null, null, 0, null, null, 62, null));
                }
            }
            cl0.g gVar = new cl0.g();
            gVar.o("type", i27);
            gVar.h("result", sb7.toString());
            com.tencent.mars.xlog.Log.i(this.f461697m, "[report] " + gVar);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 65L, gVar.toString(), null, 4, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.c0(this, null), 3, null);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new yf2.e0(this, null), 3, null);
    }
}
