package dt2;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar f243204a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.w94 f243205b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f243206c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar f243207d;

    public v(com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar finderLiveReplaySeekbar, com.tencent.mm.plugin.finder.replay.widget.FinderLiveReplaySeekbar seekbar, r45.w94 wonderfulFragment) {
        kotlin.jvm.internal.o.g(seekbar, "seekbar");
        kotlin.jvm.internal.o.g(wonderfulFragment, "wonderfulFragment");
        this.f243207d = finderLiveReplaySeekbar;
        this.f243204a = seekbar;
        this.f243205b = wonderfulFragment;
        android.graphics.drawable.Drawable drawable = finderLiveReplaySeekbar.getContext().getDrawable(seekbar.getContext().getResources().getConfiguration().orientation == 2 ? com.tencent.mm.R.drawable.axd : com.tencent.mm.R.drawable.axe);
        kotlin.jvm.internal.o.d(drawable);
        this.f243206c = drawable;
    }
}
