package vo2;

/* loaded from: classes2.dex */
public final class c implements vo2.d {

    /* renamed from: a, reason: collision with root package name */
    public final r45.zi2 f438558a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy f438559b;

    public c(android.content.Context context, r45.zi2 musicInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(musicInfo, "musicInfo");
        this.f438558a = musicInfo;
        a();
    }

    public final void a() {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f438559b;
        if (finderThumbPlayerProxy != null) {
            if (!(finderThumbPlayerProxy.currentPlayState == 1 || finderThumbPlayerProxy.currentPlayState == 11)) {
                return;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init musicId:");
        r45.zi2 zi2Var = this.f438558a;
        sb6.append(zi2Var.getString(0));
        sb6.append(",musicName:");
        sb6.append(zi2Var.getString(2));
        sb6.append(" mediaStreamingUrl:");
        sb6.append(zi2Var.getString(5));
        sb6.append(' ');
        sb6.append(hashCode());
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("FinderMusicTPPlayer", sb6.toString());
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy(context);
        finderThumbPlayerProxy2.setOnlyAudio(true);
        finderThumbPlayerProxy2.setLoop(true);
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).P6(finderThumbPlayerProxy2);
        finderThumbPlayerProxy2.setIMMVideoViewCallback(new vo2.a());
        this.f438559b = finderThumbPlayerProxy2;
        java.lang.String string = zi2Var.getString(5);
        if (string == null) {
            string = "";
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy3 = this.f438559b;
        if (finderThumbPlayerProxy3 != null) {
            mn2.i iVar = new mn2.i(string);
            com.tencent.mm.plugin.finder.storage.FeedData feedData = new com.tencent.mm.plugin.finder.storage.FeedData();
            java.lang.String string2 = zi2Var.getString(2);
            feedData.setDescription(string2 != null ? string2 : "");
            finderThumbPlayerProxy3.n(iVar, false, feedData);
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy4 = this.f438559b;
        if (finderThumbPlayerProxy4 != null) {
            finderThumbPlayerProxy4.F();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("track player: ");
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy5 = this.f438559b;
        sb7.append(finderThumbPlayerProxy5 != null ? java.lang.Integer.valueOf(finderThumbPlayerProxy5.hashCode()) : null);
        sb7.append(", musicId=");
        sb7.append(zi2Var.getString(0));
        com.tencent.mars.xlog.Log.i("FinderMusicTPPlayer", sb7.toString());
    }

    public boolean b() {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f438559b;
        return finderThumbPlayerProxy != null && finderThumbPlayerProxy.isPlaying();
    }

    public void c() {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f438559b;
        if (finderThumbPlayerProxy != null) {
            finderThumbPlayerProxy.setVideoViewFocused(false);
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = this.f438559b;
        if (finderThumbPlayerProxy2 != null) {
            finderThumbPlayerProxy2.pause();
        }
    }

    public void d() {
        a();
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f438559b;
        if (finderThumbPlayerProxy != null) {
            finderThumbPlayerProxy.setVideoViewFocused(true);
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = this.f438559b;
        if (finderThumbPlayerProxy2 != null) {
            zy2.g5.u(finderThumbPlayerProxy2, null, 1, null);
        }
    }

    public void e() {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = this.f438559b;
        if (finderThumbPlayerProxy != null) {
            finderThumbPlayerProxy.d();
        }
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = this.f438559b;
        if (finderThumbPlayerProxy2 != null) {
            finderThumbPlayerProxy2.b();
        }
        ((com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class)).O6(new vo2.b(this));
        this.f438559b = null;
    }
}
