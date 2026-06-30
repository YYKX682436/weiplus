package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class h1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.k1 f168474d;

    public h1(com.tencent.mm.plugin.sns.ui.k1 k1Var) {
        this.f168474d = k1Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener$1");
        com.tencent.mm.plugin.sns.ui.k1 k1Var = this.f168474d;
        if (com.tencent.mm.plugin.sns.ui.k1.a(k1Var) != null && !com.tencent.mm.plugin.sns.ui.widget.t2.i(com.tencent.mm.plugin.sns.ui.k1.a(k1Var).f373139t, 64) && !com.tencent.mm.plugin.sns.ui.widget.t2.i(com.tencent.mm.plugin.sns.ui.k1.a(k1Var).f373139t, 16)) {
            contextMenu.add(0, 0, 0, com.tencent.mm.plugin.sns.ui.l1.a(k1Var.f169606h).getString(com.tencent.mm.R.string.f490359sr));
        }
        contextMenu.add(1, 1, 0, com.tencent.mm.plugin.sns.ui.l1.a(k1Var.f169606h).getString(com.tencent.mm.R.string.f490367t0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.BaseTimeLine$CommentClickListener$1");
    }
}
