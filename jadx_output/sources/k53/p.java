package k53;

/* loaded from: classes8.dex */
public class p implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI f304380d;

    public p(com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI) {
        this.f304380d = gameVideoPreviewUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI = this.f304380d;
        g4Var.p(2, gameVideoPreviewUI.f140114d.getString(com.tencent.mm.R.string.fph), gameVideoPreviewUI.f140114d.getString(com.tencent.mm.R.string.fpg), com.tencent.mm.R.raw.game_icon_share_wechat);
    }
}
