package com.tencent.mm.ui.tools;

/* loaded from: classes9.dex */
public final class sd {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.tools.sd f210742a = new com.tencent.mm.ui.tools.sd();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f210743b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f210744c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f210745d;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
        hashSet.add("com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        hashSet.add("com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI");
        hashSet.add("com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI");
        hashSet.add("com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
        hashSet.add("com.tencent.mm.compose_chatting.VoiceSeekUI");
        f210743b = hashSet;
        f210745d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_background_voice, 1) == 1;
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a0(0, new com.tencent.mm.ui.tools.rd());
    }

    public final void a(java.lang.String toWhere) {
        kotlin.jvm.internal.o.g(toWhere, "toWhere");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jump to ");
        sb6.append(toWhere);
        sb6.append(", from:");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        sb6.append(" " + com.tencent.mm.sdk.platformtools.z3.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.VoiceStateHolder", sb6.toString());
        if (f210743b.contains(toWhere)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VoiceStateHolder", "need stop set to false");
            b(false);
        }
    }

    public final void b(boolean z17) {
        if (f210745d) {
            f210744c = z17;
        }
    }
}
