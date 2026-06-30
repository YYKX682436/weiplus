package cp4;

/* loaded from: classes10.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f220992d;

    public d(cp4.r rVar) {
        this.f220992d = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cp4.r rVar = this.f220992d;
        rVar.f221073x++;
        if (rVar.f221071v) {
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder = rVar.f221058f;
            if (!(editorPanelHolder.f156012h != null)) {
                if (!(rVar.D().F != null)) {
                    rVar.D().setVideoPauseListener(new cp4.h(rVar));
                    rVar.D().setVideoSeekListener(new cp4.i(rVar));
                    rVar.D().setStartTransListener(new cp4.j(rVar));
                    rVar.D().setClearTransListener(new cp4.k(rVar));
                    rVar.D().setDismissListener(new cp4.l(rVar));
                    rVar.D().setItemClickListener(new cp4.m(rVar));
                }
                com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder.k(editorPanelHolder, rVar.D(), null, 2, null);
                editorPanelHolder.setOnVisibleChangeCallback(new cp4.q(rVar));
            }
            editorPanelHolder.setShow(true);
        } else {
            rVar.f221071v = true;
            rVar.E(0);
            rVar.G(0);
            cp4.r.z(rVar, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorCaptionPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
