package qb2;

/* loaded from: classes10.dex */
public final class j0 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f361225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.AdapterView.AdapterContextMenuInfo f361226e;

    public j0(boolean z17, android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo) {
        this.f361225d = z17;
        this.f361226e = adapterContextMenuInfo;
    }

    @Override // c01.da
    public boolean a() {
        return false;
    }

    @Override // c01.da
    public void c() {
        com.tencent.mars.xlog.Log.i("Finder.ConversationOnLongClickListener", "longclick delete msg finish");
        com.tencent.mars.xlog.Log.i("Finder.ConversationOnLongClickListener", "[CONTEXT_MENU_LONG_CLICK_DELETE] ret" + this.f361225d + " position=" + this.f361226e.position);
        com.tencent.mm.plugin.finder.report.p pVar = com.tencent.mm.plugin.finder.report.p.f125222a;
        com.tencent.mm.plugin.finder.report.a6 a6Var = com.tencent.mm.plugin.finder.report.p.f125223b;
        a6Var.f124955g = a6Var.f124955g + 1;
    }
}
