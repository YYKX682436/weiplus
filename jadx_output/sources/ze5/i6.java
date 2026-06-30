package ze5;

/* loaded from: classes9.dex */
public final class i6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f471998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471999e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.k f472000f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ze5.k6 f472001g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(rd5.d dVar, yb5.d dVar2, z01.k kVar, ze5.k6 k6Var) {
        super(1);
        this.f471998d = dVar;
        this.f471999e = dVar2;
        this.f472000f = kVar;
        this.f472001g = k6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.m6 it = (ze5.m6) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView content = it.c().getContent();
        yb5.d dVar = this.f471999e;
        content.setTag(new com.tencent.mm.ui.chatting.viewitems.er(this.f471998d, dVar.D(), it, dVar.t()));
        ze5.k6 k6Var = this.f472001g;
        if (k6Var.f205377t == null) {
            k6Var.f205377t = new com.tencent.mm.ui.chatting.viewitems.sk(dVar);
        }
        com.tencent.mm.ui.chatting.viewitems.sk skVar = k6Var.f205377t;
        z01.k kVar = this.f472000f;
        kVar.f469083d = skVar;
        kVar.f469084e = k6Var.u(dVar);
        sb5.z zVar = (sb5.z) dVar.f460708c.a(sb5.z.class);
        kVar.f469085f = zVar != null ? ((com.tencent.mm.ui.chatting.adapter.k) zVar).B1 : null;
        it.c().setViewModel(kVar);
        return jz5.f0.f302826a;
    }
}
