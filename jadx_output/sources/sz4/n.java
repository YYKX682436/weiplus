package sz4;

/* loaded from: classes12.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz4.t f414209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f414210e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f414211f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iz4.c f414212g;

    public n(sz4.t tVar, int i17, int i18, iz4.c cVar) {
        this.f414209d = tVar;
        this.f414210e = i17;
        this.f414211f = i18;
        this.f414212g = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder$bindItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sz4.t tVar = this.f414209d;
        mz4.j0 j0Var = tVar.f414182d;
        if (j0Var.f333309q == 2) {
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) j0Var.f333300h;
            noteEditorUI.getClass();
            noteEditorUI.C7(false);
            tVar.f414182d.a();
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f414210e);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f414211f);
        iz4.c cVar = this.f414212g;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(((iz4.o) cVar).f296133q);
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.wenote.model.datamodel.WNNoteFavItemBase");
        iz4.o oVar = (iz4.o) cVar;
        com.tencent.mars.xlog.Log.i("NoteMediaGroupItemHolder", "click item, pos:%s offset:%s type:%d id:%s", valueOf, valueOf2, valueOf3, oVar.f296131o);
        com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent();
        am.zl zlVar = notifyWNNoteOperationEvent.f54554g;
        zlVar.f8579b = oVar.f296131o;
        zlVar.f8581d = view.getContext();
        notifyWNNoteOperationEvent.f54554g.f8578a = 1;
        ((hz4.f) hz4.f.wi()).f286407d.p(notifyWNNoteOperationEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteMediaGroupItemHolder$SubItemHolder$bindItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
