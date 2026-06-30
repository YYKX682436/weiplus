package fn4;

/* loaded from: classes15.dex */
public class y implements in4.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f264622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f264623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI f264624c;

    public y(com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI, android.view.View view, int i17) {
        this.f264624c = topStoryBaseVideoUI;
        this.f264622a = view;
        this.f264623b = i17;
    }

    @Override // in4.p
    public void a(r45.xn6 xn6Var) {
        r45.vn6 vn6Var = xn6Var.T;
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = this.f264624c;
        if (vn6Var != null) {
            topStoryBaseVideoUI.N = true;
            fn4.z0 z0Var = topStoryBaseVideoUI.K;
            int i17 = this.f264623b;
            r45.xn6 d17 = z0Var.d(i17);
            in4.h hVar = new in4.h(topStoryBaseVideoUI.getContext(), d17, new fn4.z(topStoryBaseVideoUI, d17, i17));
            topStoryBaseVideoUI.P = hVar;
            boolean z17 = topStoryBaseVideoUI.U;
            android.view.View view = this.f264622a;
            if (z17) {
                hVar.c(view, true, 0 - i65.a.b(topStoryBaseVideoUI.getContext(), 40), i65.a.b(topStoryBaseVideoUI.getContext(), 16));
                try {
                    ((gn4.c0) topStoryBaseVideoUI.f175126J.f264574c.getControlBar()).z();
                } catch (java.lang.Exception unused) {
                }
            } else {
                hVar.c(view, false, 0, 0 - i65.a.b(topStoryBaseVideoUI.getContext(), 10));
            }
        }
        topStoryBaseVideoUI.M.dismiss();
    }

    @Override // in4.p
    public void b(r45.xn6 xn6Var) {
    }

    @Override // in4.p
    public void c(r45.xn6 xn6Var) {
        fn4.b1 b1Var = fn4.b1.f264481b;
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = this.f264624c;
        topStoryBaseVideoUI.getClass();
        b1Var.a(topStoryBaseVideoUI, topStoryBaseVideoUI.f175135o, xn6Var);
        topStoryBaseVideoUI.M.dismiss();
        jx3.f.INSTANCE.d(17080, 65, 2);
    }

    @Override // in4.p
    public void onDismiss() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "more popupWindow dismiss");
        com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI topStoryBaseVideoUI = this.f264624c;
        if (topStoryBaseVideoUI.L) {
            topStoryBaseVideoUI.L = false;
            if (topStoryBaseVideoUI.N) {
                return;
            }
            topStoryBaseVideoUI.f175126J.k();
            if (topStoryBaseVideoUI.U) {
                try {
                    ((gn4.c0) topStoryBaseVideoUI.f175126J.f264574c.getControlBar()).y();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }
}
