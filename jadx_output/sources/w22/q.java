package w22;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.v f442570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w22.v vVar) {
        super(0);
        this.f442570d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        w22.v vVar = this.f442570d;
        if (vVar.f442587h && vVar.f442588i) {
            r22.d dVar = vVar.f442581b;
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f98697h = dVar.getF98697h();
            if (f98697h != null) {
                f98697h.setRemoveBackground(vVar.f442590k);
            }
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView f98697h2 = dVar.getF98697h();
            if (f98697h2 != null) {
                f98697h2.setSticker(vVar.f442592m.f423978e);
            }
            com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = (com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer) dVar;
            com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView emojiVideoPlayTextureView = captureEditorContainer.f98697h;
            if (emojiVideoPlayTextureView != null) {
                emojiVideoPlayTextureView.setAlpha(1.0f);
            }
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = captureEditorContainer.f98695f;
            if (emojiCaptureReporter == null) {
                kotlin.jvm.internal.o.o("reporter");
                throw null;
            }
            emojiCaptureReporter.f98586g = java.lang.System.currentTimeMillis();
            y22.m mVar = (y22.m) vVar.f442582c;
            com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI emojiCaptureUI = mVar.f459104b;
            com.tencent.mars.xlog.Log.i(emojiCaptureUI.f98606d, "onEditorPrepared");
            if (emojiCaptureUI.f98611i == 2) {
                com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer2 = emojiCaptureUI.f98608f;
                if (captureEditorContainer2 != null) {
                    captureEditorContainer2.setAlpha(1.0f);
                }
                com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = emojiCaptureUI.f98607e;
                if (captureContainer != null) {
                    captureContainer.setVisibility(8);
                }
                mVar.b();
                emojiCaptureUI.f98611i = 1;
            }
            w22.v.a(vVar, vVar.f442585f, vVar.f442586g, true);
            u22.b bVar = vVar.f442592m;
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = bVar.f423982i;
            if (emojiInfo != null) {
                vVar.b(emojiInfo, bVar.f423983j);
            }
            vVar.f442588i = false;
            vVar.f442587h = false;
        }
        return jz5.f0.f302826a;
    }
}
