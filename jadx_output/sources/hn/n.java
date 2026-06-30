package hn;

/* loaded from: classes4.dex */
public final class n implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vg3.i3 f282359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f282360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f282361c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg3.h3 f282362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f282363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hn.s f282364f;

    public n(vg3.i3 i3Var, com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, android.content.Context context, vg3.h3 h3Var, kotlin.jvm.internal.h0 h0Var, hn.s sVar) {
        this.f282359a = i3Var;
        this.f282360b = mMFragmentActivity;
        this.f282361c = context;
        this.f282362d = h3Var;
        this.f282363e = h0Var;
        this.f282364f = sVar;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        r45.j8 j8Var;
        java.lang.String str2;
        r45.ie baseResponse;
        r45.du5 du5Var;
        r45.j8 j8Var2;
        r45.j8 j8Var3;
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomOpenService", "GetCheckAppBindResp: errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
        pm0.v.X(new hn.k(this.f282363e));
        com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
        r45.mz mzVar = fVar instanceof r45.mz ? (r45.mz) fVar : null;
        boolean z17 = true;
        if (i17 != 0 || i18 != 0 || mzVar == null) {
            java.lang.String str4 = (mzVar == null || (j8Var3 = mzVar.f380938f) == null) ? null : j8Var3.f377633d;
            if (str4 != null && str4.length() != 0) {
                z17 = false;
            }
            java.lang.String string = z17 ? this.f282361c.getString(com.tencent.mm.R.string.f490824ay2) : (mzVar == null || (j8Var = mzVar.f380938f) == null) ? null : j8Var.f377633d;
            if (mzVar == null || (j8Var2 = mzVar.f380938f) == null || (str2 = j8Var2.f377634e) == null) {
                str2 = (mzVar == null || (baseResponse = mzVar.getBaseResponse()) == null || (du5Var = baseResponse.f376960e) == null) ? null : du5Var.f372756d;
                if (str2 == null) {
                    str2 = string;
                }
            }
            vg3.h3 h3Var = this.f282362d;
            if (h3Var != null) {
                h3Var.a(false, str2, null);
            }
            ((ku5.t0) ku5.t0.f312615d).B(new hn.m(this.f282360b, string, str2));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomOpenService", "GetCheckAppBindResp Success");
        vg3.i3 i3Var = this.f282359a;
        i3Var.f436717i = mzVar.f380936d;
        r45.oh ohVar = mzVar.f380937e;
        if (ohVar == null || (str3 = ohVar.f382253e) == null) {
            str3 = "";
        }
        i3Var.f436716h = str3;
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f282360b;
        vg3.i3 i3Var2 = this.f282359a;
        intent.setClassName(mMFragmentActivity, "com.tencent.mm.ui.contact.GroupCardSelectUI");
        intent.putExtra("group_select_type", true);
        intent.putExtra("group_select_only_need_self_owner", true);
        intent.putExtra("group_select_need_result", true);
        intent.putExtra("group_select_show_create_new_group", true);
        intent.putExtra("group_select_should_intercept", true);
        intent.putExtra("key_bind_param", i3Var2);
        this.f282360b.setMMOnFragmentActivityResult(new hn.l(this.f282359a, this.f282364f, this.f282361c, this.f282362d));
        this.f282360b.startActivityForResult(intent, 15001);
    }
}
