package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public final class d1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f174956d;

    /* renamed from: e, reason: collision with root package name */
    public int f174957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f174956d = "TopStoryLongVideoUIC";
    }

    public final void T6(android.widget.FrameLayout curLayout) {
        kotlin.jvm.internal.o.g(curLayout, "curLayout");
        wn2.f fVar = (wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class));
        fVar.getClass();
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = fVar.f447522f;
        if (i0Var != null) {
            curLayout.setBackgroundColor(curLayout.getContext().getResources().getColor(com.tencent.mm.R.color.BW_93, null));
            android.view.View view = i0Var.f120937f;
            if (view == null) {
                vn2.u0.f438387a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "handleAddLongVideoView curLayout:" + curLayout.hashCode() + " longVideoView is null!");
                return;
            }
            android.view.ViewParent parent = view.getParent();
            if (kotlin.jvm.internal.o.b(parent, curLayout)) {
                vn2.u0.f438387a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "handleAddLongVideoView parent is ok, do nothing");
                return;
            }
            if (parent != null) {
                android.view.View view2 = i0Var.f120937f;
                java.lang.Object parent2 = view2 != null ? view2.getParent() : null;
                android.view.ViewGroup viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
                if (viewGroup != null) {
                    viewGroup.removeView(i0Var.f120937f);
                }
                com.tencent.mars.xlog.Log.i("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "handleAddLongVideoView remove longvideo from oldParent");
            }
            curLayout.addView(i0Var.f120937f, new android.widget.FrameLayout.LayoutParams(-1, -1));
            vn2.u0.f438387a.m("Finder.MegaVideo.TopStoryMegaVideoUICProxy", "handleAddLongVideoView add longvideo view");
        }
    }

    public final void U6(int i17) {
        if (i17 != this.f174957e) {
            com.tencent.mars.xlog.Log.i(this.f174956d, "initPageEnterType from " + this.f174957e + " to " + i17 + '!');
        }
        this.f174957e = i17;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onBeforeFinishAfterTransition() {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).Ni(bundle);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        boolean z17;
        boolean z18;
        zy2.sb sbVar = (zy2.sb) i95.n0.c(zy2.sb.class);
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        wn2.f fVar = (wn2.f) sbVar;
        fVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        boolean z19 = true;
        vn2.u0.f438388b = !vn2.u0.f438387a.k();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.D7;
        vn2.u0.f438389c = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue();
        ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128055z7).getValue()).l();
        ((lb2.j) ((jz5.n) gVar).getValue()).l();
        vn2.u0.f438390d = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.E7).getValue()).r()).intValue() == 1;
        vn2.u0.f438391e = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.J7).getValue()).r()).intValue() == 1;
        fVar.Ui(fVar.Di());
        r45.sd4 sd4Var = ((ey2.g1) pf5.u.f353936a.e(c61.l7.class).a(ey2.g1.class)).f257378g;
        if (((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
            z18 = false;
        }
        if (z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get longVideoInfoInPorcess=");
            r45.td4 td4Var = (r45.td4) sd4Var.getCustom(0);
            sb6.append(td4Var != null ? td4Var.getString(0) : null);
            sb6.append(", longVideoInfoInTabLifecycle=");
            r45.td4 td4Var2 = (r45.td4) fVar.f447521e.getCustom(0);
            sb6.append(td4Var2 != null ? td4Var2.getString(0) : null);
            com.tencent.mars.xlog.Log.i("Finder.MegaVideo.TopStoryMegaVideoService", sb6.toString());
        }
        kotlin.jvm.internal.o.g(sd4Var, "<this>");
        r45.sd4 sd4Var2 = new r45.sd4();
        r45.td4 td4Var3 = new r45.td4();
        r45.td4 td4Var4 = (r45.td4) sd4Var.getCustom(0);
        td4Var3.set(0, td4Var4 != null ? td4Var4.getString(0) : null);
        r45.td4 td4Var5 = (r45.td4) sd4Var.getCustom(0);
        td4Var3.set(1, td4Var5 != null ? td4Var5.getString(1) : null);
        r45.td4 td4Var6 = (r45.td4) sd4Var.getCustom(0);
        td4Var3.set(2, td4Var6 != null ? td4Var6.getString(2) : null);
        sd4Var2.set(0, td4Var3);
        fVar.Ri(sd4Var2);
        int i17 = fVar.f447520d;
        if (i17 != 1 && i17 != 2) {
            z19 = false;
        }
        if (z19) {
            fVar.f447522f = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0(context, i17);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.MegaVideo.TopStoryMegaVideoService", "init but switch disable!");
        }
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).onDestroy();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onInterceptFinish() {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).getClass();
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).getClass();
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).onNewIntent(intent);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPostDestroyed() {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onPreDestroyed() {
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.i0 i0Var = ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).f447522f;
        if (i0Var != null) {
            android.app.Activity context = i0Var.f120935d;
            kotlin.jvm.internal.o.g(context, "context");
            if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
                nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            } else {
                nyVar = null;
            }
            if (nyVar != null) {
                nyVar.onPreDestroyed();
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).onRequestPermissionsResult(i17, permissions, grantResults);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).onResume();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).onStart();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).onStop();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
        super.onUserVisibleFocused();
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        ((wn2.f) ((zy2.sb) i95.n0.c(zy2.sb.class))).getClass();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onWindowFocusChanged(boolean z17) {
        ((zy2.sb) i95.n0.c(zy2.sb.class)).getClass();
    }
}
