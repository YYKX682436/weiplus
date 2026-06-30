package zl3;

/* loaded from: classes11.dex */
public final class m implements com.tencent.mm.plugin.music.player.base.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zl3.n f474069a;

    public m(zl3.n nVar) {
        this.f474069a = nVar;
    }

    @Override // com.tencent.mm.plugin.music.player.base.k
    public final void a(int i17, int i18) {
        zl3.n nVar = this.f474069a;
        com.tencent.pigeon.mm_foundation.MusicCallbackApi musicCallbackApi = nVar.f474070d;
        if (musicCallbackApi != null) {
            musicCallbackApi.onPlayProgressChanged(i17, i18, new zl3.j(nVar));
        }
    }
}
