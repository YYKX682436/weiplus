package y22;

/* loaded from: classes.dex */
public final class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI f459094d;

    public i(com.tencent.mm.plugin.emojicapture.ui.EmojiCaptureUI emojiCaptureUI) {
        this.f459094d = emojiCaptureUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialog, int i17) {
        kotlin.jvm.internal.o.g(dialog, "dialog");
        dialog.dismiss();
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = this.f459094d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
    }
}
