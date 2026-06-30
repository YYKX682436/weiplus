package gn4;

/* loaded from: classes15.dex */
public class o0 implements in4.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f273644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI f273645b;

    public o0(com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI, r45.xn6 xn6Var) {
        this.f273645b = topStoryFSVideoUI;
        this.f273644a = xn6Var;
    }

    @Override // in4.j
    public void a(sm4.f fVar) {
        com.tencent.mm.plugin.topstory.ui.video.fs.TopStoryFSVideoUI topStoryFSVideoUI = this.f273645b;
        topStoryFSVideoUI.f175165x.e(fVar, new gn4.n0(this), (int) topStoryFSVideoUI.f175153i.f387505h, this.f273644a.A);
        if (topStoryFSVideoUI.I.d()) {
            topStoryFSVideoUI.I.h();
        }
    }
}
