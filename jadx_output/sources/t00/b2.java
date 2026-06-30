package t00;

/* loaded from: classes9.dex */
public final class b2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f414268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f414269e;

    public b2(android.content.Context context, c00.n3 n3Var) {
        this.f414268d = context;
        this.f414269e = n3Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserInfo selectContactEcsActionHandler$IPCUserInfo = (com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserInfo) obj;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(selectContactEcsActionHandler$IPCUserInfo.f65636h);
        c00.n3 n3Var = this.f414269e;
        if (!K0) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
            u1Var.g(selectContactEcsActionHandler$IPCUserInfo.f65636h);
            u1Var.n(this.f414268d.getResources().getString(com.tencent.mm.R.string.f492294fz1));
            u1Var.l(t00.a2.f414264a);
            u1Var.q(false);
            n3Var.onCancel();
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = selectContactEcsActionHandler$IPCUserInfo.f65632d;
        if (str == null) {
            str = "";
        }
        jSONObject.put("displayName", str);
        java.lang.String str2 = selectContactEcsActionHandler$IPCUserInfo.f65633e;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("headImgUrl", str2);
        java.lang.Object obj2 = selectContactEcsActionHandler$IPCUserInfo.f65634f;
        if (obj2 == null) {
            obj2 = "";
        }
        jSONObject.put("recipientType", obj2);
        java.lang.Integer num = selectContactEcsActionHandler$IPCUserInfo.f65635g;
        jSONObject.put("chatRoomMemberNum", num != null ? num : "");
        n3Var.b(jSONObject);
    }
}
