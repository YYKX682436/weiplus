package sw3;

/* loaded from: classes9.dex */
public abstract class a extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f413459r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413460s;

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413460s = u0Var;
        return dispatch(sVar, this.f413459r, this);
    }
}
