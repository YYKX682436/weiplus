package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public ql3.a f150779a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.music.ui.MusicItemLayout f150780b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f150781c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f150782d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f150783e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f150784f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f150785g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f150786h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.music.ui.LyricView f150787i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f150789k;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.u f150791m;

    /* renamed from: j, reason: collision with root package name */
    public int f150788j = 1;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.animation.Animation.AnimationListener f150790l = new com.tencent.mm.plugin.music.ui.r(this);

    public t(com.tencent.mm.plugin.music.ui.u uVar) {
        this.f150791m = uVar;
    }

    public void a() {
        if (this.f150789k || this.f150788j == 2) {
            return;
        }
        com.tencent.mm.plugin.music.ui.u uVar = this.f150791m;
        pl3.c.b(2, uVar.f150805p);
        if (uVar.f150804o == 0) {
            uVar.f150804o = this.f150781c.getMeasuredHeight();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, uVar.f150804o);
            layoutParams.weight = 0.0f;
            this.f150781c.setLayoutParams(layoutParams);
        }
        pl3.c.f356699b = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(285L, 4L, 1L, false);
        this.f150788j = 2;
        this.f150789k = true;
        com.tencent.mm.plugin.music.ui.s sVar = new com.tencent.mm.plugin.music.ui.s(this, this.f150787i, uVar.f150800h);
        sVar.setDuration(500L);
        sVar.setAnimationListener(this.f150790l);
        this.f150787i.startAnimation(sVar);
    }

    public void b() {
        if (this.f150789k || this.f150788j == 1) {
            return;
        }
        com.tencent.mm.plugin.music.ui.u uVar = this.f150791m;
        pl3.c.b(3, uVar.f150805p);
        if (uVar.f150804o == 0) {
            uVar.f150804o = this.f150781c.getMeasuredHeight();
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, uVar.f150804o);
            layoutParams.weight = 0.0f;
            this.f150781c.setLayoutParams(layoutParams);
        }
        pl3.c.f356699b = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(285L, 4L, 1L, false);
        this.f150788j = 1;
        this.f150789k = true;
        com.tencent.mm.plugin.music.ui.s sVar = new com.tencent.mm.plugin.music.ui.s(this, this.f150787i, uVar.f150799g);
        sVar.setDuration(500L);
        sVar.setAnimationListener(this.f150790l);
        this.f150787i.startAnimation(sVar);
    }

    public void c(ql3.a aVar, boolean z17) {
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainAdapter", "updateView %s", aVar.field_songName);
            this.f150779a = aVar;
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_songHAlbumUrl);
            com.tencent.mm.plugin.music.ui.u uVar = this.f150791m;
            if (K0) {
                ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).E(aVar, uVar.f150806q, true);
            }
            this.f150780b.setTag(this);
            if ((!ll3.j2.h(aVar) || uVar.f150805p == 3) && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_songSinger)) {
                this.f150786h.setText(aVar.field_songSinger);
                this.f150786h.setVisibility(0);
            } else {
                this.f150786h.setVisibility(8);
            }
            this.f150785g.setText(aVar.field_songName);
            this.f150785g.setTag(aVar.field_songName);
            com.tencent.mm.plugin.music.ui.LyricView lyricView = this.f150787i;
            ql3.b Ai = ll3.o2.Ai();
            boolean z18 = uVar.f150806q;
            lt0.f fVar = (lt0.f) Ai.f364582f;
            lyricView.setLyricObj(fVar.get(aVar.field_musicId) != null ? (ll3.h1) fVar.get(aVar.field_musicId) : Ai.z0(aVar, z18, true));
            if (!ll3.j2.h(aVar) || uVar.f150806q) {
                this.f150787i.setCurrentTime(1L);
            }
            b();
            uVar.f150803n.b(aVar, this.f150784f, uVar.f228355d, z17, uVar.f150806q);
        }
    }
}
