package vw3;

/* loaded from: classes.dex */
public final class x3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI f441179d;

    public x3(com.tencent.mm.plugin.repairer.ui.RepairerNewXmlUI repairerNewXmlUI) {
        this.f441179d = repairerNewXmlUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f441179d.finish();
        return false;
    }
}
