package kr;

/* loaded from: classes15.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.panel.SmileyPanelView f311292d;

    public d(com.tencent.mm.emoji.panel.SmileyPanelView smileyPanelView) {
        this.f311292d = smileyPanelView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/SmileyPanelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.k0 textOperationListener = this.f311292d.getTextOperationListener();
        if (textOperationListener != null) {
            textOperationListener.b();
        }
        yj0.a.h(this, "com/tencent/mm/emoji/panel/SmileyPanelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
