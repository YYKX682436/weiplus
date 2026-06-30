package f12;

/* loaded from: classes5.dex */
public final class c implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringCardActivity f258571d;

    public c(com.tencent.mm.plugin.eggspring.ui.SpringCardActivity springCardActivity) {
        this.f258571d = springCardActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f258571d.finish();
        return true;
    }
}
