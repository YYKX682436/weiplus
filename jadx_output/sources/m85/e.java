package m85;

/* loaded from: classes10.dex */
public final class e implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.SnsWithTaUI f324831d;

    public e(com.tencent.mm.sns_compose.SnsWithTaUI snsWithTaUI) {
        this.f324831d = snsWithTaUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f324831d.onBackPressed();
        return true;
    }
}
