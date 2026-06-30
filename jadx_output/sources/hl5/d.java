package hl5;

/* loaded from: classes15.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl5.f f282121d;

    public d(hl5.f fVar) {
        this.f282121d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/cedit/menu/OperateWindow$MyRecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view != null || (view.getTag() instanceof nl5.z)) {
            nl5.z zVar = (nl5.z) view.getTag();
            hl5.f fVar = this.f282121d;
            int selectionStart = fVar.f282125f.f282134i.getSelectionStart();
            int selectionEnd = fVar.f282125f.f282134i.getSelectionEnd();
            fVar.f282124e.a(view, zVar, fVar.f282125f.f282134i.getText().subSequence(java.lang.Math.min(selectionStart, selectionEnd), java.lang.Math.max(selectionStart, selectionEnd)).toString());
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/cedit/menu/OperateWindow$MyRecycleViewAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
