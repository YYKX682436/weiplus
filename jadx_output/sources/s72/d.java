package s72;

/* loaded from: classes11.dex */
public final class d extends com.tencent.mm.modelbase.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f404014d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.network.l0 f404015e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f404016f;

    public d(com.tencent.mm.modelbase.o rr6, com.tencent.mm.network.l0 back) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        kotlin.jvm.internal.o.g(back, "back");
        this.f404014d = rr6;
        this.f404015e = back;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f404016f = u0Var;
        return dispatch(sVar, this.f404014d, new s72.c(this));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 400;
    }
}
