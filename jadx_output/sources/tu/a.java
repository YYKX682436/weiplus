package tu;

/* loaded from: classes3.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.appmsg.ui.RecordDetailUI f422052d;

    public a(com.tencent.mm.feature.appmsg.ui.RecordDetailUI recordDetailUI) {
        this.f422052d = recordDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f422052d.finish();
        return true;
    }
}
