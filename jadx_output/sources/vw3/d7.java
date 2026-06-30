package vw3;

/* loaded from: classes.dex */
public final class d7 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerWebSearchTemplateUI f440933d;

    public d7(com.tencent.mm.plugin.repairer.ui.RepairerWebSearchTemplateUI repairerWebSearchTemplateUI) {
        this.f440933d = repairerWebSearchTemplateUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f440933d.finish();
        return false;
    }
}
