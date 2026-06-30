package nd5;

/* loaded from: classes8.dex */
public final class b extends pk3.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 4;
    }

    @Override // pk3.h
    public void O6(java.lang.Object obj) {
    }

    @Override // pk3.h
    public void P6(android.view.View view, com.tencent.mm.plugin.multitask.model.MultiTaskInfo info, r45.fr4 animateData, java.lang.Object obj) {
        zk3.c Ai;
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(animateData, "animateData");
        if (info.field_data != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FileMultiTaskUIC", "handleBallInfoClicked, openFile t:%s", info);
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                long j17 = md5.b.B + 30000;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                md5.b.B = currentTimeMillis;
                if (j17 < currentTimeMillis) {
                    gm0.j1.i();
                    md5.b.A = gm0.j1.u().l();
                }
                if (!md5.b.A) {
                    db5.t7.k(activity, null);
                    return;
                }
            }
            r45.qs0 qs0Var = new r45.qs0();
            try {
                qs0Var.parseFrom(info.field_data);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FileMultiTaskUIC", "handleMultiTaskInfoClicked", th6);
            }
            java.lang.String string = qs0Var.getString(1);
            if (!com.tencent.mm.vfs.w6.j(string)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FileMultiTaskUIC", "handleBallInfoClicked() %s not exist", string);
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
                u1Var.u("");
                u1Var.g(activity.getString(com.tencent.mm.R.string.cfe));
                u1Var.a(true);
                u1Var.l(new nd5.a());
                u1Var.q(false);
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.multitask.j0.We((com.tencent.mm.plugin.multitask.j0) c17, info.field_id, info.field_type, false, 4, null);
                return;
            }
            r45.w60 w60Var = new r45.w60();
            w60Var.set(0, animateData);
            if (view != null) {
                nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar).wi(context, 5);
                w60Var.set(1, kr4Var != null ? kr4Var.getString(0) : null);
            }
            w60Var.set(3, bm5.f1.a());
            if (qs0Var.getBoolean(0)) {
                android.content.Intent intent = new android.content.Intent();
                intent.setClassName(activity, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
                ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
                al3.d.a(intent, qs0Var);
                intent.putExtra("key_multi_task_common_info", w60Var.toByteArray());
                android.os.Bundle extras = intent.getExtras();
                if (extras != null) {
                    extras.putInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 9);
                }
                intent.addFlags(268435456);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/chatting/multitask/uic/FileMultiTaskUIC", "onMultiTaskItemClick", "(Landroid/view/View;Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;Lcom/tencent/mm/protocal/protobuf/MultiTaskAnimData;Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activity, "com/tencent/mm/ui/chatting/multitask/uic/FileMultiTaskUIC", "onMultiTaskItemClick", "(Landroid/view/View;Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;Lcom/tencent/mm/protocal/protobuf/MultiTaskAnimData;Ljava/lang/Object;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                java.lang.String string2 = qs0Var.getString(2);
                java.lang.String string3 = qs0Var.getString(3);
                java.lang.String string4 = qs0Var.getString(4);
                boolean z17 = qs0Var.getBoolean(6);
                if (com.tencent.mm.sdk.platformtools.t8.K0(string4)) {
                    jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
                    java.lang.String string5 = info.v0().getString(1);
                    ((ht.a) vVar).getClass();
                    com.tencent.mm.pluginsdk.ui.tools.f.j(0L, "", string, string2, string5, 9, w60Var);
                } else {
                    ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).v7(activity, string, string2, string3, z17, string4);
                }
            }
            if (!(activity instanceof com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI) || (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(activity)) == null) {
                return;
            }
            ((com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC) Ai).h7(false);
        }
    }

    @Override // pk3.h
    public void S6() {
    }

    @Override // pk3.h
    public void T6() {
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
        getRootView().findViewById(super.getLayoutId());
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
    public b(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
