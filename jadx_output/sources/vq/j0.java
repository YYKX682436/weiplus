package vq;

/* loaded from: classes10.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439171d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = u85.i.f425710d + "preview/";
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f439171d;
        if (j17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.io.File externalCacheDir = emojiDebugUI.getExternalCacheDir();
            sb6.append(externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null);
            sb6.append("/preview.zip");
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.vfs.w6.T(str, sb7);
            dp.a.makeText((android.content.Context) emojiDebugUI, (java.lang.CharSequence) sb7, 1).show();
            com.tencent.mm.sdk.platformtools.b0.e(sb7);
        } else {
            dp.a.makeText((android.content.Context) emojiDebugUI, (java.lang.CharSequence) "no file", 1).show();
        }
        return jz5.f0.f302826a;
    }
}
