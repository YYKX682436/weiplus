package t00;

/* loaded from: classes9.dex */
public final class d2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f414274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414275e;

    public d2(android.content.Context context, c00.n3 n3Var) {
        this.f414274d = context;
        this.f414275e = n3Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo selectContactEcsActionHandler$IPCSingleUserInfo = (com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCSingleUserInfo) obj;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(selectContactEcsActionHandler$IPCSingleUserInfo.f65631f);
        c00.n3 n3Var = this.f414275e;
        if (!K0) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.g(selectContactEcsActionHandler$IPCSingleUserInfo.f65631f);
            u1Var.n(this.f414274d.getResources().getString(com.tencent.mm.R.string.f492294fz1));
            u1Var.l(t00.c2.f414271a);
            u1Var.q(false);
            n3Var.onCancel();
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = selectContactEcsActionHandler$IPCSingleUserInfo.f65629d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("displayName", str);
        java.lang.String str2 = selectContactEcsActionHandler$IPCSingleUserInfo.f65630e;
        jSONObject.put("headImgUrl", str2 != null ? str2 : "");
        int i17 = h20.g.f278267a;
        jSONObject.put("selectType", 2);
        n3Var.b(jSONObject);
    }
}
