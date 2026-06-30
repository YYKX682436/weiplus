package com.tencent.mm.plugin.wenote.ui.nativenote.voiceview;

/* loaded from: classes12.dex */
public class NoteVoiceView extends android.widget.FrameLayout implements uz4.c, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f188292d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f188293e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageButton f188294f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f188295g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f188296h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f188297i;

    /* renamed from: m, reason: collision with root package name */
    public int f188298m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f188299n;

    /* renamed from: o, reason: collision with root package name */
    public int f188300o;

    /* renamed from: p, reason: collision with root package name */
    public uz4.d f188301p;

    /* renamed from: q, reason: collision with root package name */
    public uz4.g f188302q;

    public NoteVoiceView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f188299n = "";
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c8e, (android.view.ViewGroup) this, true);
    }

    public static void e(com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView noteVoiceView) {
        if (!noteVoiceView.f188301p.g(noteVoiceView.f188299n, noteVoiceView.f188300o)) {
            dp.a.makeText(noteVoiceView.getContext(), com.tencent.mm.R.string.f491220ce1, 1).show();
            return;
        }
        noteVoiceView.f188293e.setKeepScreenOn(true);
        uz4.g gVar = noteVoiceView.f188302q;
        gVar.f432178a = false;
        gVar.removeMessages(4096);
        gVar.b(gVar.f432183f.f188298m);
        gVar.f432178a = false;
        com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView noteVoiceView2 = gVar.f432183f;
        noteVoiceView2.f188294f.setImageResource(com.tencent.mm.R.raw.voicepost_pauseicon);
        noteVoiceView2.f188294f.setContentDescription(noteVoiceView2.getContext().getResources().getString(com.tencent.mm.R.string.f490511x5));
        gVar.sendEmptyMessage(4096);
    }

    @Override // uz4.c
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteVoiceView", "onNotifyPausePlay !!");
        f();
    }

    @Override // uz4.c
    public void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteVoiceView", "onNotifyResumePlay !!");
    }

    @Override // uz4.c
    public void c() {
        uz4.g gVar = this.f188302q;
        gVar.f432178a = false;
        gVar.removeMessages(4096);
        gVar.b(gVar.f432183f.f188298m);
        this.f188293e.setKeepScreenOn(false);
    }

    @Override // uz4.c
    public void d(java.lang.String str) {
        if (this.f188299n.equals(str)) {
            return;
        }
        uz4.g gVar = this.f188302q;
        gVar.f432178a = false;
        gVar.removeMessages(4096);
        gVar.b(gVar.f432183f.f188298m);
        this.f188293e.setKeepScreenOn(false);
    }

    public final void f() {
        uz4.g gVar = this.f188302q;
        gVar.f432178a = true;
        gVar.removeMessages(4096);
        com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView noteVoiceView = gVar.f432183f;
        noteVoiceView.f188294f.setImageResource(com.tencent.mm.R.raw.voicepost_beginicon);
        noteVoiceView.f188294f.setContentDescription(noteVoiceView.getContext().getResources().getString(com.tencent.mm.R.string.f490519xf) + noteVoiceView.getContext().getResources().getString(com.tencent.mm.R.string.h_i));
        this.f188293e.setKeepScreenOn(false);
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteVoiceView", "on configuration changed, is paused ? %B", java.lang.Boolean.valueOf(this.f188302q.f432178a));
        uz4.g gVar = this.f188302q;
        if (gVar.f432178a) {
            gVar.postDelayed(new uz4.e(this), 128L);
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f188292d = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.f487612p62);
        this.f188295g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487610p60);
        this.f188296h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487614p64);
        this.f188293e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487611p61);
        this.f188294f = (android.widget.ImageButton) findViewById(com.tencent.mm.R.id.p5z);
        this.f188297i = findViewById(com.tencent.mm.R.id.p7e);
        this.f188302q = new uz4.g(this, null);
        this.f188294f.setOnClickListener(new uz4.f(this));
    }

    public void setVoiceHelper(uz4.d dVar) {
        this.f188301p = dVar;
        dVar.b(this);
    }

    public NoteVoiceView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f188299n = "";
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c8e, (android.view.ViewGroup) this, true);
    }
}
