package yw3;

/* loaded from: classes.dex */
public final class g0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerConversationDemoUI f466746d;

    public g0(com.tencent.mm.plugin.repairer.ui.demo.RepairerConversationDemoUI repairerConversationDemoUI) {
        this.f466746d = repairerConversationDemoUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f466746d.finish();
        return true;
    }
}
