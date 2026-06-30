package we5;

/* loaded from: classes9.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we5.n0 f445305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f445307f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f445308g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f445309h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(we5.n0 n0Var, com.tencent.mm.storage.f9 f9Var, boolean z17, boolean z18, boolean z19) {
        super(1);
        this.f445305d = n0Var;
        this.f445306e = f9Var;
        this.f445307f = z17;
        this.f445308g = z18;
        this.f445309h = z19;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f445305d.e0(it, this.f445306e, this.f445307f, this.f445308g, this.f445309h);
        return jz5.f0.f302826a;
    }
}
