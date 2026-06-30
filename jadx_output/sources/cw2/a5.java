package cw2;

/* loaded from: classes3.dex */
public final class a5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout f223565d;

    public a5(com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout finderRecordPluginLayout) {
        this.f223565d = finderRecordPluginLayout;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout finderRecordPluginLayout = this.f223565d;
        finderRecordPluginLayout.H = true;
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = finderRecordPluginLayout.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
