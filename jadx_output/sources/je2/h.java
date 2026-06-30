package je2;

/* loaded from: classes3.dex */
public final class h extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f299233f;

    /* renamed from: g, reason: collision with root package name */
    public int f299234g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f299233f = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
    }

    public final void N6(boolean z17) {
        com.tencent.mars.xlog.Log.i("LiveBubbleSlice", "update tagLiveBubbleShow: " + z17);
        this.f299233f.postValue(java.lang.Boolean.valueOf(z17));
    }
}
