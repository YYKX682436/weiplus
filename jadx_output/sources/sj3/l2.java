package sj3;

/* loaded from: classes12.dex */
public final class l2 implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f408621a;

    public l2(sj3.g3 g3Var) {
        this.f408621a = g3Var;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        sj3.g3 g3Var = this.f408621a;
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = g3Var.f408520a;
        if (!(multiTalkMainUI instanceof android.app.Activity)) {
            multiTalkMainUI = null;
        }
        if (!com.tencent.mm.ui.fj.b(multiTalkMainUI)) {
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI2 = g3Var.f408520a;
            com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI3 = multiTalkMainUI2 instanceof android.app.Activity ? multiTalkMainUI2 : null;
            kotlin.jvm.internal.o.d(multiTalkMainUI3);
            if (!com.tencent.mm.ui.bk.z(multiTalkMainUI3.getTaskId())) {
                g4Var.g(1, g3Var.f408520a.getContext().getString(com.tencent.mm.R.string.k2b), com.tencent.mm.R.raw.icons_outlined_sperated);
                g4Var.g(2, g3Var.f408520a.getContext().getString(com.tencent.mm.R.string.k27), com.tencent.mm.R.raw.icons_outlined_mini_window_new_2);
            }
        }
        g4Var.g(1, g3Var.f408520a.getContext().getString(com.tencent.mm.R.string.f493412k26), com.tencent.mm.R.raw.icons_outlined_merge);
        g4Var.g(2, g3Var.f408520a.getContext().getString(com.tencent.mm.R.string.k27), com.tencent.mm.R.raw.icons_outlined_mini_window_new_2);
    }
}
