package cw2;

/* loaded from: classes2.dex */
public final class m8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar f223871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f223872e;

    public m8(com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar, com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f223871d = finderLongVideoPlayerSeekBar;
        this.f223872e = finderVideoLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        cw2.h8 playInfo;
        ec2.g videoPlayBehavior;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderVideoLayout$initLongVideoSeekBar$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.video.FinderLongVideoPlayerSeekBar finderLongVideoPlayerSeekBar = this.f223871d;
        boolean z17 = finderLongVideoPlayerSeekBar.f191446z;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f223872e;
        finderVideoLayout.b0(!z17);
        finderLongVideoPlayerSeekBar.setIsPlay(!z17);
        if (z17 && (playInfo = finderVideoLayout.getPlayInfo()) != null && (videoPlayBehavior = finderVideoLayout.getVideoPlayBehavior()) != null) {
            com.tencent.mm.plugin.finder.storage.FeedData feedData = playInfo.f223745a;
            long expectId = feedData.getExpectId();
            java.lang.String dupFlag = feedData.getDupFlag();
            mn2.g4 g4Var = playInfo.f223747c;
            ((ec2.h) videoPlayBehavior).e(expectId, dupFlag, g4Var.f330002e, g4Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$initLongVideoSeekBar$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
