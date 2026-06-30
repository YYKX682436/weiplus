package rx1;

/* loaded from: classes12.dex */
public class g extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f400957a;

    /* renamed from: b, reason: collision with root package name */
    public float f400958b;

    /* renamed from: c, reason: collision with root package name */
    public float f400959c;

    /* renamed from: d, reason: collision with root package name */
    public int f400960d;

    /* renamed from: e, reason: collision with root package name */
    public int f400961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView f400962f;

    public g(com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView voiceView, rx1.e eVar) {
        this.f400962f = voiceView;
    }

    public void b(int i17) {
        this.f400957a = false;
        float Y = o72.x1.Y(i17);
        this.f400958b = Y;
        this.f400959c = Y;
        com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView voiceView = this.f400962f;
        this.f400961e = i65.a.b(voiceView.getContext(), 0);
        voiceView.f96652g.setText(com.tencent.mm.plugin.fav.ui.w6.b(voiceView.getContext(), (int) (this.f400958b - this.f400959c)));
        voiceView.f96653h.setText(com.tencent.mm.plugin.fav.ui.w6.b(voiceView.getContext(), (int) this.f400958b));
        voiceView.f96651f.setImageResource(com.tencent.mm.R.raw.voicepost_beginicon);
        voiceView.f96651f.setContentDescription(voiceView.getContext().getResources().getString(com.tencent.mm.R.string.f490519xf));
        voiceView.f96650e.setWidth(this.f400961e);
    }

    public void c() {
        float f17 = 1.0f - (this.f400959c / this.f400958b);
        com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView voiceView = this.f400962f;
        int width = voiceView.f96649d.getWidth();
        this.f400960d = ((int) (f17 * (width - r3))) + this.f400961e;
        voiceView.f96652g.setText(com.tencent.mm.plugin.fav.ui.w6.b(voiceView.getContext(), (int) (this.f400958b - this.f400959c)));
        voiceView.f96653h.setText(com.tencent.mm.plugin.fav.ui.w6.b(voiceView.getContext(), (int) this.f400958b));
        voiceView.f96650e.setWidth(this.f400960d);
    }

    public void d(double d17, int i17, boolean z17) {
        com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView voiceView = this.f400962f;
        this.f400961e = i65.a.b(voiceView.getContext(), 0);
        voiceView.f96651f.setImageResource(com.tencent.mm.R.raw.voicepost_beginicon);
        voiceView.f96651f.setContentDescription(voiceView.getContext().getResources().getString(com.tencent.mm.R.string.f490519xf));
        c();
        if (z17) {
            voiceView.f96651f.setImageResource(com.tencent.mm.R.raw.voicepost_pauseicon);
            voiceView.f96651f.setContentDescription(voiceView.getContext().getResources().getString(com.tencent.mm.R.string.f490511x5));
            sendEmptyMessage(4096);
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        this.f400959c = java.lang.Math.max(0.0f, this.f400959c - 0.256f);
        c();
        if (this.f400959c <= 0.1f) {
            return;
        }
        sendEmptyMessageDelayed(4096, 256L);
    }
}
