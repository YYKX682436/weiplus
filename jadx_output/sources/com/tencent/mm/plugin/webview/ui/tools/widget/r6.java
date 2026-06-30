package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes7.dex */
public class r6 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.x6 f187526d;

    public r6(com.tencent.mm.plugin.webview.ui.tools.widget.x6 x6Var) {
        this.f187526d = x6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.base.AuthorizeItemListView authorizeItemListView = this.f187526d.f187603c;
        if (authorizeItemListView != null) {
            authorizeItemListView.setAdapter((android.widget.ListAdapter) null);
        }
    }
}
