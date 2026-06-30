package gx1;

/* loaded from: classes12.dex */
public class b0 extends gx1.l {
    public final android.widget.LinearLayout A;
    public final android.widget.LinearLayout B;
    public final com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView C;
    public final android.widget.ImageView D;
    public final android.widget.TextView E;
    public final android.widget.TextView F;
    public ix1.n G;
    public final com.tencent.mm.sdk.platformtools.n3 H;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.LinearLayout f277293z;

    public b0(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        this.H = new gx1.a0(this);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486165kf3);
        this.f277293z = linearLayout;
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486167kf5);
        this.A = linearLayout2;
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486166kf4);
        this.B = linearLayout3;
        this.D = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.kf6);
        this.E = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kf8);
        this.F = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kf9);
        com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView voiceView = (com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView) view.findViewById(com.tencent.mm.R.id.kej);
        this.C = voiceView;
        voiceView.setVoiceHelper(rx1.d.b());
        linearLayout.setVisibility(0);
        linearLayout2.setVisibility(8);
        linearLayout3.setVisibility(0);
        this.f277304f.setVisibility(8);
        this.f277307i.setVisibility(8);
        linearLayout.setOnClickListener(new gx1.z(this));
    }

    @Override // gx1.a
    public int i() {
        return 4;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        boolean b17;
        ix1.n nVar = (ix1.n) aVar;
        this.G = nVar;
        boolean z17 = nVar.f295328q;
        android.widget.LinearLayout linearLayout = this.A;
        android.widget.LinearLayout linearLayout2 = this.B;
        android.widget.LinearLayout linearLayout3 = this.f277293z;
        if (z17) {
            linearLayout3.setBackgroundResource(0);
            linearLayout2.setVisibility(0);
            linearLayout.setVisibility(8);
            linearLayout3.setPadding(0, 0, 0, 0);
            boolean z18 = aVar.f295318h;
            ix1.n nVar2 = this.G;
            java.lang.String str = nVar2.f295329r;
            int i19 = nVar2.f295344u;
            int i27 = nVar2.f295345v;
            com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView voiceView = this.C;
            voiceView.getClass();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            voiceView.f96656n = str;
            voiceView.f96657o = i19;
            voiceView.f96655m = i27;
            if (z18) {
                android.view.View view = voiceView.f96654i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = voiceView.f96654i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (voiceView.f96656n.equals(voiceView.f96658p.f400946e)) {
                double d17 = 0.0d;
                if (voiceView.f96658p.c()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.NoteVoiceView", "updateInfo .isPlay()");
                    rx1.g gVar = voiceView.f96659q;
                    com.tencent.mm.modelbase.c1 c1Var = voiceView.f96658p.f400945d;
                    if (c1Var == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.RecordVoiceHelper", "get now progress error, player is null");
                    } else {
                        d17 = ((sl.j) c1Var).a();
                    }
                    gVar.d(d17, i27, true);
                } else {
                    com.tencent.mm.modelbase.c1 c1Var2 = voiceView.f96658p.f400945d;
                    if (c1Var2 == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.RecordVoiceHelper", "check is pause, but player is null");
                        b17 = false;
                    } else {
                        b17 = ((sl.j) c1Var2).b();
                    }
                    if (b17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.NoteVoiceView", "updateInfo .isPause()");
                        rx1.g gVar2 = voiceView.f96659q;
                        com.tencent.mm.modelbase.c1 c1Var3 = voiceView.f96658p.f400945d;
                        if (c1Var3 == null) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.RecordVoiceHelper", "get now progress error, player is null");
                        } else {
                            d17 = ((sl.j) c1Var3).a();
                        }
                        gVar2.d(d17, i27, false);
                    } else {
                        voiceView.f96659q.b(i27);
                    }
                }
            } else {
                voiceView.f96659q.b(i27);
            }
        } else {
            linearLayout3.setBackgroundResource(com.tencent.mm.R.drawable.s_);
            linearLayout3.setPadding(26, 7, 0, 7);
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            android.widget.ImageView imageView = this.D;
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
            boolean booleanValue = this.G.f295349w.booleanValue();
            android.widget.TextView textView = this.F;
            android.widget.TextView textView2 = this.E;
            if (booleanValue) {
                this.H.sendEmptyMessage(4096);
                textView2.setText(com.tencent.mm.R.string.ce6);
                textView.setText(" " + ((java.lang.String) com.tencent.mm.plugin.component.editor.u1.m(com.tencent.mm.sdk.platformtools.x2.f193071a, this.G.f295343t)).toString());
            } else {
                textView2.setText(com.tencent.mm.R.string.f491224ce5);
                textView.setText(" " + ((java.lang.String) com.tencent.mm.plugin.component.editor.u1.m(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) com.tencent.mm.plugin.component.editor.u1.j(this.G.f295345v))).toString());
            }
        }
        super.j(aVar, i17, i18);
    }
}
