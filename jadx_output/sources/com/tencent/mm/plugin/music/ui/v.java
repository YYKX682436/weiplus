package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class v extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.MusicMainUI f150808a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI, android.os.Looper looper) {
        super(looper);
        this.f150808a = musicMainUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == 1) {
            int i17 = com.tencent.mm.plugin.music.ui.MusicMainUI.I;
            this.f150808a.Y6();
        }
    }
}
