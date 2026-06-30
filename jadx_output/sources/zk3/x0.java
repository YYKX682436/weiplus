package zk3;

/* loaded from: classes8.dex */
public final class x0 extends pk3.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 2;
    }

    @Override // pk3.h
    public void O6(java.lang.Object obj) {
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, r45.fr4 animateData, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(animateData, "animateData");
        r45.k97 k97Var = new r45.k97();
        try {
            k97Var.parseFrom(info.field_data);
            if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(k97Var.getString(1))) {
                java.lang.String string = k97Var.getString(1);
                if (string == null) {
                    string = "";
                }
                android.net.Uri parse = android.net.Uri.parse(string);
                android.net.Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                java.util.Set<java.lang.String> queryParameterNames = parse.getQueryParameterNames();
                kotlin.jvm.internal.o.f(queryParameterNames, "getQueryParameterNames(...)");
                for (java.lang.String str : queryParameterNames) {
                    java.util.List<java.lang.String> c17 = kotlin.jvm.internal.o.b(str, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE) ? kz5.b0.c("334") : parse.getQueryParameters(str);
                    if (c17 != null) {
                        java.util.Iterator<T> it = c17.iterator();
                        while (it.hasNext()) {
                            clearQuery.appendQueryParameter(str, (java.lang.String) it.next());
                        }
                    }
                }
                if (!parse.getQueryParameterNames().contains(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE)) {
                    clearQuery.appendQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "334");
                }
                if (parse.getFragment() != null) {
                    clearQuery.fragment(parse.getFragment());
                }
                k97Var.set(1, clearQuery.build().toString());
                k97Var.set(13, 334);
            }
        } catch (java.lang.Exception unused) {
        }
        android.content.Intent intent = new android.content.Intent();
        al3.d.b(intent, k97Var);
        int integer = k97Var.getInteger(19);
        r45.w60 w60Var = new r45.w60();
        w60Var.set(3, bm5.f1.a());
        w60Var.set(0, animateData);
        if (view != null) {
            nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((md0.e) eVar).getClass();
            if ((context instanceof com.tencent.mm.ui.component.UIComponentActivity ? (t04.a) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(t04.a.class) : null) != null) {
                nd0.e eVar2 = (nd0.e) i95.n0.c(nd0.e.class);
                android.content.Context context2 = view.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar2).wi(context2, 5);
                w60Var.set(1, kr4Var != null ? kr4Var.getString(0) : null);
            }
        }
        intent.putExtra("rawUrl", k97Var.getString(1));
        intent.putExtra("convertActivityFromTranslucent", false);
        intent.putExtra("key_multi_task_common_info", w60Var.toByteArray());
        intent.putExtra("float_ball_key", info.field_id);
        intent.putExtra("key_enable_teen_mode_check", true);
        intent.putExtra("key_enable_fts_quick", true);
        intent.putExtra("nextAnimIn", com.tencent.mm.R.anim.f477783bc);
        intent.putExtra("currentAnimOut", 0);
        intent.putExtra("minimize_secene", 0);
        intent.putExtra("webpageTitle", k97Var.getString(4));
        if (integer > -1) {
            boolean z17 = integer == 5;
            int integer2 = k97Var.getInteger(13);
            int integer3 = k97Var.getInteger(14);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(integer2)) {
                if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(getActivity(), k97Var.getString(1), integer, z17, integer2, integer3, intent)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebMultiTaskUIC", "openWebPage, use fast Load");
                    return;
                }
            }
        }
        j45.l.j(getActivity(), "webview", ".ui.tools.WebViewUI", intent, null);
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0 h0Var = com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a;
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184204d.remove(info.field_id);
    }

    @Override // pk3.h
    public void Q6(com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        info.field_showData.getString(1);
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a.f(info);
    }

    @Override // pk3.h
    public void S6() {
    }

    @Override // pk3.h
    public void T6() {
    }

    @Override // pk3.h
    public void U6(com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, int i17) {
        kotlin.jvm.internal.o.g(info, "info");
        info.field_showData.getString(1);
        r45.k97 k97Var = new r45.k97();
        try {
            k97Var.parseFrom(info.field_data);
            int integer = k97Var.getInteger(19);
            java.lang.String string = k97Var.getString(1);
            if (integer > -1 && !com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                int integer2 = k97Var.getInteger(13);
                info.field_showData.getString(1);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).d(string, integer, integer2, new java.lang.Object[0]);
            }
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            com.tencent.mm.plugin.webview.ui.tools.floatball.h0.f184201a.e(info);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebMultiTaskUIC", "WebMultiTaskData parse fail", th6);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return super.getLayoutId();
    }

    @Override // pk3.b
    public pk3.a i0() {
        return pk3.a.f356435e;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onKeyUp(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRestoreInstanceState(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onStartActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleFocused() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onUserVisibleUnFocused() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
