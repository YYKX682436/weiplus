package com.tencent.mm.plugin.finder.music;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/music/FinderQQMusicFollowHeaderView;", "Landroid/widget/FrameLayout;", "Luo2/j0;", "topicFollowHelper", "Ljz5/f0;", "setTopicFollowHelper", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderQQMusicFollowHeaderView extends android.widget.FrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f121441n = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f121442d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f121443e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f121444f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f121445g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f121446h;

    /* renamed from: i, reason: collision with root package name */
    public uo2.j0 f121447i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$musicPlayEventListener$1 f121448m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$musicPlayEventListener$1] */
    public FinderQQMusicFollowHeaderView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f121444f = "";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f121448m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$musicPlayEventListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2;
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("event :");
                am.jk jkVar = event.f54512g;
                sb6.append(jkVar != null ? java.lang.Integer.valueOf(jkVar.f7036b) : null);
                com.tencent.mars.xlog.Log.i("Finder.QQMusicFollowHeaderView", sb6.toString());
                java.lang.Integer valueOf = jkVar != null ? java.lang.Integer.valueOf(jkVar.f7036b) : null;
                com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView = com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView.this;
                if (valueOf != null && valueOf.intValue() == 0) {
                    java.lang.String playId = finderQQMusicFollowHeaderView.f121444f;
                    kotlin.jvm.internal.o.g(playId, "playId");
                    if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).oj(playId) && (weImageView2 = finderQQMusicFollowHeaderView.f121443e) != null) {
                        weImageView2.setImageResource(com.tencent.mm.R.raw.icons_outlined_pause2);
                    }
                } else {
                    boolean z17 = true;
                    if (!((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 3)) && (valueOf == null || valueOf.intValue() != 4)) {
                        z17 = false;
                    }
                    if (z17 && (weImageView = finderQQMusicFollowHeaderView.f121443e) != null) {
                        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_play2);
                    }
                }
                return false;
            }
        };
        a(context);
    }

    public final void a(android.content.Context context) {
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.b7w, (android.view.ViewGroup) this, true);
        this.f121442d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.egn);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f485036gb4);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new uo2.b0(this));
        } else {
            linearLayout = null;
        }
        this.f121445g = linearLayout;
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.f485037gb5)).getPaint(), 0.8f);
        this.f121447i = new uo2.j0(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e7 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView.b():void");
    }

    public final void c(com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.zi2 zi2Var) {
        java.lang.String u17;
        java.lang.String str;
        if (finderObject != null) {
            u17 = pm0.v.u(finderObject.getId());
            this.f121444f = u17;
        } else {
            u17 = pm0.v.u(c01.id.c());
            this.f121444f = u17;
        }
        java.lang.String str2 = u17;
        r45.xs4 xs4Var = new r45.xs4();
        xs4Var.set(0, pm0.v.u(finderObject != null ? finderObject.getId() : 0L));
        if (finderObject == null || (str = finderObject.getObjectNonceId()) == null) {
            str = "";
        }
        xs4Var.set(1, str);
        xs4Var.set(2, zi2Var.getString(1));
        xs4Var.set(3, "");
        xs4Var.set(4, "");
        xs4Var.set(5, zi2Var.getString(4));
        xs4Var.set(10, java.lang.Integer.valueOf(zi2Var.getInteger(9)));
        xs4Var.set(14, zi2Var.getString(2));
        xs4Var.set(16, zi2Var.getString(1));
        xs4Var.set(13, zi2Var.getString(1));
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.finder.profile.uic.d6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.d6.class)).f123613f = false;
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
        com.tencent.mm.plugin.finder.storage.cd0 cd0Var = com.tencent.mm.plugin.finder.storage.cd0.f126580a;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        cd0Var.g(context2, zi2Var, str2, 0, xs4Var, true, bw5.ar0.TingScene_FinderProfileMusic);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        alive();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dead();
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
    }

    public final void setTopicFollowHelper(uo2.j0 topicFollowHelper) {
        kotlin.jvm.internal.o.g(topicFollowHelper, "topicFollowHelper");
        this.f121447i = topicFollowHelper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$musicPlayEventListener$1] */
    public FinderQQMusicFollowHeaderView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f121444f = "";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f121448m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$musicPlayEventListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2;
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("event :");
                am.jk jkVar = event.f54512g;
                sb6.append(jkVar != null ? java.lang.Integer.valueOf(jkVar.f7036b) : null);
                com.tencent.mars.xlog.Log.i("Finder.QQMusicFollowHeaderView", sb6.toString());
                java.lang.Integer valueOf = jkVar != null ? java.lang.Integer.valueOf(jkVar.f7036b) : null;
                com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView = com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView.this;
                if (valueOf != null && valueOf.intValue() == 0) {
                    java.lang.String playId = finderQQMusicFollowHeaderView.f121444f;
                    kotlin.jvm.internal.o.g(playId, "playId");
                    if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).oj(playId) && (weImageView2 = finderQQMusicFollowHeaderView.f121443e) != null) {
                        weImageView2.setImageResource(com.tencent.mm.R.raw.icons_outlined_pause2);
                    }
                } else {
                    boolean z17 = true;
                    if (!((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 3)) && (valueOf == null || valueOf.intValue() != 4)) {
                        z17 = false;
                    }
                    if (z17 && (weImageView = finderQQMusicFollowHeaderView.f121443e) != null) {
                        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_play2);
                    }
                }
                return false;
            }
        };
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$musicPlayEventListener$1] */
    public FinderQQMusicFollowHeaderView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f121444f = "";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f121448m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView$musicPlayEventListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2;
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("event :");
                am.jk jkVar = event.f54512g;
                sb6.append(jkVar != null ? java.lang.Integer.valueOf(jkVar.f7036b) : null);
                com.tencent.mars.xlog.Log.i("Finder.QQMusicFollowHeaderView", sb6.toString());
                java.lang.Integer valueOf = jkVar != null ? java.lang.Integer.valueOf(jkVar.f7036b) : null;
                com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView finderQQMusicFollowHeaderView = com.tencent.mm.plugin.finder.music.FinderQQMusicFollowHeaderView.this;
                if (valueOf != null && valueOf.intValue() == 0) {
                    java.lang.String playId = finderQQMusicFollowHeaderView.f121444f;
                    kotlin.jvm.internal.o.g(playId, "playId");
                    if (((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).oj(playId) && (weImageView2 = finderQQMusicFollowHeaderView.f121443e) != null) {
                        weImageView2.setImageResource(com.tencent.mm.R.raw.icons_outlined_pause2);
                    }
                } else {
                    boolean z17 = true;
                    if (!((valueOf != null && valueOf.intValue() == 2) || (valueOf != null && valueOf.intValue() == 3)) && (valueOf == null || valueOf.intValue() != 4)) {
                        z17 = false;
                    }
                    if (z17 && (weImageView = finderQQMusicFollowHeaderView.f121443e) != null) {
                        weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_play2);
                    }
                }
                return false;
            }
        };
        a(context);
    }
}
