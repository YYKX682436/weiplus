package y22;

/* loaded from: classes10.dex */
public final class m implements y22.h {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f459103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI f459104b;

    public m(com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI emojiCaptureUI) {
        this.f459104b = emojiCaptureUI;
    }

    public void b() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f459103a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mars.xlog.Log.i(this.f459104b.f98606d, "dismissLoading: " + this.f459103a);
    }

    public void c(boolean z17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI emojiCaptureUI = this.f459104b;
        if (z17) {
            intent.putExtra("key_enter_time", emojiCaptureUI.f98612m);
            intent.putExtra("gif_md5", str);
            emojiCaptureUI.setResult(-1, intent);
        } else {
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter = emojiCaptureUI.f98617r;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter emojiCaptureReporter2 = emojiCaptureUI.f98617r;
            long j17 = emojiCaptureReporter2.f98583d;
            emojiCaptureReporter.f98592p = currentTimeMillis - j17;
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.b(6, j17, emojiCaptureReporter2.f98592p, 0L, 0L, 0L, 0L, 0, 0, emojiCaptureReporter2.G);
            emojiCaptureUI.setResult(0);
        }
        emojiCaptureUI.finish();
    }

    public void d() {
        com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI emojiCaptureUI = this.f459104b;
        com.tencent.mars.xlog.Log.i(emojiCaptureUI.f98606d, "go2Capture");
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer = emojiCaptureUI.f98607e;
        if (captureContainer != null) {
            captureContainer.setVisibility(0);
        }
        com.tencent.mm.plugin.emojicapture.ui.editor.CaptureEditorContainer captureEditorContainer = emojiCaptureUI.f98608f;
        if (captureEditorContainer != null) {
            captureEditorContainer.setVisibility(8);
        }
        com.tencent.mm.plugin.emojicapture.ui.capture.CaptureContainer captureContainer2 = emojiCaptureUI.f98607e;
        if (captureContainer2 != null) {
            captureContainer2.c();
        }
        emojiCaptureUI.f98611i = 0;
    }

    public void e(java.lang.String str) {
        r22.c cVar = this.f459104b.f98610h;
        if (cVar != null) {
            w22.v vVar = (w22.v) cVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorPresenter", "voice text callback");
            vVar.c(str, new w22.p(vVar, str));
        }
    }

    public void f(android.content.Context context, java.lang.CharSequence msg, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(msg, "msg");
        pm0.v.X(new y22.l(this, context, msg, z17, i17, onCancelListener));
        com.tencent.mars.xlog.Log.i(this.f459104b.f98606d, "showLoading: " + this.f459103a);
    }
}
