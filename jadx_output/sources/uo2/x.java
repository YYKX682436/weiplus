package uo2;

/* loaded from: classes2.dex */
public final class x implements fz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag f429647d;

    public x(com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag) {
        this.f429647d = finderImgFeedMusicTag;
    }

    @Override // fz2.b
    public void M7(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onHeadsetStateChange on:");
        sb6.append(z17);
        sb6.append(" isPlaying:");
        com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag = this.f429647d;
        vo2.d dVar = finderImgFeedMusicTag.player;
        sb6.append(dVar != null ? ((vo2.c) dVar).b() : false);
        com.tencent.mars.xlog.Log.i("FinderImgFeedMusicTag", sb6.toString());
        if (z17) {
            return;
        }
        vo2.d dVar2 = finderImgFeedMusicTag.player;
        if (dVar2 != null ? ((vo2.c) dVar2).b() : false) {
            finderImgFeedMusicTag.getOnHeadsetStateChangePauseMusicTag().invoke();
        }
    }
}
