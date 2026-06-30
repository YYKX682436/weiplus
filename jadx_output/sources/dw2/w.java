package dw2;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag f244169d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag) {
        super(1);
        this.f244169d = finderImgFeedMusicTag;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        android.view.View musicViewInManager = (android.view.View) obj;
        kotlin.jvm.internal.o.g(musicViewInManager, "musicViewInManager");
        com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag = this.f244169d;
        if (finderImgFeedMusicTag != null) {
            com.tencent.mars.xlog.Log.i("FinderImgFeedMusicPlayer", "focusView:" + finderImgFeedMusicTag.getId() + ",other:" + musicViewInManager.getId());
            z17 = kotlin.jvm.internal.o.b(finderImgFeedMusicTag, musicViewInManager);
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
