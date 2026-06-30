package sz4;

/* loaded from: classes12.dex */
public class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sz4.u f414248d;

    public y(sz4.u uVar) {
        this.f414248d = uVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sz4.u uVar = this.f414248d;
        mz4.j0 j0Var = uVar.f414182d;
        if (j0Var.f333309q == 2) {
            com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) j0Var.f333300h;
            noteEditorUI.getClass();
            noteEditorUI.C7(false);
            uVar.f414182d.a();
        }
        int adapterPosition = ((androidx.recyclerview.widget.k3) view.getTag()).getAdapterPosition();
        com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent notifyWNNoteOperationEvent = new com.tencent.mm.autogen.events.NotifyWNNoteOperationEvent();
        mz4.d dVar = uVar.f414183e;
        if (dVar.l(adapterPosition) == null) {
            com.tencent.mars.xlog.Log.e("Micromsg.NoteOtherItemHolder", "click not response, null == NoteDataManager.getMgr().get(position),position is %d,datalist size = %d", java.lang.Integer.valueOf(adapterPosition), java.lang.Integer.valueOf(dVar.D()));
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (((hz4.f) hz4.f.wi()).f286407d == null) {
            com.tencent.mars.xlog.Log.e("Micromsg.NoteOtherItemHolder", "getWnNoteBase is null");
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("Micromsg.NoteOtherItemHolder", "click item, type is %d", java.lang.Integer.valueOf(dVar.l(adapterPosition).d()));
        notifyWNNoteOperationEvent.f54554g.f8579b = ((iz4.o) dVar.l(adapterPosition)).f296131o;
        notifyWNNoteOperationEvent.f54554g.f8581d = view.getContext();
        notifyWNNoteOperationEvent.f54554g.f8578a = 1;
        ((hz4.f) hz4.f.wi()).f286407d.p(notifyWNNoteOperationEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteOtherItemHolder$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
