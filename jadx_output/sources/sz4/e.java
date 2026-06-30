package sz4;

/* loaded from: classes12.dex */
public class e extends sz4.u {
    public final com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView A;
    public final android.widget.ImageView B;
    public final android.widget.TextView C;
    public final android.widget.TextView D;
    public iz4.l E;
    public final com.tencent.mm.sdk.platformtools.n3 F;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.LinearLayout f414190y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.LinearLayout f414191z;

    public e(android.view.View view, mz4.j0 j0Var, mz4.d dVar, uz4.d dVar2) {
        super(view, j0Var, dVar);
        this.F = new sz4.d(this);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486167kf5);
        this.f414190y = linearLayout;
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.kec);
        this.f414191z = linearLayout2;
        this.B = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.kf6);
        this.C = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kf8);
        this.D = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kf9);
        com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView noteEditorVoiceBaseView = (com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView) view.findViewById(com.tencent.mm.R.id.keh);
        this.A = noteEditorVoiceBaseView;
        noteEditorVoiceBaseView.setVoiceHelper(dVar2);
        this.f414239q.setVisibility(0);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(0);
        this.f414231f.setVisibility(8);
        this.f414234i.setVisibility(8);
        this.f414239q.setOnClickListener(new sz4.c(this));
    }

    @Override // sz4.a
    public int i() {
        return 20;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        iz4.l lVar = (iz4.l) cVar;
        this.E = lVar;
        boolean z17 = lVar.f296134r;
        android.widget.LinearLayout linearLayout = this.f414190y;
        android.widget.LinearLayout linearLayout2 = this.f414191z;
        android.widget.LinearLayout linearLayout3 = this.f414239q;
        if (z17) {
            linearLayout2.setVisibility(0);
            linearLayout.setVisibility(8);
            linearLayout3.setPadding(0, 0, 0, 0);
            boolean z18 = cVar.f296111i;
            com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView noteEditorVoiceBaseView = this.A;
            if (z18) {
                noteEditorVoiceBaseView.setBackgroundResource(com.tencent.mm.R.drawable.bbg);
            } else {
                noteEditorVoiceBaseView.setBackgroundResource(com.tencent.mm.R.drawable.bbf);
            }
            iz4.l lVar2 = this.E;
            java.lang.String str = lVar2.f296135s;
            int i19 = lVar2.f296162w;
            java.lang.String str2 = lVar2.f296161v;
            noteEditorVoiceBaseView.getClass();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            noteEditorVoiceBaseView.f188289h = str;
            noteEditorVoiceBaseView.f188290i = i19;
            noteEditorVoiceBaseView.setText(str2);
        } else {
            linearLayout3.setPadding(26, 7, 0, 7);
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            android.widget.ImageView imageView = this.B;
            if (imageView.getAnimation() != null) {
                imageView.startAnimation(imageView.getAnimation());
            } else {
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(500L);
                alphaAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(2);
                imageView.startAnimation(alphaAnimation);
            }
            boolean booleanValue = this.E.f296121y.booleanValue();
            android.widget.TextView textView = this.D;
            android.widget.TextView textView2 = this.C;
            if (booleanValue) {
                this.F.sendEmptyMessage(4096);
                textView2.setText(com.tencent.mm.R.string.ce6);
                textView.setText(" " + ((java.lang.String) c31.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, this.E.f296160u)).toString());
            } else {
                textView2.setText(com.tencent.mm.R.string.f491224ce5);
                textView.setText(" " + ((java.lang.String) c31.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) c31.a.a(this.E.f296163x))).toString());
            }
        }
        super.j(cVar, i17, i18);
    }
}
