package sf4;

/* loaded from: classes4.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView f407499a;

    /* renamed from: b, reason: collision with root package name */
    public sf4.f2 f407500b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f407501c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f407502d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f407503e;

    /* renamed from: f, reason: collision with root package name */
    public if4.h f407504f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f407505g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f407507i;

    /* renamed from: k, reason: collision with root package name */
    public int f407509k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$onlineVideoEventListener$1 f407510l;

    /* renamed from: m, reason: collision with root package name */
    public final sf4.i2 f407511m;

    /* renamed from: h, reason: collision with root package name */
    public final fp.e f407506h = new fp.e(com.tencent.mm.sdk.platformtools.x2.f193071a);

    /* renamed from: j, reason: collision with root package name */
    public final long f407508j = 987;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$onlineVideoEventListener$1] */
    public j2() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        ?? r17 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnlineVideoEvent>(a0Var) { // from class: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$onlineVideoEventListener$1
            {
                this.__eventId = -2133747774;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.OnlineVideoEvent onlineVideoEvent) {
                com.tencent.mm.autogen.events.OnlineVideoEvent event = onlineVideoEvent;
                kotlin.jvm.internal.o.g(event, "event");
                sf4.j2 j2Var = sf4.j2.this;
                j2Var.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onelinevideo event callback, retcode:");
                am.hn hnVar = event.f54588g;
                sb6.append(hnVar != null ? java.lang.Integer.valueOf(hnVar.f6845b) : null);
                sb6.append(", currVideoItem:");
                sb6.append(j2Var.f407504f);
                com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
                if4.h hVar = j2Var.f407504f;
                if (hVar != null) {
                    if (!(hVar.f291253a == 0) && hnVar.f6845b == -21112) {
                        pm0.v.X(new sf4.h2(j2Var, event));
                    }
                }
                return false;
            }
        };
        this.f407510l = r17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "init create StoryVideoViewMgr " + hashCode());
        r17.alive();
        this.f407511m = new sf4.i2(this);
    }

    public final void b(android.view.ViewGroup parent, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView;
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f407509k = 0;
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView2 = this.f407499a;
        boolean b17 = kotlin.jvm.internal.o.b(storyVideoView2 != null ? storyVideoView2.getParent() : null, parent);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attachVideoView, parent:");
        sb6.append(parent.hashCode());
        sb6.append(", isVideoPause:false, currentSessionId:");
        sb6.append(this.f407502d);
        sb6.append(", isPlayingVideoItem:");
        sb6.append(this.f407503e);
        sb6.append(" videoView ");
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView3 = this.f407499a;
        sb6.append(storyVideoView3 != null ? java.lang.Integer.valueOf(storyVideoView3.hashCode()) : null);
        sb6.append(" sameParent ");
        sb6.append(b17);
        sb6.append(" this:");
        sb6.append(hashCode());
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString(), new java.lang.Object[0]);
        d(parent, true);
        if (this.f407499a == null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView4 = new com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView(context, null);
            this.f407499a = storyVideoView4;
            sf4.f2 f2Var = new sf4.f2(this);
            this.f407500b = f2Var;
            storyVideoView4.setIOnlineVideoProxy(f2Var);
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView5 = this.f407499a;
            if (storyVideoView5 != null) {
                storyVideoView5.setIMMVideoViewCallback(this.f407511m);
            }
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView6 = this.f407499a;
            if (storyVideoView6 != null) {
                storyVideoView6.setReporter(new sf4.g2(this));
            }
            this.f407503e = false;
        }
        if (b17) {
            if (layoutParams == null || (storyVideoView = this.f407499a) == null) {
                return;
            }
            storyVideoView.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams == null) {
            parent.addView(this.f407499a);
        } else {
            parent.addView(this.f407499a, layoutParams);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r4 == (r5 != null ? r5.f291257e : null)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        if (r4 == (r3 != null ? r3.f291257e : null)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(if4.h r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.g(r8, r0)
            r0 = 1
            r1 = 0
            r2 = 0
            int r3 = r8.f291253a
            if4.i r4 = r8.f291257e
            if (r3 == 0) goto L25
            if4.h r5 = r7.f407504f
            if (r5 == 0) goto L19
            int r6 = r5.f291253a
            if (r6 != r3) goto L19
            r3 = r0
            goto L1a
        L19:
            r3 = r2
        L1a:
            if (r3 == 0) goto L25
            if (r5 == 0) goto L21
            if4.i r3 = r5.f291257e
            goto L22
        L21:
            r3 = r1
        L22:
            if (r4 != r3) goto L25
            goto L55
        L25:
            r45.xe6 r3 = r8.f291258f
            java.lang.String r3 = r3.f390023f
            if (r3 == 0) goto L34
            int r3 = r3.length()
            if (r3 != 0) goto L32
            goto L34
        L32:
            r3 = r2
            goto L35
        L34:
            r3 = r0
        L35:
            if (r3 != 0) goto L57
            if4.h r3 = r7.f407504f
            if (r3 == 0) goto L42
            r45.xe6 r3 = r3.f291258f
            if (r3 == 0) goto L42
            java.lang.String r3 = r3.f390023f
            goto L43
        L42:
            r3 = r1
        L43:
            r45.xe6 r5 = r8.f291258f
            java.lang.String r5 = r5.f390023f
            boolean r3 = kotlin.jvm.internal.o.b(r3, r5)
            if (r3 == 0) goto L57
            if4.h r3 = r7.f407504f
            if (r3 == 0) goto L53
            if4.i r1 = r3.f291257e
        L53:
            if (r4 != r1) goto L57
        L55:
            r1 = r0
            goto L58
        L57:
            r1 = r2
        L58:
            r1 = r1 ^ r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "change:"
            r3.<init>(r4)
            r3.append(r1)
            r4 = 32
            r3.append(r4)
            boolean r4 = r7.f407505g
            r3.append(r4)
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = ", changeVideoItem: origin: "
            r3.append(r4)
            if4.h r4 = r7.f407504f
            r3.append(r4)
            java.lang.String r4 = ", new: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = ",  change:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " this:"
            r3.append(r4)
            int r4 = r7.hashCode()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "MicroMsg.Gallery.StoryVideoViewMgr"
            com.tencent.mm.sdk.platformtools.Log.c(r5, r3, r4)
            if (r1 == 0) goto Lb6
            r7.f407504f = r8
            boolean r8 = r7.f407505g
            if (r8 != 0) goto Lb0
            if (r9 == 0) goto Lb6
        Lb0:
            r7.f(r2, r0)
            r7.e()
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sf4.j2.c(if4.h, boolean):void");
    }

    public final void d(android.view.ViewGroup viewGroup, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkDetachVideoView, videoView:");
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = this.f407499a;
        sb6.append(storyVideoView != null ? storyVideoView.hashCode() : 0);
        sb6.append(", isPlay:");
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView2 = this.f407499a;
        sb6.append(storyVideoView2 != null ? storyVideoView2.isPlaying() : false);
        sb6.append(", parent:");
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView3 = this.f407499a;
        android.view.ViewParent parent = storyVideoView3 != null ? storyVideoView3.getParent() : null;
        sb6.append(parent != null ? parent.hashCode() : 0);
        sb6.append(", newParent:");
        sb6.append(viewGroup != null ? viewGroup.hashCode() : 0);
        sb6.append(", isPlayingVideoItem:");
        sb6.append(this.f407503e);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString(), new java.lang.Object[0]);
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView4 = this.f407499a;
        if ((storyVideoView4 != null ? storyVideoView4.getParent() : null) != null) {
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView5 = this.f407499a;
            if (kotlin.jvm.internal.o.b(storyVideoView5 != null ? storyVideoView5.getParent() : null, viewGroup)) {
                return;
            }
            f(false, true);
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView6 = this.f407499a;
            android.view.ViewParent parent2 = storyVideoView6 != null ? storyVideoView6.getParent() : null;
            kotlin.jvm.internal.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent2).removeView(this.f407499a);
            this.f407504f = null;
        }
    }

    public final void e() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Gallery.StoryVideoViewMgr", "playVideo, false " + this.f407505g + ", " + this.f407504f, new java.lang.Object[0]);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVideoViewProp, isMute:");
        sb6.append(this.f407501c);
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
        com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = this.f407499a;
        if (storyVideoView != null) {
            storyVideoView.setMute(this.f407501c);
        }
        this.f407505g = true;
        if4.h hVar = this.f407504f;
        if (hVar != null) {
            this.f407502d = java.util.UUID.randomUUID().toString();
            sf4.f2 f2Var = this.f407500b;
            if (f2Var != null) {
                f2Var.f407475f = hVar;
                f2Var.f407473d = ef4.k0.f252459a.b(hVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayProxy", "setStoryVideoItem " + hVar + " videoCache " + f2Var.f407473d);
            }
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView2 = this.f407499a;
            if (storyVideoView2 != null) {
                storyVideoView2.l0(hVar, this.f407502d);
            }
            if (hVar.f291257e != if4.i.f291260d) {
                this.f407503e = true;
            }
            if (!this.f407507i) {
                this.f407506h.b();
                this.f407507i = true;
            }
        }
        mf4.d.f326163d.f60918d = com.tencent.mars.comm.NetStatusUtil.getIOSNetType(this.f407499a != null ? r1.getContext() : null);
    }

    public final void f(boolean z17, boolean z18) {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Gallery.StoryVideoViewMgr", "stopVideo, detach: " + z17, new java.lang.Object[0]);
        if (this.f407503e) {
            this.f407502d = null;
            com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView storyVideoView = this.f407499a;
            if (storyVideoView != null) {
                storyVideoView.stop();
            }
            if (this.f407507i) {
                this.f407506h.a();
                this.f407507i = false;
            }
            this.f407503e = false;
        }
        if (z17) {
            this.f407505g = false;
            d(null, z18);
            mf4.d dVar = mf4.d.f326160a;
            mf4.d.f326163d.f60925k = java.lang.System.currentTimeMillis();
            if (z18) {
                dVar.c();
            }
        }
    }
}
