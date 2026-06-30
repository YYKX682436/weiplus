package fn4;

/* loaded from: classes15.dex */
public class d1 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn4.l1 f264488d;

    public d1(fn4.l1 l1Var) {
        this.f264488d = l1Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFocusChange onPause: ");
        this.f264488d.l(true);
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFocusChange onResume: ");
        this.f264488d.l(false);
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "onFocusChange onStop: ");
        this.f264488d.h();
    }
}
