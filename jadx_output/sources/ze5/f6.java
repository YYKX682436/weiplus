package ze5;

/* loaded from: classes9.dex */
public final class f6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f471922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z01.k f471924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ze5.g6 f471925g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(rd5.d dVar, yb5.d dVar2, z01.k kVar, ze5.g6 g6Var) {
        super(1);
        this.f471922d = dVar;
        this.f471923e = dVar2;
        this.f471924f = kVar;
        this.f471925g = g6Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ze5.m6 it = (ze5.m6) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView content = it.c().getContent();
        yb5.d dVar = this.f471923e;
        content.setTag(new com.tencent.mm.ui.chatting.viewitems.er(this.f471922d, dVar.D(), it, dVar.t()));
        ze5.g6 g6Var = this.f471925g;
        if (g6Var.f205275t == null) {
            g6Var.f205275t = new com.tencent.mm.ui.chatting.viewitems.sk(dVar);
        }
        com.tencent.mm.ui.chatting.viewitems.sk skVar = g6Var.f205275t;
        z01.k kVar = this.f471924f;
        kVar.f469083d = skVar;
        kVar.f469084e = g6Var.u(dVar);
        sb5.z zVar = (sb5.z) dVar.f460708c.a(sb5.z.class);
        kVar.f469085f = zVar != null ? ((com.tencent.mm.ui.chatting.adapter.k) zVar).B1 : null;
        it.c().setViewModel(kVar);
        return jz5.f0.f302826a;
    }
}
