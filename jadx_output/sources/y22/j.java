package y22;

/* loaded from: classes.dex */
public final class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI f459095d;

    public j(com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI emojiCaptureUI) {
        this.f459095d = emojiCaptureUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialog, int i17) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        dialog.dismiss();
        this.f459095d.finish();
    }
}
