package uo2;

/* loaded from: classes2.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag f429645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f429646e;

    public w(com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag, android.content.Context context) {
        this.f429645d = finderImgFeedMusicTag;
        this.f429646e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag finderImgFeedMusicTag = this.f429645d;
        com.tencent.mm.ui.xj xjVar = new com.tencent.mm.ui.xj(finderImgFeedMusicTag);
        int f17 = i65.a.f(this.f429646e, com.tencent.mm.R.dimen.f479738dv);
        android.graphics.Rect rect = new android.graphics.Rect();
        finderImgFeedMusicTag.getHitRect(rect);
        int i17 = -f17;
        rect.inset(i17, i17);
        xjVar.a(new com.tencent.mm.ui.yj(rect, finderImgFeedMusicTag));
    }
}
