package i11;

/* loaded from: classes2.dex */
public class r extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f287144d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f287145e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f287146f = "";

    public r(double d17, double d18, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.h83();
        lVar.f70665b = new r45.i83();
        lVar.f70666c = "/cgi-bin/micromsg-bin/geocoderlocation";
        lVar.f70667d = com.google.android.gms.wearable.WearableStatusCodes.ASSET_UNAVAILABLE;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f287145e = a17;
        r45.h83 h83Var = (r45.h83) a17.f70710a.f70684a;
        h83Var.f375938e = d17;
        h83Var.f375937d = d18;
        h83Var.f375941h = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f287144d = u0Var;
        return dispatch(sVar, this.f287145e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.google.android.gms.wearable.WearableStatusCodes.ASSET_UNAVAILABLE;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f287144d;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        this.f287146f = ((r45.i83) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f376812d;
        com.tencent.mm.modelbase.u0 u0Var2 = this.f287144d;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
