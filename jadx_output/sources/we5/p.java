package we5;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we5.v f445372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445373e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445374f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rd5.d f445375g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(we5.v vVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, rd5.d dVar2) {
        super(1);
        this.f445372d = vVar;
        this.f445373e = dVar;
        this.f445374f = f9Var;
        this.f445375g = dVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        we5.v vVar = this.f445372d;
        yb5.d dVar = this.f445373e;
        vVar.f204055s = dVar;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = it.f203379b;
        com.tencent.mm.storage.f9 f9Var = this.f445374f;
        mMNeat7extView.setTag(com.tencent.mm.R.id.bon, java.lang.Long.valueOf(f9Var.getMsgId()));
        it.f203379b.setTag(com.tencent.mm.R.id.rfh, f9Var.Q0());
        it.f203379b.setTag(com.tencent.mm.R.id.bom, java.lang.Boolean.TRUE);
        boolean D = dVar.D();
        rd5.d dVar2 = this.f445375g;
        it.f203379b.setTag(new com.tencent.mm.ui.chatting.viewitems.go(dVar2, D, it, null));
        if (com.tencent.mm.storage.z3.L4(dVar2.f394254d.f445300b.Q0())) {
            it.f203379b.setMaxWidth((int) (com.tencent.mm.ui.bk.o(0.88f) / j65.f.f297943g));
        } else {
            it.f203379b.setMaxWidth((int) (r6.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480241sa) / j65.f.f297943g));
        }
        return jz5.f0.f302826a;
    }
}
