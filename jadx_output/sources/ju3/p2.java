package ju3;

/* loaded from: classes.dex */
public final class p2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f301991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout f301992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout webviewScreenShotPluginLayout) {
        super(1);
        this.f301991d = u3Var;
        this.f301992e = webviewScreenShotPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel it = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f301991d.dismiss();
        com.tencent.mm.plugin.recordvideo.plugin.parent.WebviewScreenShotPluginLayout webviewScreenShotPluginLayout = this.f301992e;
        db5.t7.i(webviewScreenShotPluginLayout.getContext(), webviewScreenShotPluginLayout.getContext().getResources().getString(com.tencent.mm.R.string.n3g), com.tencent.mm.R.raw.icons_filled_done);
        return jz5.f0.f302826a;
    }
}
