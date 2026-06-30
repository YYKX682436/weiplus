package com.tencent.mm.plugin.wenote.ui.nativenote.voiceview;

/* loaded from: classes12.dex */
public class NoteEditorVoiceBaseView extends android.widget.TextView implements uz4.c, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f188285d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.animation.AlphaAnimation f188286e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.AnimationDrawable f188287f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f188288g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f188289h;

    /* renamed from: i, reason: collision with root package name */
    public int f188290i;

    /* renamed from: m, reason: collision with root package name */
    public uz4.d f188291m;

    public NoteEditorVoiceBaseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f188285d = false;
        this.f188289h = "";
        this.f188288g = context;
        f();
    }

    public static void e(com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView noteEditorVoiceBaseView) {
        if (!noteEditorVoiceBaseView.f188291m.g(noteEditorVoiceBaseView.f188289h, noteEditorVoiceBaseView.f188290i)) {
            dp.a.makeText(noteEditorVoiceBaseView.getContext(), com.tencent.mm.R.string.f491220ce1, 1).show();
        } else {
            if (noteEditorVoiceBaseView.f188285d) {
                return;
            }
            noteEditorVoiceBaseView.f188285d = true;
            noteEditorVoiceBaseView.setCompoundDrawablesWithIntrinsicBounds(noteEditorVoiceBaseView.f188287f, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            noteEditorVoiceBaseView.f188287f.stop();
            noteEditorVoiceBaseView.f188287f.start();
        }
    }

    @Override // uz4.c
    public void a() {
    }

    @Override // uz4.c
    public void b(java.lang.String str) {
    }

    @Override // uz4.c
    public void c() {
        g();
    }

    @Override // uz4.c
    public void d(java.lang.String str) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (str.equals(this.f188289h)) {
            return;
        }
        g();
    }

    public final void f() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.1f, 1.0f);
        this.f188286e = alphaAnimation;
        alphaAnimation.setDuration(1000L);
        this.f188286e.setRepeatCount(-1);
        this.f188286e.setRepeatMode(2);
        this.f188287f = new ig5.a();
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f1);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f188287f.addFrame(drawable, 300);
        android.graphics.drawable.Drawable drawable2 = getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f2);
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        this.f188287f.addFrame(drawable2, 300);
        android.graphics.drawable.Drawable drawable3 = getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new_f3);
        drawable3.setBounds(0, 0, drawable3.getIntrinsicWidth(), drawable3.getIntrinsicHeight());
        this.f188287f.addFrame(drawable3, 300);
        this.f188287f.setOneShot(false);
        this.f188287f.setVisible(true, true);
    }

    public void g() {
        android.view.animation.AlphaAnimation alphaAnimation = this.f188286e;
        if (alphaAnimation != null && alphaAnimation.isInitialized()) {
            setAnimation(null);
        }
        this.f188285d = false;
        setCompoundDrawablesWithIntrinsicBounds(getResources().getDrawable(com.tencent.mm.R.raw.chatfrom_voice_playing_new), (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        this.f188287f.stop();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new uz4.a(this));
    }

    public void setVoiceHelper(uz4.d dVar) {
        this.f188291m = dVar;
        dVar.b(this);
    }

    public NoteEditorVoiceBaseView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f188285d = false;
        this.f188289h = "";
        this.f188288g = context;
        f();
    }
}
