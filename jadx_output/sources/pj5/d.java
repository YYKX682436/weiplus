package pj5;

/* loaded from: classes10.dex */
public final class d implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI f355370d;

    public d(com.tencent.mm.ui.schedulemsg.ScheduleMsgDetailUI scheduleMsgDetailUI) {
        this.f355370d = scheduleMsgDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f355370d.finish();
        return true;
    }
}
