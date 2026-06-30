package we5;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we5.v f445383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f445385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445386g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(we5.v vVar, yb5.d dVar, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f445383d = vVar;
        this.f445384e = dVar;
        this.f445385f = h0Var;
        this.f445386g = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f445383d.m(it, this.f445384e, (java.lang.String) this.f445385f.f310123d, this.f445386g);
        return jz5.f0.f302826a;
    }
}
