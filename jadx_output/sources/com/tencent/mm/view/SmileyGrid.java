package com.tencent.mm.view;

/* loaded from: classes5.dex */
public class SmileyGrid extends android.widget.GridView {

    /* renamed from: d, reason: collision with root package name */
    public final int f213461d;

    public SmileyGrid(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213461d = 20;
        int i17 = com.tencent.mm.pluginsdk.ui.ChatFooterPanel.f189765e;
    }

    public int getSmileyType() {
        return this.f213461d;
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.AbsListView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
    }

    public void setCallback(com.tencent.mm.pluginsdk.ui.chat.v9 v9Var) {
    }

    public void setOnTextOperationListener(com.tencent.mm.pluginsdk.ui.k0 k0Var) {
    }

    public void setScene(int i17) {
    }

    @Override // android.widget.AdapterView
    public void setAdapter(android.widget.ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
    }
}
