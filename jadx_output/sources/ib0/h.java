package ib0;

/* loaded from: classes3.dex */
public final class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.ui.OpenMsgUI f290035d;

    public h(com.tencent.mm.feature.openmsg.ui.OpenMsgUI openMsgUI) {
        this.f290035d = openMsgUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f290035d.finish();
        return true;
    }
}
