package w35;

/* loaded from: classes8.dex */
public final class e implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.n0 f442730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f442731b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w35.g f442732c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.w f442733d;

    public e(com.tencent.mm.pluginsdk.model.n0 n0Var, android.content.Context context, w35.g gVar, com.tencent.mm.pluginsdk.ui.otherway.w wVar) {
        this.f442730a = n0Var;
        this.f442731b = context;
        this.f442732c = gVar;
        this.f442733d = wVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mm.pluginsdk.model.k0 k0Var;
        if (z17) {
            this.f442730a.a(this.f442731b);
            w35.g gVar = this.f442732c;
            w35.a aVar = gVar.f442724b;
            if (aVar != null) {
                ((com.tencent.mm.pluginsdk.ui.otherway.v) aVar).j();
            }
            com.tencent.mm.pluginsdk.ui.otherway.i0 i0Var = com.tencent.mm.pluginsdk.ui.otherway.i0.f190963a;
            com.tencent.mm.pluginsdk.ui.otherway.w wVar = this.f442733d;
            i0Var.a(wVar.b(), gVar.f442725c);
            com.tencent.mm.pluginsdk.model.p3 p3Var = gVar.f442723a.f189319l;
            if (p3Var == null || (k0Var = p3Var.f189406c) == null) {
                return;
            }
            ((kb0.f) k0Var).a(false, wVar);
        }
    }
}
