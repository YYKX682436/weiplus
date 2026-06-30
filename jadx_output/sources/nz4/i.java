package nz4;

/* loaded from: classes12.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f341624d;

    public i(nz4.y yVar) {
        this.f341624d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("NoteSelectManager", "delete");
        boolean z17 = nz4.y.M;
        nz4.y yVar = this.f341624d;
        if (!z17 || !yVar.f341643a) {
            com.tencent.mars.xlog.Log.e("NoteSelectManager", "delete: not init or not editable");
            yVar.p();
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            if (nz4.y.a(yVar)) {
                lz4.a aVar = yVar.f341664v;
                if (aVar != null) {
                    ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar).w7();
                }
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            lz4.a aVar2 = yVar.f341664v;
            if (aVar2 != null) {
                com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI noteEditorUI = (com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar2;
                db5.e1.A(noteEditorUI, noteEditorUI.getString(com.tencent.mm.R.string.h_p), "", noteEditorUI.getString(com.tencent.mm.R.string.h_o), noteEditorUI.getString(com.tencent.mm.R.string.h_n), new com.tencent.mm.plugin.wenote.ui.nativenote.p0(noteEditorUI), null);
            } else {
                yVar.d();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
