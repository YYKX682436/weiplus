package com.tencent.mm.plugin.recordvideo.ui.editor;

/* loaded from: classes5.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView f156095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f156096e;

    public a(com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView, android.content.Context context) {
        this.f156095d = editorAudioView;
        this.f156096e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView editorAudioView = this.f156095d;
        editorAudioView.setMuteOrigin(!editorAudioView.getMuteOrigin());
        com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView.a callback = editorAudioView.getCallback();
        if (callback != null) {
            callback.g(editorAudioView.getMuteOrigin());
        }
        boolean muteOrigin = editorAudioView.getMuteOrigin();
        android.content.Context context = this.f156096e;
        if (muteOrigin) {
            editorAudioView.f155977q.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.ui_rescoures_checkbox_unselected, -1));
            editorAudioView.i(editorAudioView.f155980t, com.tencent.mm.R.id.f482772nk, com.tencent.mm.R.string.f489949ge);
        } else {
            editorAudioView.f155977q.setImageDrawable(com.tencent.mm.ui.uk.e(context, editorAudioView.G, editorAudioView.H));
            editorAudioView.i(editorAudioView.f155980t, com.tencent.mm.R.id.f482772nk, com.tencent.mm.R.string.f489950gf);
        }
        editorAudioView.f155980t.setTag(com.tencent.mm.R.id.e7_, java.lang.Boolean.valueOf(!editorAudioView.getMuteOrigin()));
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorAudioView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
