package we5;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we5.v f445379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445381f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f445382g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(we5.v vVar, yb5.d dVar, com.tencent.mm.storage.f9 f9Var, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f445379d = vVar;
        this.f445380e = dVar;
        this.f445381f = f9Var;
        this.f445382g = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String str = (java.lang.String) this.f445382g.f310123d;
        this.f445379d.n(it, this.f445380e, this.f445381f, str);
        return jz5.f0.f302826a;
    }
}
