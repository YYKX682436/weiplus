package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class FloatBallMusicLyricView extends android.widget.LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f150667i = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f150668d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.music.ui.view.MarqueeLyricView f150669e;

    /* renamed from: f, reason: collision with root package name */
    public ql3.a f150670f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.music.player.base.k f150671g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f150672h;

    /* renamed from: com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView$3, reason: invalid class name */
    /* loaded from: classes11.dex */
    public class AnonymousClass3 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent> {
        public AnonymousClass3(androidx.lifecycle.y yVar) {
            super(yVar);
            this.__eventId = -1155728636;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
            com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent2 = musicPlayerEvent;
            if (musicPlayerEvent2.f54512g.f7036b != 6) {
                return false;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.music.ui.c(this, musicPlayerEvent2));
            return false;
        }
    }

    public FloatBallMusicLyricView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void setMusicLyric(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallMusicLyricView", "setMusicLyric: %s", str);
        if (this.f150669e != null) {
            ql3.a z17 = ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).z();
            this.f150670f = z17;
            if (z17 == null) {
                this.f150669e.setVisibility(8);
                return;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(z17.field_songHAlbumUrl)) {
                this.f150669e.setVisibility(8);
                return;
            }
            this.f150669e.setVisibility(8);
            ((kl3.z) ((kl3.i) sl3.b.b(kl3.i.class))).E(this.f150670f, false, false);
        }
    }

    private void setMusicTitle(java.lang.String str) {
        android.widget.TextView textView = this.f150668d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setMusicWrapper(b21.r rVar) {
        setMusicTitle(rVar.f17348g);
        setMusicLyric(rVar.f17355q);
    }

    public FloatBallMusicLyricView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        this.f150670f = null;
        com.tencent.mm.plugin.music.ui.a aVar = new com.tencent.mm.plugin.music.ui.a(this);
        this.f150671g = aVar;
        com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView.AnonymousClass3 anonymousClass3 = new com.tencent.mm.plugin.music.ui.FloatBallMusicLyricView.AnonymousClass3(com.tencent.mm.app.a0.f53288d);
        this.f150672h = anonymousClass3;
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.bao, (android.view.ViewGroup) this, true);
        this.f150668d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486051k04);
        this.f150669e = (com.tencent.mm.plugin.music.ui.view.MarqueeLyricView) findViewById(com.tencent.mm.R.id.jza);
        anonymousClass3.alive();
        java.util.LinkedList linkedList = ((rl3.b) kl3.t.g().a()).f397235j;
        if (linkedList.contains(aVar)) {
            return;
        }
        linkedList.add(aVar);
    }
}
