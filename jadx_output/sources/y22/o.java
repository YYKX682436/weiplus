package y22;

/* loaded from: classes10.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f459107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView) {
        super(1);
        this.f459107d = emojiVideoPlayTextureView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture surfaceTexture = (android.graphics.SurfaceTexture) obj;
        com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView = this.f459107d;
        com.tencent.mars.xlog.Log.i(emojiVideoPlayTextureView.f98622h, "previewCallback: " + surfaceTexture);
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        emojiVideoPlayTextureView.f98631t = surface;
        ph3.k kVar = emojiVideoPlayTextureView.f98626o;
        if (kVar == null || !emojiVideoPlayTextureView.f98629r) {
            emojiVideoPlayTextureView.E();
        } else {
            kVar.k(surface);
            if (emojiVideoPlayTextureView.f98634w) {
                ph3.k kVar2 = emojiVideoPlayTextureView.f98626o;
                if (kVar2 != null) {
                    kVar2.start();
                }
            } else {
                emojiVideoPlayTextureView.f98635x = true;
                ph3.k kVar3 = emojiVideoPlayTextureView.f98626o;
                if (kVar3 != null) {
                    kVar3.setMute(true);
                }
                ph3.k kVar4 = emojiVideoPlayTextureView.f98626o;
                if (kVar4 != null) {
                    kVar4.start();
                }
            }
            emojiVideoPlayTextureView.f98634w = false;
        }
        return jz5.f0.f302826a;
    }
}
