package jm3;

/* loaded from: classes8.dex */
public final class t0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvPostUI f300353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f300354e;

    public t0(com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f300353d = musicMvPostUI;
        this.f300354e = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI = this.f300353d;
        if (itemId == 1) {
            android.content.Intent intent = new android.content.Intent(musicMvPostUI, (java.lang.Class<?>) com.tencent.mm.plugin.mv.ui.MusicMvRouterUI.class);
            intent.putExtra("KEY_MUSIC_ROUTER", 2);
            musicMvPostUI.f150887i = true;
            musicMvPostUI.startActivityForResult(intent, 1000);
            return;
        }
        if (itemId != 2) {
            this.f300354e.u();
            return;
        }
        musicMvPostUI.f150887i = true;
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI2 = this.f300353d;
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.c(musicMvPostUI2, 1001, 1, 27, 1, false, null);
    }
}
