package hn4;

/* loaded from: classes15.dex */
public class j0 implements in4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f282581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI f282582b;

    public j0(com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI topStoryListVideoUI, r45.xn6 xn6Var) {
        this.f282582b = topStoryListVideoUI;
        this.f282581a = xn6Var;
    }

    @Override // in4.j
    public void a(sm4.f fVar) {
        com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI topStoryListVideoUI = this.f282582b;
        topStoryListVideoUI.H1.e(fVar, new hn4.i0(this), (int) topStoryListVideoUI.f175135o.f387505h, this.f282581a.A);
        if (topStoryListVideoUI.f175126J.d()) {
            topStoryListVideoUI.f175126J.h();
        }
    }
}
