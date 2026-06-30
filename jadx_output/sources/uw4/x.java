package uw4;

/* loaded from: classes8.dex */
public final class x extends pk3.h {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f431758d = new java.util.LinkedList();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // pk3.b
    public boolean M9(int i17) {
        return i17 == 2 || i17 == 26;
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
        } catch (java.lang.Exception unused) {
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", k97Var.getString(1));
        intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, k97Var.getString(4));
        intent.putExtra("KMutilTaskInfo", info);
        intent.putExtra("webview_bg_color_rsID", android.R.color.transparent);
        r45.w60 w60Var = new r45.w60();
        w60Var.set(3, bm5.f1.a());
        w60Var.set(0, animateData);
        if (view != null) {
            nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            r45.kr4 kr4Var = (r45.kr4) ((md0.e) eVar).wi(context, 5);
            w60Var.set(1, kr4Var != null ? kr4Var.getString(0) : null);
        }
        intent.putExtra("key_multi_task_common_info", w60Var.toByteArray());
        intent.putExtra("float_ball_key", info.field_id);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageWebMultiTaskUIC", "onMultiTaskItemClick, id = " + info.field_id);
        j45.l.j(getActivity(), "webview", ".ui.tools.WebViewUI", intent, null);
        db5.f.h(getActivity());
    }

    @Override // pk3.h
    public void Q6(com.tencent.mm.plugin.multitask.model.MultiTaskInfo obj, int i17) {
        kotlin.jvm.internal.o.g(obj, "obj");
        java.util.Iterator it = f431758d.iterator();
        if (it.hasNext()) {
            android.support.v4.media.f.a(it.next());
            throw null;
        }
        fs.g.b(uw4.w.class, new uw4.v(obj));
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
    public x(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
