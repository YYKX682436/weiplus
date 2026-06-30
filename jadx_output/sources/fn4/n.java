package fn4;

/* loaded from: classes15.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f264587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f264588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI f264589f;

    public n(com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI, java.util.List list, boolean z17) {
        this.f264589f = topStoryBaseVideoUI;
        this.f264587d = list;
        this.f264588e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = this.f264589f;
        boolean z17 = topStoryBaseVideoUI.U;
        boolean z18 = this.f264588e;
        java.util.List list = this.f264587d;
        if (z17) {
            topStoryBaseVideoUI.f175142v.x(list, z18);
            topStoryBaseVideoUI.f175138r.notifyDataSetChanged();
        } else {
            topStoryBaseVideoUI.f175138r.x(list, z18);
            topStoryBaseVideoUI.f175142v.notifyDataSetChanged();
        }
    }
}
