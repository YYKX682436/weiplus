package yh4;

/* loaded from: classes.dex */
public final class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.test.ExMainSettings f462417d;

    public g(com.tencent.mm.plugin.test.ExMainSettings exMainSettings) {
        this.f462417d = exMainSettings;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f462417d.finish();
        return false;
    }
}
