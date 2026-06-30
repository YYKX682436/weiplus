package k53;

/* loaded from: classes4.dex */
public class e0 implements com.tencent.mm.pluginsdk.ui.a1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.preview.GameVideoView f304356d;

    public e0(com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView) {
        this.f304356d = gameVideoView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.a1
    public void r(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoView", "onDownloadFinish path [%s] isPlayNow [%b]", str, java.lang.Boolean.valueOf(z17));
        if (str == null || !str.endsWith(".temp")) {
            return;
        }
        java.lang.String replace = str.replace(".temp", "");
        com.tencent.mm.vfs.w6.c(str, replace);
        com.tencent.mm.plugin.game.media.preview.GameVideoView gameVideoView = this.f304356d;
        gameVideoView.f140138n = true;
        gameVideoView.f140139o = replace;
        ((java.util.HashSet) com.tencent.mm.plugin.game.media.preview.GameVideoView.A).add(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoView", "onDownloadFinish tempPath [%s] newPath [%s]", str, replace);
    }
}
