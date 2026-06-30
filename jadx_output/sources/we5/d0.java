package we5;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f445324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.storage.f9 f9Var, rd5.d dVar, yb5.d dVar2) {
        super(1);
        this.f445323d = f9Var;
        this.f445324e = dVar;
        this.f445325f = dVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = it.f203379b;
        com.tencent.mm.storage.f9 f9Var = this.f445323d;
        mMNeat7extView.setTag(com.tencent.mm.R.id.bon, java.lang.Long.valueOf(f9Var.getMsgId()));
        it.f203379b.setTag(com.tencent.mm.R.id.rfh, f9Var.Q0());
        it.f203379b.setTag(com.tencent.mm.R.id.bom, java.lang.Boolean.TRUE);
        it.f203379b.setMaxLines(Integer.MAX_VALUE);
        yb5.d dVar = this.f445325f;
        boolean D = dVar.D();
        rd5.d dVar2 = this.f445324e;
        it.f203379b.setTag(new com.tencent.mm.ui.chatting.viewitems.go(dVar2, D, it, null));
        if (!com.tencent.mm.storage.z3.L4(dVar2.f394254d.f445300b.Q0()) || dVar.E()) {
            it.f203379b.setMaxWidth((int) (r6.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480241sa) / j65.f.f297943g));
        } else {
            it.f203379b.setMaxWidth((int) (com.tencent.mm.ui.bk.o(0.88f) / j65.f.f297943g));
        }
        return jz5.f0.f302826a;
    }
}
