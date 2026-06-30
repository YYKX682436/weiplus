package nz4;

/* loaded from: classes12.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f341626d;

    public k(nz4.y yVar) {
        this.f341626d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("NoteSelectManager", "copy");
        boolean z17 = nz4.y.M;
        nz4.y yVar = this.f341626d;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("NoteSelectManager", "copy: not init");
            yVar.p();
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (nz4.y.a(yVar)) {
            lz4.a aVar = yVar.f341664v;
            if (aVar != null) {
                ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) aVar).w7();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        yVar.p();
        int m17 = yVar.m();
        if (m17 == 2) {
            android.text.SpannableStringBuilder f17 = yVar.f(false, null, "");
            if (com.tencent.mm.sdk.platformtools.t8.J0(f17)) {
                com.tencent.mars.xlog.Log.e("NoteSelectManager", "copy: selectedSpan is null or empty");
                yVar.s();
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                iz4.i iVar = new iz4.i();
                iVar.f296155t = kz4.c.b(f17);
                iVar.f296105c = -1;
                iVar.f296104b = false;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(iVar);
                mz4.u.e(com.tencent.mm.sdk.platformtools.x2.f193071a, arrayList2);
            }
        } else if (m17 == 3) {
            java.util.ArrayList e17 = yVar.e(false, null, "");
            if (e17 == null || e17.size() <= 0) {
                com.tencent.mars.xlog.Log.e("NoteSelectManager", "copy: dataList is null or empty");
                yVar.s();
            } else {
                com.tencent.mars.xlog.Log.i("NoteSelectManager", "copy: dataList len=%s", java.lang.Integer.valueOf(e17.size()));
                mz4.u.e(com.tencent.mm.sdk.platformtools.x2.f193071a, e17);
            }
        } else {
            com.tencent.mars.xlog.Log.e("NoteSelectManager", "copy: not in select");
            yVar.s();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
