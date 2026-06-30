package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class u6 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.x6 f161599d;

    public u6(com.tencent.mm.plugin.setting.ui.setting.x6 x6Var) {
        this.f161599d = x6Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f161599d.f161729d.getString(com.tencent.mm.R.string.f490359sr));
    }
}
