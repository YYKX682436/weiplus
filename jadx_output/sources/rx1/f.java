package rx1;

/* loaded from: classes12.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView f400956d;

    public f(com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView voiceView) {
        this.f400956d = voiceView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        boolean e17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (iq.b.C(view.getContext()) || iq.b.v(view.getContext()) || iq.b.e(view.getContext())) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean b17 = fp.i.b();
        com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView voiceView = this.f400956d;
        if (!b17 && !com.tencent.mm.sdk.platformtools.t8.K0(voiceView.f96656n)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = voiceView.f96656n;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(voiceView.f96658p.f400946e)) {
            com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView.e(voiceView);
        } else if (voiceView.f96658p.c()) {
            voiceView.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.NoteVoiceView", "pause play");
            rx1.d dVar = voiceView.f96658p;
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordVoiceHelper", "pause play");
            com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
            com.tencent.mm.modelbase.c1 c1Var = dVar.f400945d;
            if (c1Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RecordVoiceHelper", "pause play error, player is null");
            } else if (((sl.j) c1Var).d(true)) {
                for (rx1.c cVar : dVar.f400954p) {
                    if (cVar != null) {
                        cVar.a();
                    }
                }
            }
            rx1.g gVar = voiceView.f96659q;
            gVar.f400957a = true;
            gVar.removeMessages(4096);
            com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView voiceView2 = gVar.f400962f;
            voiceView2.f96651f.setImageResource(com.tencent.mm.R.raw.voicepost_beginicon);
            voiceView2.f96651f.setContentDescription(voiceView2.getContext().getResources().getString(com.tencent.mm.R.string.f490519xf));
            voiceView.f96650e.setKeepScreenOn(false);
        } else {
            voiceView.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.NoteVoiceView", "resume play");
            rx1.d dVar2 = voiceView.f96658p;
            dVar2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordVoiceHelper", "resume play");
            com.tencent.mm.sdk.platformtools.c3.a("keep_app_silent");
            com.tencent.mm.modelbase.c1 c1Var2 = dVar2.f400945d;
            if (c1Var2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.RecordVoiceHelper", "resum play error, player is null");
                e17 = false;
            } else {
                e17 = ((sl.j) c1Var2).e();
                if (e17) {
                    for (rx1.c cVar2 : dVar2.f400954p) {
                        if (cVar2 != null) {
                            cVar2.b(dVar2.f400946e);
                        }
                    }
                }
            }
            rx1.g gVar2 = voiceView.f96659q;
            gVar2.f400957a = false;
            gVar2.sendEmptyMessage(4096);
            com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView voiceView3 = gVar2.f400962f;
            voiceView3.f96651f.setImageResource(com.tencent.mm.R.raw.voicepost_pauseicon);
            voiceView3.f96651f.setContentDescription(voiceView3.getContext().getResources().getString(com.tencent.mm.R.string.f490511x5));
            voiceView.f96650e.setKeepScreenOn(true);
            if (!e17) {
                com.tencent.mm.plugin.component.editor.widget.voiceview.VoiceView.e(voiceView);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
