package fk1;

/* loaded from: classes8.dex */
public final class p implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263286d;

    public p(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI) {
        this.f263286d = wAGameRecordShareUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f263286d.finish();
        return true;
    }
}
