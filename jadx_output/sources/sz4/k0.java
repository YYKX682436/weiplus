package sz4;

/* loaded from: classes12.dex */
public class k0 extends sz4.u {
    public final android.widget.LinearLayout A;
    public final com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView B;
    public final android.widget.ImageView C;
    public final android.widget.TextView D;
    public final android.widget.TextView E;
    public iz4.l F;
    public final com.tencent.mm.sdk.platformtools.n3 G;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.LinearLayout f414206y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.LinearLayout f414207z;

    public k0(android.view.View view, mz4.j0 j0Var, mz4.d dVar, uz4.d dVar2) {
        super(view, j0Var, dVar);
        this.G = new sz4.j0(this);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486165kf3);
        this.f414206y = linearLayout;
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486167kf5);
        this.f414207z = linearLayout2;
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486166kf4);
        this.A = linearLayout3;
        this.C = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.kf6);
        this.D = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kf8);
        this.E = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kf9);
        com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView noteVoiceView = (com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView) view.findViewById(com.tencent.mm.R.id.kej);
        this.B = noteVoiceView;
        noteVoiceView.setVoiceHelper(dVar2);
        linearLayout.setVisibility(0);
        linearLayout2.setVisibility(8);
        linearLayout3.setVisibility(0);
        this.f414231f.setVisibility(8);
        this.f414234i.setVisibility(8);
        linearLayout.setOnClickListener(new sz4.i0(this));
    }

    @Override // sz4.a
    public int i() {
        return 4;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        iz4.l lVar = (iz4.l) cVar;
        this.F = lVar;
        boolean z17 = lVar.f296134r;
        android.widget.LinearLayout linearLayout = this.f414207z;
        android.widget.LinearLayout linearLayout2 = this.A;
        android.widget.LinearLayout linearLayout3 = this.f414206y;
        if (z17) {
            linearLayout3.setBackgroundResource(0);
            linearLayout2.setVisibility(0);
            linearLayout.setVisibility(8);
            linearLayout3.setPadding(0, 0, 0, 0);
            boolean z18 = cVar.f296111i;
            iz4.l lVar2 = this.F;
            java.lang.String str = lVar2.f296135s;
            int i19 = lVar2.f296162w;
            int i27 = lVar2.f296163x;
            com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView noteVoiceView = this.B;
            noteVoiceView.getClass();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            noteVoiceView.f188299n = str;
            noteVoiceView.f188300o = i19;
            noteVoiceView.f188298m = i27;
            if (z18) {
                android.view.View view = noteVoiceView.f188297i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = noteVoiceView.f188297i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (noteVoiceView.f188299n.equals(noteVoiceView.f188301p.f432166d)) {
                if (noteVoiceView.f188301p.f()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NoteVoiceView", "updateInfo .isPlay()");
                    uz4.g gVar = noteVoiceView.f188302q;
                    uz4.d dVar = noteVoiceView.f188301p;
                    gVar.d(dVar.f432175p != null ? ((sl.j) dVar.e()).a() : 0.0d, i27, true);
                } else {
                    uz4.d dVar2 = noteVoiceView.f188301p;
                    if (dVar2.f432175p != null && ((sl.j) dVar2.e()).b()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NoteVoiceView", "updateInfo .isPause()");
                        uz4.g gVar2 = noteVoiceView.f188302q;
                        uz4.d dVar3 = noteVoiceView.f188301p;
                        gVar2.d(dVar3.f432175p != null ? ((sl.j) dVar3.e()).a() : 0.0d, i27, false);
                    } else {
                        noteVoiceView.f188302q.b(i27);
                    }
                }
            } else {
                noteVoiceView.f188302q.b(i27);
            }
        } else {
            linearLayout3.setBackgroundResource(com.tencent.mm.R.drawable.bbs);
            linearLayout3.setPadding(26, 7, 0, 7);
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            android.widget.ImageView imageView = this.C;
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
            boolean booleanValue = this.F.f296121y.booleanValue();
            android.widget.TextView textView = this.E;
            android.widget.TextView textView2 = this.D;
            if (booleanValue) {
                this.G.sendEmptyMessage(4096);
                textView2.setText(com.tencent.mm.R.string.ce6);
                textView.setText(" " + ((java.lang.String) c31.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, this.F.f296160u)).toString());
            } else {
                textView2.setText(com.tencent.mm.R.string.f491224ce5);
                textView.setText(" " + ((java.lang.String) c31.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) c31.a.a(this.F.f296163x))).toString());
            }
        }
        super.j(cVar, i17, i18);
    }
}
