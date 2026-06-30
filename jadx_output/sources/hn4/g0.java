package hn4;

/* loaded from: classes15.dex */
public class g0 implements in4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f282569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI f282570b;

    public g0(com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI topStoryListVideoUI, r45.xn6 xn6Var) {
        this.f282570b = topStoryListVideoUI;
        this.f282569a = xn6Var;
    }

    @Override // in4.j
    public void a(sm4.f fVar) {
        com.tencent.mm.plugin.topstory.ui.video.list.TopStoryListVideoUI topStoryListVideoUI = this.f282570b;
        topStoryListVideoUI.H1.e(fVar, new hn4.f0(this), (int) topStoryListVideoUI.f175135o.f387505h, this.f282569a.A);
        if (topStoryListVideoUI.f175126J.d()) {
            topStoryListVideoUI.f175126J.h();
        }
    }
}
