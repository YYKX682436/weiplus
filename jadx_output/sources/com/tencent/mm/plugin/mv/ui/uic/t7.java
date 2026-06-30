package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class t7 implements com.tencent.mm.plugin.music.player.base.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC f151468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f151469b;

    public t7(com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f151468a = musicMvSongInfoUIC;
        this.f151469b = appCompatActivity;
    }

    @Override // com.tencent.mm.plugin.music.player.base.k
    public final void a(int i17, int i18) {
        pm0.v.X(new com.tencent.mm.plugin.mv.ui.uic.s7(i17, i18, this.f151468a, this.f151469b));
    }
}
