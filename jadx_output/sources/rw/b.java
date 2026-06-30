package rw;

/* loaded from: classes7.dex */
public final class b implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.brandecs.timeline.ui.EcsTLTestUI f400569d;

    public b(com.tencent.mm.feature.brandecs.timeline.ui.EcsTLTestUI ecsTLTestUI) {
        this.f400569d = ecsTLTestUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f400569d.finish();
        return true;
    }
}
