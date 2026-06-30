package yo4;

/* loaded from: classes10.dex */
public final class j0 implements cq4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464239a;

    public j0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout) {
        this.f464239a = multiVideoFullScreenPluginLayout;
    }

    @Override // cq4.u
    public void a() {
        com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f464239a;
        com.tencent.mm.plugin.vlog.model.u0 u0Var = multiVideoFullScreenPluginLayout.H;
        com.tencent.mm.plugin.vlog.model.h1 h1Var = new com.tencent.mm.plugin.vlog.model.h1(u0Var.f175744u);
        u0Var.f175743t = h1Var;
        h1Var.u(u0Var.f175736m, u0Var.f175737n);
        multiVideoFullScreenPluginLayout.getMultiPreviewPlugin().I(false);
    }

    @Override // cq4.u
    public void onMove(int i17, int i18) {
        java.util.Collections.swap(this.f464239a.H.f175744u, i17, i18);
    }
}
