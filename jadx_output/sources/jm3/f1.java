package jm3;

/* loaded from: classes3.dex */
public final class f1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvRouterUI f300317d;

    public f1(com.tencent.mm.plugin.mv.ui.MusicMvRouterUI musicMvRouterUI) {
        this.f300317d = musicMvRouterUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        this.f300317d.finish();
    }
}
