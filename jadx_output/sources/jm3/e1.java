package jm3;

/* loaded from: classes3.dex */
public final class e1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvRouterUI f300315d;

    public e1(com.tencent.mm.plugin.mv.ui.MusicMvRouterUI musicMvRouterUI) {
        this.f300315d = musicMvRouterUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.mv.ui.MusicMvRouterUI musicMvRouterUI = this.f300315d;
        musicMvRouterUI.finish();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = musicMvRouterUI.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
