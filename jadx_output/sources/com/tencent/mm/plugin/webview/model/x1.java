package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class x1 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f183177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.v0 f183178b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.l2 f183179c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.u1 f183180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f183182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f183183g;

    public x1(java.lang.ref.WeakReference weakReference, com.tencent.mm.plugin.webview.stub.v0 v0Var, com.tencent.mm.plugin.webview.model.l2 l2Var, com.tencent.mm.plugin.webview.model.u1 u1Var, java.lang.String str, int i17, android.app.Dialog dialog) {
        this.f183177a = weakReference;
        this.f183178b = v0Var;
        this.f183179c = l2Var;
        this.f183180d = u1Var;
        this.f183181e = str;
        this.f183182f = i17;
        this.f183183g = dialog;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        android.content.Context context = (android.content.Context) this.f183177a.get();
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "onSceneEnd doOauthAuthorize errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (context == null || this.f183178b == null || this.f183179c == null || this.f183180d == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 != 0 || i18 != 0 || oVar == null || (fVar = oVar.f70711b.f70700a) == null || !(fVar instanceof r45.lx4)) {
            com.tencent.mm.plugin.webview.model.k2.c(false, str, bundle, context, this.f183178b, this.f183179c, this.f183180d, this.f183182f, i18, this.f183183g);
            return;
        }
        r45.lx4 lx4Var = (r45.lx4) fVar;
        bundle.putString("oauth_url", this.f183181e);
        java.util.LinkedList linkedList = lx4Var.f379934d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (linkedList != null && !linkedList.isEmpty()) {
            for (int i19 = 0; i19 < linkedList.size(); i19++) {
                try {
                    arrayList.add(((r45.px4) linkedList.get(i19)).toByteArray());
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.OauthAuthorizeLogic", "oauthScopeInfoListToBytesList index:%d, exp:%s ", java.lang.Integer.valueOf(i19), e17.getLocalizedMessage());
                    arrayList.clear();
                }
            }
        }
        bundle.putSerializable("scope_list", arrayList);
        bundle.putString("appname", lx4Var.f379935e);
        bundle.putString("appicon_url", lx4Var.f379936f);
        bundle.putString("redirect_url", lx4Var.f379937g);
        bundle.putBoolean("is_recent_has_auth", lx4Var.f379938h);
        bundle.putBoolean("is_silence_auth", lx4Var.f379939i);
        bundle.putBoolean("is_call_server_when_confirm", lx4Var.f379940m);
        java.util.LinkedList linkedList2 = lx4Var.f379941n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList2) && linkedList2 != null) {
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                try {
                    arrayList2.add(((r45.mx4) it.next()).toByteArray());
                } catch (java.io.IOException unused) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.OauthMultiAccountMgr", "oauthAvatarListToBytesList exception");
                    arrayList2.clear();
                }
            }
        }
        bundle.putSerializable("avatar_list", arrayList2);
        bundle.putBoolean("is_use_new_page", lx4Var.f379942o);
        bundle.putBoolean("is_ban_modify_avatar", lx4Var.f379943p);
        r45.qx4 qx4Var = lx4Var.f379949v;
        if (qx4Var != null) {
            bundle.putString("create_avatar_title", qx4Var.f384336e);
        }
        bundle.putInt("avatar_limit", lx4Var.f379944q);
        bundle.putInt("default_avatar_id", lx4Var.f379945r);
        bundle.putString("default_headimg_url", lx4Var.f379946s);
        bundle.putString("default_headimg_fileid", lx4Var.f379947t);
        bundle.putBoolean("is_tourist_oauth", lx4Var.f379948u);
        bundle.putString("tourist_banner_wording", lx4Var.f379949v.f384337f);
        com.tencent.mm.plugin.webview.model.k2.c(true, str, bundle, context, this.f183178b, this.f183179c, this.f183180d, this.f183182f, i18, this.f183183g);
    }
}
