package tu;

/* loaded from: classes3.dex */
public final class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.appmsg.ui.RecordDetailUI f422066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f422067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f422068f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu.f f422069g;

    public g(com.tencent.mm.feature.appmsg.ui.RecordDetailUI recordDetailUI, com.tencent.mm.storage.f9 f9Var, boolean z17, hu.f fVar) {
        this.f422066d = recordDetailUI;
        this.f422067e = f9Var;
        this.f422068f = z17;
        this.f422069g = fVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.feature.appmsg.ui.RecordDetailUI recordDetailUI = this.f422066d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) recordDetailUI.getContext(), 1, false);
        boolean z17 = this.f422068f;
        com.tencent.mm.storage.f9 f9Var = this.f422067e;
        k0Var.f211872n = new tu.d(f9Var, z17, recordDetailUI);
        k0Var.f211881s = new tu.f(recordDetailUI, f9Var, this.f422069g);
        k0Var.v();
        return true;
    }
}
