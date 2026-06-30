package com.tencent.mm.plugin.finder.view;

/* loaded from: classes5.dex */
public final class i9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView f132296d;

    public i9(com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView finderExtendReadingEditView, java.lang.String str) {
        this.f132296d = finderExtendReadingEditView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$refreshTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.FinderExtendReadingEditView finderExtendReadingEditView = this.f132296d;
        finderExtendReadingEditView.f131041i.setText("");
        finderExtendReadingEditView.f131042m.setVisibility(8);
        finderExtendReadingEditView.f131044o.setVisibility(0);
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderExtendReadingEditView.f131041i;
        mMEditText.setSelection(mMEditText.getText().length());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderExtendReadingEditView$refreshTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
