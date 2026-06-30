package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bj0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ej0 f112042d;

    public bj0(com.tencent.mm.plugin.finder.live.plugin.ej0 ej0Var) {
        this.f112042d = ej0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.plugin.ej0 ej0Var = this.f112042d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            ej0Var.t1();
            return;
        }
        ((mm2.c1) ej0Var.P0(mm2.c1.class)).f328798e5 = true;
        android.content.Context context = ej0Var.f365323d.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        kotlin.jvm.internal.o.d(activity);
        com.tencent.mm.ui.ee.f(activity.getTaskId(), null);
        if (com.tencent.mm.ui.bk.w0()) {
            android.content.Context context2 = ej0Var.f365323d.getContext();
            com.tencent.mm.ui.fj.f(context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null, true);
            android.content.Context context3 = ej0Var.f365323d.getContext();
            android.app.Activity activity2 = context3 instanceof android.app.Activity ? (android.app.Activity) context3 : null;
            if (activity2 == null || (intent = activity2.getIntent()) == null) {
                return;
            }
            intent.putExtra("KEY_PARAMS_FROM_SPLIT_SCREEN", true);
        }
    }
}
