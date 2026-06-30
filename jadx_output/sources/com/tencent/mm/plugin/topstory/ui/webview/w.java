package com.tencent.mm.plugin.topstory.ui.webview;

/* loaded from: classes7.dex */
public class w implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f175249a;

    public w(com.tencent.mm.plugin.topstory.ui.webview.l lVar, java.lang.ref.WeakReference weakReference) {
        this.f175249a = weakReference;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        android.content.Context context = (android.content.Context) this.f175249a.get();
        if (context == null || android.text.TextUtils.isEmpty(str2) || !com.tencent.mm.vfs.w6.j(str2)) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.y1.c(str2)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_File_Name", str2);
            intent.putExtra("Retr_Compress_Type", 0);
            intent.putExtra("Retr_Msg_Type", 0);
            intent.addFlags(268435456);
            j45.l.u(context, ".ui.transmit.MsgRetransmitUI", intent, null);
            return;
        }
        com.tencent.mm.api.IEmojiInfo Ni = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(kk.k.e(str2));
        if (Ni == null || !((com.tencent.mm.storage.emotion.EmojiInfo) Ni).E0()) {
            Ni = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ai(com.tencent.mm.sdk.platformtools.x2.f193071a, str2));
        }
        long k17 = Ni == null ? 0L : com.tencent.mm.vfs.w6.k(((com.tencent.mm.storage.emotion.EmojiInfo) Ni).N0());
        if (Ni != null) {
            str2 = ((com.tencent.mm.storage.emotion.EmojiInfo) Ni).N0();
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        boolean z17 = (com.tencent.mm.sdk.platformtools.x.J(str2, options) != null && options.outHeight > ip.c.c()) || options.outWidth > ip.c.c();
        if (k17 > ip.c.a() || z17) {
            db5.e1.y(context, context.getString(com.tencent.mm.R.string.bvm), "", context.getString(com.tencent.mm.R.string.f492294fz1), null);
            db5.e1.C(context, context.getString(com.tencent.mm.R.string.bvm), "", context.getString(com.tencent.mm.R.string.f492294fz1), "", false, new com.tencent.mm.plugin.topstory.ui.webview.u(this), new com.tencent.mm.plugin.topstory.ui.webview.v(this));
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Retr_File_Name", Ni != null ? ((com.tencent.mm.storage.emotion.EmojiInfo) Ni).getMd5() : "");
        intent2.putExtra("Retr_Msg_Type", 5);
        intent2.putExtra("Retr_MsgImgScene", 1);
        j45.l.u(context, ".ui.transmit.MsgRetransmitUI", intent2, null);
    }
}
