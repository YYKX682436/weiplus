package com.tencent.mm.plugin.recordvideo.ui.editor;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView f156121d;

    public b(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView) {
        this.f156121d = editorAudioView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = this.f156121d;
        editorAudioView.K.z(null);
        editorAudioView.j(true);
        editorAudioView.setShowAudioPanel(false);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a callback = editorAudioView.getCallback();
        if (callback != null) {
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
            audioCacheInfo.f155718o = 2;
            callback.m(audioCacheInfo);
        }
        wt3.u uVar = wt3.v.f449504h;
        wt3.v vVar = wt3.v.f449505i;
        if (vVar != null) {
            r45.lh4 lh4Var = new r45.lh4();
            lh4Var.f379481e = 14;
            lh4Var.f379483g = (int) com.tencent.mm.sdk.platformtools.t8.i1();
            vVar.f449513g.add(lh4Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioReporter", "record enter search " + wt3.w.a(lh4Var));
        }
        nu3.i iVar = nu3.i.f340218a;
        nu3.i.f340221d.f60887v = 1L;
        nu3.i.f340224g.f60957q = 1L;
        iVar.d(17);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
