package sp2;

/* loaded from: classes2.dex */
public final class r extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public sp2.o2 f411192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c6i;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBeforeFinish(android.content.Intent r29) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.r.onBeforeFinish(android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        int i17;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        sp2.o2 o2Var = this.f411192d;
        if (o2Var == null) {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onConfigurationChanged orientation: ");
        sb6.append(newConfig.orientation);
        sb6.append(" rv: ");
        com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = o2Var.f411139j;
        if (finderParentRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        sb6.append(finderParentRecyclerView.getWidth());
        sb6.append(" ui: ");
        com.tencent.mm.ui.ah a17 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        int i18 = a17.f197135a;
        if (!z17 && i18 > (i17 = a17.f197136b)) {
            i18 = i17;
        }
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", sb6.toString());
        com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView2 = o2Var.f411139j;
        if (finderParentRecyclerView2 != null) {
            finderParentRecyclerView2.post(new sp2.q1(newConfig, o2Var));
        } else {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x01b5, code lost:
    
        if (r13 > (r3 + sp2.b.f410976e)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b7, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01b9, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x01e7, code lost:
    
        if (r4 > (((sp2.a) r10).f410958e + sp2.b.f410976e)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0b87  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0cb0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0845 A[LOOP:2: B:289:0x0819->B:297:0x0845, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x084e A[EDGE_INSN: B:298:0x084e->B:299:0x084e BREAK  A[LOOP:2: B:289:0x0819->B:297:0x0845], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0cf0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02aa  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r58) {
        /*
            Method dump skipped, instructions count: 3317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.r.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabUIC", "onDestroy() tab:null");
        sp2.o2 o2Var = this.f411192d;
        if (o2Var == null) {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "onDestroy: ");
        o2Var.f411144l0.dead();
        o2Var.f411138i0.dead();
        o2Var.f411136h0.dead();
        o2Var.Z.dead();
        o2Var.f411146m0.dead();
        o2Var.f411148n0.dead();
        java.util.ArrayList arrayList = (java.util.ArrayList) o2Var.f411147n;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Runnable runnable = (java.lang.Runnable) it.next();
            com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = o2Var.f411139j;
            if (finderParentRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            finderParentRecyclerView.removeCallbacks(runnable);
        }
        arrayList.clear();
        kotlinx.coroutines.z0.e(o2Var.f411129e, null, 1, null);
        kotlinx.coroutines.z0.e(o2Var.f411131f, null, 1, null);
        android.content.Intent intent = o2Var.f411121a.getIntent();
        boolean z17 = (intent != null ? (android.content.Intent) intent.getParcelableExtra("KEY_ENTER_LIVE_PARAM_INTENT_DATA") : null) != null;
        java.lang.String cacheBusinessKey = o2Var.V;
        if (!(z17 || kotlin.jvm.internal.o.b(cacheBusinessKey, "closeGuidePreload") || kotlin.jvm.internal.o.b(cacheBusinessKey, "liveEndPage"))) {
            sp2.b bVar = sp2.b.f410972a;
            r45.dk2 dk2Var = o2Var.A;
            r45.bk2 bk2Var = dk2Var != null ? (r45.bk2) dk2Var.getCustom(16) : null;
            if (zl2.q4.f473933a.E()) {
                ae2.b2 b2Var = ae2.b2.f3461a;
                jz5.g gVar = ae2.b2.f3473g;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() != -1 && bk2Var != null) {
                    bk2Var.set(2, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue()));
                }
                jz5.g gVar2 = ae2.b2.f3474h;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue() != -1 && bk2Var != null) {
                    bk2Var.set(3, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue()));
                }
                jz5.g gVar3 = ae2.b2.f3475i;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue() != -1 && bk2Var != null) {
                    bk2Var.set(4, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue()));
                }
                jz5.g gVar4 = ae2.b2.f3476j;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).getValue()).r()).intValue() != -1 && bk2Var != null) {
                    bk2Var.set(5, java.lang.Integer.valueOf(((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).getValue()).r()).intValue()));
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateExitEntranceDataInterval client_max_cache_time: ");
            sb6.append(bk2Var != null ? java.lang.Integer.valueOf(bk2Var.getInteger(2)) : null);
            sb6.append(" client_samll_refresh_max_time: ");
            sb6.append(bk2Var != null ? java.lang.Integer.valueOf(bk2Var.getInteger(3)) : null);
            sb6.append(" reddot_to_square_client_samll_refresh_max_time: ");
            sb6.append(bk2Var != null ? java.lang.Integer.valueOf(bk2Var.getInteger(4)) : null);
            sb6.append(" reddot_to_live_client_samll_refresh_max_time: ");
            sb6.append(bk2Var != null ? java.lang.Integer.valueOf(bk2Var.getInteger(5)) : null);
            sb6.append(' ');
            com.tencent.mars.xlog.Log.i("CacheUtils", sb6.toString());
            if (bk2Var != null) {
                sp2.b.f410976e = bk2Var.getInteger(2) > 0 ? bk2Var.getInteger(2) * 1000 : ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.P1().r()).intValue();
            }
            o2Var.H(o2Var.t());
            if (!kotlin.jvm.internal.o.b(o2Var.t(), "7312+0+messageNotify+0") && r26.n0.D(o2Var.t(), "7312+0+messageNotify+0", false, 2, null)) {
                com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "onDestroy: duplicate update message notify cache, preloadKey=" + o2Var.t());
                o2Var.H("7312+0+messageNotify+0");
            }
        }
        sp2.d3 d3Var = o2Var.D;
        if (d3Var != null) {
            kotlinx.coroutines.f1 f1Var = d3Var.f411013g;
            if (f1Var != null) {
                kotlinx.coroutines.p2.a(f1Var, null, 1, null);
            }
            d3Var.f411013g = null;
            az2.f fVar = d3Var.f411015i;
            if (fVar != null) {
                fVar.b();
            }
            d3Var.f411015i = null;
            if (d3Var.f411014h != null) {
                d3Var.b(null);
            }
            d3Var.f411016j = false;
        }
        gp2.l0 l0Var = o2Var.f411162x;
        if (l0Var != null) {
            l0Var.o();
        }
        o2Var.I = null;
        kotlin.jvm.internal.o.g(cacheBusinessKey, "cacheBusinessKey");
        by1.d a17 = by1.c.f36353b.a().a("7312+0+" + cacheBusinessKey + "+0");
        aq2.k kVar = a17 instanceof aq2.k ? (aq2.k) a17 : null;
        if (kVar != null) {
            kVar.g();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        java.lang.String str;
        super.onPause();
        sp2.o2 o2Var = this.f411192d;
        if (o2Var == null) {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
        gp2.l0 l0Var = o2Var.f411162x;
        if (l0Var != null) {
            l0Var.m();
        }
        gp2.l0 l0Var2 = o2Var.f411162x;
        if (l0Var2 != null) {
            c50.m0.c(l0Var2, null, 1, null);
        }
        sp2.z3.f411301b = null;
        o2Var.I = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).cj();
        com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "recordCurNoticeStatus lastNoticeSnapshot:" + o2Var.I);
        zy2.d8 d8Var = (zy2.d8) i95.n0.c(zy2.d8.class);
        com.tencent.mm.ui.MMActivity mMActivity = o2Var.f411121a;
        int hashCode = mMActivity.hashCode();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = mMActivity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) mMActivity : null;
        if (mMFinderUI == null || (str = java.lang.Integer.valueOf(mMFinderUI.getD()).toString()) == null) {
            str = "";
        }
        ((b92.d2) d8Var).Ai(hashCode, "LiveSquare", str);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        java.lang.String str;
        up2.h hVar;
        sp2.o2 o2Var = this.f411192d;
        if (o2Var == null) {
            kotlin.jvm.internal.o.o("liveFriendsCallback");
            throw null;
        }
        gp2.l0 l0Var = o2Var.f411162x;
        if (l0Var != null) {
            l0Var.g();
        }
        java.lang.String str2 = o2Var.I;
        if (str2 != null) {
            java.lang.String cj6 = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).cj();
            if (!com.tencent.mm.sdk.platformtools.t8.D0(str2, cj6) && (hVar = o2Var.f411151p) != null) {
                hVar.notifyDataSetChanged();
            }
            com.tencent.mars.xlog.Log.i("Finder.LiveEntranceFragmentViewCallback", "checkNoticeStatus lastNoticeSnapshot:" + str2 + " newSnapshot:" + cj6);
        }
        i95.m c17 = i95.n0.c(zy2.d8.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.d8 d8Var = (zy2.d8) c17;
        com.tencent.mm.ui.MMActivity mMActivity = o2Var.f411121a;
        int hashCode = mMActivity.hashCode();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = mMActivity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) mMActivity : null;
        if (mMFinderUI == null || (str = java.lang.Integer.valueOf(mMFinderUI.getD()).toString()) == null) {
            str = "";
        }
        android.view.Window window = mMActivity.getWindow();
        kotlin.jvm.internal.o.f(window, "getWindow(...)");
        ((b92.d2) d8Var).wi(hashCode, "LiveSquare", str, mMActivity, window, 0L, 0L);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        if (this.f411192d != null) {
            return;
        }
        kotlin.jvm.internal.o.o("liveFriendsCallback");
        throw null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        if (this.f411192d != null) {
            return;
        }
        kotlin.jvm.internal.o.o("liveFriendsCallback");
        throw null;
    }
}
