package gn4;

/* loaded from: classes15.dex */
public class h0 implements in4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f273626a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f273627b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI f273628c;

    public h0(com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI, r45.xn6 xn6Var, int i17) {
        this.f273628c = topStoryFSVideoUI;
        this.f273626a = xn6Var;
        this.f273627b = i17;
    }

    @Override // in4.g
    public void a(java.util.Set set) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "popupWindow commit");
        com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI = this.f273628c;
        db5.t7.makeText(topStoryFSVideoUI.getContext(), com.tencent.mm.R.string.f493392k06, 0).show();
        pm4.y.a(topStoryFSVideoUI.f175153i, this.f273626a, set, topStoryFSVideoUI.f175147J.e());
        topStoryFSVideoUI.I.m();
        fn4.z0 z0Var = topStoryFSVideoUI.f175147J;
        int i17 = this.f273627b;
        z0Var.o(i17);
        if (topStoryFSVideoUI.f175147J.e() == 0) {
            topStoryFSVideoUI.finish();
            return;
        }
        gn4.c1 c1Var = topStoryFSVideoUI.f175156o;
        c1Var.notifyItemRemoved(i17 + c1Var.z());
        topStoryFSVideoUI.f175154m.smoothScrollBy(0, 3);
    }

    @Override // in4.g
    public void onDismiss() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "popupWindow dismiss");
        com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI = this.f273628c;
        if (topStoryFSVideoUI.Q) {
            topStoryFSVideoUI.I.k();
            topStoryFSVideoUI.Q = false;
            try {
                ((gn4.c0) topStoryFSVideoUI.I.f264574c.getControlBar()).y();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
