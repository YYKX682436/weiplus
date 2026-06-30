package ze5;

/* loaded from: classes9.dex */
public final class l6 implements com.tencent.mm.storage.a9 {

    /* renamed from: d, reason: collision with root package name */
    public final wd5.b f472070d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.msgquote.model.MsgQuoteItem f472071e;

    public l6(wd5.b quoteModel, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem quoteItem) {
        kotlin.jvm.internal.o.g(quoteModel, "quoteModel");
        kotlin.jvm.internal.o.g(quoteItem, "quoteItem");
        this.f472070d = quoteModel;
        this.f472071e = quoteItem;
    }

    @Override // com.tencent.mm.storage.a9
    public boolean U(java.lang.Object obj) {
        boolean z17;
        wd5.b bVar;
        wd5.b bVar2;
        ze5.l6 l6Var = (ze5.l6) obj;
        r15.i j17 = this.f472070d.j();
        if (j17 != null) {
            z17 = j17.compareContent((l6Var == null || (bVar2 = l6Var.f472070d) == null) ? null : bVar2.j());
        } else {
            z17 = ((l6Var == null || (bVar = l6Var.f472070d) == null) ? null : bVar.j()) == null;
        }
        return z17 && this.f472071e.a(l6Var != null ? l6Var.f472071e : null);
    }
}
