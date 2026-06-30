package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class aj0 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ej0 f111899a;

    public aj0(com.tencent.mm.plugin.finder.live.plugin.ej0 ej0Var) {
        this.f111899a = ej0Var;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.finder.live.plugin.ej0 ej0Var = this.f111899a;
        android.content.Context context = ej0Var.f365323d.getContext();
        if (!com.tencent.mm.ui.fj.b(context instanceof android.app.Activity ? (android.app.Activity) context : null)) {
            android.content.Context context2 = ej0Var.f365323d.getContext();
            android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
            kotlin.jvm.internal.o.d(activity);
            if (!com.tencent.mm.ui.bk.z(activity.getTaskId())) {
                g4Var.g(1, ej0Var.f365323d.getContext().getString(com.tencent.mm.R.string.k2b), com.tencent.mm.R.raw.icons_outlined_sperated);
                g4Var.g(2, ej0Var.f365323d.getContext().getString(com.tencent.mm.R.string.k27), com.tencent.mm.R.raw.icons_outlined_mini_window_new_2);
            }
        }
        g4Var.g(1, ej0Var.f365323d.getContext().getString(com.tencent.mm.R.string.f493412k26), com.tencent.mm.R.raw.icons_outlined_merge);
        g4Var.g(2, ej0Var.f365323d.getContext().getString(com.tencent.mm.R.string.k27), com.tencent.mm.R.raw.icons_outlined_mini_window_new_2);
    }
}
