package sf4;

/* loaded from: classes4.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f407428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f407430f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f407431g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf4.d2 f407432h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(sf4.j2 j2Var, java.lang.String str, long j17, long j18, sf4.d2 d2Var) {
        super(0);
        this.f407428d = j2Var;
        this.f407429e = str;
        this.f407430f = j17;
        this.f407431g = j18;
        this.f407432h = d2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        sf4.d2 d2Var;
        long j17;
        java.lang.String str2;
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPauseOnProgress, isVideoPause:false, ");
        sf4.j2 j2Var = this.f407428d;
        j2Var.getClass();
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = j2Var.f407499a;
        sb6.append(storyVideoView != null ? storyVideoView.getSessionId() : null);
        sb6.append(", ");
        sb6.append(j2Var.f407502d);
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView2 = j2Var.f407499a;
        if (storyVideoView2 != null) {
            storyVideoView2.f(this.f407429e, this.f407430f, this.f407431g);
        }
        sf4.d2 d2Var2 = this.f407432h;
        nf4.o oVar = d2Var2.f407450f;
        long j18 = this.f407431g;
        if (oVar != null) {
            oVar.field_totalSize = (int) j18;
        }
        long j19 = this.f407430f;
        if (oVar != null) {
            oVar.field_cacheSize = (int) j19;
        }
        ef4.v vVar = ef4.w.f252468t;
        boolean update = vVar.k().update(d2Var2.f407450f, new java.lang.String[0]);
        if4.h hVar = d2Var2.f407451g;
        java.lang.String str3 = this.f407429e;
        if (hVar != null) {
            nf4.f y07 = vVar.g().y0(hVar.f291256d);
            long j27 = y07.field_syncId;
            long j28 = hVar.f291254b;
            if (j27 == j28 && y07.isValid() && d2Var2.f407450f != null) {
                java.lang.String Id = hVar.f291258f.f390021d;
                kotlin.jvm.internal.o.f(Id, "Id");
                nf4.o oVar2 = d2Var2.f407450f;
                int i17 = oVar2 != null ? oVar2.field_cacheSize : 0;
                if (j28 == y07.field_syncId) {
                    y07.field_preloadStoryId = j28;
                    y07.field_preloadMediaId = Id;
                    y07.field_preLoadResource = i17;
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (z17) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("markPreloadCompleted onProgress, mediaId:");
                    sb7.append(str3);
                    sb7.append(", offset:");
                    sb7.append(j19);
                    sb7.append(", total:");
                    j17 = j18;
                    sb7.append(j17);
                    str2 = " this:";
                    sb7.append(str2);
                    sb7.append(d2Var2);
                    str = "MicroMsg.VideoPlayProxy";
                    com.tencent.mars.xlog.Log.i(str, sb7.toString());
                    nf4.g g17 = vVar.g();
                    d2Var = d2Var2;
                    if (g17.d1((int) y07.systemRowid, y07) >= 0) {
                        g17.doNotify("notify_story_preload", 3, y07);
                    }
                } else {
                    d2Var = d2Var2;
                }
            } else {
                d2Var = d2Var2;
            }
            str = "MicroMsg.VideoPlayProxy";
            str2 = " this:";
            j17 = j18;
        } else {
            str = "MicroMsg.VideoPlayProxy";
            d2Var = d2Var2;
            j17 = j18;
            str2 = " this:";
        }
        com.tencent.mars.xlog.Log.i(str, "onProgress, update ret " + update + " mediaId:" + str3 + ", offset:" + j19 + ", total:" + j17 + str2 + d2Var);
        return jz5.f0.f302826a;
    }
}
