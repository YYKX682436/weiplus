package sf4;

/* loaded from: classes4.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f407489d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.OnlineVideoEvent f407490e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(sf4.j2 j2Var, com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent) {
        super(0);
        this.f407489d = j2Var;
        this.f407490e = onlineVideoEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sf4.j2 j2Var = this.f407489d;
        if4.h hVar = j2Var.f407504f;
        int i17 = hVar != null ? hVar.f291255c : 0;
        r45.xe6 xe6Var = hVar != null ? hVar.f291258f : null;
        if (i17 > 0 && xe6Var != null) {
            com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent = this.f407490e;
            java.lang.String str = onlineVideoEvent.f54588g.f6846c;
            ef4.k0 k0Var = ef4.k0.f252459a;
            if (kotlin.jvm.internal.o.b(str, k0Var.a(i17, xe6Var.f390023f))) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(onlineVideoEvent.f54588g.f6846c);
                sb6.append(" video source changed, filePath:");
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = j2Var.f407499a;
                sb6.append(storyVideoView != null ? storyVideoView.getFilePath() : null);
                com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
                j2Var.f(false, true);
                com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView2 = j2Var.f407499a;
                com.tencent.mm.vfs.w6.h(storyVideoView2 != null ? storyVideoView2.getFilePath() : null);
                if4.h hVar2 = j2Var.f407504f;
                if (hVar2 != null) {
                    nf4.o b17 = k0Var.b(hVar2);
                    b17.field_cacheSize = 0;
                    b17.field_totalSize = 0;
                    ef4.w.f252468t.k().D0(b17);
                }
                j2Var.e();
            }
        }
        return jz5.f0.f302826a;
    }
}
