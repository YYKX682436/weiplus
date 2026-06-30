package gn4;

/* loaded from: classes15.dex */
public class g0 implements in4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f273622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f273623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI f273624c;

    public g0(com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI, android.view.View view, int i17) {
        this.f273624c = topStoryFSVideoUI;
        this.f273622a = view;
        this.f273623b = i17;
    }

    @Override // in4.p
    public void a(r45.xn6 xn6Var) {
        r45.vn6 vn6Var = xn6Var.T;
        com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI = this.f273624c;
        if (vn6Var != null) {
            topStoryFSVideoUI.Q = true;
            fn4.z0 z0Var = topStoryFSVideoUI.f175147J;
            int i17 = this.f273623b;
            r45.xn6 d17 = z0Var.d(i17);
            new in4.h(topStoryFSVideoUI.getContext(), d17, new gn4.h0(topStoryFSVideoUI, d17, i17)).c(this.f273622a, true, 0, i65.a.b(topStoryFSVideoUI.getContext(), 16));
            try {
                ((gn4.c0) topStoryFSVideoUI.I.f264574c.getControlBar()).z();
            } catch (java.lang.Exception unused) {
            }
        }
        topStoryFSVideoUI.P.dismiss();
    }

    @Override // in4.p
    public void b(r45.xn6 xn6Var) {
    }

    @Override // in4.p
    public void c(r45.xn6 xn6Var) {
        fn4.b1 b1Var = fn4.b1.f264481b;
        com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI = this.f273624c;
        topStoryFSVideoUI.getClass();
        b1Var.a(topStoryFSVideoUI, topStoryFSVideoUI.f175153i, xn6Var);
        topStoryFSVideoUI.P.dismiss();
    }

    @Override // in4.p
    public void onDismiss() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryFSVideoUI", "more popupWindow dismiss");
        com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI = this.f273624c;
        if (topStoryFSVideoUI.N) {
            topStoryFSVideoUI.N = false;
            if (topStoryFSVideoUI.Q) {
                return;
            }
            topStoryFSVideoUI.I.k();
            try {
                ((gn4.c0) topStoryFSVideoUI.I.f264574c.getControlBar()).y();
            } catch (java.lang.Exception unused) {
            }
        }
    }
}
