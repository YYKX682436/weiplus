package jm3;

/* loaded from: classes10.dex */
public final class x0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvPostUI f300363d;

    public x0(com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI) {
        this.f300363d = musicMvPostUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mv.ui.MusicMvPostUI activity = this.f300363d;
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.mv.ui.uic.x6) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.x6.class)).O6(activity.f150883e, true, 4);
        return true;
    }
}
