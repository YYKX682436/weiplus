package j00;

/* loaded from: classes9.dex */
public final class a1 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296701d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f296702e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f296703f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f296704g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f296705h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f296706i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.q f296707m;

    public a1(java.lang.String str, com.tencent.mm.ui.widget.dialog.u3 u3Var, yz5.a aVar, j00.k1 k1Var, java.lang.String str2, java.util.Map map, yz5.q qVar) {
        this.f296701d = str;
        this.f296702e = u3Var;
        this.f296703f = aVar;
        this.f296704g = k1Var;
        this.f296705h = str2;
        this.f296706i = map;
        this.f296707m = qVar;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "requestPresentOrderInfoWithLoading, cgi response, orderId: " + this.f296701d + ", errType: " + i17 + ", errCode: " + i18 + ", errMsg: " + str);
        ((ku5.t0) ku5.t0.f312615d).B(new j00.z0(this.f296702e, i17, i18, this.f296703f, this.f296704g, this.f296705h, oVar, this.f296706i, this.f296707m, this.f296701d));
        return 0;
    }
}
