package rx1;

/* loaded from: classes12.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.component.editor.widget.voiceview.EditorVoiceBaseView f400942d;

    public a(com.tencent.mm.plugin.component.editor.widget.voiceview.EditorVoiceBaseView editorVoiceBaseView) {
        this.f400942d = editorVoiceBaseView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[3];
        com.tencent.mm.plugin.component.editor.widget.voiceview.EditorVoiceBaseView editorVoiceBaseView = this.f400942d;
        objArr[0] = editorVoiceBaseView.f96648h;
        objArr[1] = rx1.d.b().c() ? "true" : "false";
        objArr[2] = rx1.d.b().f400946e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NoteEditorVoiceBaseView", "clicked path:%s, player isPlay:%s, path:%s", objArr);
        if (iq.b.C(editorVoiceBaseView.f96647g) || iq.b.v(editorVoiceBaseView.f96647g) || iq.b.e(editorVoiceBaseView.f96647g)) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (!fp.i.b() && !com.tencent.mm.sdk.platformtools.t8.K0(editorVoiceBaseView.f96648h)) {
            db5.t7.k(view.getContext(), null);
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (hx1.g.a().f285623a) {
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.String str = editorVoiceBaseView.f96648h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.equals(rx1.d.b().f400946e)) {
            com.tencent.mm.plugin.component.editor.widget.voiceview.EditorVoiceBaseView.e(editorVoiceBaseView);
        } else if (rx1.d.b().c()) {
            editorVoiceBaseView.g();
            rx1.d.b().e();
        } else {
            com.tencent.mm.plugin.component.editor.widget.voiceview.EditorVoiceBaseView.e(editorVoiceBaseView);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/voiceview/EditorVoiceBaseView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
