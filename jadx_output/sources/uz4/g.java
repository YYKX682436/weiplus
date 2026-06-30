package uz4;

/* loaded from: classes12.dex */
public class g extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f432178a;

    /* renamed from: b, reason: collision with root package name */
    public float f432179b;

    /* renamed from: c, reason: collision with root package name */
    public float f432180c;

    /* renamed from: d, reason: collision with root package name */
    public int f432181d;

    /* renamed from: e, reason: collision with root package name */
    public int f432182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView f432183f;

    public g(com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView noteVoiceView, uz4.e eVar) {
        this.f432183f = noteVoiceView;
    }

    public void b(int i17) {
        this.f432178a = false;
        float Y = o72.x1.Y(i17);
        this.f432179b = Y;
        this.f432180c = Y;
        com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView noteVoiceView = this.f432183f;
        this.f432182e = i65.a.b(noteVoiceView.getContext(), 0);
        noteVoiceView.f188295g.setText(com.tencent.mm.plugin.fav.ui.w6.b(noteVoiceView.getContext(), (int) (this.f432179b - this.f432180c)));
        noteVoiceView.f188296h.setText(com.tencent.mm.plugin.fav.ui.w6.b(noteVoiceView.getContext(), (int) this.f432179b));
        float f17 = this.f432179b;
        android.widget.TextView textView = noteVoiceView.f188296h;
        textView.setTag(com.tencent.mm.R.id.nwn, textView.getContext().getString(com.tencent.mm.R.string.k9k, "" + (((int) f17) / 60), "" + (((int) f17) % 60)));
        noteVoiceView.f188294f.setImageResource(com.tencent.mm.R.raw.voicepost_beginicon);
        noteVoiceView.f188294f.setContentDescription(noteVoiceView.getContext().getResources().getString(com.tencent.mm.R.string.f490519xf) + noteVoiceView.getContext().getResources().getString(com.tencent.mm.R.string.h_i));
        noteVoiceView.f188293e.setWidth(this.f432182e);
    }

    public void c() {
        float f17 = 1.0f - (this.f432180c / this.f432179b);
        com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView noteVoiceView = this.f432183f;
        int width = noteVoiceView.f188292d.getWidth();
        this.f432181d = ((int) (f17 * (width - r3))) + this.f432182e;
        noteVoiceView.f188295g.setText(com.tencent.mm.plugin.fav.ui.w6.b(noteVoiceView.getContext(), (int) (this.f432179b - this.f432180c)));
        noteVoiceView.f188296h.setText(com.tencent.mm.plugin.fav.ui.w6.b(noteVoiceView.getContext(), (int) this.f432179b));
        noteVoiceView.f188293e.setWidth(this.f432181d);
    }

    public void d(double d17, int i17, boolean z17) {
        com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView noteVoiceView = this.f432183f;
        this.f432182e = i65.a.b(noteVoiceView.getContext(), 0);
        noteVoiceView.f188294f.setImageResource(com.tencent.mm.R.raw.voicepost_beginicon);
        noteVoiceView.f188294f.setContentDescription(noteVoiceView.getContext().getResources().getString(com.tencent.mm.R.string.f490519xf) + noteVoiceView.getContext().getResources().getString(com.tencent.mm.R.string.h_i));
        c();
        if (z17) {
            noteVoiceView.f188294f.setImageResource(com.tencent.mm.R.raw.voicepost_pauseicon);
            noteVoiceView.f188294f.setContentDescription(noteVoiceView.getContext().getResources().getString(com.tencent.mm.R.string.f490511x5));
            sendEmptyMessage(4096);
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        this.f432180c = java.lang.Math.max(0.0f, this.f432180c - 0.256f);
        c();
        if (this.f432180c <= 0.1f) {
            return;
        }
        sendEmptyMessageDelayed(4096, 256L);
    }
}
