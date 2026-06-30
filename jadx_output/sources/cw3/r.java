package cw3;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.view.FontSelectorView f224191d;

    public r(com.tencent.mm.plugin.recordvideo.ui.editor.view.FontSelectorView fontSelectorView) {
        this.f224191d = fontSelectorView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/view/FontSelectorView$initFontSelectView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) tag).intValue();
        int i17 = com.tencent.mm.plugin.recordvideo.ui.editor.view.FontSelectorView.f156436g;
        com.tencent.mm.plugin.recordvideo.ui.editor.view.FontSelectorView fontSelectorView = this.f224191d;
        fontSelectorView.a(intValue);
        yz5.l lVar = fontSelectorView.fontSelectCallback;
        if (lVar != null) {
            lVar.invoke(ou3.q.f348970c.e() + ((org.json.JSONObject) fontSelectorView.f156438e.get(intValue)).optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/view/FontSelectorView$initFontSelectView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
