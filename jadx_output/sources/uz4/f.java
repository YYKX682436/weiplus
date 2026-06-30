package uz4;

/* loaded from: classes12.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView f432177d;

    public f(com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView noteVoiceView) {
        this.f432177d = noteVoiceView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (iq.b.C(view.getContext()) || iq.b.v(view.getContext()) || iq.b.e(view.getContext())) {
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        boolean b17 = fp.i.b();
        com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView noteVoiceView = this.f432177d;
        if (!b17 && !com.tencent.mm.sdk.platformtools.t8.K0(noteVoiceView.f188299n)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = noteVoiceView.f188299n;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(noteVoiceView.f188301p.f432166d)) {
            com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView.e(noteVoiceView);
        } else if (noteVoiceView.f188301p.f()) {
            noteVoiceView.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.NoteVoiceView", "pause play");
            uz4.d dVar = noteVoiceView.f188301p;
            dVar.getClass();
            com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
            boolean d17 = ((sl.j) dVar.e()).d(true);
            com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorVoiceHelper", "pause play, ret:%s", java.lang.Boolean.valueOf(d17));
            if (d17) {
                for (uz4.c cVar : dVar.f432174o) {
                    if (cVar != null) {
                        cVar.a();
                    }
                }
            }
            noteVoiceView.f();
        } else {
            noteVoiceView.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.NoteVoiceView", "resume play");
            uz4.d dVar2 = noteVoiceView.f188301p;
            dVar2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorVoiceHelper", "resume play");
            com.tencent.mm.sdk.platformtools.c3.a("keep_app_silent");
            boolean e17 = ((sl.j) dVar2.e()).e();
            if (e17) {
                for (uz4.c cVar2 : dVar2.f432174o) {
                    if (cVar2 != null) {
                        cVar2.b(dVar2.f432166d);
                    }
                }
            }
            uz4.g gVar = noteVoiceView.f188302q;
            gVar.f432178a = false;
            gVar.sendEmptyMessage(4096);
            com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView noteVoiceView2 = gVar.f432183f;
            noteVoiceView2.f188294f.setImageResource(com.tencent.mm.R.raw.voicepost_pauseicon);
            noteVoiceView2.f188294f.setContentDescription(noteVoiceView2.getContext().getResources().getString(com.tencent.mm.R.string.f490511x5));
            noteVoiceView.f188293e.setKeepScreenOn(true);
            if (!e17) {
                com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteVoiceView.e(noteVoiceView);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
