package xf2;

/* loaded from: classes8.dex */
public final class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f454281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView f454283f;

    public j(com.tencent.mm.ui.widget.dialog.k0 k0Var, java.lang.String str, com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView) {
        this.f454281d = k0Var;
        this.f454282e = str;
        this.f454283f = shellView;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView = this.f454283f;
        java.lang.String str = this.f454282e;
        if (valueOf != null && valueOf.intValue() == 0) {
            int i18 = com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView.f111617i;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", str);
            intent.putExtra("Retr_Compress_Type", 0);
            intent.putExtra("Retr_Msg_Type", 0);
            android.content.Context context = shellView.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            j45.l.x((com.tencent.mm.ui.MMFragmentActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1014, xf2.m.f454290d);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            int i19 = com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView.f111617i;
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Ksnsupload_type", 0);
            intent2.putExtra("sns_kemdia_path", str);
            android.content.Context context2 = shellView.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j45.l.w((com.tencent.mm.ui.MMActivity) context2, ".plugin.sns.ui.SnsUploadUI", intent2, 1017, xf2.n.f454291d);
        }
        this.f454281d.u();
    }
}
