package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class j extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f150751m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f150752n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f150753o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f150754p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f150755q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f150756r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f150757s;

    /* renamed from: t, reason: collision with root package name */
    public b66.g f150758t;

    public j(android.content.Context context) {
        super(context);
        com.tencent.mm.sdk.platformtools.Log.a("MicroMsg.MusicBanner", "initPlayerListener", new java.lang.Object[0]);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.music.ui.MusicBanner$3
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent2 = musicPlayerEvent;
                com.tencent.mars.xlog.Log.i("MicroMsg.MusicBanner", "musicBanner.onMusicPlayerEvent %s", java.lang.Integer.valueOf(musicPlayerEvent2.f54512g.f7036b));
                int i17 = musicPlayerEvent2.f54512g.f7036b;
                if (i17 != 0 && i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4 && i17 != 7) {
                    return false;
                }
                com.tencent.mm.plugin.music.ui.j.this.l();
                return false;
            }
        };
        this.f150752n = iListener;
        iListener.alive();
    }

    @Override // s35.b
    public void a() {
        this.f150752n.dead();
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.c4_;
    }

    @Override // s35.b
    public int c() {
        return 1;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        this.f150751m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jy8);
        this.f150754p = view.findViewById(com.tencent.mm.R.id.jy9);
        this.f150753o = view.findViewById(com.tencent.mm.R.id.f483351af3);
        this.f150755q = view.findViewById(com.tencent.mm.R.id.ryc);
        this.f150751m.setTextSize(0, i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479853h2));
        m(this.f150757s);
        view.setOnClickListener(new com.tencent.mm.plugin.music.ui.k(this));
        this.f150755q.setOnClickListener(new com.tencent.mm.plugin.music.ui.l(this));
    }

    @Override // s35.b
    public boolean i() {
        return l();
    }

    @Override // s35.b
    public void k(int i17) {
        if (!this.f402844i) {
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MusicBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout = this.f402843h;
        if (linearLayout != null) {
            android.view.View findViewById = linearLayout.findViewById(com.tencent.mm.R.id.jy9);
            if (i17 != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            if (!((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MusicBanner", "isFloatWindowOpAllowed return false");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.MusicBanner", "isFloatWindowOpAllowed return true");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/music/ui/MusicBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (b21.m.c()) {
                final b21.r b17 = b21.m.b();
                if (b17 == null || !b17.N) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MusicBanner", "resume music to float ball can ");
                    ll3.q0.d(b17);
                    return;
                }
                boolean z17 = !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).zk();
                com.tencent.mars.xlog.Log.i("MicroMsg.MusicBanner", "resume music to float ball can enter: " + z17);
                if (z17) {
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.music.ui.j$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            ll3.q0.d(b21.r.this);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x007f, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009b, code lost:
    
        if (r1 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0172, code lost:
    
        if (r0.f54510h.f6838b != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l() {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.music.ui.j.l():boolean");
    }

    public void m(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f150757s = str == null ? "" : str;
        android.widget.TextView textView = this.f150751m;
        if (textView != null) {
            textView.setText(str);
        }
    }
}
