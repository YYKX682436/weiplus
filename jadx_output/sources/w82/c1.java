package w82;

/* loaded from: classes11.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel f443831d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f443832e;

    public c1(com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel, kotlin.jvm.internal.c0 c0Var) {
        this.f443831d = favTopTagPanel;
        this.f443832e = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel = this.f443831d;
        w82.q0 q0Var = favTopTagPanel.Q;
        if (q0Var != null) {
            ((com.tencent.mm.plugin.fav.ui.r7) q0Var).a(favTopTagPanel.getHeight(), this.f443832e.f310112d);
        }
    }
}
