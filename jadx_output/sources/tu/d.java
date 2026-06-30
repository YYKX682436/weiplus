package tu;

/* loaded from: classes3.dex */
public final class d implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f422058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f422059e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.appmsg.ui.RecordDetailUI f422060f;

    public d(com.tencent.mm.storage.f9 f9Var, boolean z17, com.tencent.mm.feature.appmsg.ui.RecordDetailUI recordDetailUI) {
        this.f422058d = f9Var;
        this.f422059e = z17;
        this.f422060f = recordDetailUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.storage.f9 f9Var = this.f422058d;
        if (c01.ia.e(f9Var)) {
            return;
        }
        boolean z17 = this.f422059e;
        com.tencent.mm.feature.appmsg.ui.RecordDetailUI recordDetailUI = this.f422060f;
        if (z17 && !c01.ia.C(f9Var)) {
            g4Var.f(1, recordDetailUI.getString(com.tencent.mm.R.string.lag));
        }
        if (z17 && recordDetailUI.getIntent().getIntExtra("from_scene", 0) == 0) {
            g4Var.f(2, recordDetailUI.getString(com.tencent.mm.R.string.hjg));
        }
    }
}
