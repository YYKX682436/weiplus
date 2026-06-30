package uc4;

/* loaded from: classes4.dex */
public final class r implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.e86 f426447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc4.v f426448e;

    public r(r45.e86 e86Var, uc4.v vVar) {
        this.f426447d = e86Var;
        this.f426448e = vVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuListener$1");
        r45.e86 e86Var = this.f426447d;
        boolean i17 = com.tencent.mm.plugin.sns.ui.widget.t2.i(e86Var.f373139t, 64);
        uc4.v vVar = this.f426448e;
        if (!i17 && !com.tencent.mm.plugin.sns.ui.widget.t2.i(e86Var.f373139t, 16)) {
            contextMenu.add(0, 0, 0, vVar.b().getString(com.tencent.mm.R.string.f490359sr));
        }
        contextMenu.add(1, 1, 0, vVar.b().getString(com.tencent.mm.R.string.f490367t0));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateContextMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuListener$1");
    }
}
