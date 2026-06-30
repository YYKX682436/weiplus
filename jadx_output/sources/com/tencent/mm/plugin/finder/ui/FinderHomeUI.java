package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderHomeUI;", "Lcom/tencent/mm/plugin/finder/ui/slideprofile/FinderHomeSlideProfileUI;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderHomeUI extends com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI {
    public boolean A;

    /* renamed from: y, reason: collision with root package name */
    public boolean f128583y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f128584z;

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).S6());
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean enableEdge2Edge() {
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity
    public boolean enableLazyInitUIC() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127858o7).getValue()).r()).intValue() == 1;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        if (((com.tencent.mm.plugin.finder.viewmodel.component.gg) a17).P6(false)) {
            return;
        }
        int intExtra = getIntent().getIntExtra("FROM_SCENE_KEY", 0);
        boolean booleanExtra = getContext().getIntent().getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false);
        boolean booleanExtra2 = getContext().getIntent().getBooleanExtra("KEY_FROM_SNS_SYNC_POST", false);
        boolean booleanExtra3 = getContext().getIntent().getBooleanExtra("KEY_POST_FROM_NORMAL_TASK", false);
        boolean booleanExtra4 = getContext().getIntent().getBooleanExtra("KEY_BACK_TO_NORMAL", false);
        if (intExtra == 5) {
            if (!getContext().getIntent().getBooleanExtra("KEY_PUSH_FAIL_RETURN_READY", false)) {
                l7();
                return;
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23669, getIntent().getStringExtra("KEY_TASK_ID"), "fail_return_to", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", 1, 1);
            int intExtra2 = getIntent().getIntExtra("KEY_PUSH_RETURN_TO", -1);
            if (intExtra2 == 4) {
                m7();
            } else {
                if (intExtra2 != 5) {
                    super.finish();
                    return;
                }
                l7();
            }
        } else if (booleanExtra || booleanExtra2 || booleanExtra3) {
            r7(false);
        } else if (getIntent().getBooleanExtra("KEY_FROM_SHARE_REL", false) || booleanExtra4 || intExtra == 4 || this.A) {
            l7();
        } else if (((com.tencent.mm.plugin.finder.viewmodel.component.gg) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).f134505d || this.f128583y || intExtra == 6 || !this.f128584z) {
            int taskId = getTaskId();
            i95.m c17 = i95.n0.c(au2.q.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            if (taskId == ((au2.q) c17).f14090h) {
                l7();
            } else if (!this.f128583y) {
                r7(false);
            }
        } else {
            l7();
        }
        sc2.a8 a8Var = (sc2.a8) pf5.z.f353948a.a(this).e(sc2.a8.class);
        if (a8Var != null) {
            a8Var.n7();
        }
        pm0.v.V(0L, new com.tencent.mm.plugin.finder.ui.x6(this));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ak_;
    }

    @Override // com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI
    public void i7(boolean z17) {
        com.tencent.mm.plugin.finder.viewmodel.component.el elVar = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).f133576p;
        if (z17) {
            elVar.b();
        } else {
            elVar.a();
        }
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set e17 = kz5.p1.e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.bl.class, com.tencent.mm.plugin.finder.viewmodel.component.u6.class, com.tencent.mm.plugin.finder.viewmodel.component.v6.class, com.tencent.mm.plugin.finder.viewmodel.component.di.class, com.tencent.mm.plugin.finder.viewmodel.component.uc.class, com.tencent.mm.plugin.finder.viewmodel.component.ko.class, cs2.k.class, com.tencent.mm.plugin.finder.viewmodel.component.ny.class, com.tencent.mm.plugin.finder.viewmodel.component.ru.class, com.tencent.mm.plugin.finder.viewmodel.component.h80.class, com.tencent.mm.plugin.finder.viewmodel.component.hy.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.sx.class, hy2.f.class, com.tencent.mm.plugin.finder.viewmodel.component.u70.class, d92.b2.class, com.tencent.mm.plugin.finder.viewmodel.component.f2.class, com.tencent.mm.plugin.finder.viewmodel.component.fy.class, com.tencent.mm.plugin.finder.viewmodel.component.gg.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.b8.class)), com.tencent.mm.plugin.finder.viewmodel.component.ya0.class, com.tencent.mm.plugin.finder.viewmodel.component.pt.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class, d92.p1.class, com.tencent.mm.plugin.finder.viewmodel.component.a4.class, com.tencent.mm.plugin.finder.viewmodel.component.qn.class, com.tencent.mm.plugin.finder.viewmodel.component.cl.class, ey2.b0.class, com.tencent.mm.plugin.finder.viewmodel.component.d7.class, com.tencent.mm.plugin.finder.viewmodel.component.ea.class);
        sr2.t tVar = sr2.t.f411718d;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126401J).getValue()).r()).booleanValue()) {
            e17.add(com.tencent.mm.plugin.finder.viewmodel.component.FinderPostRemindUIC.class);
        }
        if (!((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.N0().r()).booleanValue()) {
            e17.add(com.tencent.mm.plugin.finder.viewmodel.component.hs.class);
            e17.add(com.tencent.mm.plugin.finder.viewmodel.component.nq.class);
            e17.add(com.tencent.mm.plugin.finder.viewmodel.component.e90.class);
        }
        return e17;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    public void l7() {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("preferred_tab", 2);
        j45.l.u(this, ".ui.LauncherUI", intent, null);
        overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
    }

    public void m7() {
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.putExtra("preferred_tab", 0);
        j45.l.u(this, ".ui.LauncherUI", intent, null);
        overridePendingTransition(com.tencent.mm.R.anim.f477880e4, com.tencent.mm.R.anim.f477889ed);
    }

    public final void n7(android.content.Intent intent) {
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_FINDER_JUMP_FOLLOW_TAB", false) : false;
        android.content.Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra("KEY_FINDER_JUMP_FOLLOW_TAB", booleanExtra);
        }
        if (booleanExtra) {
            pf5.u uVar = pf5.u.f353936a;
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class);
            finderVideoRecycler.getClass();
            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.n90(finderVideoRecycler));
            androidx.lifecycle.c1 a17 = uVar.c(this).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("Source", 0);
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) a17).f7(3, bundle);
        }
    }

    public final void o7(android.content.Intent intent, boolean z17) {
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_FINDER_JUMP_FRIEND_TAB", false) : false;
        android.content.Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra("KEY_FINDER_JUMP_FRIEND_TAB", booleanExtra);
        }
        if (booleanExtra) {
            pf5.u uVar = pf5.u.f353936a;
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class);
            finderVideoRecycler.getClass();
            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.n90(finderVideoRecycler));
            androidx.lifecycle.c1 a17 = uVar.c(this).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("Source", 0);
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) a17).f7(1, bundle);
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI, com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        java.lang.String str2 = "";
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Zi("", "homeUIClear");
        jx3.f.INSTANCE.idkeyStat(1279L, 41L, 1L, false);
        boolean z17 = true;
        if (getIntent().getBooleanExtra("key_form_sns", false)) {
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_from_sns_post", true);
            i0Var.qk(this, intent);
        }
        n7(getIntent());
        o7(getIntent(), false);
        p7(getIntent());
        q7(getIntent());
        android.content.Intent intent2 = getIntent();
        boolean b17 = kotlin.jvm.internal.o.b(intent2 != null ? intent2.getStringExtra("KEY_FROM_PATH") : null, "appPush");
        if (((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).N6(4).f257452l && !b17) {
            com.tencent.mm.plugin.finder.report.x2 x2Var = com.tencent.mm.plugin.finder.report.x2.f125429a;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            if (nyVar != null && (str = nyVar.f135382p) != null) {
                str2 = str;
            }
            com.tencent.mm.plugin.finder.report.x2.f125431c = str2;
        }
        if (b17) {
            overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6);
        }
        if (!com.tencent.mm.plugin.finder.storage.t70.f127590a.U0()) {
            com.tencent.mars.xlog.Log.i("Finder.HomeUI", "onCreate: multi task is close, clear all finder task");
            i95.m c17 = i95.n0.c(zy2.c9.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.c9.ad((zy2.c9) c17, false, 1, null);
        }
        getIntent().putExtra("is_report_feed_immediate", true);
        if (getIntent().getLongExtra("key_finder_post_local_id", -1L) == -1 || (!getIntent().getBooleanExtra("KEY_FINDER_JUMP_FOLLOW_TAB", false) && !getIntent().getBooleanExtra("KEY_FINDER_JUMP_HOT_TAB", false))) {
            z17 = false;
        }
        this.A = z17;
        U6();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderHomeAffinityUI);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, getClass().getSimpleName());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, be1.r0.CTRL_INDEX, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new com.tencent.mm.plugin.finder.ui.y6(this));
        if (getIntent().getBooleanExtra("key_need_update_task_id", false)) {
            pm0.v.K(null, new com.tencent.mm.plugin.finder.ui.z6(this));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!iq.b.l(null, false)) {
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
            zl2.r4.f473950a.s3(true, true);
            co0.b.f43709e2.a();
        }
        com.tencent.mm.plugin.finder.report.q1.f125258d = null;
        com.tencent.mm.plugin.finder.report.q1.f125256b = 0L;
        com.tencent.mm.plugin.finder.report.q1.f125257c = 0L;
        com.tencent.mm.plugin.finder.report.q1.f125259e = false;
        com.tencent.mm.plugin.finder.report.q1.f125261g = true;
        ig2.m.f291393a.g();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null) {
            nyVar.m7(intent, getIntent(), false);
        }
        n7(intent);
        o7(intent, true);
        p7(intent);
        q7(intent);
        if (intent != null) {
            getIntent().putExtra("isEnableShowUnreadFeed", intent.getBooleanExtra("isEnableShowUnreadFeed", false));
            getIntent().putExtra("KEY_POST_DIRECTLY_FROM_SNS", intent.getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false));
            getIntent().putExtra("key_finder_post_local_id", intent.getLongExtra("key_finder_post_local_id", -1L));
            getIntent().putExtra("KEY_PUSH_RETURN_TO", intent.getIntExtra("KEY_PUSH_RETURN_TO", -1));
            getIntent().putExtra("KEY_TASK_ID", intent.getStringExtra("KEY_TASK_ID"));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
        finderHomeUIC.getRootView().post(new com.tencent.mm.plugin.finder.ui.a7(finderHomeUIC));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        this.f128583y = true;
        super.onSwipeBack();
    }

    public final void p7(android.content.Intent intent) {
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_FINDER_JUMP_HOT_TAB", false) : false;
        boolean booleanExtra2 = intent != null ? intent.getBooleanExtra("KEY_FINDER_JUMP_HOT_TAB_WITH_ANIM", true) : false;
        int intExtra = intent != null ? intent.getIntExtra("Source", 0) : 0;
        android.content.Intent intent2 = getIntent();
        if (intent2 != null) {
            intent2.putExtra("KEY_FINDER_JUMP_HOT_TAB", booleanExtra);
        }
        if (booleanExtra) {
            pf5.u uVar = pf5.u.f353936a;
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler finderVideoRecycler = (com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) uVar.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class);
            finderVideoRecycler.getClass();
            pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.n90(finderVideoRecycler));
            androidx.lifecycle.c1 a17 = uVar.c(this).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("Source", intExtra);
            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) a17).g7(4, booleanExtra2, bundle);
        }
    }

    public final void q7(android.content.Intent intent) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("KEY_ROUTE_TO_PAGE") : null;
        boolean booleanExtra = intent != null ? intent.getBooleanExtra("KEY_ROUTE_TO_TOPIC", false) : false;
        com.tencent.mars.xlog.Log.i("Finder.HomeUI", "checkRoute " + stringExtra + ' ' + booleanExtra);
        if (kotlin.jvm.internal.o.b(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.finder.ui.FinderSelfUI.class).g(), stringExtra)) {
            com.tencent.mars.xlog.Log.i("Finder.HomeUI", "jumpFinderPersonCenter");
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("RED_DOT_EXIST_ON_ENTER", true);
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(com.tencent.mm.plugin.finder.viewmodel.component.ny.L1, this, intent2, 0L, null, 0, 0, false, 0, null, 508, null);
            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).qk(this, intent2);
        }
        if (booleanExtra) {
            xc2.y2.f453343a.f(intent, new com.tencent.mm.plugin.finder.ui.w6(this));
        }
    }

    public void r7(boolean z17) {
    }
}
