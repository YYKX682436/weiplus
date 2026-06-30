package wj;

/* loaded from: classes9.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj.j0 f446417d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(wj.j0 j0Var) {
        super(1);
        this.f446417d = j0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject adsInfoJson = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(adsInfoJson, "adsInfoJson");
        com.tencent.mm.protobuf.e fromJson = new r45.e5().fromJson(adsInfoJson);
        kotlin.jvm.internal.o.e(fromJson, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AdsInfo");
        r45.e5 e5Var = (r45.e5) fromJson;
        wj.j0 j0Var = this.f446417d;
        java.lang.String string = e5Var.getString(5);
        kotlin.jvm.internal.o.f(string, "getAdPosid(...)");
        wj.j0.hj(j0Var, string, e5Var, 60L, false, 8, null);
        return jz5.f0.f302826a;
    }
}
