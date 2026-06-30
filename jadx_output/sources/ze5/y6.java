package ze5;

/* loaded from: classes9.dex */
public final class y6 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f472318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f472319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f472320c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ze5.i7 f472323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v05.b f472324g;

    public y6(com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean z17, android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, ze5.i7 i7Var, v05.b bVar) {
        this.f472318a = u3Var;
        this.f472319b = z17;
        this.f472320c = view;
        this.f472321d = dVar;
        this.f472322e = f9Var;
        this.f472323f = i7Var;
        this.f472324g = bVar;
    }

    @Override // q80.f0
    public void fail() {
        boolean z17 = this.f472319b;
        yb5.d dVar = this.f472321d;
        if (z17) {
            ot0.q qVar = new ot0.q();
            v05.b bVar = this.f472324g;
            qVar.f348674k = bVar.getString(bVar.f368365d + 9);
            com.tencent.mm.ui.chatting.viewitems.c2.h0(qVar, this.f472320c, dVar, this.f472322e, new com.tencent.mm.ui.chatting.viewitems.qq(this.f472323f));
        } else {
            db5.t7.makeText(dVar.g(), com.tencent.mm.R.string.ggb, 0).show();
        }
        this.f472318a.cancel();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1293L, 32L, 1L);
        this.f472318a.cancel();
    }
}
