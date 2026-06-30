package ox1;

/* loaded from: classes12.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f349601d;

    public h(ox1.s sVar) {
        this.f349601d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.Editor.EditorSelectManager", "copy");
        boolean z17 = ox1.s.K;
        ox1.s sVar = this.f349601d;
        if (!z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "copy: not init");
            sVar.p();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (ox1.s.a(sVar)) {
            mx1.a aVar = sVar.f349636v;
            if (aVar != null) {
                ((com.tencent.mm.plugin.component.editor.EditorUI) aVar).h7();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        sVar.p();
        int m17 = sVar.m();
        if (m17 == 2) {
            android.text.SpannableStringBuilder f17 = sVar.f(false, null, "");
            if (com.tencent.mm.sdk.platformtools.t8.J0(f17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "copy: selectedSpan is null or empty");
                sVar.r();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                ix1.l lVar = new ix1.l();
                lVar.f295338s = lx1.c.a(f17);
                lVar.f295313c = -1;
                lVar.f295312b = false;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(lVar);
                nx1.b.e(com.tencent.mm.sdk.platformtools.x2.f193071a, arrayList2);
            }
        } else if (m17 == 3) {
            java.util.ArrayList e17 = sVar.e(false, null, "");
            if (e17 == null || e17.size() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "copy: dataList is null or empty");
                sVar.r();
            } else {
                nx1.b.e(com.tencent.mm.sdk.platformtools.x2.f193071a, e17);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Editor.EditorSelectManager", "copy: not in select");
            sVar.r();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
