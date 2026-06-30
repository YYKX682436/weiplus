package uz4;

/* loaded from: classes12.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView f432164d;

    public a(com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView noteEditorVoiceBaseView) {
        this.f432164d = noteEditorVoiceBaseView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteEditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView noteEditorVoiceBaseView = this.f432164d;
        objArr[0] = noteEditorVoiceBaseView.f188289h;
        objArr[1] = noteEditorVoiceBaseView.f188291m.f() ? "true" : "false";
        objArr[2] = noteEditorVoiceBaseView.f188291m.f432166d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorVoiceBaseView", "clicked path:%s, player isPlay:%s, path:%s", objArr);
        if (iq.b.C(noteEditorVoiceBaseView.f188288g) || iq.b.v(noteEditorVoiceBaseView.f188288g) || iq.b.e(noteEditorVoiceBaseView.f188288g)) {
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteEditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!fp.i.b() && !com.tencent.mm.sdk.platformtools.t8.K0(noteEditorVoiceBaseView.f188289h)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteEditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (hz4.b0.a().f286382a) {
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteEditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = noteEditorVoiceBaseView.f188289h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(noteEditorVoiceBaseView.f188291m.f432166d)) {
            com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView.e(noteEditorVoiceBaseView);
        } else if (noteEditorVoiceBaseView.f188291m.f()) {
            noteEditorVoiceBaseView.g();
            noteEditorVoiceBaseView.f188291m.h();
        } else {
            com.tencent.mm.plugin.wenote.ui.nativenote.voiceview.NoteEditorVoiceBaseView.e(noteEditorVoiceBaseView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteEditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
