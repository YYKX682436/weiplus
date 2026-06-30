package gc0;

/* loaded from: classes5.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f270354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f270355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270356g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270357h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270358i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270359m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f270360n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270361o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ uc0.u f270362p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270363q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(gc0.p2 p2Var, gc0.b0 b0Var, com.tencent.mm.ui.base.FlowLayout flowLayout, yz5.a aVar, yz5.a aVar2, yz5.a aVar3, yz5.a aVar4, com.tencent.mm.ui.base.FlowLayout flowLayout2, yz5.l lVar, uc0.u uVar, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270353d = p2Var;
        this.f270354e = b0Var;
        this.f270355f = flowLayout;
        this.f270356g = aVar;
        this.f270357h = aVar2;
        this.f270358i = aVar3;
        this.f270359m = aVar4;
        this.f270360n = flowLayout2;
        this.f270361o = lVar;
        this.f270362p = uVar;
        this.f270363q = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.x1(this.f270353d, this.f270354e, this.f270355f, this.f270356g, this.f270357h, this.f270358i, this.f270359m, this.f270360n, this.f270361o, this.f270362p, this.f270363q, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gc0.x1 x1Var = (gc0.x1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        x1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        yz5.l lVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f270353d.W6(this.f270354e, this.f270355f, this.f270356g, null, this.f270357h);
        this.f270353d.U6(this.f270354e, this.f270358i, this.f270359m, this.f270360n, this.f270361o);
        uc0.u uVar = this.f270362p;
        r45.kl5 kl5Var = uVar.f426280c;
        if ((kl5Var != null ? kl5Var.getLong(4) : 0L) != 0 && (lVar = this.f270363q) != null) {
            lVar.invoke(uVar.f426280c);
        }
        return jz5.f0.f302826a;
    }
}
