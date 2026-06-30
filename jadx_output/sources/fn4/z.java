package fn4;

/* loaded from: classes15.dex */
public class z implements in4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f264628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f264629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI f264630c;

    public z(com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI, r45.xn6 xn6Var, int i17) {
        this.f264630c = topStoryBaseVideoUI;
        this.f264628a = xn6Var;
        this.f264629b = i17;
    }

    @Override // in4.g
    public void a(java.util.Set set) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "popupWindow commit");
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = this.f264630c;
        db5.t7.makeText(topStoryBaseVideoUI.getContext(), com.tencent.mm.R.string.f493392k06, 0).show();
        pm4.y.a(topStoryBaseVideoUI.f175135o, this.f264628a, set, topStoryBaseVideoUI.K.e());
        topStoryBaseVideoUI.f175126J.m();
        fn4.z0 z0Var = topStoryBaseVideoUI.K;
        int i17 = this.f264629b;
        z0Var.o(i17);
        if (topStoryBaseVideoUI.K.e() == 0) {
            topStoryBaseVideoUI.finish();
            return;
        }
        if (!topStoryBaseVideoUI.U) {
            fn4.e eVar = topStoryBaseVideoUI.f175138r;
            eVar.notifyItemRemoved(i17 + eVar.z());
            topStoryBaseVideoUI.f175142v.notifyDataSetChanged();
        } else {
            fn4.e eVar2 = topStoryBaseVideoUI.f175142v;
            eVar2.notifyItemRemoved(i17 + eVar2.z());
            topStoryBaseVideoUI.f175138r.notifyDataSetChanged();
            topStoryBaseVideoUI.f175140t.smoothScrollBy(0, 3);
        }
    }

    @Override // in4.g
    public void onDismiss() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "popupWindow dismiss");
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = this.f264630c;
        if (topStoryBaseVideoUI.N) {
            topStoryBaseVideoUI.f175126J.k();
            topStoryBaseVideoUI.N = false;
            if (topStoryBaseVideoUI.U) {
                try {
                    ((gn4.c0) topStoryBaseVideoUI.f175126J.f264574c.getControlBar()).y();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }
}
